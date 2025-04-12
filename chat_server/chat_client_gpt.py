from kivy.app import App
from kivy.uix.textinput import TextInput
from kivy.uix.button import Button
from kivy.uix.boxlayout import BoxLayout
from kivy.clock import Clock
import socket
import threading

class ChatClient(App):
    def build(self):
        # Create the main layout
        self.layout = BoxLayout(orientation='vertical')
        
        # Chat area to display received messages
        self.chat_area = TextInput(size_hint=(1, 0.8), readonly=True)
        
        # Input field for typing messages
        self.message_input = TextInput(hint_text='Enter message', size_hint=(1, 0.1))
        
        # Button to send the typed message
        self.send_button = Button(text='Send', size_hint=(1, 0.1))
        self.send_button.bind(on_press=self.send_message)
        
        # Add widgets to the layout
        self.layout.add_widget(self.chat_area)
        self.layout.add_widget(self.message_input)
        self.layout.add_widget(self.send_button)
        
        return self.layout
    
    def send_message(self, instance):
        # Get the message from the input field
        message = self.message_input.text.strip()
        self.message_input.text = ""
        
        # Send the message to the server
        if message:
            try:
                self.client_socket.send(message.encode('utf-8'))
            except Exception as e:
                self.chat_area.text += f"Error sending message: {e}\n"
    
    def connect_to_server(self):
        # Create a socket and connect to the server
        self.client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        self.client_socket.connect(('172.17.38.115', 8000))  # Change 'localhost' to the server IP if needed
        
        # Start a thread to listen for messages from the server
        threading.Thread(target=self.receive_messages, daemon=True).start()
    
    def receive_messages(self):
        # Continuously receive messages from the server
        while True:
            try:
                message = self.client_socket.recv(1024).decode('utf-8')
                if message:
                    # Use Clock.schedule_once to update the UI in the main thread
                    Clock.schedule_once(lambda dt: self.update_chat_area(message))
            except Exception as e:
                error_message = f"Error receiving message: {e}\n"
                Clock.schedule_once(lambda dt: self.update_chat_area(error_message))
                break

    def update_chat_area(self, message):
        """Update the chat area in the main thread."""
        self.chat_area.text += f"{message}\n"

if __name__ == '__main__':
    # Create and run the chat client
    chat_app = ChatClient()
    chat_app.connect_to_server()
    chat_app.run()

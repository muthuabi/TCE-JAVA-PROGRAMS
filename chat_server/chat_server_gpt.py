import socket
import threading

clients = []

# Function to handle messages from a client
def handle_client(client_socket, client_address):
    while True:
        try:
            message = client_socket.recv(1024).decode('utf-8')
            if not message:
                break
            print(f"{client_address} says: {message}")
            broadcast_message(f"{client_address}: {message}", client_socket)
        except Exception as e:
            print(f"Error with client {client_address}: {e}")
            break

    # Remove the client on disconnect
    clients.remove(client_socket)
    client_socket.close()
    print(f"{client_address} disconnected.")

# Function to broadcast a message to all clients except the sender
def broadcast_message(message, sender_socket):
    for client in clients:
        if client != sender_socket:
            try:
                client.send(message.encode('utf-8'))
            except Exception as e:
                print(f"Error sending message: {e}")

# Function to handle server-side message input
def send_server_message():
    while True:
        message = input("Server: ")
        if message:
            broadcast_message(f"Server: {message}", None)

# Main function to start the server
def start_server():
    server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server.bind(('172.17.38.115', 8000))  # Localhost and port
    server.listen(5)
    server_ip, server_port = server.getsockname()
    print(f"Server started on {server_ip}:{server_port}")
    #print("Waiting for clients to connect...")
    #print("Server started on 127.0.0.1:8000")

    # Start the server-side message input thread
    threading.Thread(target=send_server_message, daemon=True).start()

    while True:
        client_socket, client_address = server.accept()
        print(f"Connection from {client_address} established.")

        # Add client to the clients list
        clients.append(client_socket)

        # Start a new thread to handle the client
        threading.Thread(target=handle_client, args=(client_socket, client_address), daemon=True).start()

if __name__ == '__main__':
    start_server()

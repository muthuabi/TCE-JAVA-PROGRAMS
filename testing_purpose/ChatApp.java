import java.util.Scanner;

public class ChatApp {
    static class ChatUser implements Runnable {
        String name;
        Thread thread;
        int index;
        static int turnIndex = 0;
        static int totalUsers = 0;
        static Object lock = new Object();
        static Scanner sc = new Scanner(System.in);
        String msg = "";

        public ChatUser(String name, int index) {
            this.name = name;
            this.index = index;
            this.thread = new Thread(this);
        }

        public void startChat() {
            thread.start();
        }

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    while (turnIndex % totalUsers != index) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            return;
                        }
                    }

                    // It's this user's turn
                    System.out.print("\n" + name + " > ");
                    msg = sc.nextLine();
                    System.out.println(name + " typed: " + msg);

                    if (msg.equalsIgnoreCase("exit")) {
                        System.out.println(name + " has left the chat.");
                        totalUsers--;  // Reduce user count
                        lock.notifyAll();
                        break; // End thread
                    }

                    turnIndex++;
                    lock.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) {
        ChatUser[] users = {
            new ChatUser("Krish", 0),
            new ChatUser("Abi", 1),
            new ChatUser("Deva", 2)
        };

        ChatUser.totalUsers = users.length;

        for (ChatUser user : users) {
            user.startChat();
        }

        for (ChatUser user : users) {
            try {
                user.thread.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }

        System.out.println("\nAll users have left the chat!");
    }
}

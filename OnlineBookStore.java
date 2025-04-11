package mini;
import java.util.*;

public class OnlineBookStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("         Welcome to Online Book Store   ");
        System.out.println("========================================");

        String[][] books = {
            {"1", "Java Programming", "John Doe", "$20"},
            {"2", "Python Basics", "Jane Smith", "$25"},
            {"3", "Web Development", "Alice Johnson", "$30"},
            {"4", "Data Structures", "Robert King", "$28"},
            {"5", "Machine Learning", "Tom White", "$35"},
            {"6", "C++ Fundamentals", "Alex Moore", "$22"},
            {"7", "Cyber Security", "David Clark", "$27"},
            {"8", "Mobile App Dev", "Maria Lee", "$24"},
            {"9", "Cloud Computing", "Sam Turner", "$31"},
            {"10", "AI for Beginners", "Nina Patel", "$33"},
            {"11", "Operating Systems", "Andy Park", "$26"},
            {"12", "Computer Networks", "Laura Green", "$29"},
            {"13", "Software Engineering", "Mike Brown", "$23"},
            {"14", "Database Systems", "Sara Grey", "$32"},
            {"15", "Ethical Hacking", "Ravi Kumar", "$30"}
        };

        Map<Integer, Integer> stock = new HashMap<>();
        Map<Integer, Integer> sold = new HashMap<>();
        for (int i = 0; i < books.length; i++) {
            stock.put(i + 1, 10); // increased default stock
            sold.put(i + 1, 0);
        }

        while (true) {
            System.out.println("\n1. Buyer");
            System.out.println("2. Seller");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("\n--- Buyer Menu ---");
                        System.out.println("1. View Available Books");
                        System.out.println("2. Buy a Book");
                        System.out.println("3. Back to Main Menu");
                        System.out.print("Enter choice: ");
                        int buyerChoice = scanner.nextInt();

                        if (buyerChoice == 1) {
                            System.out.println("\nAvailable Books:");
                            System.out.println("----------------------------------------------------------");
                            System.out.println("ID | Title               | Author         | Price | Stock");
                            System.out.println("----------------------------------------------------------");
                            for (int i = 0; i < books.length; i++) {
                                String[] book = books[i];
                                int bookId = Integer.parseInt(book[0]);
                                System.out.printf("%s  | %-19s | %-14s | %-5s | %d\n",
                                        book[0], book[1], book[2], book[3], stock.get(bookId));
                            }
                            System.out.println("----------------------------------------------------------");
                        } else if (buyerChoice == 2) {
                            System.out.print("Enter the Book ID to purchase: ");
                            int bookId = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            boolean found = false;
                            for (String[] book : books) {
                                if (Integer.parseInt(book[0]) == bookId) {
                                    if (stock.get(bookId) > 0) {
                                        System.out.print("Enter your name: ");
                                        String name = scanner.nextLine();
                                        System.out.print("Enter your phone number: ");
                                        String phone = scanner.nextLine();
                                        System.out.print("Enter your delivery address: ");
                                        String address = scanner.nextLine();

                                        System.out.println("\nOrder Summary:");
                                        System.out.println("Book: " + book[1]);
                                        System.out.println("Buyer: " + name);
                                        System.out.println("Phone: " + phone);
                                        System.out.println("Address: " + address);
                                        System.out.println("Status: Order placed successfully!");
                                        System.out.println("Thank you for shopping with us!\n");

                                        stock.put(bookId, stock.get(bookId) - 1);
                                        sold.put(bookId, sold.get(bookId) + 1);
                                    } else {
                                        System.out.println("Sorry! The book is out of stock.\n");
                                    }
                                    found = true;
                                    break;
                                }
                            }
                            if (!found) {
                                System.out.println("Invalid Book ID! Try again.\n");
                            }
                        } else if (buyerChoice == 3) {
                            break;
                        } else {
                            System.out.println("Invalid choice!\n");
                        }
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Enter seller password: ");
                    String password = scanner.nextLine();
                    if (password.equals("admin123")) {
                        System.out.println("\n--- Seller Panel ---");
                        System.out.println("Book ID | Title                | Stock | Sold");
                        System.out.println("---------------------------------------------");
                        for (int i = 0; i < books.length; i++) {
                            String[] book = books[i];
                            int id = Integer.parseInt(book[0]);
                            System.out.printf("%-7s | %-20s | %-5d | %-4d\n",
                                    book[0], book[1], stock.get(id), sold.get(id));
                        }
                        System.out.println();
                    } else {
                        System.out.println("Incorrect password. Access denied.\n");
                    }
                    break;
                case 3:
                    System.out.println("Thank you for visiting Online Book Store. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.\n");
            }
        }
    }
}

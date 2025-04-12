# Online-Book-Stores
A simple miniproject in java
The aim of this project is to simulate an online bookstore where buyers can view and purchase books with home delivery, while sellers can monitor stock and sales records. It demonstrates the use of core Java concepts like arrays, loops, conditional statements, and HashMaps."
*Features of the Project
**Briefly list what it can do.
>>Buyer can:
1.View available books
2.Place an order
3.Give address for delivery ,name,phone number

>>Seller can:
1.Login with a password
2.View stock and total books sold

"First, I import java.util.* to use Scanner and HashMap. Then I define a 2D array to store book data, where each row has book ID, title, author, and price. I use a HashMap to track stock and sales count for each book. Then I ask the user if they are a buyer or seller. Buyers can browse and buy books with delivery info. Sellers, after password authentication, can view stock and sales."

"This project simulates a real-life use case of an online bookstore. It can be extended with GUI, file storage, or even a database. For now, it's a solid example of how Java can be used for object-oriented applications."
"This is a simplified console-based simulation. In a real-world application, the system would be managed by an admin or seller who has a password-protected login to manage stock and view sales.Buyers can only view and purchase books — they do not have access to view stock or sales data. So, the control lies with the seller through authentication."
"If this project is extended in the future, I can add an admin panel with login credentials for sellers and maybe even different roles like delivery manager, admin, etc."
"Currently, I update the stock count in the program after each purchase. If the stock reaches zero, the book won’t appear as available, and the buyer will be informed. In the future, we can also disable the 'Buy' option for out-of-stock books."
"Since this is a backend-free project, delivery info like name, address, and mobile number is just simulated via user input. In a real system, this would be stored in a database and tracked by the seller or delivery partner."
"Right now, this is a console-based, single-user program for demonstration. But with GUI or web development and database support, this can definitely be extended to allow multiple buyers and sellers."
"I chose this project because it's a real-world relatable scenario — almost everyone uses online book or shopping platforms. It gave me a good opportunity to apply core Java concepts while simulating practical buying and selling operations."

🔹 Main Menu Logic
You enter an infinite loop which keeps showing the main menu options to the user.
There are three options:
Buyer
Seller
Exit
The user is prompted to enter their choice. Based on the input, the program uses a switch-case to decide what to do.

💠 Buyer Section
If the user chooses "Buyer", a nested loop starts for the Buyer Menu.
Here, they see three options:
View Available Books
Buy a Book
Go Back to Main Menu

🟢 View Available Books
It prints a neatly formatted list of all the books.
For each book, it shows the ID, Title, Author, Price, and how many are left in stock.
This helps the user decide which book they want to purchase.

🟢 Buy a Book
The user is asked to enter the Book ID they want to buy.
The program checks if that ID exists and whether the book is still in stock.
If the book is available:
It collects buyer details like name, phone number, and delivery address.
Then, it prints a clear order summary and a success message.
The stock of that book is reduced by 1.
The number of sold copies is increased by 1.
If the book is out of stock, it informs the user.
If the user enters an invalid ID, an error message is shown.

🟢 Back to Main Menu
Ends the buyer loop and returns to the main menu.

💠 Seller Section
If the user chooses "Seller", they are asked to enter a password.
If the password is correct (in this case it's hardcoded), they get access to the Seller Panel.
The seller panel shows:
Book ID
Title
Current Stock
Total Sold
This allows the seller to keep track of inventory and sales easily.
If the password is wrong, access is denied.

💠 Exit Option
If the user chooses "Exit":
A goodbye message is shown.
The program ends gracefully by closing the scanner.

✅ Program Structure Summary
The whole logic is well-structured using loops, arrays, maps, and conditional statements.

The use of HashMap helps maintain dynamic stock and sales tracking.

The 2D array for books keeps data organized.

Input validation and appropriate messages improve user experience.

The code uses a modular menu-based system that makes it easy to navigate for both buyers and sellers.


///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
// /* A company wants to develop an online shopping platform that allows customers to browse 
//products, add them to a shopping cart, and make purchases. The system should handle different types 
//of users, such as customers and administrators. This case study demonstrates the use of encapsulation, 
//inheritance, and polymorphism to build a flexible and maintainable online shopping system. */
//package Assignment_3;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// *
// * @author Abdul Rafay
// */
//class Product {
//
//    private String name;
//    private int price;
//
//    public Product(String name, int price) {
//
//        this.name = name;
//        this.price = price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" + "name=" + name + ", price=" + price + '}';
//    }
//
//}
//
//class Customer {
//
//    private String name;
//    private Shoppingcart cart;
//
//    public Customer(String name) {
//
//        this.name = name;
//        this.cart = new Shoppingcart();
//
//    }
//
//    public Shoppingcart getShoppingcart() {
//        return cart;
//    }
//
//    public void placeOrder(String name) {
//        System.out.println("Order placed for " + this.name + ".");
//        // Simulate order processing with payment, etc. (not implemented here)
//    }
//}
//
//class Administrator extends Customer {
//
//    public Administrator(String name) {
//        super(name); // Call parent constructor for customer details
//    }
//
//    // Additional functionalities for managing products, promotions, etc.
//    public void addProduct(Product product) {
//        // Simulate adding product to the system (logic depends on your chosen data storage)
//        System.out.println("Added product: " + product);
//    }
//
//    public void updateProduct(Product product) {
//        // Simulate updating product details (logic depends on your chosen data storage)
//        System.out.println("Updated product: " + product);
//    }
//
//    public void removeProduct(Product product) {
//        // Simulate removing product from the system (logic depends on your chosen data storage)
//        System.out.println("Removed product: " + product.getName());
//    }
//
//    public void viewOrders() {
//        // Simulate retrieving and displaying order information (logic depends on your chosen data storage)
//        System.out.println("Displaying all orders...");
//        // Implement logic to iterate through orders and display details
//    }
//
//    public void managePromotions() {
//        // Implement functionalities for creating, editing, and managing promotions
//        System.out.println("Promotion management functionalities...");
//        // You can have methods for adding discounts, setting sale prices, etc.
//    }
//}
//
//class Shoppingcart {
//
//    private List<Product> items;
//
//    public Shoppingcart() {
//        this.items = new ArrayList<>();
//    }
//
//    public void addItem(Product product) {
//        items.add(product);
//    }
//
//    public void removeItem(Product product) {
//        items.remove(product);
//    }
//
//    public void displayCart() {
//        if (items.isEmpty()) {
//            System.out.println("Cart is empty.");
//        } else {
//            for (Product product : items) {
//                System.out.println(product);
//            }
//        }
//    }
//}
//
//abstract class Payment {
//
//    public abstract boolean processPayment(double amount);
//}
//
//class CreditCardPayment extends Payment {
//
//    private String cardNumber;
//    private String expiryDate;
//
//    public CreditCardPayment(String cardNumber, String expiryDate) {
//        this.cardNumber = cardNumber;
//        this.expiryDate = expiryDate;
//    }
//
//    @Override
//    public boolean processPayment(double amount) {
//        // Simulate payment processing (replace with actual payment gateway integration)
//        System.out.println("Processing payment of $" + amount + " with credit card...");
//        return Math.random() > 0.1; // Simulate occasional failure (10% chance)
//    }
//
//    public class Online_Shopping {
//
//        public static void main(String[] args) {
//            // Create some products
//            Product product1 = new Product("Laptop", 10);
//            Product product2 = new Product("Headphones", 5);
//
//            // Create a customer
//            Customer customer = new Customer("John Doe");
//
//            // Customer browses products
//            System.out.println("Available Products:");
//            System.out.println(product1);
//            System.out.println(product2);
//
//            // Customer adds product to cart
//            customer.getShoppingcart().addItem(product1);
//
//            // Display shopping cart contents
//            System.out.println("\nShopping Cart:");
//            customer.getShoppingcart().displayCart();
//
//            // Customer places order (with payment processing)
//            if (customer.placeOrder(new CreditCardPayment("1234567890123456", "12/24"))) {
//                System.out.println("Order placed successfully!");
//            } else {
//                System.out.println("Order failed. Please check payment details.");
//            }
//
//            // Administrator can manage products (assuming inheritance)
//            Administrator admin = new Administrator("Jane Smith");
//            admin.addProduct(new Product("Tablet", 15));
//        }
//    }

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;


//The main class
public class ShoppingBill {

    public static void main(String [] args) {

        // variables

        String id = null;
        String productName = null;
        int quantity = 0;
        double price = 0.0;
        double totalPrice = 0.0;
        double overAllPrice = 0.0;
        double serviceTax, vatTax, subtotal = 0.0, discount = 0.0;
        char choice = '\0';
        System.out.println("\t\t\t\t--------------------Invoice-----------------");
        System.out.println("\t\t\t\t\t " + "  " + "Welcome to our Super Market");
        System.out.println("\t\t\t\t\t     6 Kilo Addis Abeba");
        System.out.println("\t\t\t\t\t" + "    " + "Opposite Metro Walk");
        System.out.println("GSTIN: 03AWBPP8756K592" + "\t\t\t\t\t\t\tContact: (+251) 988584529");

        //format of date and time

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        //prints current date and time
        System.out.println("Date: " + formatter.format(date) + "  " + days[calendar.get(Calendar.DAY_OF_WEEK) - 1] + "\t\t\t\t\t\t (+251) 988584529");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String customername = scan.nextLine();
        System.out.print("Enter your Address: ");
        String address = scan.nextLine();
        
        //create Scanner class object
        //creating an ArrayList to store the product
        List<Product> product = new ArrayList<Product>();
        do {

            try{
            // read input values
            System.out.println("Enter the product details: ");
            System.out.print("Enter Product ID: ");
            id = scan.nextLine();
            System.out.print("Enter Product Name: ");
            productName = scan.nextLine();
            System.out.print("Quantity: ");
            quantity = scan.nextInt();
            System.out.print("Price (per unit): ");
            price = scan.nextDouble();

            }catch(Exception e){
                System.out.println("please enter the required input:");

            }

            //calculate total price for a particular product
            totalPrice = price * quantity;
            //calculates overall price
            overAllPrice = overAllPrice + totalPrice;
            //creates Product class object and add it to the List
            product.add(new Product(id, productName, quantity, price, totalPrice));
            // ask for continue shopping?
            System.out.print("Want to add more items? (y or n): ");

            //reads a character Y or N
            choice = scan.next().charAt(0);
            //read remaining characters, don't store (no use)
            scan.nextLine();
        }
        while (choice == 'y' || choice == 'Y');
        //display all product with its properties
        Product.displayFormat();
        for (Product p : product) {
            p.display();
        }
        //price calculation
        System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount ($.) " + overAllPrice);
        //calculating discount
        discount = overAllPrice * 2 / 100;
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t    Discount ($.) " + discount);
        //total amount after discount
        subtotal = overAllPrice - discount;
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t     Subtotal " + subtotal);
        //calculating tax
        serviceTax = overAllPrice * 12 / 100;
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t     ServiceTax(%) " + serviceTax);

        vatTax = overAllPrice * 12 / 100;
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t      VatTax (%) " + vatTax);
        //calculating amount to be paid by buyer
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t     Invoice Total " + (subtotal + vatTax + serviceTax));

        System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");
        System.out.println("\t\t\t\t                     Visit Again");
        // close Scanner
        scan.close();


    }
}

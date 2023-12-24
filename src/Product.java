import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.*;
public class Product
{
    // properties
    private String id;
    private String productName;
    private int quantity;
    private double price;
    private double totalPrice;

    // constructor
    Product(String id, String productName, int quantity, double price, double totalPrice)
    {
        this.id=id;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
    }
    // getter methods
    public String getId()
    {

        return id;
    }
    public String getProductName()
    {

        return productName;
    }
    public int getQty()
    {

        return quantity;
    }
    public double getPrice()
    {

        return price;
    }
    public double getTotalPrice()
    {

        return totalPrice;
    }
    //displayFormat
    public static void displayFormat()
    {
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("\nProduct ID \t\t\t\tName\t\t\tQuantity\t\t\t\tRate \t\t\t\t\t\tTotal Price\n");
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");
    }

    // display
    public void display()

    {
        System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n" ,id, productName, quantity, price, totalPrice);
    }
}




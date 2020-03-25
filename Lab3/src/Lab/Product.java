package Lab;
import java.util.Scanner;
public class Product {

         Scanner scann=new Scanner(System.in);

    String name;
    Double price;
    int productCode;
    int numberOfItems;

    public Product(String name, Double price, int productCode, int numberOfItems) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfItems = numberOfItems;
    }
    public Product(String name, Double price, int productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfItems = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = 5;
    }

        void changeParameters(){
        if(numberOfItems==0) {
            System.out.println("Enter desired name, price and code");
            this.name = scann.next();
            this.price = scann.nextDouble();
            this.productCode = scann.nextInt();
        }else if(numberOfItems>0) {
            System.out.println("Enter desired name, price, code and number of items");
            this.name = scann.next();
            this.price = scann.nextDouble();
            this.productCode = scann.nextInt();
            this.numberOfItems = scann.nextInt();
        }else if(numberOfItems<0) {
            throw new IllegalArgumentException("number must be valid");
        }
            System.out.println( "Your product is " + name + ", it costs " + price + ", the product code is " + productCode + " and the quantity is " + numberOfItems);
        }


        }


package java;

import java.util.ArrayList;
import java.util.Scanner;
public class Category {

    Scanner scan=new Scanner(System.in);

   public String name;
   public ArrayList<Product> products;

        public Category(String name, ArrayList<Product> products){
            this.name = name;
            this.products = products;
        }
        public Category(String name){
            this.name=name;
            this.products=new ArrayList<>();
        }
        public Category(){
            this.products=new ArrayList<>();
        }

    public void setName(String name) {
        System.out.println("rename your category");
        this.name = scan.next();
    }

    public void addProduct(Product newProduct){

            products.add(newProduct);
        }
    public void removeProduct(Product newProduct){
            products.remove(newProduct);
    }

    public int productNum(){
            return products.size();
        }
    public ArrayList<Product> getProducts() { return products; }
}

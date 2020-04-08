package java;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class User {

    Scanner scan=new Scanner(System.in);
    public String name;
    public String lastName;
    public String email;
    private String password;
    public String isGuest;

    public User(String name, String lastName, String email, String password) {

        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.isGuest = "false";
    }

    public User(String email) {
        this.email = email;
        this.lastName = null;
        this.name = null;
        this.password = null;
        this.isGuest = "true";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void isGuestAcc() {
        if (isGuest == "true") {
            System.out.println(" This is a Guest Account");
        } else if (isGuest == "false") {
            System.out.println(" This is User Account");
        }
    }
    public void register(){
        if(isGuest=="true"){
            System.out.println("Do u want to create a user account?");
            String answer;
            answer=scan.next();
            if (answer.equals("yes")){
                System.out.println(" Enter your name, surname and password");
                this.name=scan.next();
                this.lastName=scan.next();
                this.password=scan.next();
                this.email=email;
                this.isGuest="false";
                System.out.println("Welcome " + name + " " + lastName + " you are now registered user ;)");
            }

        }
    }

}

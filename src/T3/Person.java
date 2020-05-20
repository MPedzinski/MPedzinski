package T3;

public abstract class Person {

    public String firstName;
    public String lastName;
    public int birthdayYear;
    public int age;

    public Person(String firstName, String lastName, int birthdayYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }

    public int getAge(){
        return age;
    }

}

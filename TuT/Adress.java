package TuT;

public class Adress {


    String Country;
    String City;
    int PostalCode;
    String StreetName;
    int AptNumber;


    public String createAdress(String Country){
        return String.format("country: %s", Country);
    }

    public String createAdress(String Country, String City){
        return String.format("country: %s , city: %d", Country, City);
    }

    public String createAdress(String Country, String City, int PostalCode){
        return String.format("country: %s , city: %d , postalcode: %f", Country, City, PostalCode);
    }

    public String createAdress(String Country, String City, int PostalCode, String StreetName){
        return String.format("country: %s , city: %d , postalcode: %f, streetname: %g", Country, City, PostalCode, StreetName);
    }

    public String createAdress(String Country, String City, int PostalCode, String StreetName, int AptNumber){
        return String.format("country: %s , city: %s , postalcode: %d, streetname: %s , apartmentnumber: %d", Country, City, PostalCode, StreetName, AptNumber);
    }





}



public class Customer {

    // FIELDS
    // TODO Filedslari olusuturun
    /*
    TÜM FIELD LAR PRIVATE OLMALIDIR. FINAL OLMAYACAK.
     customerId Integer,
     firstName, lastName, city String OLACAK
     */
    private int customerId;
    private String firstName;
    private String lastName;
    private String city;
    private static int nextId=1000;


    ///////////////////////////////////////////////////////////////////////////////////

    // CONSTRUCTORS
    // TODO BOŞ CONSTRUCTOR OLUŞTURUN

    public Customer() {
    }

    // PARAMTRELERİ int customerId, String firstName, String lastName, String city OLAN CONSTRUCTOR OLUŞTURUN

    public Customer( String firstName, String lastName, String city) {
        this.customerId = ++nextId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }


    ////////////////////////////////////////////////////////////////////////////////////

    // GETTER SETTER METHODS
    // TODO  GETTER VE SETTER METODLARI OLUŞTURUN

    public int getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

//    public void setCustomerId(int customerId) {
//        this.customerId = customerId;
//    }

    ////////////////////////////////////////////////////////////////////////////////

    //  TODO TO STRING METODU OLUŞTURUN

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }


    /////////////////////////////////////////////////////////////////////////////////
}

package zipcode.rocks;

public class Person {
    // private = restricted access
    private String firstname;
    private String lastname;
    private String beverage;
    private String color;
    private String month;
    private Boolean pets;





//Version1
//    public Person(String fname, String lname, String beverage, String color, String month, String pets) {
//        this.firstname = fname;
//        this.lastname = lname;
//        this.beverage = beverage;
//        this.color = color;
//        this.month = month;
//        this.pets = Boolean.valueOf(pets);
//
//    }

    //Version2
    public Person(String fname, String lname) {
        this.firstname = fname;
        this.lastname = lname;
//        this.beverage = beverage;
//        this.color = color;
//        this.month = month;
//        this.pets = Boolean.valueOf(pets);

    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }
    public String getColor() { return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMonth() { return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    public Boolean getPets() { return pets;
    }
    public void setPets(Boolean pets) {
        this.pets = pets;
    }


    public String toString() {
        return this.lastname + ", " + this.firstname + ", " + this.color + ", " + this.month + ", " + this.pets;
    }
}

package OOP.Abstraction;

public class Employee {

    private String name;
    private String phoneNo;
    private String email;

    // public Employee(){} I did Constructor Overloading

    public Employee(String name, String phoneNo, String email) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void login() {
        System.out.println(this.name + " entered the Univercity !!");
    }

    public void out() {
        System.out.println(this.name + " left the Univercity ");
    }

    public void dininHall() {
        System.out.println(this.name + " entered the dining hall.");
    }

}

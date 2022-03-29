package OOP.Inheritance;

public class Officer extends Employee {
    
    private String department;
    private String shift;
    public Officer(String name, String phoneNo, String email, String department, String shift) {
        super(name, phoneNo, email);
        this.department = department;
        this.shift = shift;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getShift() {
        return shift;
    }
    public void setShift(String shift) {
        this.shift = shift;
    }

    public void work(){
        System.out.println(this.getName()+" has been working here for 2 years.");
    }
    

}

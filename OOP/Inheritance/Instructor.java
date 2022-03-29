package OOP.Inheritance;

public class Instructor extends Academican {
    
    private String doorNo;

    public Instructor(String name, String phoneNo, String email, String teachingField, String title, String doorNo) {
        super(name, phoneNo, email, teachingField, title);
        this.doorNo = doorNo;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }




}

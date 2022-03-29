package OOP.Inheritance;

public class Computing extends Officer {
    
    public Computing(String name, String phoneNo, String email, String department, String shift) {
        super(name, phoneNo, email, department, shift);
        //TODO Auto-generated constructor stub
    }

    private String mission;

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public void setupTheNetwork(){
        System.out.println(this.getName()+" is setuping the network.");
    }

}

package OOP.Abstraction;

public class LabAsistant extends Asistan  {

    public LabAsistant(String name, String phoneNo, String email, String teachingField, String title,
            String officeClock) {
        super(name, phoneNo, email, teachingField, title, officeClock);
    }
    
    public void enterTheLab(){
        System.out.println(this.getName()+" is entering lab");
    }

    
}  

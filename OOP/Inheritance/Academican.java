package OOP.Inheritance;

public class Academican extends Employee{

    private String teachingField;
    private String title;

    public Academican(String name, String phoneNo, String email,String teachingField,String title) {
        super(name, phoneNo, email);
        
        this.teachingField = teachingField;
        this.title = title;
        
    }

    public String getTeachingField() {
        return teachingField;
    }

    public void setTeachingField(String teachingField) {
        this.teachingField = teachingField;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void enterTheLesson(){
        System.out.println(this.getName()+ " entered the lesson.");
    }

    
    
}

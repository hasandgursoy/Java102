package OOP.Abstraction;

public class Asistan extends Academican {
    
    private String officeClock;

    public Asistan(String name, String phoneNo, String email, String teachingField, String title, String officeClock) {
        super(name, phoneNo, email, teachingField, title);
        this.officeClock = officeClock;
    }

    public String getOfficeClock() {
        return officeClock;
    }

    public void setOfficeClock(String officeClock) {
        this.officeClock = officeClock;
    }

    public void makeAQuiz(){
        System.out.println(this.getName()+" is making quiz");
    }

    @Override
    public void enterTheLesson() {
        System.out.println(this.getName()+" entered the lesson");
    }

}

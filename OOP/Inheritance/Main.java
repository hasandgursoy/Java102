package OOP.Inheritance;

public class Main {
    
    public static void main(String[] args) {
        
        Employee e1 = new Employee("Hasan Gürsoy", "+86565254", "hasan.d.gursoy@gmail.com");
        e1.login();
        e1.dininHall();
        e1.out();

        Academican a1 = new Academican("Ali", "+7855565656", "ali.g@hotmail.com","Cemical","Prof.");
        a1.out();
        a1.enterTheLesson();

        Officer o1 = new Officer("Sun Zui", "+54654656", "war.art@hotmail.com", "Tactics of War", "5 hours");
        o1.dininHall();

        Instructor i1 = new Instructor("Özgür Demirtas", "+54698787854", "ozgur.demirtas@gmail.com", "Econometri", "Prof.", "1");
        System.out.println(i1.getTeachingField());




    }
}

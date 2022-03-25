package StaticKeyword;

import java.util.ArrayList;

public class Student {
    
    private String name;
    private int not;

    public Student(String name, int not){
        this.name = name;
        this.not = not;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }

    public static double calcAvarage(ArrayList<Student> students){

        int sum = 0;
        double result = 0;

        for(int i = 0; i < students.size();i++){

            sum += students.get(i).getNot();
            
        }

        result = sum / students.size();

        return result;
    }

    

}

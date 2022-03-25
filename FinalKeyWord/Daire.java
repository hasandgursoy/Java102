package FinalKeyWord;

public class Daire {
    
    final static public double PI = 3.14;

    public int r;

    public Daire(int r){

        this.r = r;

    }

    public  void calcArea(Daire d){
        double area = PI * d.r*d.r;
        System.out.println(area);
    }

}

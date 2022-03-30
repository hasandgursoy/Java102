package OOP.Polimorphism;

public class Soldier {
    private String name;
    private String rank;
    private String unity;

    public Soldier(String name, String rank, String unity) {
        this.name = name;
        this.rank = rank;
        this.unity = unity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getUnity() {
        return unity;
    }

    public void setUnity(String unity) {
        this.unity = unity;
    }

    public void sayHi(){
        System.out.println("From "+this.unity+" "+this.getRank()+" "+this.getName());
    }

}

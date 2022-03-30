package OOP.Polimorphism;


public class Agent extends Soldier {

    private String secretCode;

    public Agent(String name, String rank, String unity, String secretCode) {
        super(name, rank, unity);
        this.secretCode = secretCode;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    @Override
    public void sayHi(){
        System.out.println("My code "+this.getSecretCode());
    }
    


}
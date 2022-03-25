package StaticKeyword;

public class Player {
    
    public String name;
    public int id;
    public static String game = "CS";
    public static int count = 0;

    public Player(String name,int id){
        this.name = name;
        this.id = id;
        count++;
    }

    public void login(){
        count++;
        System.out.println(count);
    }

    public static int multipleID (Player p){
        return p.id*2;
    }
}

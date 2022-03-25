package StaticCodeBlocks;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println(User.counter);
        User u1 = new User("hasan");
        System.out.println(User.counter);

    }
}

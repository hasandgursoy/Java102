package StaticKeyword;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Player p1 = new Player("Hasan", 153);
        System.out.println(p1.name);
        System.out.println(Player.game);
        // System.out.println(p1.game);
        System.out.println(Player.count);
        p1.login();

        int id = Player.multipleID(p1);
        System.out.println(id);

        // ===================================================

        Student s1 = new Student("hasan",80);
        Student s2 = new Student("celil", 90);
        Student s3 = new Student("ayşe", 70);

        ArrayList<Student> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(Student.calcAvarage(students));


    }

    // Static demek ben sınıfa ait bir özelliğim nesne oluşturmadan beni çağır demek.
}

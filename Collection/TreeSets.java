package Collection;

import java.util.TreeSet;

public class TreeSets {
    
    public static void main(String[] args) {
        
        // Sıralanabilir set yapabiliyoruz bu güzel bir durum eldeki TreeSet'i sırayalacak compare sınıfına ihtiyacımız var o kadar.

        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator().reversed());
        students.add(new Student("Hasan", 15));
        students.add(new Student("Ahmet", 100));
        students.add(new Student("Behlül", 45));
        students.add(new Student("Hakan", 87));
        students.add(new Student("Hasan", 69));

        for (Student stu : students) {
            System.out.println(stu.getName());
        }

    }
}

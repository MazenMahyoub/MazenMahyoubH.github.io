import java.util.Scanner;

public class listOfObject {
    public static void main(String[] args) {
        DoublyLinkedList<Student>list=new DoublyLinkedList<>();
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("id\t name\t major");
            Student s=new Student(in.nextInt(), in.next(), in.next());
            list.addFirst(s);

        }
        while (!list.isEmpty())
        {
            System.out.println(list.removelast());
        }
    }
}

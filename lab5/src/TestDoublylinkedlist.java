import java.util.Scanner;

public class TestDoublylinkedlist {
    public static void main(String[] args) {
        DoublyLinkedList<String>list=new DoublyLinkedList<>();
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <6 ; i++) {
            int choice ;
            System.out.println("Your choice ");
            choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("input name");
                    list.addFirst(in.next());
                    break;

                case 2:
                    System.out.println("input name");
                    System.out.println(list.Last());
                    list.addlast(in.next());
                    System.out.println(list.Last());
                    break;
                case 3:
                    System.out.println("delete name"+list.removeFirst());
                    break;
                case 4:
                    System.out.println("delete name "+list.removelast());
                    break;
            }
            System.out.println("\nFirst="+list.First()+"\t last="+list.Last()+"\t size="+list.size());

        }
    }
}

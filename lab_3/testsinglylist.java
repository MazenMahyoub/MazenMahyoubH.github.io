
import java.util.Scanner;

public class testsinglylist {
    public static void main(String[] args) {
//        singlylinkedlist<Integer>numlist =new singlylinkedlist<>();
//        numlist.addfirst(1);
//        numlist.addlast(2);
//        numlist.addfirst(0);
//        System.out.println("size of list ="+numlist.size());
//        System.out.println("size of list ="+numlist.first());
//        System.out.println("size of list ="+numlist.last());
        singlylinkedlist<String>numlist =new singlylinkedlist<>();
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            numlist.addlast(in.next());

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(numlist.Removefirst());

            System.out.println("size of list ="+numlist.size());
            System.out.println("size of list ="+numlist.first());
            System.out.println("size of list ="+numlist.last());

        }



    }

}

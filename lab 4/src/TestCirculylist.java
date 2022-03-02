import java.util.Scanner;

public class TestCirculylist {
    public static void main(String[] args) {
        Ciruclylindlist<String>list=new Ciruclylindlist<>();
        Scanner in=new Scanner(System.in);
        int choice=-1;
        System.out.println("1Add \n"+"1Add \n"+"1Add \n"+"1Add \n"+ "1Add \n");
        while (choice!=0){
            System.out.println("YOUr cj");
            choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("input name");
                    list.addFirst(in.next());
                    System.out.println("First"+list.first());
            }
        }
    }
}

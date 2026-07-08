import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("hello bhai naam batao : ");

        String name=sc.nextLine();

        System.out.println("Ok your name is " + name);

        System.out.print("enter first value : ");

        int a=sc.nextInt();

        System.out.print("enter second value value : ");

        int b=sc.nextInt();

        System.out.println("sum is "+ (a+b));
        //if a+b are not paked in parenthesis then it will be proceeded as string and you will get ab(like a=2 and b=4 then get 24) instead of a+b(6)

        sc.close();
    }
}
import java.util.*;

public class function {

    static int sum(int a){
        if(a==0) return 0;
        return (a%10)+sum(a/10);
    }


      void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a=sc.nextInt();
        System.out.println(sum(a));
        
        sc.close();
    }
}
import java.util.*;


public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //for loop
        for(int i=1;i<11;i++){
            System.out.println("2 * "+ i +"=" + (2*i));
        }
        

        //while loop
        int j=2;
        while(j>0){
            System.out.println("BONJOUR");
            j--;
        }



        //do while loop here its xame as while but 1st do will execute in any condition like condition checking is done after first do
        int a=2;
        do{
            System.out.println("Hii");
            a--;
        }
        while(a>0);
        sc.close();
    }
    
}

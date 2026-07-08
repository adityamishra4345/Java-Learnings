import java.util.*;

public class conditional {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Age : ");

        int age=sc.nextInt();

      //if - else if - else
        if(age>100){
            System.out.println("bhai teri toh abb marne ki age ho gayi hai");
        }
        else if(age>=18){
            System.out.println("Ok now you are an Adult");
        }
        else if(age<=0){
            System.out.println("Paida to hoja bhai");
        }
       
        else if(age<18){
            System.out.println("Bhai tu abhi chota hai");
        }
        
        

    //switch - case

    System.out.println("Enter the A for NAMASTE B for HELLO And C for BONJOUR");
    String button=sc.next();
    switch(button){
        case "A" , "a":
             System.out.println("Namaste");
             break;
        case"B","b":
            System.out.println("Hello");
            break;
        case "C" , "c":
            System.out.println("BONJOUR");
            break;
        default :
            System.out.println("Wrong selection");
            break;
    }
       sc.close();
    }
    
}

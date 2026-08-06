import java.util.*;
public class Problem1 {
   static int mini(int a,int b){
        if(a>b) return b;
        else return a;
    }
   public static void main(String[] args) {
      //sc will be used to take inputs
       Scanner sc=new Scanner(System.in);
            System.out.print("enter the no of students on session 1 : ");
            //no of students in morning session
            int Morning_session=sc.nextInt();
            //array of morning session
            int[] Session_1=new int[Morning_session];

            System.out.print("Enter the roll nos. : ");
            //taking students roll nunbers in morning sessions
            for(int i=0;i<Morning_session;i++){
                Session_1[i]=sc.nextInt();
            }
            //no of students in sessions 2
            System.out.print("enter the no of students on session 2 : ");
            int Evening_session=sc.nextInt();

            int[] Session_2=new int[Evening_session];
            
            System.out.print("Enter the roll nos. : ");
            //result arr with students minimum students of both sessions
            int[] result=new int[mini(Morning_session,Evening_session)];

            //taking students roll nunbers in morning sessions
            for(int i=0;i<Evening_session;i++){
                Session_2[i]=sc.nextInt();
            }
            int i=0;
            int j=0;
            int k=0;
            //comnparing to get common roll numbers
            while(i<Morning_session && j<Evening_session){
               //comparing if equal then store in result i.e common
               if(Session_1[i]==Session_2[j]){
                  result[k]=Session_1[i];
                  k++;
                  i++;
                  j++;
               }
               else if(Session_1[i]<Session_2[j]){
                  i++;
               }
               else if(Session_1[i]>Session_2[j]){
                  j++;
               }
            }
            //printing common students
            System.out.print("Students present in Both Sessions are : ");
            for(int l=0;l<k;l++){
                System.out.print(result[l]+" ");
            }
            sc.close();
            

      
   }
}
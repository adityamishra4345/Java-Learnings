import java.util.*;
    public class arrays {
        public static void main(String[] args) {
            // int[] arr= new int[5];
            // arr[0]=1;
            // arr[1]=1;
            // arr[2]=2;
            // arr[3]=3;
            // arr[4]=4;  its methid one
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the size of array : ");
            int size=sc.nextInt();
            int arr[]=new int[size];
        
            for(int i=0;i<size;i++){
                System.out.print("Enter the value of array : ");
                arr[i]=sc.nextInt();
            }

            System.out.print("enter the no u wanna to search : ");
            int target=sc.nextInt();

            for(int i=0;i<size;i++){
                
                if(arr[i]==target){
                    System.out.println(target + " Found at " + (i+1) + "th position");
                    target=0;
                }
            }
            if(target!=0) System.out.println("Not Found");

            
        }
    }
    


import java.util.*;
public class Problem2 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            //Taking no of days in total
            System.out.print("Enter the no of days: ");
            int days=sc.nextInt();
            //consumption array
            int[] consumption=new int[days];
            //taking per day consumption 
            System.out.print("Enter the consumptions: ");
            int curr_max=1;
            int prev_max=1;
            for(int i=0;i<days;i++){
                consumption[i]=sc.nextInt();
            }
            //comparing to find max streak
            for(int j=0;j<days-1;j++){
                if(consumption[j]<consumption[j+1]){
                    curr_max++;
                }
                else{
                    //if preveous streak is lesser than current then upadating it to current
                    if(prev_max<curr_max){
                         prev_max=curr_max;
                        }
                    curr_max=1;
                }
            }
            //if preveous streak is lesser than current then upadating it to current
            if(prev_max<curr_max){
                         prev_max=curr_max;
                        }
            //printing no of days as max streak
            System.out.println("Longest Increasing Streak: "+prev_max);


        }
    }

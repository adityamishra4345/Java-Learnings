

public class gcd {
    static int hcf(int a,int b,int n){
        if(n==1) return 1;
        if(a%n==0  &&  b%n==0) return n;
        return hcf(a,b,n-1);
    }

        public static void main(String[] args) {
            System.out.println(hcf(12,15,12));
            
        }
    }
    

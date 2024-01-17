import java.util.*;
public class Whileloop {
   public static void main(String[] args) {
    int n,r,sum=0;
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the Number ");
    n=in.nextInt();
    
    while (n!=0) {
        r=n%10;
        sum=sum+r;
        n=n/10;
    }
    System.out.println("Sum of digits = "+sum);
   } 
}

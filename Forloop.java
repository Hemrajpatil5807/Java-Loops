import java.util.*;

/**
 * Forloop
 */
public class Forloop {
  public static void main(String[] args) {
    int n,i,fact=1;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the Number for Factorial ");
    n=in.nextInt();

    for(i=1;i<=n;i++)
     fact=fact*i;

    System.out.println("Factorial = "+fact); 
  }
    
}
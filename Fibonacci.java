import java.util.Scanner;

/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {
        int a=0,b=1,c,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           c=a+b;
           System.out.println(c);
           a=b;
           b=c;
        }
        sc.close();
    }
}
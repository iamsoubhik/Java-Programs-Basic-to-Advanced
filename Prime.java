import java.util.Scanner;

/**
 * Prime
 */
public class Prime {

    public static void main(String[] args) {
        int n;
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to check:");
        n=sc.nextInt();
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                temp=temp+1;
            }
        }
            if(temp==0)
            {
                System.out.println("This is prime number");
            }
            else{
                System.out.println("This is not prime number");
            }
            sc.close();
    }
}
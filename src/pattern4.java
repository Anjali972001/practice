import java.sql.SQLOutput;
import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int n=input.nextInt();
        for(int i =n;i>=1;i--)//inverting the condition of outer loop.
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the Number for Multiplication Table : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int i=1;i<=20;i++)
        {
            System.out.println(n+" * "+ i+" = "+n*i);
        }
    }
}

import java.util.Scanner;

public class NumPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int value1 = 1, value2 = 2;
        for (int x = 0; x < row; x++) {

                if(value1<=row){
                    for (int y = 0; y <= x; y++) {

                        System.out.print(value1);


                    } value1 = value1 + 2;
                    System.out.println();
                }

        }

        System.out.println();

        for (int i = 0; i < row; i++) {

            if(value2<=row){
                for (int j = 0; j <= i; j++) {

                    System.out.print(value2);


                } value2 = value2 + 2;
                System.out.println();
            }

        }
    }
}

import java.util.Scanner;

public class MyMath {

    public static int GCF(int a, int b) {
        int c = 0;
        while ( b != 0) {
            if (a>b) {
                c=b;
                b=a%b;
                a=c;
            } else {
                b = b%a;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers to find the greatest common factor: ");
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int gcf = GCF(i1,i2);
        System.out.println("greatest common factor = " + gcf);
    }
}

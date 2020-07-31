import java.util.Scanner;

public class SolucionCuadratica
{
    public static void main(String[] args)
    {
        double a, b, c;
        double x1, x2;
        Scanner kbd = new Scanner(System.in);
        
        System.out.print("a = ");
        a = kbd.nextDouble();
        System.out.print("b = ");
        b = kbd.nextDouble();
        System.out.print("c = ");
        c = kbd.nextDouble();
        
        x1 = (-b + Math.sqrt((b*b) - (4 * a * c)))/ (2*a);
        x2 = (-b - Math.sqrt((b*b) - (4 * a * c)))/ (2*a);
        
        System.out.println("x1 = " + x1);
        System.out.print("x2 = " + x2);
    }
}








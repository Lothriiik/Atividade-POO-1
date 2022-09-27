package retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        double Width = sc.nextDouble();
        double Height = sc.nextDouble();

        rect.setWidth(Width);
        rect.setHeight(Height);

        
        System.out.printf("AREA = %.2f%n",  rect.Area());
        System.out.printf("PERIMETER = %.2f%n", rect.Perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.Diagonal());


    }

    
}

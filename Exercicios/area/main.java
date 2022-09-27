package area;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import area.enums.Color;


public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");

            System.out.print("Rectangle or Circle (r/c)? ");

            char chart = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color c1 = Color.valueOf(sc.next());

            if (chart == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                list.add(new Rectangle(c1, width, height));

            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                list.add(new Circle(c1, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        
        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}
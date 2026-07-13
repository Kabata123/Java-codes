import java.util.*;
public class unitconversion {
    public static void main(String[] args) {
         Scanner unit = new Scanner(System.in);

         System.out.println("Enter the value in kilometers :");
         double n = unit.nextDouble();

        double x;

        x = n * 1000;
        System.out.println("The value which was converted is " + x + "meters");

        unit.close();
    }
}
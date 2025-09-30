import java.util.Scanner;


class Circle {
    protected int radius;

    public Circle() {
        radius = 0;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRad() {
        return radius;
    }

    public int getDiam() {
        return 2 * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class DebugCircle extends Circle {

    public DebugCircle(int radius) {
        super(radius);  
    }
    
}

public class DebugFour1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius for a circle >> ");
        int radius = input.nextInt();

        DebugCircle c = new DebugCircle(radius);

        System.out.println("The radius is " + c.getRad());
        System.out.println("The diameter is " + c.getDiam());
        System.out.println("The area is " + c.getArea());

        input.close();
    }
}

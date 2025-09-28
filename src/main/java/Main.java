public class Main {
    public static void attemptToChangePrimitive(int val) {
        System.out.println("Inside method, parameter 'val' starts as: " + val);
        val = 99; // Local change
        System.out.println("Inside method, parameter 'val' is now: " + val);
    }

    // Used for Exercise 5
    public static int sumCoordinates(Point... points) {
        // Implementation needed for Exercise 5
        int sum = 0;
        for (Point point : points) {
            sum += point.x;
        }
        return sum;
    }

    public static void main(String[] args) {
        // --- Implement all exercises here ---

        //Exercise #1
        System.out.println("Exercise 1");
        Point startPoint;
        startPoint = new Point(10,20);     //Instantiating and Initializing startPoint
        System.out.println("Starting point x value: " + startPoint.x);        //Printing startPoint x value

        startPoint.move(5,-3);      //Using Point move method
        startPoint.printState();                 //Using Point printState method
        System.out.println();

//--------------------------------------------------------------------------------------------
        //Exercise #2
        System.out.println("Exercise 2");
        int originalValue = 50;
        attemptToChangePrimitive(originalValue);
        System.out.println("New value: " + originalValue);
        System.out.println();
        /*
        The value of originalValue stayed the same even after the method because changes to the parameter
        (originalValue) within the method are only local and do not affect the original value. In
        order to get the change from the method, you will need to make a new variable and make the method
        return the new change to said variable.
        Example: int changedValue = attemptToChangePrimitive(originalValue) where attemptToChangePrimitive
        has been changed to return a value
         */

//------------------------------------------------------------------------------------------------
        //Exercise #3
        System.out.println("Exercise 3");
        Point zeroPoint = new Point();
        zeroPoint.printState();
        System.out.println();

//-----------------------------------------------------------------------------------------------
        //Exercise #5
        System.out.println("Exercise 5");
        int s1 = sumCoordinates(new Point(10,20), new Point(5,7), new Point(0,1));
        System.out.println("Sum of x-coordinates in first array: " + s1);

        Point[] points = {
                new Point(3,4),
                new Point(12,20),
                new Point(100,101)
        };
        int s2 = sumCoordinates(points);
        System.out.println("Sum of x-coordinates in second array: " + s2);
        System.out.println();

//------------------------------------------------------------------------------------------------
        //Exercise #7
        System.out.println("Exercise 4, 6, and 7 combined");
        Device d1;
        Microwave m1 = new Microwave(500,200);

        Device polyDevice = m1; //Implicit Casting (Upcasting)
        polyDevice.printDescription();
        System.out.println();
        /*
        The printDescription method that was executed was the one from the class Microwave. This is because we have
        upcasted polyDevice to being both classes Device and Microwave. Runtime polymorphism is the big factor to
        this because in Java, when a method is overridden, the JVM calls the method for the object's runtime type,
        not the variable's declared type.

        Ex: In Device polyDevice = new Microwave(), Device would be considered polyDevice's declared type while
        Microwave would be considered its runtime type, meaning that it would take the overridden methods (if there
        were any) from the class Microwave.
         */

//-------------------------------------------------------------------------------------------------
        //Exercise #8
        System.out.println("Exercise 8");
        if (polyDevice instanceof Microwave) {
            Microwave polyDevice2 = (Microwave)polyDevice;
            polyDevice2.heatFood();
        }


    }

}

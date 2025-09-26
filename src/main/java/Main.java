public class Main {
    public static void attemptToChangePrimitive(int val) {
        System.out.println("Inside method, parameter 'val' starts as: " + val);
        val = 99; // Local change
        System.out.println("Inside method, parameter 'val' is now: " + val);
    }

    // Used for Exercise 5
    public static int sumCoordinates(Point... points) {
        // Implementation needed for Exercise 5
        return 0;
    }

    public static void main(String[] args) {
        // --- Implement all exercises here ---

        //Exercise #1
        Point startPoint;
        startPoint = new Point(10,20);     //Instantiating and Initializing startPoint
        System.out.println(startPoint.x);        //Printing startPoint x value

        startPoint.move(5,-3);      //Using Point move method
        startPoint.printState();                 //Using Point printState method



    }

}

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
        System.out.println("Starting point x value: " + startPoint.x);        //Printing startPoint x value

        startPoint.move(5,-3);      //Using Point move method
        startPoint.printState();                 //Using Point printState method
        System.out.println();

//--------------------------------------------------------------------------------------------
        //Exercise #2
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




    }

}

public class Microwave extends Device {
    public int maxTime;

    public Microwave(int startPower, int maxCookingTime){
        super(startPower);
        maxTime = maxCookingTime;
    }

//---------------------------------------------------------------------------------------------
    // Exercise #6
    @Override  //Ensures method exists in super class
    public void printDescription(){ //Overridden printDescription method from super class
        super.printDescription();
        System.out.println("Max Coking Time: " + maxTime + " minutes");

    }

}

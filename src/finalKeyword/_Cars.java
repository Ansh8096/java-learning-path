package finalKeyword;

//public final class _Cars {   //  After declaring this class final,means we can't create this class subClasses...

public class _Cars {

    // After declaring it Final means we can't update this value later on..
    // also we can't generate this variable setter()...
    // method-1:
    private final int  speedLimit = 200;

    public int getSpeedLimit() {
        return speedLimit;
    }

    // method:-2:
    //we can declare the final keyword variable in constructor also (just like we did in static variables)...
    private final int  topSpeed;

    // And then we can use the constructor to initialize its value here:
    public _Cars(){
        topSpeed = 350;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    // Declaring this method final means, we can't override this method in its subclasses...
    public final void airBags(){
        System.out.println("4 Air Bags...");
    }
}

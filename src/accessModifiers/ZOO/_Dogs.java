package accessModifiers.ZOO;

public class _Dogs extends _Animals{

    // public Constructor...
    public _Dogs(String name) {
        super(name, "Bark");
    }

    public void wagTail(){
        System.out.println(getName() + " is wagging its tail ");
    }

    public void setDogSound(String newDogSound) {
        changeSound(newDogSound); // we can access 'changeSound()' method here because it is declared as protected in its parent class ...
    }
}

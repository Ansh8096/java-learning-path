package Interface.ANIMALS;

public class DOGS implements ANIMAL {
    // While implementing the interfaces,either we have to make this class abstract
    // Or we have to override all the abstract methods present in the interface...

    @Override
    public void sleep() {
        System.out.println(" Dog is sleeping...");
    }

    @Override
    public void eat() {
        System.out.println(" Dog is eating...");
    }

}

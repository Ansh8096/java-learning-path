package Interface.ANIMALS;

public class CATS implements ANIMAL {
    // While implementing the interfaces,either we have to make this class abstract
    // Or we have to override all the abstract methods present in the interface...

    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping...");
    }

}

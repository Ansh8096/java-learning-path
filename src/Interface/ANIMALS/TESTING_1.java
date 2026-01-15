package Interface.ANIMALS;

public class TESTING_1 {
    public static void main(String[] args) {
        // we can't create the object of the interface 'ANIMAL'

        DOGS doggie = new DOGS();
        doggie.eat(); doggie.sleep();

        System.out.println(doggie.MAX_AGE);
        System.out.println(ANIMAL.MAX_AGE); // we can also access static members directly with the interfaces...

        CATS cat = new CATS();
        cat.eat(); cat.sleep();
        System.out.println(cat.MAX_AGE);

        ANIMAL.info(); // this is the static method which can only be call by INTERFACE not with the class that implements this interface...

        // Default methods:-----
        doggie.run();
        cat.run();
        doggie.weightAndHeight(20,5);
        cat.weightAndHeight(12,3);


    }
}

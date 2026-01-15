package accessModifiers.ZOO;

public class testZoo {
    public static void main(String[] args) {
        _Dogs doggy = new _Dogs("Bobby");
        doggy.wagTail();
        doggy.makesSound();
        doggy.changeSound("woof"); // Since this method is protected , means this method is accessible in the class of same package (in which the class may or may not be the subclass) ...
//        doggy.setDogSound("woof");
        doggy.makesSound();
    }
}

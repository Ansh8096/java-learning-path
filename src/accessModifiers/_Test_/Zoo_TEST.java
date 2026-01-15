package accessModifiers._Test_;

import accessModifiers.ZOO._Dogs;

public class Zoo_TEST {
    public static void main(String[] args)
    {
        _Dogs doggy = new _Dogs("Bobby");
        doggy.wagTail();
        doggy.makesSound();
//        doggy.changeSound("woof"); // this method is not accessible since it is protected...

        doggy.setDogSound("woof");
        doggy.makesSound();


    }
}

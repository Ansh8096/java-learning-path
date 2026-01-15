package Abstraction;

public class _Test_ {
    public static void main(String... args){

        // We can't create new object of the abstract class...
        // _Animals_ lion = new _Animals_();

        // we can use runtime polymorphism...
        _Animals_ Doggie = new _Dogs_();
        Doggie.sayHello();

        _Cats_ oggy = new _Cats_();
        oggy.sayHello();
    }
}

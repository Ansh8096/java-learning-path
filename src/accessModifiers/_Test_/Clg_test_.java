package accessModifiers._Test_;

import accessModifiers._School_._College_;

public class Clg_test_ {
    public static void main(String[] args) {

        // the object of _College_ class will only be created once only,because of the getInstance() method...
        _College_.getInstance();
        _College_.getInstance();
        _College_.getInstance();

    }
}

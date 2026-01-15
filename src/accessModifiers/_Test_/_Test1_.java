package accessModifiers._Test_;

import accessModifiers._School_._Student_;

public class _Test1_ {
    public static void main(String[] args) {

//        _Student_ Student = new _Student_(); // Now we can't create the object of this class. (because the constructor is private)...
//        Student.age = 17;
//        Student.name = "Ansh";
//        Student.sayHello();

        _Student_.sayBye(); // we can call 'sayBye()' method directly,without creating instance of class(because 'sayBye()' is the static method)...
    }
}

package MULTI_THREADING.LambdaExpression;

public class test_Std {
    public static void main(String[] args) {
        // This is lock.lock();done by using an anonymous inner class...
        Student std = new Student() {
            @Override
            public void getBio(String name) {
                System.out.println(name + " is an engineering student...");
            }
        };
        std.getBio("Ansh");

        // This is done by using the lambda expression:----------->
        // We can only use this lambda expression on the functional Interface (means the interface have only one abstract method)...
        Student std2 = (name) -> {
            System.out.println(name + " is also an law student");
        };
        std2.getBio("Ansh");

        // we can also remove parenthesis like this,because we know we only required one parameter...
        Student std3 = name -> System.out.println(name + " is also an medical student");
        std3.getBio("Ansh");



    }
}

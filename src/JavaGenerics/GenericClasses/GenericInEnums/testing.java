package JavaGenerics.GenericClasses.GenericInEnums;

enum Operations {
    ADD,MULTIPLY,DIVIDE,SUBTRACT;
    public <T extends Number> double apply(T a , T b){
        switch (this){
            case ADD :
                return a.doubleValue() + b.doubleValue();
            case MULTIPLY:
                return a.doubleValue() * b.doubleValue();
            case DIVIDE:
                return a.doubleValue() / b.doubleValue();
            case SUBTRACT:
                return a.doubleValue() - b.doubleValue();
            default :
                throw new AssertionError("Unknown Operation : " + this);
        }
    }
}

public class testing {
    public static void main(String[] args) {
        double res1 = Operations.ADD.apply(10, 20);
        double res2 = Operations.MULTIPLY.apply(10, 20);
        System.out.println(res1);
        System.out.println(res2);

        // Operations.ADD.apply("hello","world"); // it will give us error because are T is extending 'Number'...
    }
}

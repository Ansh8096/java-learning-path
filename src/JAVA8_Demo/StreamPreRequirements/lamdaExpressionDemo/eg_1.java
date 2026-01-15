package JAVA8_Demo.StreamPreRequirements.lamdaExpressionDemo;

@FunctionalInterface
interface mathOperation{
    int operate(int a,int b);
}
public class eg_1 {
    static void main() {

// Java 8 --> allows minimal code, and enables functional programing...
// Java 8 --> comes with lambda expression, Streams, Date & Time API...

    // 'lambda expression' is an anonymous function (with no name, no return type, no access modifier)...
        // Using it with our custom interface...
        mathOperation multiplyOP = (a,b) -> a*b;
        mathOperation additionOP = (a,b) -> a+b;
        int multiply = multiplyOP.operate(2, 3);
        int add = additionOP.operate(5, 5);
        System.out.println(multiply);
        System.out.println(add);


        // Using it in Threads:---
        Thread t1  = new Thread(()-> System.out.println("heloo"));
        t1.start();
    }
}

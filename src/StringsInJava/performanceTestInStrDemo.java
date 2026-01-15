package StringsInJava;

public class performanceTestInStrDemo {
    static void main() {

        // String class :-------->
        String str = "";
        long startTime = System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            str += "hello";
        }
        long endTime =System.currentTimeMillis();
        System.out.println("Time taken by String is " + (endTime-startTime) + "ms");


        // StringBuilder class :-------->
        StringBuilder str2 = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            str2.append("hello");
        }
        endTime =System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder is " + (endTime-startTime) + "ms");


        // StringBuilder class :-------->
        StringBuffer str3 = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            str3.append("hello");
        }
        endTime =System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer is " + (endTime-startTime) + "ms");

    }
}

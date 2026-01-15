package dataTypes;

public class testString {
    public static void main(String[] args) {
        // these are the 2 ways to create strings...
//        String Name1 = new String ("Anshi");
//        String Name = "Ansh";
//        System.out.println(Name);


//        String x = "Ram";
//        String a = new String("Ram");
//        String b = new String(x);
////        These both a and b will to point to different memory location because of 'new' for "Ram" ...
//        System.out.println(a == b); // it will return false becauz they are not same..
//        String c = "Ram";
//        String d = "Ram";
//        // here c and d will point to the same memory location where "Ram" is stored because we didn't use 'new' keyword..
//        System.out.println(c == d); // this will give us true..
////        here a,b,c,d are the string reference..


        // STRING METHODS:-->

//        String name = "Ansh Verma";
//        int length = name.length();
////        System.out.println(length);
//        char c = name.charAt(length - 1);
////        System.out.println(c);
//        String name2 = "Ansh verma";
//        System.out.println(name.equals(name2)); // it will compare two strings (char by char) ...
//        System.out.println(name.equalsIgnoreCase(name2)); // it wil compare two strings and will ignore change in cases ...


//        String str1 = "remote";
//        String str2 = "ramote";
//        System.out.println('r'+0); // to find the ASCII values..
//        System.out.println('R'+0);
//        int i = str1.compareTo(str2); // it will compare chars ASCII value :
//        int i2 = str1.compareToIgnoreCase(str2); // it will compare chars ASCII value and will ignore cases:
//        // 1. if the char is equal it will go to next char until it find different one..
//        // 2. when both the char is different it will give us the difference of ASCII value of both chars(difference depends which str we are comparing)
//        System.out.println(i);
//        System.out.println(i2);

//        String name = "Ansh Verma";
//        System.out.println(name.substring(5)); // prints:-Verma
//        System.out.println(name.substring(5,9)); // prints:-Verm
//        System.out.println(name.substring(5,name.length())); // prints:-Verma
//        System.out.println(name.toUpperCase()); // it prints everything in uppercase
//        System.out.println(name.toLowerCase()); // it prints everything in lowercase

        String x = "Ansh Verma";
//        String trim = x.trim(); // it discards the extra spaces in the starting and ending of the string...
//        System.out.println(trim);
//        String new_x = x.replace("Verma","Dhiman"); // it replaces all the occurrence of Verma to Dhiman..
//        String new_x = x.replace("Verma","Dhiman").length(); // we can apply all the string methods directly to this because we are creating new string...
//        System.out.println(new_x);
        String new_x1 = x.replace('e','o'); // it replaces all the occurrence of 'e' to 'o'..
//        System.out.println(new_x1);

//        System.out.println(x.contains("A")); // it returns true..
//        System.out.println(x.contains("Ansh")); // it returns true..
//        System.out.println(x.contains("eee")); // it returns false..
        System.out.println(x.startsWith("A")); // it returns true if string starts with 'A' else false ..
        System.out.println(x.endsWith("a")); // it returns true if string ends with 'a' else false..

        String str = " ";
        System.out.println(str.isEmpty()); // it returns false because there is a space in string...
        System.out.println(str.isBlank()); // it returns true because it doesn't include spaces in string...
        System.out.println(x.indexOf("A")); // gives starting index of a in string ..
        System.out.println(x.lastIndexOf("a")); // gives last index of a in string ..
        System.out.println(x.indexOf("An")); // gives starting index of "An" in string ..
        System.out.println(x.indexOf("An" , 2)); // it will starting searching from index 2 in string for "An"..

        int a =10;
        String s = String.valueOf(a); // it converts a(int) into string(s) ....
        System.out.println(s);

        String formattedStr = String.format("My name is %s and I'm %d years old ",x,20);
        System.out.println(formattedStr);
        System.out.println(x.subSequence(2,8)); // it will return the subsequence within the given range...
    }
}

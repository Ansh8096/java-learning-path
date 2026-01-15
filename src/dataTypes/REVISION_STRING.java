package dataTypes;

public class REVISION_STRING {
    public static void main(String[] args) {
        String name = "Ansh Verma";
        System.out.println(name.length());

        char ch = name.charAt(name.length()-1);
        System.out.println(ch);

        String name1 = "Ansh verma";
        System.out.println(name.equals(name1));;
        System.out.println(name.equalsIgnoreCase(name1));

        System.out.println(name1.replace('A','S'));
        System.out.println(name1.replaceAll("verma","Dhiman"));

        int val = 100;
        String s = String.valueOf(val);
        System.out.println("this is the string value : " + s);

        System.out.println(name.subSequence(5,name.length()));
    }
}

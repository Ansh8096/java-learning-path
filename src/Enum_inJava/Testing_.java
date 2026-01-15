package Enum_inJava;

public class Testing_ {


    public static void main(String[] args) {

// While using Interface:---->
//        System.out.println(Days.Monday);
//        System.out.println(Days.Tuesday);

// While using Enum:--->
        System.out.println(day.Monday);
        System.out.println(day.Tuesday);

        // we can create object of enum like this :---->
        day Thursday = day.Thursday; // created object...

        System.out.println(Thursday.ordinal()); // it will give the index of 'Thursday' , which is in enum...
        String name1 = Thursday.name(); // By introducing local variable,we can use String methods ...
        System.out.println(name1.toUpperCase());

        // day enumDay = day.valueOf("SatUrday"); // If the 'name' string is not present in the enum , then you will get an exception...
        day enumDay = day.valueOf("Saturday"); // 'valuOf()' is the method in the Enum...
        System.out.println(enumDay);

//        day[] days = day.values(); // 'values()' is the method in Enum that returns the array of 'Enum'...
//        for(day i : days){
//            System.out.print(i + " ");
//        }

        // creating object of enum Monday ...
        day enumDay2 = day.Friday;
        // we can access the custom methods which we create in enum like this...
        enumDay2.display();
        System.out.println(enumDay2.getLower());
        System.out.println(enumDay2.getHindi());

        // We can also use Switch case here:------>
        day Tuesday = day.Tuesday;

        // We need to write Switch case with the String , because each case will return a String...
        // we don't need to write 'break;' after any case , because it is written automatically...
        String ans = switch(Tuesday){
            case Monday -> "M"; // this case will return "M"...
            case Tuesday -> "T";
            default -> "weekend"; // case for rest of the days...
        };
        System.out.println(ans);

        // THIS IS FROM SECOND METHOD OF ENUM...
        System.out.println(months.JUNE);

    }

    //  We can also create Enums like this...
    public static enum months{
        JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCOTBER,NOVEMBER,DECEMBER;
    }

}

package CollectionFrameWorks.Maps.EnumMapsDemo;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

enum Day {
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}

public class Demo {
    static void main() {
        // enumMap for storing values uses array of size same as enum...
        // eg :-> ["walk","Gym","Run",_,_,_,_]...
        // there is no hashing...
        // In this ordinal/index is used...
        // IT IS FASTER THAN HASHMAP...
        // It IS MEMORY EFFICIENT...
        Map<Day,String> enumMap = new EnumMap<>(Day.class);
        enumMap.put(Day.Monday,"walk");
        enumMap.put(Day.Wednesday,"Run");
        enumMap.put(Day.Tuesday,"Gym");
        System.out.println(Day.Tuesday.ordinal()); // this is how you see the index of any value in enum...
        System.out.println(enumMap);

    }
}
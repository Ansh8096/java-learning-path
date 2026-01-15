package innerClasses.memberInnerClass;

public class TESTING_CAR {
    public static void main(String[] args) {
        _Car_ car = new _Car_("Defender ");
        _Car_.Engine engine = car.new Engine(); // after creating the main class object, we can use that object to create object of member inner class....
        engine.starts(); engine.stops(); engine.stops();
    }
}

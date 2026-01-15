package innerClasses.staticNestedClass;

public class TESTING_computer {
    public static void main(String... a)
    {
        Computer pc = new Computer("DELL","inspiron","xyz");
        pc.getOs().displayInfo();

        Computer.USB usb = new Computer.USB("TYPE-C");
        usb.displayInfo();
    }
}

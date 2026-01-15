package Interface.DEVICES;

public interface PHONE {
    void callNumber(String number);
    void endCall();


    // We can also create main method in the interface....
    // because main method is static and interfaces can be run in interfaces....
    public static void main(String[] args) {
        System.out.println("hello,this is main method in PHONE-interface");
    }
}

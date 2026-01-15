package Interface.DEVICES;

// This is how we can effectively achieve an multiple inheritance....(not purely)
public class SMARTPHONE implements CAMERA,MUSICPLAYER,PHONE {


    @Override
    public void takePhoto() {
        System.out.println("SmartPhone is taking photo...");
    }

    @Override
    public void makeRecording() {
        System.out.println("SmartPhone is recording...");
    }

    @Override
    public void playMusic() {
        System.out.println("SmartPhone is playing music...");
    }

    @Override
    public void stopMusic() {
        System.out.println("SmartPhone stops playing music...");
    }

    @Override
    public void callNumber(String number){
        System.out.println("SmartPhone is now calling this number : " + number);
    }

    @Override
    public void endCall() {
        System.out.println("SmartPhone ends the call...");
    }
}

package Interface.DEVICES;


public class TESTING_2 {
    public static void main(String[] args) {
      SMARTPHONE Mobile = new SMARTPHONE();
      Mobile.callNumber("8295968771");
      Mobile.endCall();
      Mobile.takePhoto();
      Mobile.makeRecording();
      Mobile.playMusic();
      Mobile.stopMusic();
    }
}

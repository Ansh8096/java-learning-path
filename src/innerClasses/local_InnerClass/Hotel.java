package innerClasses.local_InnerClass;

public class Hotel {
    private String name;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String name, int totalRooms,int reservedRooms){
        this.name = name;
        this.reservedRooms = reservedRooms;
        this.totalRooms = totalRooms;
    }

    public void reserveRooms(String guestName,int numOfRooms){

    // LOCAL INNER CLASS:-------->
    // These type of classes are created in any types of method...
    // This is the class,which we used when we want to use class in certain method only...
    // This class is able to access the fields/variables of the main class...
        class reservationValidator{
            boolean validate(){

               if(guestName.isBlank()){
                   System.out.println("Guest name can't be empty!");
                   return false;
               }
               if(numOfRooms<0){
                   System.out.println("Numbers of rooms should be greater then zero...");
                   return false;
               }
               if(numOfRooms + reservedRooms > totalRooms){
                   System.out.println("Not enough rooms available...");
                   return false;
               }
               return true;
            }
    }

    // We can create the local inner class object inside the same method only...
    reservationValidator validator = new reservationValidator();
        if(validator.validate()){
            reservedRooms += numOfRooms;
            System.out.println("Reservations confirmed for " + guestName + " for " + numOfRooms + " rooms...");
        }
        else System.out.println("Reservation is failed...");
    }
}

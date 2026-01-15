package innerClasses.local_InnerClass;

public class testHotel {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("TAJ HOTEL",10,5);
        hotel.reserveRooms("Ansh",2);
        hotel.reserveRooms("Riya",-1);
        hotel.reserveRooms("",3);
        hotel.reserveRooms("Riya",3);
        hotel.reserveRooms("Seju",1);
    }
}

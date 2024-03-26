import java.util.Scanner;

class FlightDto {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Flight flight=new Flight();

        System.out.println("Enter Flight name:");
        flight.setName(sc.next());
        System.out.println("Enter Departure Airport:");
        flight.setDepartureAirport(sc.next());
        System.out.println("Enter Arrival Airport:");
        flight.setArrivalAirport(sc.next());
        System.out.println("Enter phone number:");
        flight.setPhoneNumber(sc.next());

        System.out.println("--------------------------------------");
        System.out.println("   Flight Details    ");
        System.out.println("--------------------------------------");
        System.out.println("Flight Name:"+flight.getName());
        System.out.println("Flight Departure Airport:"+flight.getDepartureAirport());
        System.out.println("Flight Arrival Airport:"+flight.getArrivalAirport());
        System.out.println("Flight phone number:"+flight.getPhoneNumber());
        System.out.println("Flight seats:"+flight.getFlighCount());
        System.out.println("--------------------------------------");

        sc.close();
    }
}
class Flight {
    private String name;
    private String phoneNumber;
    private String departureAirport;
    private String arrivalAirport;
    private static int flightSeats=50;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getDepartureAirport() {
        return departureAirport;
    }
    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }
    public String getArrivalAirport() {
        return arrivalAirport;
    }
    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }
    public int getFlighCount() {
        return flightSeats;
    }


}
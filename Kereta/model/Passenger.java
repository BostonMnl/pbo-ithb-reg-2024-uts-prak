package Kereta.model;

public class Passenger {
    private String passengerID;
    private String passengerName;
    private int passengerGender;
    private int passengerAge;

    public Passenger() {
    }

    public Passenger(String passengerID, String passengerName, int passengerGender, int passengerAge) {
        this.passengerID = passengerID;
        this.passengerName = passengerName;
        this.passengerGender = passengerGender;
        this.passengerAge = passengerAge;
    }

    public String getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getPassengerGender() {
        return passengerGender;
    }

    public void setPassengerGender(int passengerGender) {
        this.passengerGender = passengerGender;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public String getPassengerInfo() {
        return "\n---------------------\nPassenger ID : " + getPassengerID() + "\nPassenger Name : "
                + getPassengerName() + "\nPassenger Gender : " + getPassengerGender() + "\nPassenger Age : "
                + getPassengerAge() + "\n---------------------";
    }
}

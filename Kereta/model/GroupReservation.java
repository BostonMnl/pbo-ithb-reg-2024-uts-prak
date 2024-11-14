package Kereta.model;

import java.sql.Date;

public class GroupReservation extends Reservation {
    private String groupName;
    private int numberOfPassangers;

    public GroupReservation() {

    }

    public GroupReservation(String reservationID, Date reservationDate, String groupName, int numberOfPassangers) {
        super(reservationID, reservationDate);
        this.groupName = groupName;
        this.numberOfPassangers = numberOfPassangers;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getNumberOfPassangers() {
        return numberOfPassangers;
    }

    public void setNumberOfPassangers(int numberOfPassangers) {
        this.numberOfPassangers = numberOfPassangers;
    }

    @Override
    public String getReservationInfo() {
        return super.getReservationInfo() + "\nGroup Name : " + getGroupName() + "\nNumber Of Passengers : "
                + getNumberOfPassangers();
    }
}

package Kereta.model;

import java.sql.Date;

import javax.swing.JOptionPane;

public class Reservation {
    private String reservationID;
    private Date reservationDate;

    public Reservation() {

    }

    public Reservation(String reservationID, Date reservationDate) {
        this.reservationID = reservationID;
        this.reservationDate = reservationDate;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void reserveSeat() {
        int seat = Integer.parseInt(JOptionPane.showInputDialog("Pilih Kursi : "));
        System.out.println("Kursi telah dipesan");
    }

    public void cancelReservation() {

    }

    public String getReservationInfo() {
        return "\nReservation ID : " + getReservationID() + "\nReservation Date " + getReservationDate();
    }
}

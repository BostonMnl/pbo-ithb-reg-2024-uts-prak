package Kereta.control;

import java.util.ArrayList;

import Kereta.model.Ticket;

public class controller {
    public static double countTotalRevenue(ArrayList<Ticket> tiket, String tgl){
        double total=0;
        for (Ticket ticket : tiket) {
            if (ticket.getReservation().getReservationDate().equals(tgl)) {
                total++;
            }
        }
        return total;
    }
}

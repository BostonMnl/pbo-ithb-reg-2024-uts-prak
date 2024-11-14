package Kereta.main;

import Kereta.model.ClassType;
import Kereta.model.GroupReservation;
import Kereta.model.OnlinePayment;
import Kereta.model.Passenger;
import Kereta.model.Reservation;
import Kereta.model.Ticket;
import Kereta.model.TicketStatus;
import Kereta.model.Train;
import Kereta.model.TrainType;
import Kereta.view.Menu;

import java.sql.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Train train1 = new Train(001, "Lenovo", TrainType.STANDARD);
        Train train2 = new Train(002, "Advand", TrainType.STANDARD);
        Train train3 = new Train(003, "ACER", TrainType.FASTTRAIN);

        Passenger passenger1 = new Passenger("P001", "Calvin", 1, 20);
        Passenger passenger2 = new Passenger("P002", "JOCHAL", 0, 21);
        Passenger passenger3 = new Passenger("P003", "PAUL", 1, 23);

        Reservation reservation1 = new Reservation("R001", Date.valueOf("2024-09-11"));
        Reservation reservation2 = new Reservation("R002", Date.valueOf("2024-09-11"));

        GroupReservation groupReserve = new GroupReservation("R003", Date.valueOf("2024-10-01"), "Selalu Bahagia", 5);

        OnlinePayment onlinePay1 = new OnlinePayment("Tr001", "PayPal");
        OnlinePayment onlinePay2 = new OnlinePayment("Tr002", "Xendit");
        OnlinePayment onlinePay3 = new OnlinePayment("Tr003", "DOKU");

        Ticket ticket1 = new Ticket("T001", "LB01", ClassType.BUSINESS_CLASS, TicketStatus.PAID, train1, passenger1,
                reservation2, 250000, onlinePay3);
        Ticket ticket2 = new Ticket("T002", "LE01", ClassType.ECONOMY_CLASS, TicketStatus.AWITING_PAYMENT, train1,
                passenger2, groupReserve, 875000, onlinePay1);
        Ticket ticket3 = new Ticket("T003", "LE01", ClassType.FIRST_CLASS, TicketStatus.PAID, train3, passenger3,
                reservation1, 600000, onlinePay2);

        ArrayList<Ticket> tiket = new ArrayList<>();
        tiket.add(ticket1);
        tiket.add(ticket2);
        tiket.add(ticket3);

        Menu.menu(tiket);
    }
}
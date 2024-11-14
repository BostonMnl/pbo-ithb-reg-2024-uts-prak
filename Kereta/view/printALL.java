package Kereta.view;

import java.util.ArrayList;

import Kereta.model.Ticket;

public class printALL {
    public static void printTicket(ArrayList<Ticket> tiket){
        for (Ticket ticket : tiket) {
            ticket.printTicket();
        }
    }
}

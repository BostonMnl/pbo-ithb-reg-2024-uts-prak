package Kereta.view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Kereta.control.controller;
import Kereta.model.Ticket;

public class Menu {
    public static void main(String[] args) {

    }

    public static void menu(ArrayList<Ticket> tiket)  {
        int option = Integer.parseInt(JOptionPane.showInputDialog("1.Print all ticket \n2.Calculate Total Revenue"));

        switch (option) {
            case 1:
                printALL.printTicket(tiket);
                break;
            case 2:
                controller.countTotalRevenue(tiket, "2024-10-1");
                break;
            default:
                break;
        }
    }
}

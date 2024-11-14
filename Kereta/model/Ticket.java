package Kereta.model;

public class Ticket {
    private String ticketID;
    private String seatNumber;
    private ClassType classType;
    private TicketStatus status;
    private Train train;
    private Passenger passager;
    private Reservation reservation;
    private double price;
    private OnlinePayment payment;

    public Ticket() {
    }

    public Ticket(String ticketID, String seatNumber, ClassType classType, TicketStatus status, Train train,
            Passenger passager, Reservation reservation, double price, OnlinePayment payment) {
        this.ticketID = ticketID;
        this.seatNumber = seatNumber;
        this.classType = classType;
        this.status = status;
        this.train = train;
        this.passager = passager;
        this.reservation = reservation;
        this.price = price;
        this.payment = payment;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Passenger getPassager() {
        return passager;
    }

    public void setPassager(Passenger passager) {
        this.passager = passager;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OnlinePayment getPayment() {
        return payment;
    }

    public void setPayment(OnlinePayment payment) {
        this.payment = payment;
    }

    public String printTicket() {
        return "\n=========<TICKET>=========\nTicketID : " + getTicketID() + "\nSeat Number : " + getSeatNumber()
                + "\nClass Type : " + getClassType() + "\nPrice : " + getPrice() + train.getTrainDetail()
                + passager.getPassengerInfo() + "\n==========================";
    }

    public String getTicketStatus() {
        return "Status : " + getStatus();
    }
}

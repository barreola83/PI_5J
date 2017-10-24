package classes;

import java.util.Date;

public class Ticket {

    private String specialistName;
    private String description;
    private String motive;
    private Date date;
    private String status;
    private int ticketNum;
    private String location; //ubicación

    public Ticket(String specialistName, String description, String motive, Date date, String status, int ticketNum, String location) {
        this.specialistName = specialistName;
        this.description = description;
        this.motive = motive;
        this.date = date;
        this.status = status;
        this.ticketNum = ticketNum;
        this.location = location;
    }

    public String getSpecialistName() {
        return specialistName;
    }

    public String getDescription() {
        return description;
    }

    public String getMotive() {
        return motive;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public int getTicketNum() {
        return ticketNum;
    }

    public String getLocation() {
        return location;
    }

    public void setSpecialistName(String specialistName) {
        this.specialistName = specialistName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMotive(String motive) {
        this.motive = motive;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}

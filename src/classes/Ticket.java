package classes;

import java.util.Date;

public class Ticket {

    //La tabla Ticket en la BD tiene el siguiente formato: 
//| no_ticket           | int(5)      | NO   | PRI | NULL    |       |
//| nombre_especialista | varchar(20) | NO   |     | NULL    |       |
//| descripcion         | varchar(80) | NO   |     | NULL    |       |
//| motivo              | varchar(40) | NO   |     | NULL    |       |
//| fecha               | datetime    | NO   |     | NULL    |       |
//| status              | varchar(9)  | NO   |     | NULL    |       |
//| ubicacion           | varchar(40) | NO   |     | NULL    |       |
    private int ticketNum;
    private String specialistName;
    private String description;
    private String motive;
    private Date date;
    private String status;
    private String location; //ubicación

    public Ticket(int ticketNum, String specialistName, String description, String motive, Date date, String status, String location) {
        this.ticketNum = ticketNum;
        this.specialistName = specialistName;
        this.description = description;
        this.motive = motive;
        this.date = date;
        this.status = status;
        this.location = location;
    }

    public int getTicketNum() {
        return ticketNum;
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

    public String getLocation() {
        return location;
    }

    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
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

    public void setLocation(String location) {
        this.location = location;
    }
}

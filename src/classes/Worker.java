package classes;

import java.util.Date;

public class Worker {

    //La tabla Workers en la BD tiene el siguiente formato:
    //| no_trabajador     | int(4)      | NO   | PRI | NULL    |       |
    //| cargo             | varchar(20) | NO   |     | NULL    |       |
    //| nombre            | varchar(30) | NO   |     | NULL    |       |
    //| correo            | varchar(30) | NO   |     | NULL    |       |
    //| tickets_asignados | int(3)      | NO   |     | NULL    |       |
    //| status            | varchar(9)  | NO   |     | NULL    |       |
    //| area              | varchar(25) | NO   |     | NULL    |       |
    //| horario           | datetime    | NO   |     | NULL    |       |
    //| contrasena        | varchar(16) | NO   |     | NULL    |       |
    private String position;
    private int workerNum;
    private String name;
    private String fLastName; //apellido paterno / primer apellido
    private String sLastName; //apellido materno / segundo apellido
    private String email;
    private String designateTicket; //ticket asignado
    private String status;
    private String area;
    private Date timeTable;
    private String password;

    public Worker(String position, int workerNum, String name, String fLastName, String sLastName, String email, String designateTicket, String status, String area, Date timeTable, String password) {
        this.position = position;
        this.workerNum = workerNum;
        this.name = name;
        this.fLastName = fLastName;
        this.sLastName = sLastName;
        this.email = email;
        this.designateTicket = designateTicket;
        this.status = status;
        this.area = area;
        this.timeTable = timeTable;
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public int getWorkerNum() {
        return workerNum;
    }

    public String getName() {
        return name;
    }

    public String getfLastName() {
        return fLastName;
    }

    public String getsLastName() {
        return sLastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDesignateTicket() {
        return designateTicket;
    }

    public String getStatus() {
        return status;
    }

    public String getArea() {
        return area;
    }

    public Date getTimeTable() {
        return timeTable;
    }

    public String getPassword() {
        return password;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setWorkerNum(int workerNum) {
        this.workerNum = workerNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setfLastName(String fLastName) {
        this.fLastName = fLastName;
    }

    public void setsLastName(String sLastName) {
        this.sLastName = sLastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDesignateTicket(String designateTicket) {
        this.designateTicket = designateTicket;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setTimeTable(Date timeTable) {
        this.timeTable = timeTable;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package classes;

import java.util.Date;

public class Dependencies {
    
    //La tabla Dependencies en la BD tiene el siguiente formato:
    //| nombre    | varchar(15) | NO   | PRI | NULL    |       |
    //| directivo | varchar(15) | NO   |     | NULL    |       |
    //| telefono  | int(10)     | NO   |     | NULL    |       |
    //| horario   | datetime    | NO   |     | NULL    |       |

    private String name;
    private String executive;
    private int phone;
    private Date timeTable;

    public Dependencies(String name, String executive, int phone, Date timetable) {
        this.name = name;
        this.executive = executive;
        this.phone = phone;
        this.timeTable = timetable;
    }

    public String getName() {
        return name;
    }

    public String getExecutive() {
        return executive;
    }

    public int getPhone() {
        return phone;
    }

    public Date getTimetable() {
        return timeTable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExecutive(String executive) {
        this.executive = executive;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setTimetable(Date timetable) {
        this.timeTable = timetable;
    }
}

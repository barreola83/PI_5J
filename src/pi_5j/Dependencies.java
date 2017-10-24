package pi_5j;

import java.util.Date;

public class Dependencies {
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

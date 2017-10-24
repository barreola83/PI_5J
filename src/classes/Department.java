package classes;

import java.util.Date;

public class Department {
    private Date timeTable;
    private String name;
    private int extension;
    private String monitor;

    public Department(Date timeTable, String name, int extension, String monitor) {
        this.timeTable = timeTable;
        this.name = name;
        this.extension = extension;
        this.monitor = monitor;
    }

    public Date getTimeTable() {
        return timeTable;
    }

    public String getName() {
        return name;
    }

    public int getExtension() {
        return extension;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setTimeTable(Date timeTable) {
        this.timeTable = timeTable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
}

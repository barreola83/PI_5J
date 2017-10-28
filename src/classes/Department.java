package classes;

import java.util.Date;

public class Department {
    
    //La tabla Departments en la DB tiene el siguiente formato:
    //| nombre    | varchar(15) | NO   | PRI | NULL    |       |
    //| extension | int(5)      | NO   |     | NULL    |       |
    //| encargado | int(5)      | NO   |     | NULL    |       |
    //| horario   | datetime    | NO   |     | NULL    |       |

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

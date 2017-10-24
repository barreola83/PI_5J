package classes;

import java.util.Date;

public class logBook { //bitacora

    private int regNumber;
    private Date arrivalTime; //hora de llegada
    private Date releaseTime; //hora de salida
    private String arrivalGasLevel; //nivel_gas_llegada
    private String releaseGasLevel; //nivel_gas_salida
    private String odometerArrival; //kilometraje de llegada
    private String odometerRelease; //kilometraje de salida

    public logBook(int regNumber, Date arrivalTime, Date releaseTime, String arrivalGasLevel, String releaseGasLevel, String odometerArrival, String odometerRelease) {
        this.regNumber = regNumber;
        this.arrivalTime = arrivalTime;
        this.releaseTime = releaseTime;
        this.arrivalGasLevel = arrivalGasLevel;
        this.releaseGasLevel = releaseGasLevel;
        this.odometerArrival = odometerArrival;
        this.odometerRelease = odometerRelease;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public String getArrivalGasLevel() {
        return arrivalGasLevel;
    }

    public String getReleaseGasLevel() {
        return releaseGasLevel;
    }

    public String getOdometerArrival() {
        return odometerArrival;
    }

    public String getOdometerRelease() {
        return odometerRelease;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public void setArrivalGasLevel(String arrivalGasLevel) {
        this.arrivalGasLevel = arrivalGasLevel;
    }

    public void setReleaseGasLevel(String releaseGasLevel) {
        this.releaseGasLevel = releaseGasLevel;
    }

    public void setOdometerArrival(String odometerArrival) {
        this.odometerArrival = odometerArrival;
    }

    public void setOdometerRelease(String odometerRelease) {
        this.odometerRelease = odometerRelease;
    }

    public int getRegNumber() {
        return regNumber;
    }
}

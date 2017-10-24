package classes;

public class Vehicle {
    private String status;
    private String model;
    private String brand;
    private int year;
    private String licensePlate; //placa del carro

    public Vehicle(String status, String model, String brand, int year, String licensePlate) {
        this.status = status;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.licensePlate = licensePlate;
    }

    public String getStatus() {
        return status;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}


package pi_5j;

public class Service {
    private int serviceNumber;
    private String name;
    private String catService;

    public Service(int serviceNumber, String name, String catService) {
        this.serviceNumber = serviceNumber;
        this.name = name;
        this.catService = catService;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public String getName() {
        return name;
    }

    public String getCatService() {
        return catService;
    }

    public void setServiceNumber(int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCatService(String catService) {
        this.catService = catService;
    }
}

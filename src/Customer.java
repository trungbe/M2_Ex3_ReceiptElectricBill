public class Customer {
    private String name;
    private int houseNumber;
    private int clientId;

    public Customer(String name, int houseNumber, int clientId) {
        this.name = name;
        this.houseNumber = houseNumber;
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", houseNumber=" + houseNumber +
                ", clientId=" + clientId +
                '}';
    }
}

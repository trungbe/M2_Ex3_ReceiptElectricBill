public class Receipt {
    private Customer customer;
    private int oldIndex;
    private int newIndex;

    public Receipt(Customer customer, int oldIndex, int newIndex) {
        this.customer = customer;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }


    public int getTotalMoney() {
        return (newIndex - oldIndex) * 750;
    }

    public int getClientID() {
        return this.customer.getClientId();
    }
}

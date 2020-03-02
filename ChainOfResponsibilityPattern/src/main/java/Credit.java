public class Credit {

    private String customerName;
    private int amount;

    public Credit(String customerName, int amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

public class Check extends Payment {
    private String name;
    private String bankID;

    public void authorized() {
        System.out.println("Authorizing...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankID() {
        return bankID;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
    }
}
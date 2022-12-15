
import java.time.LocalDate;

public class Credit extends Payment {
    private String number;
    private String type;
    private LocalDate expDate;

    public void authorized() {
        System.out.println("Authorizing...");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }
}
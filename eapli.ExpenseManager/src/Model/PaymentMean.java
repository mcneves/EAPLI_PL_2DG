package Model;

public class PaymentMean {
    
    private String description;
    
    public PaymentMean(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String toString(){
        return "Payment Mean: " + description;
    }
}

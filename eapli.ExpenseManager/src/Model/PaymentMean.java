package Model;

import javax.persistence.*;

@Entity
public class PaymentMean {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String description;
    
    protected PaymentMean(){
    }
    
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

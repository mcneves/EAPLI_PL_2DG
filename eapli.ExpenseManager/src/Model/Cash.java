package Model;

import javax.persistence.*;

@Entity
public class Cash extends PaymentMean {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Cash() {
        super("Cash");
    }
}


import java.time.LocalDate;

@Entity
public class MyDocument {

    @Id
    private Long id;

    //This field should be replaced with field validFrom and validTo
    @Column
    private String status;

    //This field should be added the same time
    @Column
    private LocalDate validFrom;

    //This field should be added the same time
    @Column
    private LocalDate validTo;

    public String getStatus() {
        return status;
    }
}

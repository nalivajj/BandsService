package backend.Entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by naliv on 12.12.2017.
 */
@Entity
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date_of_start")
    private Date dateOfStart;

    @Column(name = "date_of_end")
    private Date dateOfEnd;
}

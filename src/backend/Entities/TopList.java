package backend.Entities;

import javax.persistence.*;

@Entity
@Table(name = "top_list")
public class TopList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String text;
}

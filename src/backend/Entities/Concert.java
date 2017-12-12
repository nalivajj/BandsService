package backend.Entities;

import javax.persistence.*;

@Entity
public class Concert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "url_to_youtube")
    private String urlToYoutube;

}

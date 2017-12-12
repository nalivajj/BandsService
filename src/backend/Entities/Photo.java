package backend.Entities;

import javax.persistence.*;

@Entity
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String url;

    @Column(name = "is_main_photo")
    private boolean isMainPhoto;

}

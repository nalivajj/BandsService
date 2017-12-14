package backend.Entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "band_rating")
public class BandRating extends Rating {

    @ManyToOne
    @JoinColumn(name = "band_id")
    private Band band;

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }
}

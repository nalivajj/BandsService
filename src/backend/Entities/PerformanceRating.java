package backend.Entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "performance_rating")
public class PerformanceRating extends Rating {

    @ManyToOne
    @JoinColumn(name = "performance_id")
    private Performance performance;

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }
}

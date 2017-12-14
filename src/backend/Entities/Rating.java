package backend.Entities;

import javax.persistence.*;

@MappedSuperclass
public abstract class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

    @Column
    protected byte point;

    @ManyToOne
    @JoinColumn(name = "user_id")
    protected User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getPoint() {
        return point;
    }

    public void setPoint(byte point) {
        this.point = point;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

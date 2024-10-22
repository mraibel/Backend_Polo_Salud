package sdp.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_poll", nullable = false)
    private Integer id_poll;
    private String name;
    private String link;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    public Poll() {
    }

    public Integer getId_poll() {
        return id_poll;
    }
    public void setId_poll(Integer id_poll) {
        this.id_poll = id_poll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
}

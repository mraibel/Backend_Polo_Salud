//imports 
package sdp.api.model;
import java.util.Date;
import jakarta.persistence.*;
@Entity
public class Suggestion{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_suggestion", nullable = false)
    private Integer id_suggestion;
    private String title;
    private String description;
    //date:timestamp
    private Date date;
    // FK con id user
    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    //setters y getters
    public Integer getId_suggestion() {
        return id_suggestion;
    }
    public void setId_suggestion(Integer id_suggestion) {
        this.id_suggestion = id_suggestion;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
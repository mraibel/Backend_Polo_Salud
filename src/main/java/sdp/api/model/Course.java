package sdp.api.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id_course", nullable = false)
    private Integer id_course;
    private String name;
    private String description;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    public Integer getId_course() {
        return id_course;
    }
    
    public void setId_course(Integer id_course) {
        this.id_course = id_course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

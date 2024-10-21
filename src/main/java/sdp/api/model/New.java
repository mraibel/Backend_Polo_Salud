package sdp.api.model;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
public class New {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_new", nullable = false)
    private Integer id_new;

    private String title;
    private String subtitle;
    private String lead;
    private String body;
    private Date date;

    /* Relaciones */




    /* Gets and Setters */
    public Integer getId_new() {
        return id_new;
    }
    public void setId_new(Integer id_new) {
        this.id_new = id_new;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getSubtitle() {
        return subtitle;
    }
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
    public String getLead() {
        return lead;
    }
    public void setLead(String lead) {
        this.lead = lead;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    

}

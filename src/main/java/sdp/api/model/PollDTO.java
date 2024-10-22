package sdp.api.model;

public class PollDTO {
    private Integer id_poll;
    private String name;
    private String link;

    public PollDTO() {
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

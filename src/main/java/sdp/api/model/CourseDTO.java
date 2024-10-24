package sdp.api.model;

public class CourseDTO {
    private Integer id_course;
    private String name;
    private String description;
    private String date;

    public CourseDTO(){
    }
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
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}

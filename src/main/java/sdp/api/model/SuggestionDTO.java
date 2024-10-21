package sdp.api.model;

public class SuggestionDTO{
    private Integer id_suggestion;
    private String title;
    private String description;
    private String date;
    
    public SuggestionDTO(){
    }
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
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}
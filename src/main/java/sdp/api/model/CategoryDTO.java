package sdp.api.model;

public class CategoryDTO {
    private Integer id_category;
    private String name;

    public CategoryDTO(){
    }

    public Integer getId_category() {
        return id_category;
    }
    public void setId_category(Integer id_category) {
        this.id_category = id_category;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}

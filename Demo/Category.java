

@Entity
@Table(name="categories")
//annoatation is data about the data
public class Category {
    //product category
    private @NotBlank String categoryName;
    //which product
    private @NotBlank String description;
    private @NotBlank String imageUrl;
    //default constructor
    public Category(){

    }
    //parameter constructor
    public Category(@NotBlank String categoryName,@NotBlank String description){
        this.categoryName=categoryName;
        this.description=description;
    }
//parameter constructor
    public Category(@NotBlank String categoryName, @NotBlank String description, @NotBlank String imageUrl) {
        this.categoryName = categoryName;
        this.description = description;
        this.imageUrl = imageUrl;
    }
    //get property to retrive product name
    public String getCategoryName(){
        return this.categoryName;
    }
    //get property
    public String getDescription(){

    }
    //set property
    public String setDescription(){

    }
    //set value
    public String setCategoryName(){
this.categoryName=this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    //get image Url
    public String getImageUrl(){
        return this.imageUrl;

    }
    public void setImageUrl(String imageUrl){
        this.imageUrl=this.imageUrl;
    }
    public Integer getId(){

    }
    public Integer setId(){

    }
    @Override
    public String toString() {
        return "User {category id=" + id + ", category name='" + categoryName + "', description='" + description + "'}";
    }
}
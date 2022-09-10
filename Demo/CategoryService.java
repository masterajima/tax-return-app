@Service
public class CategoryService{
    private  Categoryrepository categoryrepository;
    public List<>listCategories(Category){
       return categoryrepository.findAll();
    }
    public void createCategory(){
        categoryrepository.save(category);
    }
    //save method to retrive category by name
    public Category readCategory(){
        return categoryrepository.findByCategoryName(categoryName);
    }
    //create product category and save it in category
    public void createCategory(){
        categoryrepository.save(category);
    }
    //find product by id and using repository
    public Optional<Category> readCategory(){
        return categoryrepository.findById()
    }
    //update item in the list
    public void updateCategory(){
        Category category=categoryrepository.findById(categoryID).get();
        category.setCategoryName(newCategory.getCategoryName());
        category.setDescription(newCategory.getDescription());
        category.setImageUrl(newCategory.getImageUrl());
        categoryrepository.save(category);

    }

}
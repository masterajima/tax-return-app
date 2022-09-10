import java.util.List;
import.java.util.Object;
import.javax.validation.valid;
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/");
    public ResponseEntity<List<Category>>getCategories(){
        List<Category> body=categoryService.listCategories();
        return new ResponseEntity<>(body,HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ApiResponse> createCategory(@Valid @RequestBody Category category){
        if(Objects.nonNull(categoryService.readCategory(category.getCategoryName()))){
            return new ResponseEntity<ApiResponse>(new ApiResponse(false,"category already exixst"),HttpStatus.CONFLICT)
        }
        //response Api that category updated
        public ResponseEntity<ApiResponse> updateCategory(@PathVariable(categoryId),Integer categoryId,@RequestBody Category category){
            //check to see if category exist or not
            if(Objects.nonNull(categoryService.readCategory(categoryId))){
                categoryService.updateCategory(categoryId,category);
                return new ResponseEntity<ApiResponse>(new ApiResponse(true,'Api response updated'),HttpStatus.OK);

            }
            return new ResponseEntity<>(new ApiResponse(false,"Api response does not exit"),HttpStatus.NOT_FOUND)
        }

    }
}
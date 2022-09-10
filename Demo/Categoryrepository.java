public interface Categoryrepository extends JpaRepository<Category,Integer>{
    Category findByCategoryName(String categoryName){

    }
}
import java.util.List;

public interface IRepository<T> {
    boolean add(T item);
    boolean removeById(String id);
    T findById(String Id);
    List<T> findALl();

    List<Product> findAll();
}

package itesm.ecommerce.domain.repository;
import itesm.ecommerce.domain.model.Product;

public interface ProductRepository {
    public Product insertProduct(Product product);
}

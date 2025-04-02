package itesm.ecommerce.application.service;


import itesm.ecommerce.domain.model.Product;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import itesm.ecommerce.domain.repository.ProductRepository;

@ApplicationScoped
public class ProductService {

    @Inject
    ProductRepository productRepository;

    public Product createProduct(Product product) {
        return repository.insertProduct(product);
    }
}
package itesm.ecommerce.infrastructure.persistence.mapper;

import itesm.ecommerce.domain.model.Product;
import itesm.ecommerce.infrastructure.persistence.entity.ProductEntity;


public class ProductMapper {
    public static ProductEntity toEntity(Product product) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(product.getName());
        productEntity.setDescription(product.getDescription());
        productEntity.setPrice(product.getPrice());
        return productEntity;
    }
public static Product toDomain(ProductEntity productEntity) {
        Product product = new Product();
        product.setName(productEntity.getName());
        product.setDescription(productEntity.getDescription());
        product.setPrice(productEntity.getPrice());
        return product;
    }
    
}

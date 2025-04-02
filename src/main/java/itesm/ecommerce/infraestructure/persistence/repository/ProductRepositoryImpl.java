package itesm.ecommerce.infrastructure.persistence.repository;

import itesm.ecommerce.domain.model.Product;
import itesm.ecommerce.infrastructure.persistence.entity.ProductEntity;
import itesm.ecommerce.infrastructure.persistence.mapper.ProductMapper;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.criteria.CriteriaBuilder.In;
import itesm.ecommerce.domain.repository.ProductRepository;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class ProductRepositoryImpl implements ProductRepository, PanacheRepositoryBase<ProductEntity, Integer> {

    @Override
    @Transactional
    public Product insertProduct(Product product) {
        persist(ProductMapper.toEntity(product));
        flush();
        return product;
    }
}


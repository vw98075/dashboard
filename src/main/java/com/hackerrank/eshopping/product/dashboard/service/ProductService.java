package com.hackerrank.eshopping.product.dashboard.service;

import com.hackerrank.eshopping.product.dashboard.model.Product;
import com.hackerrank.eshopping.product.dashboard.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing {@link Product}.
 */
@Service
@Transactional
public class ProductService {

    private final Logger log = LoggerFactory.getLogger(ProductService.class);

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * Save a product.
     *
     * @param product the entity to save.
     * @return the persisted entity.
     */
    public Product save(Product product) {
        log.debug("Request to save Product : {}", product);
        return productRepository.save(product);
    }

    /**
     * Partially update a product.
     *
     * @param product the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<Product> partialUpdate(Product product) {
        log.debug("Request to partially update Product : {}", product);

        return productRepository
            .findById(product.getId())
            .map(
                existingProduct -> {
                    if (product.getName() != null) {
                        existingProduct.setName(product.getName());
                    }
                    if (product.getCategory() != null) {
                        existingProduct.setCategory(product.getCategory());
                    }
                    if (product.getRetailPrice() != null) {
                        existingProduct.setRetailPrice(product.getRetailPrice());
                    }
                    if (product.getDiscountedPrice() != null) {
                        existingProduct.setDiscountedPrice(product.getDiscountedPrice());
                    }
                    if (product.getAvailability() != null) {
                        existingProduct.setAvailability(product.getAvailability());
                    }

                    return existingProduct;
                }
            )
            .map(productRepository::save);
    }

    /**
     * Get all the products.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<Product> findAll(Pageable pageable) {
        log.debug("Request to get all Products");
        return productRepository.findAll(pageable);
    }

    /**
     * Get one product by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<Product> findOne(Long id) {
        log.debug("Request to get Product : {}", id);
        return productRepository.findById(id);
    }

    /**
     * Delete the product by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete Product : {}", id);
        productRepository.deleteById(id);
    }

    /**
     * Get products by category.
     *
     * @param category of the products.
     * @return the entity list.
     */
    public List<Product> findByCategory(String category){

        return productRepository.findByCategoryOrderByAvailabilityDescDiscountedPriceAscIdAsc(category);
    }

    /**
     * Get products by category.
     *
     * @param category of the products.
     * @param availability of the products.
     * @return the entity list.
     */
    public List<Product> findByCategoryAndAvailiability(String category, Boolean availability){
        return productRepository.findByCategoryAndAvailabilityOrderByDiscountedPriceAscIdAsc(category, availability);
    }

    /**
     * Get all products ordered by id asc.
     *
     * @return the entity list.
     */
    public List<Product> findAll(){
        return productRepository.findAllByOrderByIdAsc();
    }
}

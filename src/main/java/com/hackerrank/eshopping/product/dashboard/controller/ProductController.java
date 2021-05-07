package com.hackerrank.eshopping.product.dashboard.controller;

import com.hackerrank.eshopping.product.dashboard.model.Product;
import com.hackerrank.eshopping.product.dashboard.repository.ProductRepository;
import com.hackerrank.eshopping.product.dashboard.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing {@link com.hackerrank.eshopping.product.dashboard.model.Product}.
 */
@RestController
public class ProductController {

    private final Logger log = LoggerFactory.getLogger(ProductController.class);

    private static final String ENTITY_NAME = "product";

    private final ProductService productService;

    private final ProductRepository productRepository;

    public ProductController(ProductService productService, ProductRepository productRepository) {
        this.productService = productService;
        this.productRepository = productRepository;
    }

    /**
     * {@code POST  /products} : Create a new product.
     *
     * @param product the product to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new product, or with status {@code 400 (Bad Request)} if the product has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/products")
    public ResponseEntity<?> createProduct(@Valid @RequestBody Product product) {
        log.debug("REST request to save Product : {}", product);
        Long productId = product.getId();
        if (productId != null && productService.findOne(productId).isPresent()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Product result = productService.save(product);
        return new ResponseEntity<Product>(result, HttpStatus.CREATED);
    }

    /**
     * {@code PUT  /products/:id} : Updates an existing product.
     *
     * @param id the id of the product to save.
     * @param product the product to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated product,
     * or with status {@code 400 (Bad Request)} if the product is not valid,
     * or with status {@code 500 (Internal Server Error)} if the product couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/products/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable(value = "id") final Long id, @RequestBody Product product) {
        log.debug("REST request to update Product : {}, {}", id, product);

        if (!productRepository.existsById(id)) {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
        product.setId(id);
        Optional<Product> result = productService.partialUpdate(product);
        return result.isPresent() ?
                new ResponseEntity<Product>(result.get(), HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    /**
     * {@code GET  /products/:id} : get the "id" product.
     *
     * @param id the id of the product to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the product, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long id) {
        log.debug("REST request to get Product : {}", id);
        Optional<Product> product = productService.findOne(id);
        return product.isPresent() ?
                new ResponseEntity<Product>(product.get(), HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /**
     * {@code DELETE  /products/:id} : delete the "id" product.
     *
     * @param id the id of the product to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/products/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        log.debug("REST request to delete Product : {}", id);
        productService.delete(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    /**
     * {@code GET  /products} : get all the products.
     *
     * @param categoryOptional
     * @param availabilityOptional
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of products in body.
     */
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(@RequestParam(name="category") Optional<String> categoryOptional,
                                                     @RequestParam(name="availability") Optional<Integer> availabilityOptional){
        log.debug("REST request to get all Products");
        if(categoryOptional.isPresent()){
            return (availabilityOptional.isPresent()) ?
                    new ResponseEntity<>(productService.findByCategoryAndAvailiability(
                            categoryOptional.get().replace("%20", " "),
                            (availabilityOptional.get() == 1) ? true : false), HttpStatus.OK) :
                    new ResponseEntity<>(productService.findByCategory(
                            categoryOptional.get().replace("%20", " ")),
                            HttpStatus.OK);
        }
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }
}

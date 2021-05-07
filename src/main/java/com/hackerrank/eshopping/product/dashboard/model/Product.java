package com.hackerrank.eshopping.product.dashboard.model;

import com.sun.istack.NotNull;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A Product.
 */
@Entity
@Table(name = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Size(min = 2, max = 80)
    @Column(name = "name", length = 80, nullable = false)
    private String name;

    @NotNull
    @Size(min = 2, max = 60)
    @Column(name = "category", length = 60, nullable = false)
    private String category;

    @NotNull
    @DecimalMin(value = "0.01")
    @DecimalMax(value = "999.99")
    @Column(name = "retail_price", nullable = false)
    private Double retailPrice;

    @DecimalMin(value = "0.01")
    @DecimalMax(value = "999.99")
    @Column(name = "discounted_price")
    private Double discountedPrice;

    @Column(name = "availability")
    private Boolean availability;

//    @Transient
//    @Formula(value = "coalesce((retailPrice - discountedPrice) * 100 / NULLIF(retailPrice, 0), 0)")
//    private int discountPercentage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product id(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Product name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return this.category;
    }

    public Product category(String category) {
        this.category = category;
        return this;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getRetailPrice() {
        return this.retailPrice;
    }

    public Product retailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
        return this;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Double getDiscountedPrice() {
        return this.discountedPrice;
    }

    public Product discountedPrice(Double discountedPrice) {
        this.discountedPrice = discountedPrice;
        return this;
    }

    public void setDiscountedPrice(Double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public Boolean getAvailability() {
        return this.availability;
    }

    public Product availability(Boolean availability) {
        this.availability = availability;
        return this;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Product)) {
            return false;
        }
        return id != null && id.equals(((Product) o).id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Product{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", category='" + getCategory() + "'" +
            ", retailPrice=" + getRetailPrice() +
            ", discountedPrice=" + getDiscountedPrice() +
            ", availability='" + getAvailability() + "'" +
            "}";
    }
}

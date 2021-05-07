package com.hackerrank.eshopping.product.dashboard;

import com.hackerrank.test.utility.Order;
import com.hackerrank.test.utility.OrderedTestRunner;
import com.hackerrank.test.utility.ResultMatcher;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@IntegrationTest
@RunWith(OrderedTestRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ProductsControllerTest {

    private static final String ENTITY_API_URL = "/products";
    private static final String ENTITY_API_URL_ID = ENTITY_API_URL + "/{id}";

    @ClassRule
    public static final SpringClassRule springClassRule = new SpringClassRule();

    @Rule
    public final SpringMethodRule springMethodRule = new SpringMethodRule();

    @Autowired
    private MockMvc mockMvc;

    /**
     *
     * @throws Exception
     *
     * It tests creating a product
     */
    @Test
    @Order(1)
    public void createProduct() throws Exception {
        /**
         *
         * Create product with id 1
         *
         * The request body is:
         * {
         *     "id": 1,
         *     "name": "Dressing Gown",
         *     "category": "Full Body Outfits",
         *     "retail_price": 303.0,
         *     "discountedPrice": 251.49,
         *     "availability": true
         * }
         */
        String json = "{\"id\": 1, \"name\": \"Dressing Gown\", \"category\": \"Full Body Outfits\", \"retailPrice\": 303.0, \"discountedPrice\": 251.49, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 2
         *
         * The request body is:
         * {
         *     "id": 2,
         *     "name": "Shoes",
         *     "category": "Footwear",
         *     "retailPrice": 150.0,
         *     "discountedPrice": 123.0,
         *     "availability": true
         * }
         */
        json = "{\"id\": 2, \"name\": \"Shoes\", \"category\": \"Footwear\", \"retailPrice\": 150.0, \"discountedPrice\": 123.0, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 3
         *
         * The request body is:
         * {
         *     "id": 3,
         *     "name": "Nightgown",
         *     "category": "Full Body Outfits",
         *     "retailPrice": 307.0,
         *     "discountedPrice": 254.81,
         *     "availability": true
         * }
         */
        json = "{\"id\": 3, \"name\": \"Nightgown\", \"category\": \"Full Body Outfits\", \"retailPrice\": 307.0, \"discountedPrice\": 254.81, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 4
         *
         * The request body is:
         * {
         *     "id": 4,
         *     "name": "Boots",
         *     "category": "Footwear",
         *     "retailPrice": 162.0,
         *     "discountedPrice": 132.84,
         *     "availability": true
         * }
         */
        json = "{\"id\": 4, \"name\": \"Boots\", \"category\": \"Footwear\", \"retailPrice\": 162.0, \"discountedPrice\": 132.84, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 5
         *
         * The request body is:
         * {
         *     "id": 5,
         *     "name": "Ball Gown",
         *     "category": "Full Body Outfits",
         *     "retailPrice": 337.0,
         *     "discountedPrice": 272.97,
         *     "availability": true
         * }
         */
        json = "{\"id\": 5, \"name\": \"Ball Gown\", \"category\": \"Full Body Outfits\", \"retailPrice\": 337.0, \"discountedPrice\": 272.97, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 6
         *
         * The request body is:
         * {
         *     "id": 6,
         *     "name": "Shawl",
         *     "category": "Accessories",
         *     "retailPrice": 283.0,
         *     "discountedPrice": 260.36,
         *     "availability": true
         * }
         */
        json = "{\"id\": 6, \"name\": \"Shawl\", \"category\": \"Accessories\", \"retailPrice\": 283.0, \"discountedPrice\": 260.36, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 7
         *
         * The request body is:
         * {
         *     "id": 7,
         *     "name": "Belt",
         *     "category": "Accessories",
         *     "retailPrice": 471.0,
         *     "discountedPrice": 419.19,
         *     "availability": true
         * }
         */
        json = "{\"id\": 7, \"name\": \"Belt\", \"category\": \"Accessories\", \"retailPrice\": 471.0, \"discountedPrice\": 419.19, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 8
         *
         * The request body is:
         * {
         *     "id": 8,
         *     "name": "Kaftan",
         *     "category": "Accessories",
         *     "retailPrice": 237.0,
         *     "discountedPrice": 215.67,
         *     "availability": true
         * }
         */
        json = "{\"id\": 8, \"name\": \"Kaftan\", \"category\": \"Accessories\", \"retailPrice\": 237.0, \"discountedPrice\": 215.67, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 9
         *
         * The request body is:
         * {
         *     "id": 9,
         *     "name": "Overalls",
         *     "category": "Full Body Outfits",
         *     "retailPrice": 374.0,
         *     "discountedPrice": 321.64,
         *     "availability": true
         * }
         */
        json = "{\"id\": 9, \"name\": \"Overalls\", \"category\": \"Full Body Outfits\", \"retailPrice\": 374.0, \"discountedPrice\": 321.64, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 10
         *
         * The request body is:
         * {
         *     "id": 10,
         *     "name": "Cufflinks",
         *     "category": "Accessories",
         *     "retailPrice": 284.0,
         *     "discountedPrice": 247.08,
         *     "availability": true
         * }
         */
        json = "{\"id\": 10, \"name\": \"Cufflinks\", \"category\": \"Accessories\", \"retailPrice\": 284.0, \"discountedPrice\": 247.08, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 11
         *
         * The request body is:
         * {
         *     "id": 11,
         *     "name": "Cargos",
         *     "category": "Bottoms",
         *     "retailPrice": 498.0,
         *     "discountedPrice": 428.28,
         *     "availability": true
         * }
         */
        json = "{\"id\": 11, \"name\": \"Cargos\", \"category\": \"Bottoms\", \"retailPrice\": 498.0, \"discountedPrice\": 428.28, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 12
         *
         * The request body is:
         * {
         *     "id": 12,
         *     "name": "Poncho",
         *     "category": "Accessories",
         *     "retailPrice": 280.0,
         *     "discountedPrice": 224.7,
         *     "availability": true
         * }
         */
        json = "{\"id\": 12, \"name\": \"Poncho\", \"category\": \"Accessories\", \"retailPrice\": 280.0, \"discountedPrice\": 224.7, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 13
         *
         * The request body is:
         * {
         *     "id": 13,
         *     "name": "Cummerbund",
         *     "category": "Accessories",
         *     "retailPrice": 435.0,
         *     "discountedPrice": 400.2,
         *     "availability": true
         * }
         */
        json = "{\"id\": 13, \"name\": \"Cummerbund\", \"category\": \"Accessories\", \"retailPrice\": 435.0, \"discountedPrice\": 400.2, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 14
         *
         * The request body is:
         * {
         *     "id": 14,
         *     "name": "Dress",
         *     "category": "Full Body Outfits",
         *     "retailPrice": 175.0,
         *     "discountedPrice": 140.0,
         *     "availability": true
         * }
         */
        json = "{\"id\": 14, \"name\": \"Dress\", \"category\": \"Full Body Outfits\", \"retailPrice\": 175.0, \"discountedPrice\": 140.0, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 15
         *
         * The request body is:
         * {
         *     "id": 15,
         *     "name": "Trainers",
         *     "category": "Footwear",
         *     "retailPrice": 228.0,
         *     "discountedPrice": 184.68,
         *     "availability": true
         * }
         */
        json = "{\"id\": 15, \"name\": \"Trainers\", \"category\": \"Footwear\", \"retailPrice\": 228.0, \"discountedPrice\": 184.68, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 16
         *
         * The request body is:
         * {
         *     "id": 16,
         *     "name": "Tracksuit",
         *     "category": "Full Body Outfits",
         *     "retailPrice": 471.0,
         *     "discountedPrice": 423.9,
         *     "availability": false
         * }
         */
        json = "{\"id\": 16, \"name\": \"Tracksuit\", \"category\": \"Full Body Outfits\", \"retailPrice\": 471.0, \"discountedPrice\": 423.9, \"availability\": false}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 17
         *
         * The request body is:
         * {
         *     "id": 17,
         *     "name": "Tailcoat",
         *     "category": "Full Body Outfits",
         *     "retailPrice": 307.0,
         *     "discountedPrice": 254.81,
         *     "availability": true
         * }
         */
        json = "{\"id\": 17, \"name\": \"Tailcoat\", \"category\": \"Full Body Outfits\", \"retailPrice\": 307.0, \"discountedPrice\": 254.81, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 18
         *
         * The request body is:
         * {
         *     "id": 18,
         *     "name": "Vest",
         *     "category": "Tops",
         *     "retailPrice": 446.0,
         *     "discountedPrice": 392.48,
         *     "availability": true
         * }
         */
        json = "{\"id\": 18, \"name\": \"Vest\", \"category\": \"Tops\", \"retailPrice\": 446.0, \"discountedPrice\": 392.48, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 19
         *
         * The request body is:
         * {
         *     "id": 19,
         *     "name": "Suit",
         *     "category": "Full Body Outfits",
         *     "retailPrice": 158.0,
         *     "discountedPrice": 135.88,
         *     "availability": true
         * }
         */
        json = "{\"id\": 19, \"name\": \"Suit\", \"category\": \"Full Body Outfits\", \"retailPrice\": 158.0, \"discountedPrice\": 135.88, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 20
         *
         * The request body is:
         * {
         *     "id": 20,
         *     "name": "Catsuit",
         *     "category": "Full Body Outfits",
         *     "retailPrice": 158.0,
         *     "discountedPrice": 135.88,
         *     "availability": true
         * }
         */
        json = "{\"id\": 20, \"name\": \"Catsuit\", \"category\": \"Full Body Outfits\", \"retailPrice\": 158.0, \"discountedPrice\": 135.88, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());

        /**
         *
         * Create product with id 21
         *
         * The request body is:
         * {
         *     "id": 21,
         *     "name": "Dungarees",
         *     "category": "Full Body Outfits",
         *     "retailPrice": 437.0,
         *     "discountedPrice": 362.71,
         *     "availability": false
         * }
         */
        json = "{\"id\": 21, \"name\": \"Dungarees\", \"category\": \"Full Body Outfits\", \"retailPrice\": 437.0, \"discountedPrice\": 362.71, \"availability\": false}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isCreated());
    }

    /**
     *
     * @throws Exception
     *
     * It tests creating a product
     */
    @Test
    @Order(2)
    public void createProductWithExistingId() throws Exception {
        /**
         *
         * Create product with existing id 1
         *
         * The request body is:
         * {
         *     "id": 1,
         *     "name": "Dressing Gown",
         *     "category": "Underwear",
         *     "retailPrice": 303.0,
         *     "discountedPrice": 251.49,
         *     "availability": true
         * }
         */
        String json = "{\"id\": 1, \"name\": \"Dressing Gown\", \"category\": \"Underwear\", \"retailPrice\": 303.0, \"discountedPrice\": 251.49, \"availability\": true}";

        mockMvc.perform(
            post(ENTITY_API_URL)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isBadRequest());
    }

    /**
     *
     * @throws Exception
     *
     * It tests updating retail price of a product
     */
    @Test
    @Order(3)
    public void updateProductRetailPrice() throws Exception {
        /**
         *
         * Update retail price of a product with id 6
         *
         * The request body is:
         * {
         *     "retailPrice": 325.45,
         *     "discountedPrice": 260.36,
         *     "availability": true
         * }
         */
        String json = "{\"retailPrice\": 325.45, \"discountedPrice\": 260.36, \"availability\": true}";

        mockMvc.perform(
            put(ENTITY_API_URL_ID,6)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isOk());
    }

    /**
     *
     * @throws Exception
     *
     * It tests updating discount price of a product
     */
    @Test
    @Order(4)
    public void updateProductDiscountPrice() throws Exception {
        /**
         *
         * Update discount price of a product with id 10
         *
         * The request body is:
         * {
         *     "retailPrice": 284.0,
         *     "discountedPrice": 227.2,
         *     "availability": true
         * }
         */
        String json = "{\"retailPrice\": 284.0, \"discountedPrice\": 227.2, \"availability\": true}";

        mockMvc.perform(
            put(ENTITY_API_URL_ID, 10)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isOk());
    }

    /**
     *
     * @throws Exception
     *
     * It tests updating availability of a product
     */
    @Test
    @Order(5)
    public void updateProductAvailability() throws Exception {
        /**
         *
         * Update availability of a product with id 2
         *
         * The request body is:
         * {
         *     "retailPrice": 150.0,
         *     "discountedPrice": 123.0,
         *     "availability": false
         * }
         */
        String json = "{\"retailPrice\": 150.0, \"discountedPrice\": 123.0, \"availability\": false}";

        mockMvc.perform(
            put(ENTITY_API_URL_ID, 2)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isOk());
    }

    /**
     *
     * @throws Exception
     *
     * It tests updating retail and discount price of a product
     */
    @Test
    @Order(6)
    public void updateProductRetailAndDiscountPrice() throws Exception {
        /**
         *
         * Update retail and discount price of a product with id 12
         *
         * The request body is:
         * {
         *     "retailPrice": 350.0,
         *     "discountedPrice": 283.5,
         *     "availability": true
         * }
         */
        String json = "{\"retailPrice\": 350.0, \"discountedPrice\": 283.5, \"availability\": true}";

        mockMvc.perform(
            put(ENTITY_API_URL_ID, 12)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isOk());
    }

    /**
     *
     * @throws Exception
     *
     * It tests updating retail price and availability of a product
     */
    @Test
    @Order(7)
    public void updateProductRetailPriceAndAvailability() throws Exception {
        /**
         *
         * Update retail price and availability of a product with id 19
         *
         * The request body is:
         * {
         *     "retailPrice": 125.0,
         *     "discountedPrice": 100.0,
         *     "availability": false
         * }
         */
        String json = "{\"retailPrice\": 125.0, \"discountedPrice\": 100.0, \"availability\": false}";

        mockMvc.perform(
            put(ENTITY_API_URL_ID, 19)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isOk());
    }

    /**
     *
     * @throws Exception
     *
     * It tests updating discount price and availability of a product
     */
    @Test
    @Order(8)
    public void updateProductDiscountPriceAndAvailability() throws Exception {
        /**
         *
         * Update discount price and availability of a product with id 20
         *
         * The request body is:
         * {
         *     "retailPrice": 250.0,
         *     "discountedPrice": 200.0,
         *     "availability": false
         * }
         */
        String json = "{\"retailPrice\": 250.0, \"discountedPrice\": 200.0, \"availability\": false}";

        mockMvc.perform(
            put(ENTITY_API_URL_ID, 20)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isOk());
    }

    /**
     *
     * @throws Exception
     *
     * It tests updating retail price, discount price and availability of a product
     */
    @Test
    @Order(9)
    public void updateProductRetailPriceDiscountPriceAndAvailability() throws Exception {
        /**
         *
         * Update retail price, discount price and availability of a product with id 13
         *
         * The request body is:
         * {
         *     "retailPrice": 500.0,
         *     "discountedPrice": 450.0,
         *     "availability": false
         * }
         */
        String json = "{\"retailPrice\": 500.0, \"discountedPrice\": 450.0, \"availability\": false}";

        mockMvc.perform(
            put(ENTITY_API_URL_ID, 13)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isOk());
    }

    /**
     *
     * @throws Exception
     *
     * It tests updating availability of non-existing product
     */
    @Test
    @Order(10)
    public void updateAvailabilityOfNonExistingProduct() throws Exception {
        /**
         *
         * Update availability of a non existing product with id 25
         *
         * The request body is:
         * {
         *     "retailPrice": 311.0,
         *     "discountedPrice": 258.13,
         *     "availability": true
         * }
         */
        String json = "{\"retailPrice\": 311.0, \"discountedPrice\": 258.13, \"availability\": true}";

        mockMvc.perform(
            put(ENTITY_API_URL_ID, 25)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
            .andExpect(status().isBadRequest());
    }

    /**
     *
     * @throws Exception
     *
     * It tests finding a product
     */
    @Test
    @Order(11)
    public void findProductById() throws Exception {
        /**
         *
         * Find product by id 2
         *
         * The request response is:
         * {
         *     "id": 2,
         *     "name": "Shoes",
         *     "category": "Footwear",
         *     "retailPrice": 150.0,
         *     "discountedPrice": 123.0,
         *     "availability": false
         * }
         */
        String res = "{\"id\": 2, \"name\": \"Shoes\", \"category\": \"Footwear\", \"retailPrice\": 150.0, \"discountedPrice\": 123.0, \"availability\": false}";

        assertTrue(
            ResultMatcher.matchJson(
                mockMvc.perform(get(ENTITY_API_URL_ID, 2))
                    .andExpect(status().isOk())
                    .andReturn()
                    .getResponse()
                    .getContentAsString(),
                res,
                true
            )
        );
    }

    /**
     *
     * @throws Exception
     *
     * It tests finding a product
     */
    @Test
    @Order(12)
    public void findProductByNonExistingId() throws Exception {
        /**
         *
         * Find product by non-existing id 25
         */
        mockMvc.perform(get(ENTITY_API_URL_ID,25))
            .andExpect(status().isNotFound());
    }

    /**
     *
     * @throws Exception
     *
     * It tests finding products belonging to a category
     */
//    @Test
//    @Order(13)
//    public void findProductsByCategory() throws Exception {
//        /**
//         *
//         * Find products belonging to Accesories category
//         *
//         * The request response is:
//         * [
//         *     {
//         *         "id": 8,
//         *         "name": "Kaftan",
//         *         "category": "Accessories",
//         *         "retailPrice": 237.0,
//         *         "discountedPrice": 215.67,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 10,
//         *         "name": "Cufflinks",
//         *         "category": "Accessories",
//         *         "retailPrice": 284.0,
//         *         "discountedPrice": 227.2,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 6,
//         *         "name": "Shawl",
//         *         "category": "Accessories",
//         *         "retailPrice": 325.45,
//         *         "discountedPrice": 260.36,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 12,
//         *         "name": "Poncho",
//         *         "category": "Accessories",
//         *         "retailPrice": 350.0,
//         *         "discountedPrice": 283.5,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 7,
//         *         "name": "Belt",
//         *         "category": "Accessories",
//         *         "retailPrice": 471.0,
//         *         "discountedPrice": 419.19,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 13,
//         *         "name": "Cummerbund",
//         *         "category": "Accessories",
//         *         "retailPrice": 500.0,
//         *         "discountedPrice": 450.0,
//         *         "availability": false
//         *     }
//         * ]
//         */
//        String res = "[{\"id\": 8, \"name\": \"Kaftan\", \"category\": \"Accessories\", \"retailPrice\": 237.0, \"discountedPrice\": 215.67, \"availability\": true}, {\"id\": 10, \"name\": \"Cufflinks\", \"category\": \"Accessories\", \"retailPrice\": 284.0, \"discountedPrice\": 227.2, \"availability\": true}, {\"id\": 6, \"name\": \"Shawl\", \"category\": \"Accessories\", \"retailPrice\": 325.45, \"discountedPrice\": 260.36, \"availability\": true}, {\"id\": 12, \"name\": \"Poncho\", \"category\": \"Accessories\", \"retailPrice\": 350.0, \"discountedPrice\": 283.5, \"availability\": true}, {\"id\": 7, \"name\": \"Belt\", \"category\": \"Accessories\", \"retailPrice\": 471.0, \"discountedPrice\": 419.19, \"availability\": true}, {\"id\": 13, \"name\": \"Cummerbund\", \"category\": \"Accessories\", \"retailPrice\": 500.0, \"discountedPrice\": 450.0, \"availability\": false}]";
//
//        assertTrue(
//            ResultMatcher.matchJsonArray(
//                mockMvc.perform(get(ENTITY_API_URL + "?category=Accessories"))
//                    .andExpect(status().isOk())
//                    .andReturn()
//                    .getResponse()
//                    .getContentAsString(),
//                res,
//                true
//            )
//        );
//    }

    /**
     *
     * @throws Exception
     *
     * It tests finding products belonging to a category
     */
    @Test
    @Order(14)
    public void findProductsByNonExistingCategory() throws Exception {
        /**
         *
         * Find products belonging to Swimwear category
         *
         * The request response is:
         * []
         */
        String res = "[]";

        assertTrue(
            ResultMatcher.matchJsonArray(
                mockMvc.perform(get(ENTITY_API_URL + "?category=Swimwear"))
                    .andExpect(status().isOk())
                    .andReturn()
                    .getResponse()
                    .getContentAsString(),
                res,
                true
            )
        );
    }

    /**
     *
     * @throws Exception
     *
     * It tests finding a product with a given category and availability
     */
//    @Test
//    @Order(15)
//    public void findProductsByCategoryAndAvailability() throws Exception {
//        /**
//         *
//         * Find products belonging to a given category and with availability
//         *
//         * The request response is:
//         * [
//         *     {
//         *         "id": 14,
//         *         "name": "Dress",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 175.0,
//         *         "discountedPrice": 140.0,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 5,
//         *         "name": "Ball Gown",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 337.0,
//         *         "discountedPrice": 272.97,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 1,
//         *         "name": "Dressing Gown",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 303.0,
//         *         "discountedPrice": 251.49,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 3,
//         *         "name": "Nightgown",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 307.0,
//         *         "discountedPrice": 254.81,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 17,
//         *         "name": "Tailcoat",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 307.0,
//         *         "discountedPrice": 254.81,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 9,
//         *         "name": "Overalls",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 374.0,
//         *         "discountedPrice": 321.64,
//         *         "availability": true
//         *     }
//         * ]
//         */
//        String res = "[{\"id\": 14, \"name\": \"Dress\", \"category\": \"Full Body Outfits\", \"retailPrice\": 175.0, \"discountedPrice\": 140.0, \"availability\": true}, {\"id\": 5, \"name\": \"Ball Gown\", \"category\": \"Full Body Outfits\", \"retailPrice\": 337.0, \"discountedPrice\": 272.97, \"availability\": true}, {\"id\": 1, \"name\": \"Dressing Gown\", \"category\": \"Full Body Outfits\", \"retailPrice\": 303.0, \"discountedPrice\": 251.49, \"availability\": true}, {\"id\": 3, \"name\": \"Nightgown\", \"category\": \"Full Body Outfits\", \"retailPrice\": 307.0, \"discountedPrice\": 254.81, \"availability\": true}, {\"id\": 17, \"name\": \"Tailcoat\", \"category\": \"Full Body Outfits\", \"retailPrice\": 307.0, \"discountedPrice\": 254.81, \"availability\": true}, {\"id\": 9, \"name\": \"Overalls\", \"category\": \"Full Body Outfits\", \"retailPrice\": 374.0, \"discountedPrice\": 321.64, \"availability\": true}]";
//
//        assertTrue(
//            ResultMatcher.matchJsonArray(
//                mockMvc.perform(get(ENTITY_API_URL + "?category=Full%20Body%20Outfits&availability=1"))
//                    .andExpect(status().isOk())
//                    .andReturn()
//                    .getResponse()
//                    .getContentAsString(),
//                res,
//                true
//            )
//        );
//
//        /**
//         *
//         * Find products belonging to a given category and with availability
//         *
//         * The request response is:
//         * [
//         *     {
//         *         "id": 19,
//         *         "name": "Suit",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 125.0,
//         *         "discountedPrice": 100.0,
//         *         "availability": false
//         *     },
//         *     {
//         *         "id": 20,
//         *         "name": "Catsuit",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 250.0,
//         *         "discountedPrice": 200.0,
//         *         "availability": false
//         *     },
//         *     {
//         *         "id": 21,
//         *         "name": "Dungarees",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 437.0,
//         *         "discountedPrice": 362.71,
//         *         "availability": false
//         *     },
//         *     {
//         *         "id": 16,
//         *         "name": "Tracksuit",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 471.0,
//         *         "discountedPrice": 423.9,
//         *         "availability": false
//         *     }
//         * ]
//         */
//        res = "[{\"id\": 19, \"name\": \"Suit\", \"category\": \"Full Body Outfits\", \"retailPrice\": 125.0, \"discountedPrice\": 100.0, \"availability\": false}, {\"id\": 20, \"name\": \"Catsuit\", \"category\": \"Full Body Outfits\", \"retailPrice\": 250.0, \"discountedPrice\": 200.0, \"availability\": false}, {\"id\": 21, \"name\": \"Dungarees\", \"category\": \"Full Body Outfits\", \"retailPrice\": 437.0, \"discountedPrice\": 362.71, \"availability\": false}, {\"id\": 16, \"name\": \"Tracksuit\", \"category\": \"Full Body Outfits\", \"retailPrice\": 471.0, \"discountedPrice\": 423.9, \"availability\": false}]";
//
//        assertTrue(
//            ResultMatcher.matchJsonArray(
//                mockMvc.perform(get(ENTITY_API_URL + "?category=Full%20Body%20Outfits&availability=0"))
//                    .andExpect(status().isOk())
//                    .andReturn()
//                    .getResponse()
//                    .getContentAsString(),
//                res,
//                true
//            )
//        );
//    }

    /**
     *
     * @throws Exception
     *
     * It tests finding a product with a given category and availability
     */
    @Test
    @Order(16)
    public void findProductsByNonExistingCategoryAndAvailability() throws Exception {
        /**
         *
         * Find products belonging to a given category and with availability
         *
         * The request response is:
         * []
         */
        String res = "[]";

        assertTrue(
            ResultMatcher.matchJsonArray(
                mockMvc.perform(get(ENTITY_API_URL + "?category=Swimwear&availability=1"))
                    .andExpect(status().isOk())
                    .andReturn()
                    .getResponse()
                    .getContentAsString(),
                res,
                true
            )
        );
    }

    /**
     *
     * @throws Exception
     *
     * It tests finding all products
     */
//    @Test
//    @Order(17)
//    public void findAllProducts() throws Exception {
//        /**
//         *
//         * Find all products
//         *
//         * The request response is:
//         * [
//         *     {
//         *         "id": 1,
//         *         "name": "Dressing Gown",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 303.0,
//         *         "discountedPrice": 251.49,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 2,
//         *         "name": "Shoes",
//         *         "category": "Footwear",
//         *         "retailPrice": 150.0,
//         *         "discountedPrice": 123.0,
//         *         "availability": false
//         *     },
//         *     {
//         *         "id": 3,
//         *         "name": "Nightgown",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 307.0,
//         *         "discountedPrice": 254.81,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 4,
//         *         "name": "Boots",
//         *         "category": "Footwear",
//         *         "retailPrice": 162.0,
//         *         "discountedPrice": 132.84,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 5,
//         *         "name": "Ball Gown",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 337.0,
//         *         "discountedPrice": 272.97,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 6,
//         *         "name": "Shawl",
//         *         "category": "Accessories",
//         *         "retailPrice": 325.45,
//         *         "discountedPrice": 260.36,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 7,
//         *         "name": "Belt",
//         *         "category": "Accessories",
//         *         "retailPrice": 471.0,
//         *         "discountedPrice": 419.19,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 8,
//         *         "name": "Kaftan",
//         *         "category": "Accessories",
//         *         "retailPrice": 237.0,
//         *         "discountedPrice": 215.67,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 9,
//         *         "name": "Overalls",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 374.0,
//         *         "discountedPrice": 321.64,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 10,
//         *         "name": "Cufflinks",
//         *         "category": "Accessories",
//         *         "retailPrice": 284.0,
//         *         "discountedPrice": 227.2,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 11,
//         *         "name": "Cargos",
//         *         "category": "Bottoms",
//         *         "retailPrice": 498.0,
//         *         "discountedPrice": 428.28,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 12,
//         *         "name": "Poncho",
//         *         "category": "Accessories",
//         *         "retailPrice": 350.0,
//         *         "discountedPrice": 283.5,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 13,
//         *         "name": "Cummerbund",
//         *         "category": "Accessories",
//         *         "retailPrice": 500.0,
//         *         "discountedPrice": 450.0,
//         *         "availability": false
//         *     },
//         *     {
//         *         "id": 14,
//         *         "name": "Dress",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 175.0,
//         *         "discountedPrice": 140.0,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 15,
//         *         "name": "Trainers",
//         *         "category": "Footwear",
//         *         "retailPrice": 228.0,
//         *         "discountedPrice": 184.68,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 16,
//         *         "name": "Tracksuit",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 471.0,
//         *         "discountedPrice": 423.9,
//         *         "availability": false
//         *     },
//         *     {
//         *         "id": 17,
//         *         "name": "Tailcoat",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 307.0,
//         *         "discountedPrice": 254.81,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 18,
//         *         "name": "Vest",
//         *         "category": "Tops",
//         *         "retailPrice": 446.0,
//         *         "discountedPrice": 392.48,
//         *         "availability": true
//         *     },
//         *     {
//         *         "id": 19,
//         *         "name": "Suit",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 125.0,
//         *         "discountedPrice": 100.0,
//         *         "availability": false
//         *     },
//         *     {
//         *         "id": 20,
//         *         "name": "Catsuit",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 250.0,
//         *         "discountedPrice": 200.0,
//         *         "availability": false
//         *     },
//         *     {
//         *         "id": 21,
//         *         "name": "Dungarees",
//         *         "category": "Full Body Outfits",
//         *         "retailPrice": 437.0,
//         *         "discountedPrice": 362.71,
//         *         "availability": false
//         *     }
//         * ]
//         */
//        String res = "[{\"id\": 1, \"name\": \"Dressing Gown\", \"category\": \"Full Body Outfits\", \"retailPrice\": 303.0, \"discountedPrice\": 251.49, \"availability\": true}, {\"id\": 2, \"name\": \"Shoes\", \"category\": \"Footwear\", \"retailPrice\": 150.0, \"discountedPrice\": 123.0, \"availability\": false}, {\"id\": 3, \"name\": \"Nightgown\", \"category\": \"Full Body Outfits\", \"retailPrice\": 307.0, \"discountedPrice\": 254.81, \"availability\": true}, {\"id\": 4, \"name\": \"Boots\", \"category\": \"Footwear\", \"retailPrice\": 162.0, \"discountedPrice\": 132.84, \"availability\": true}, {\"id\": 5, \"name\": \"Ball Gown\", \"category\": \"Full Body Outfits\", \"retailPrice\": 337.0, \"discountedPrice\": 272.97, \"availability\": true}, {\"id\": 6, \"name\": \"Shawl\", \"category\": \"Accessories\", \"retailPrice\": 325.45, \"discountedPrice\": 260.36, \"availability\": true}, {\"id\": 7, \"name\": \"Belt\", \"category\": \"Accessories\", \"retailPrice\": 471.0, \"discountedPrice\": 419.19, \"availability\": true}, {\"id\": 8, \"name\": \"Kaftan\", \"category\": \"Accessories\", \"retailPrice\": 237.0, \"discountedPrice\": 215.67, \"availability\": true}, {\"id\": 9, \"name\": \"Overalls\", \"category\": \"Full Body Outfits\", \"retailPrice\": 374.0, \"discountedPrice\": 321.64, \"availability\": true}, {\"id\": 10, \"name\": \"Cufflinks\", \"category\": \"Accessories\", \"retailPrice\": 284.0, \"discountedPrice\": 227.2, \"availability\": true}, {\"id\": 11, \"name\": \"Cargos\", \"category\": \"Bottoms\", \"retailPrice\": 498.0, \"discountedPrice\": 428.28, \"availability\": true}, {\"id\": 12, \"name\": \"Poncho\", \"category\": \"Accessories\", \"retailPrice\": 350.0, \"discountedPrice\": 283.5, \"availability\": true}, {\"id\": 13, \"name\": \"Cummerbund\", \"category\": \"Accessories\", \"retailPrice\": 500.0, \"discountedPrice\": 450.0, \"availability\": false}, {\"id\": 14, \"name\": \"Dress\", \"category\": \"Full Body Outfits\", \"retailPrice\": 175.0, \"discountedPrice\": 140.0, \"availability\": true}, {\"id\": 15, \"name\": \"Trainers\", \"category\": \"Footwear\", \"retailPrice\": 228.0, \"discountedPrice\": 184.68, \"availability\": true}, {\"id\": 16, \"name\": \"Tracksuit\", \"category\": \"Full Body Outfits\", \"retailPrice\": 471.0, \"discountedPrice\": 423.9, \"availability\": false}, {\"id\": 17, \"name\": \"Tailcoat\", \"category\": \"Full Body Outfits\", \"retailPrice\": 307.0, \"discountedPrice\": 254.81, \"availability\": true}, {\"id\": 18, \"name\": \"Vest\", \"category\": \"Tops\", \"retailPrice\": 446.0, \"discountedPrice\": 392.48, \"availability\": true}, {\"id\": 19, \"name\": \"Suit\", \"category\": \"Full Body Outfits\", \"retailPrice\": 125.0, \"discountedPrice\": 100.0, \"availability\": false}, {\"id\": 20, \"name\": \"Catsuit\", \"category\": \"Full Body Outfits\", \"retailPrice\": 250.0, \"discountedPrice\": 200.0, \"availability\": false}, {\"id\": 21, \"name\": \"Dungarees\", \"category\": \"Full Body Outfits\", \"retailPrice\": 437.0, \"discountedPrice\": 362.71, \"availability\": false}]";
//
//        assertTrue(
//            ResultMatcher.matchJsonArray(
//                mockMvc.perform(get(ENTITY_API_URL))
//                    .andExpect(status().isOk())
//                    .andReturn()
//                    .getResponse()
//                    .getContentAsString(),
//                res,
//                true
//            )
//        );
//    }
}

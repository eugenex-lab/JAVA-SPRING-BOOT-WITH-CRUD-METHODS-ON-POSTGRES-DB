package lab.eugene.step2postgress.controller;


import lab.eugene.step2postgress.exception.ResourceNotFoundException;
import lab.eugene.step2postgress.model.SankoreProducts;
import lab.eugene.step2postgress.repository.SankoreProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class SankoreProductController {

    @Autowired
    private SankoreProductRepository sankoreProductRepository;

    //Get SankoreProduct
    @GetMapping("products")
    public List<SankoreProducts> getAllProducts() {
        return this.sankoreProductRepository.findAll();
    }
    // Get SankoreProducts BY ID
    @GetMapping("/products/{id}")
        public ResponseEntity<SankoreProducts> getProductById(@PathVariable(value = "id")Integer productId)
            throws ResourceNotFoundException{
            SankoreProducts sankoreProducts = sankoreProductRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found for the inputed id::" +  productId));
            return ResponseEntity.ok().body(sankoreProducts);
    }

    //Save Sankore Product
    @PostMapping("products")
    public SankoreProducts createProduct(@RequestBody  SankoreProducts sankoreProducts){
        return this.sankoreProductRepository.save(sankoreProducts);
    }


    // UPdate Sankore Products
    @PutMapping("/products/{id}")
    public ResponseEntity<SankoreProducts> updateProduct(@PathVariable(value = "id") Integer productId,
        @Valid @RequestBody SankoreProducts productDetails) throws ResourceNotFoundException {

        SankoreProducts sankoreProducts = sankoreProductRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found for the inputed id::" +  productId));

        sankoreProducts.setProductName(productDetails.getProductName());
        sankoreProducts.setProductDept(productDetails.getProductDept());
        sankoreProducts.setFutureNetWorth(productDetails.getFutureNetWorth());
        sankoreProducts.setProductCEO(productDetails.getProductCEO());

        return ResponseEntity.ok(this.sankoreProductRepository.save (sankoreProducts));

    }

    //del Sankore Products
    @DeleteMapping("/products/{id}")
    public Map<String, Boolean> deleteProduct(@PathVariable(value = "id") Integer productId) throws ResourceNotFoundException {
    SankoreProducts sankoreProducts = sankoreProductRepository.findById(productId)
            .orElseThrow(() -> new ResourceNotFoundException("Product not found for the inputed id::" +  productId));
    this.sankoreProductRepository.delete(sankoreProducts);

    Map<String,Boolean>response = new Hashtable<>();
            response.put("delete",Boolean.TRUE);
            return response;


}




}

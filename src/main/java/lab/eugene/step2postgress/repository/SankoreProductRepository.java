package lab.eugene.step2postgress.repository;

import lab.eugene.step2postgress.model.SankoreProducts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SankoreProductRepository extends
        JpaRepository<SankoreProducts, Integer> {

}

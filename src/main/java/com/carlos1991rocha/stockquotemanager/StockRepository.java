
package com.carlos1991rocha.stockquotemanager;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<Stock, String> {
    public List<Stock> findByIdIgnoreCaseContaining(String id);
    public List<Stock> findByDescriptionIgnoreCaseContaining(String id);

}
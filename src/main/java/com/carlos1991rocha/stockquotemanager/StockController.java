package com.carlos1991rocha.stockquotemanager;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping({"/stock"})
public class StockController{
    @Autowired
    private StockRepository stockRepository;
    @PostMapping()
    public @ResponseBody Stock create(@RequestBody final Stock stock){
        return stockRepository.save(stock);
    }
    
    @GetMapping()
    public @ResponseBody Iterable <Stock> getAll(){
        return stockRepository.findAll();
    }
    @GetMapping({"/{id}"})
    public @ResponseBody Optional <Stock> getById(@PathVariable String id){
        return stockRepository.findById(id);
    }
   
    @GetMapping({"/search/{id}"})
    public @ResponseBody List<Stock> findByIdIgnoreCaseContaining(@PathVariable String id)
    {
        return stockRepository.findByIdIgnoreCaseContaining(id);
    }
}
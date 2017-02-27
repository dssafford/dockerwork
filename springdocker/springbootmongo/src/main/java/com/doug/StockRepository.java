package com.doug;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Doug on 9/9/16.
 */

@Repository
public interface StockRepository extends MongoRepository<Stock, Integer> {

	public Stock findBySymbol(String symbol);
}

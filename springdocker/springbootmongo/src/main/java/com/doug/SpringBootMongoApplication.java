package com.doug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootMongoApplication {


	@Autowired
	private StockRepository repo;

//	private MongoTemplate template;


	@RequestMapping("/stocks")
	private Stock stocks () {
//		Stock stock = new Stock();
//		stock.setCompanyName("Tesla");
//		stock.setSymbol("TLSA");
//		stock.setCeo("Elon Musk");
//		stock.setPrice(250.00d);
//		repo.insert(stock);

		return repo.findBySymbol("TLSA");

//		return template.findOne(new BasicQuery("{symbol:'TLSA'}"), Stock.class);
	}

//	private DBObject stocks() {
//		DB db = mongo.getDb("eatshit");
//		DBCollection collection = db.getCollection("stocks");
//
//		collection.insert(new BasicDBObject().append("companyName", "Ford").append("symbol", "F"));
//
//		return collection.findOne(new BasicDBObject().append("symbol", "F"));
//	}




	public static void main(String[] args) {


		SpringApplication.run(SpringBootMongoApplication.class, args);
	}
}

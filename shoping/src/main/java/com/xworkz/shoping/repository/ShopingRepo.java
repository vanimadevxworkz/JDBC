package com.xworkz.shoping.repository;

import java.util.List;

import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.COUNT;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.MAX;

import com.xworkz.shoping.entity.ShopingEntity;

public interface ShopingRepo {
	
	List<ShopingEntity> read();
	String readClothName();
	Object[] readid();
	Object readContact();
	
	List<Long> readListNumber();
	List<Object[]> readIdAndPriceList();
	
	int read1();
	
	long readCount();
	
	

}

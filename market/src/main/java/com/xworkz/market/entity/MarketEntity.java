package com.xworkz.market.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="shoping_table")
@NamedQuery(name = "updatebyName", query = "UPDATE MarketEntity entity set entity.name=:nameby where entity.clothName=:clothBy")
@NamedQuery(name = "updatebyPrice", query = "UPDATE MarketEntity entity set entity.price=:priceby where entity.clothName=:clothBy")
@NamedQuery(name = "updatebyContact", query = "UPDATE MarketEntity entity set entity.contactNum=:contactby where entity.name=:shopBy")
@NamedQuery(name = "updatebyId", query = "UPDATE MarketEntity entity set entity.name=:nameby where entity.id=:idBy")

public class MarketEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="shop_name")
	private String name;
	@Column(name="clothe_name")
	private String clothName;
	@Column(name="price")
	private int price;
	@Column(name="shop_contactNumber")
	private long contactNum;

}

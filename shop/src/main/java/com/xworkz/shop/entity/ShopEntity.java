package com.xworkz.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="shop_table")

@NamedQuery(name = "findnameby", query = "select entity from ShopEntity entity where entity.clothName=:nameby")
@NamedQuery(name = "findpriceby", query = "select entity from ShopEntity entity where entity.price=:priceby")
@NamedQuery(name = "findsizeby", query = "select entity from ShopEntity entity where entity.size=:sizeby")
@NamedQuery(name = "findcontactby", query = "select entity.contactNum from ShopEntity entity where entity.contactNum=:contactby")
@NamedQuery(name = "finddiscountby", query = "select entity.discount from ShopEntity entity where entity.discount=:discountby")
@NamedQuery(name = "findidby", query = "select entity.id from ShopEntity entity where entity.id=:idby")
@NamedQuery(name = "findnameandpriceby", query = "select entity.clothName,entity.price from ShopEntity entity where entity.clothName=:nameby")
@NamedQuery(name = "findnameandsizeby", query = "select entity.clothName,entity.size from ShopEntity entity where entity.clothName=:nameby")
@NamedQuery(name = "findlocationandcontactby", query = "select entity.location,entity.contactNum from ShopEntity entity where entity.location=:locationby")
@NamedQuery(name = "findnamelistby", query = "select entity from ShopEntity entity where entity.clothName=:nameby")
@NamedQuery(name = "findcontactlistby", query = "select entity from ShopEntity entity where entity.contactNum=:contactby")
@NamedQuery(name = "finddiscountlistby", query = "select entity from ShopEntity entity where entity.discount=:discountby")
@NamedQuery(name = "findnumbertlistby", query = "select entity.contactNum from ShopEntity entity where entity.contactNum=:contactby")
@NamedQuery(name = "findClothlistby", query = "select entity.clothName from ShopEntity entity where entity.clothName=:nameby")
@NamedQuery(name = "findlocationlistby", query = "select entity.location from ShopEntity entity where entity.location=:locationby")
@NamedQuery(name = "findPriceAndDiscountby", query = "select entity.price,entity.discount from ShopEntity entity where entity.price=:priceby")
@NamedQuery(name = "findIdAndSizeby", query = "select entity.id,entity.size from ShopEntity entity where entity.id=:idby")
@NamedQuery(name = "findNameAndLocationby", query = "select entity.clothName,entity.location from ShopEntity entity where entity.clothName=:nameby")
@NamedQuery(name = "findMaxPriceby", query = "select max(entity.price) from ShopEntity entity")
@NamedQuery(name = "findcountContactby", query = "select count(entity.contactNum)from ShopEntity entity")

public class ShopEntity {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="clothe_name")
	private String clothName;
	@Column(name="price")
	private int price;
	@Column(name="disscount")
	private Double discount;
	@Column(name="size")
	private char size;
	@Column(name="contact_num")
	private long contactNum;
	@Column(name="shop_location")
	private String location;

}

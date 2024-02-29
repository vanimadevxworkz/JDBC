package com.xworkz.shoping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="shoping_table")
@NamedQuery(name = "readAll", query = "select entity from ShopingEntity entity")
@NamedQuery(name = "readclothename", query = "select entity from ShopingEntity entity where entity.clothName=:nameby")
@NamedQuery(name = "readbyid", query = "select entity.id,entity.clothName from ShopingEntity entity where entity.id=:idby")
@NamedQuery(name = "readbycontact", query = "select entity.contactNumber from ShopingEntity entity where entity.contactNumber=:contactby")

@NamedQuery(name = "findnumbertlistby", query = "select entity.contactNumber from ShopingEntity entity where entity.contactNumber=:contactby")
@NamedQuery(name = "findIdAndPriceby", query = "select entity.id,entity.price from ShopingEntity entity where entity.id=:idby")

@NamedQuery(name = "findMaxPriceby", query = "select max(entity.price) from ShopingEntity entity")
@NamedQuery(name = "findcountContactby", query = "select count(entity.contactNumber)from ShopingEntity entity")
public class ShopingEntity {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="shop_name")
	private String shopName;
	@Column(name="clothe_name")
	private String clothName;
	@Column(name="price")
	private int price;
	@Column(name="shop_contactNumber")
	private long contactNumber;
}

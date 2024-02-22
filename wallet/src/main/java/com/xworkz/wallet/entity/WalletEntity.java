package com.xworkz.wallet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="wallet_table")
@NamedQuery(name = "findcompanyby", query = "select entity.company from WalletEntity entity where entity.company=:nameby")
@NamedQuery(name = "findpriceby", query = "select entity.price from WalletEntity entity where entity.price=:priceby")
@NamedQuery(name = "findcompanyandpriceby", query = "select entity.company,entity.price from WalletEntity entity where entity.company=:nameby")
public class WalletEntity {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="company")
	private String company;
	@Column(name="price")
	private int price;
	@Column(name="color")
	private String color;
	@Column(name="size")
	private String size;

}

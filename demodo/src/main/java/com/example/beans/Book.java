package com.example.beans;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Entity
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Book {
	
	//Bean class
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String author;
	private BigDecimal price;

	public Book(Long id, String name, String author, BigDecimal price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}

}

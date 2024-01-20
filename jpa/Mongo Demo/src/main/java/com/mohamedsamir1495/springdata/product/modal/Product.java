package com.mohamedsamir1495.springdata.product.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@Builder
@Document
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

	@Id
	private String id;

	private String name;

	private float price;

}

package com.yanki.account.service.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "yanki-account")
public class YankiAccount {
	
	@Id
	private String id;
	
	private String docType;
	
	private String docNumber;
	
	private Integer cellphoneNumber;
	
	private String imei;
	
	private String email;
	
	private Double amount;

}

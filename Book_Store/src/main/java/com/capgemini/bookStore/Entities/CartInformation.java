package com.capgemini.bookStore.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/***************************************************************************************
 * @author:      Aishwarya Srivastava                                                  *
 * Description:  It is a entity class that provides the entities that are              * 
 *               going to be used in the application.                                  *
 * Version :     1.0                                                                   *
 * Created Date: 16-JULY-2020                                                           *
 ***************************************************************************************/
@Entity
@Table(name="bookstore_cart")
@DynamicInsert
@DynamicUpdate
public class CartInformation {
	
	@Id
	@Column(name="customer_id")
	private int customerId;
	

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

}

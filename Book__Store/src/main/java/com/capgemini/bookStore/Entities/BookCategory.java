package com.capgemini.bookStore.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

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
@Table(name="bookstore_book_category")
@DynamicInsert
@DynamicUpdate
public class BookCategory {

	@Id
	@Column(name="category_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="categoryIdGenerator")
	@SequenceGenerator(name="categoryIdGenerator", initialValue=100)
	private int categoryId;
	
	@Column(name="category_name")
	@Size(min=5, max=30)
	private String categoryName;
	

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
}
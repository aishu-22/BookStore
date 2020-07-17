package com.capgemini.bookStore;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.bookStore.Dao.DeleteBookDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DaoTest {

	@Autowired
	DeleteBookDao Dao;
	
	@Test
	public void checkBookExist()
	{
		boolean expectedValue=true;
		boolean actualValue=Dao.bookExists(1);
		assertEquals(expectedValue,actualValue);
	}
	
	@Test
	public void checkBookNotExist()
	{
		boolean expectedValue=false;
		boolean actualValue=Dao.bookExists(5);
		assertEquals(expectedValue,actualValue);
	}
}
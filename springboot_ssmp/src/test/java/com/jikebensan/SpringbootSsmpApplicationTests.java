package com.jikebensan;

import com.jikebensan.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootSsmpApplicationTests {

	@Autowired
	private BookDao bookDao;
	@Test
	void testgetbyid() {
		System.out.println(bookDao.selectList(null));
	}



}

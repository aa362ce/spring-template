/**
 * 
 */
package com.ashish.spring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.data.util.BooksCsvUtil;
import com.ashish.model.Book;

/**
 * @author ashish
 *
 */
@RestController
public class BooksController {
	
    @RequestMapping(value ="/books")
	public List<Book> getAllBooks(){
		return BooksCsvUtil.getBookList();
	}

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello ";
	}

}

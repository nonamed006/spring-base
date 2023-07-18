package com.projct.myapp.contorller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projct.myapp.service.BookService;
import com.projct.myapp.vo.BookCopy;

@Controller
@RequestMapping("/test")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/searchBook", method=RequestMethod.GET)
	public void test() {
		ArrayList<BookCopy> list = bookService.searchBookAll();
		
		System.out.println(list);
	}
	
}

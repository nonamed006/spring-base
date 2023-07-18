package com.projct.myapp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projct.myapp.repository.BookRepository;
import com.projct.myapp.vo.BookCopy;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public ArrayList<BookCopy> searchBookAll(){
		ArrayList<BookCopy> list = null;
		list = bookRepository.selectBookAll();
		return list;
	}
}

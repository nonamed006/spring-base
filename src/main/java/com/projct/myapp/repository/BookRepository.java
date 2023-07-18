package com.projct.myapp.repository;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projct.myapp.vo.BookCopy;

@Repository
public class BookRepository {

	@Autowired
	private SqlSession sqlSession;
	
	public ArrayList<BookCopy> selectBookAll(){
		ArrayList<BookCopy> list = null;
		list = (ArrayList)sqlSession.selectList("mapper.book.selectAllBook");
		System.out.println(list.size());
		return list;
	}
}

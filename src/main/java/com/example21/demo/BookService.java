package com.example21.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javasagedemo.demo.Entity.Book;
import io.javasagedemo.demo.repository.BookRepository;

@Service

public class BookService {
	@Autowired
	BookRepository bookRepository;
	
	public List<Book> getAllBooks(String id) {
		List<Book> bookList = new ArrayList<>();
	 	bookRepository.findByTopicId(id).forEach(bookList::add);	
	 	return bookList;
	}

	public void addBook(Book book) {
		bookRepository.save(book);
	}

	public void deleteBook(String id) {
		bookRepository.deleteById(id);
	}

	public void updateBook(Book book) {
		bookRepository.save(book);
	}

	public Book getBooks(String id) {
		return bookRepository.findById(id).get();
	}
	
}

}

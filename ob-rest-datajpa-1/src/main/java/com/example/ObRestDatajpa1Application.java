package com.example;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.entities.Book;
import com.example.repository.BookRepository;

@SpringBootApplication
public class ObRestDatajpa1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObRestDatajpa1Application.class, args);
		BookRepository repository = context.getBean(BookRepository.class);
		
		// crear un libro
		Book book1 = new Book(null, "Homo Deus", "Yuval Noan", 450 , 29.99, LocalDate.of(2018, 12, 1),true);
		Book book2 = new Book(null, "Homo Sapiens", "Yuval Noan", 450 , 29.99, LocalDate.of(2013, 12, 1),true);
		repository.save(book1);
		repository.save(book2);
		
		// recuperar libros 
		System.out.println(repository.findAll().size());
		
		repository.deleteById(1L);
		
		System.out.println(repository.findAll().size());
	}

}

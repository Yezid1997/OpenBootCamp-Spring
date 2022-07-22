package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Book;
import com.example.repository.BookRepository;


@RestController
public class BookController {
	
	private final Logger log = LoggerFactory.getLogger(BookController.class);
	
	private BookRepository bookRepository;
	
	
	
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}



	// CRUD sobre la entida Book
		
	// Buscar todos los libros
	
	@GetMapping("api/books")
	public List<Book> findAll() {
		// Recuperar - devolver libros
		return bookRepository.findAll();
		
	}
	
	// Buscar un solo libro segun su id
	
	@GetMapping("/api/books/{id}")
	public ResponseEntity<Book> findOneByIs(@PathVariable Long id) {
		Optional<Book> bookOp = bookRepository.findById(id);
		if (bookOp.isPresent()) {
			return ResponseEntity.ok(bookOp.get());
		}else {
			return ResponseEntity.notFound().build();
		}
		
	}
	// Nuevo libro
	@PostMapping("/api/books")
	public ResponseEntity<Book> create(@RequestBody Book book) {
		// guardar libro
		if (book.getId() != null) {
			log.warn("Trying to create");
			return ResponseEntity.badRequest().build();
		}
		
		Book result = bookRepository.save(book);
		return ResponseEntity.ok(result);

	}
	// Actualizar un libro
	
	@PutMapping("/api/books")
	public ResponseEntity<Book> update(@RequestBody Book book) {
		if (book.getId() == null) {
			log.warn("Error no libro no existente");
			return ResponseEntity.badRequest().build();
		} if(!bookRepository.existsById(book.getId())) {
			log.warn("Error no libro no existente");
			return ResponseEntity.notFound().build();
		}
		Book result = bookRepository.save(book);
		return ResponseEntity.ok(result);
	}
	
	// Borrar un libro
	@DeleteMapping("/api/books/{id}")
	public ResponseEntity<Book> delete(@PathVariable Long id){
		if(!bookRepository.existsById(id)) {
			log.warn("Error no libro no existente");
			return ResponseEntity.notFound().build();
		}
		
		bookRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	// Borrar un todos
	@DeleteMapping("/api/books")
	public ResponseEntity<Book> deleteAll(){
		
		bookRepository.deleteAll();
		return ResponseEntity.noContent().build();
	}
	
}

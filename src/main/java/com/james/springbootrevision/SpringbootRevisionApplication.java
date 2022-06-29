package com.james.springbootrevision;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.james.springbootrevision.model.Book;
import com.james.springbootrevision.repository.BookRepository;

@SpringBootApplication
@RestController
public class SpringbootRevisionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRevisionApplication.class, args);
	}
	
	@GetMapping
	public String hello() {
		return "Hello World";
	}
	
//	@Bean
//	CommandLineRunner runner(BookRepository repository) {
//		return args -> {
//			
//			String title = "Treasure Island 2";
//			Book book = new Book(
//							title,
//							"Pirates and stuff",
//							"Robert Louis Stephenson",
//							"Fantasy",
//							4.2
//					);
//			repository.findBookByTitle(title)
//			.ifPresentOrElse(
//					s -> {
//						System.out.println("Book with title " + title + " already exists");
//					},
//					() -> {
//						System.out.println("Added book");
//						repository.insert(book);
//					});
//			
//		};
//	}

}

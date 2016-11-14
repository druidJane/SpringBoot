package com.druid;

import com.druid.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {
	@Value("${book.author}")
	private String bookAuthor;

	@Value("${book.name}")
	private String bookName;
	@Autowired
	AuthorSettings authorSettings;
	@RequestMapping(value="/")
	String index(){
		return "9090 Hello Spring Boot,book name is"+bookName+".And book author is "+bookAuthor+".And author age is "+authorSettings.getAge();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

package com.library;

import com.library.service.BookService;
import com.library.repository.BookRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        BookRepository bookRepository = context.getBean("bookRepository", BookRepository.class);
        bookService.addBook("Java FSE");
    }
}

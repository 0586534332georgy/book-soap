package book.soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import book.soap.service.BookSoapService;
import book.soap.service.BookSoapServiceImpl;
import jakarta.xml.ws.Endpoint;

@SpringBootApplication
public class BookSoapApp {

	public static void main(String[] args) {
		SpringApplication.run(BookSoapApp.class, args);
	}
	
    @Bean
    public Endpoint endpoint(BookSoapServiceImpl bookSoapService) {
        return Endpoint.publish("http://localhost:8080/ws/books", bookSoapService);
    }

}

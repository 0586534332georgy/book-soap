package book.soap.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import book.soap.api.BookGenreEnum;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "book_credential")
public class BookCredential {
	@Id
	@Column(name = "id_book")
	private Integer id;	

	@Enumerated(EnumType.STRING)
//	@Column(name = "book_genre")
	private BookGenreEnum bookGenre; 
	
	@Column(name = "pages_amount")
	private Integer pagesAmount;
	
	@OneToOne
	@JoinColumn(name = "id_book")
	@JsonBackReference
	private Book book;
	
}

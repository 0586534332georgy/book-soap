package book.soap.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import lombok.*;

@XmlRootElement(name = "Book")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
@Entity
@Table(name = "book_library")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_book")
	private Integer id;	

	@Column(name = "author_surname")
    private String authorSurname;

	@Column(name = "author_name")
    private String authorName;

    @Column(name = "bookname")
    private String title;
    
    @XmlTransient
    @OneToOne(mappedBy = "book")
    @JsonManagedReference
    private BookCredential credential;

    @XmlTransient
    @OneToOne(mappedBy = "book")
    @JsonManagedReference
    private BookStatus status;

}

package book.soap.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import book.soap.api.BookStatusEnum;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

@XmlRootElement(name = "bookStatus")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
@Entity
@Table(name = "book_status")
public class BookStatus {
	@Id
	@Column(name = "id_book")
	private Integer id;	
	
	@Column(name = "reserved_status")
	private Boolean reservedStatus;
	
	@Column(name = "reserved_date")	
	private LocalDate reservedDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "condition_status")
	private BookStatusEnum conditionStatus;	
	
	@OneToOne
	@JoinColumn(name = "id_book")
	@JsonBackReference
	private Book book;
	
}
package book.soap.service;

import java.util.List;

import book.soap.api.BookGenreEnum;
import book.soap.dto.BookCredentialsDto;
import book.soap.dto.BookDto;
import book.soap.dto.BookReservedDto;
import book.soap.entity.Book;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface BookSoapService {

	@WebMethod
	public List<Book> getAll();

	@WebMethod
	public List<BookDto> getAll2();

	@WebMethod
	public List<BookCredentialsDto> getBooksByGenre(@WebParam(name = "bookGenre") BookGenreEnum bookGenre);

	@WebMethod
	public List<BookCredentialsDto> getBooksByGenreAndPages(@WebParam(name = "bookGenre") BookGenreEnum bookGenre,
			@WebParam(name = "min") int min, @WebParam(name = "max") int max);

	@WebMethod
	public List<BookCredentialsDto> getBooksByGenreAndPagesOrdered(
			@WebParam(name = "bookGenre") BookGenreEnum bookGenre, @WebParam(name = "min") int min,
			@WebParam(name = "max") int max);

	@WebMethod
	public List<BookDto> getFreeBooks();

	@WebMethod
	public List<BookReservedDto> getReservedBooks();

	@WebMethod
	public int setBookFree(@WebParam(name = "title") String title);

	@WebMethod
	public int setBookReserved(@WebParam(name = "title") String title);

}
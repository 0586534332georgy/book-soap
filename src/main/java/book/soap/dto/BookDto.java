package book.soap.dto;

import book.soap.api.BookGenreEnum;
import book.soap.entity.Book;
import book.soap.entity.BookCredential;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class BookDto {
	
    private String title;
    private String authorSurname;
    private String authorName;
    private BookGenreEnum bookGenre;

    public static BookDto build(Book book) {
        BookDto dto = new BookDto();
        dto.setTitle(book.getTitle());
        dto.setAuthorSurname(book.getAuthorSurname());
        dto.setAuthorName(book.getAuthorName());
        
        BookCredential credential = book.getCredential();
        if (credential != null) {
            dto.setBookGenre(credential.getBookGenre());
        }

        return dto;
    }

}
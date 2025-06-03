package book.soap.dto;

import book.soap.api.BookGenreEnum;
import book.soap.entity.Book;
import book.soap.entity.BookCredential;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BookCredentialsDto {

    private Integer id;
    private String authorSurname;
    private String authorName;
    private String title;
    private BookGenreEnum bookGenre;
    private Integer pagesAmount;

    public static BookCredentialsDto build(Book book) {
        BookCredentialsDto dto = new BookCredentialsDto();
        dto.setId(book.getId());
        dto.setAuthorSurname(book.getAuthorSurname());
        dto.setAuthorName(book.getAuthorName());
        dto.setTitle(book.getTitle());
        
        BookCredential credential = book.getCredential();
        if (credential != null) {
            dto.setBookGenre(credential.getBookGenre());
            dto.setPagesAmount(credential.getPagesAmount());
        }
        return dto;
    }
}

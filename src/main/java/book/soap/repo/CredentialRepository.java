package book.soap.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import book.soap.entity.BookCredential;

public interface CredentialRepository extends JpaRepository<BookCredential, Integer> {


}

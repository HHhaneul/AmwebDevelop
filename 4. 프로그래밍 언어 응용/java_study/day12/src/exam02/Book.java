package exam02;

import java.util.Objects;

public class Book {
    private String title; // 제목
    private String author; // 저자
    private String publisher; // 출판사

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publisher);
        // 같은 값은 같은 hashCode가 나오게 만든다!
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Book){
            Book book = (Book)obj;
            if (title.equals(book.title) && author.equals(book.author) && publisher.equals(book.publisher)){
                return true;
            }
        }
        return false;
    }
}

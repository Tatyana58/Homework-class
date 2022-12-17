import java.util.Objects;

public class Book {
    private String titleBook;
    private int yearPublication;
    private final Author author;
    public Book(Author author,String titleBook,int yearPublication) {
        this.author = new Author(author.getName(), author.getSurName());
        this.titleBook = titleBook;
        this.yearPublication = yearPublication;
    }
    public String getTitleBook() {
        return this.titleBook;
    }
    public int getYearPublication() {
        return this.yearPublication;
    }
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String toString(Book titleBook,Book yearPublication){
        return "Название книги"+this.titleBook+"Год публикации"+this.yearPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titleBook='" + titleBook + '\'' +
                ", yearPublication=" + yearPublication +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(titleBook, book.titleBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, yearPublication, author);
    }
}

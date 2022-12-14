public class Book {
    private String titleBook;
    private int yearPublication;
    private Author author;
    public Book(Author author,String titleBook,int yearPublication) {
        this.author=new Author(author.getName(), author.getSurname());
        this.titleBook=titleBook;
        this.yearPublication=yearPublication;
    }
    public String getTitleBook() {
        return this.titleBook;
    }
    public int getYearPublication() {
        return this.yearPublication;
    }
    public void setYearPublication(int yearPublication) {
        this.yearPublication=yearPublication;
    }



}

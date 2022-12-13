public class Book {
    private String titleBook;
    private int yearPublication;

    public Book(String titleBook,int yearPublication) {
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

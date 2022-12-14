import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Николай", "Прохоренок");
        Book bookName1 = new Book(new Author(author1.getName(), author1.getSurname()), "Основы Java", 2022);
        Author author2 = new Author("Анджел","Леонард");
        Book bookName2 = new Book(new Author(author2.getName(), author2.getSurname()),"Java Решение практических задач", 2021);
        System.out.println("Автор, название книги, год издания: " + author1.getName() + " " + author1.getSurname() + " "
                + bookName1.getTitleBook() + " " + bookName1.getYearPublication());
        bookName1.setYearPublication(2020);
        System.out.println("Автор, название книги, год издания: " + author1.getName() + " " + author1.getSurname() + " "
                + bookName1.getTitleBook() + " " + bookName1.getYearPublication());
        System.out.println("Автор, название книги, год издания: " + author2.getName() + " " + author2.getSurname() + " "
                + bookName2.getTitleBook() + " " + bookName2.getYearPublication());

    }
}
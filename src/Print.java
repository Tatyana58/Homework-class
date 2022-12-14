
public class Print {
    public static void main(String[] args){
        Author author1 = new Author("Николай", "Прохоренок");
        Book bookName1 = new Book(new Author(author1.getName(), author1.getSurname()), "Основы Java", 2022);
        Author author2 = new Author("Анджел","Леонард");
        Book bookName2 = new Book(new Author(author2.getName(), author2.getSurname()),"Java Решение практических задач", 2021);
        printInfo(author1,author1,bookName1,bookName1);
        printInfo(author2,author2,bookName2,bookName2);
        bookName1.setYearPublication(2020);
        System.out.println("Изменили год издания");
        printInfo(author1,author1,bookName1,bookName1);
    }
    public static void printInfo(Author author, Author author2, Book nameBook, Book year ) {
        System.out.println("Новый Автор, название книги, год издания: " + author.getName() + " " + author2.getSurname() + " "
                + nameBook.getTitleBook() + " " + year.getYearPublication());
    }

}
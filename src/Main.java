public class Main {

    public static void main(String[] args) {
        System.out.println("Домашняя работа - Классы\n");
        Author author1 = new Author("Николай", "Прохоренок");
        System.out.println("Автор: " + author1.getName()+" "+author1.getSurname());
        Book bookName1 = new Book("Основы Java",2022);
        System.out.println("Название книги: " + bookName1.getTitleBook()+" год издания - "+bookName1.getYearPublication());
        Author author2 = new Author("Анджел", "Леонард");
        Book bookName2 = new Book("Java практические задачи",2021);
        System.out.println("Автор: " + author2.getName()+" "+author2.getSurname());
        System.out.println("Название книги: " + bookName2.getTitleBook()+" год издания - "+bookName2.getYearPublication());
    }
}
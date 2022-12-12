public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа - Классы");
        Author nikolay = new Author("Николай", "Прохоренок");
        System.out.println("nikolay.getName() = " + nikolay.getName());
        System.out.println("nikolay.getSurname() = " + nikolay.getSurname());
        Book bookName1 = new Book("Основы Java",2022);
        System.out.println("bookName1.getTitleBook() = " + bookName1.getTitleBook());
        System.out.println("bookName1.getYearPublication() = " + bookName1.getYearPublication());
    }
}
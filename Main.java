public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Math", "Jeong seungjae");
        Book book2 = new Book("Korean", "Saejong");
        Book book3 = new Book("Spring", "Kim Giyong");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("도서관에 등록된 책 목록은 :");
        library.showBooks();

        System.out.println("\n대여 가능한 책 목록:");
        library.showAbleBooks();

        System.out.println("\n책 대여:");
        library.rentBook("Spring");

        System.out.println("\n대여 가능한 책 목록:");
        library.showAbleBooks();

        System.out.println("\n책 반납:");
        library.returnBook("Spring");

        System.out.println("\n대여 가능한 책 목록:");
        library.showAbleBooks();
    }
}

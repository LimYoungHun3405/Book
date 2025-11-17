import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<Book>();  // 책 목록

    // 생성자
    public Library() {
        books = new ArrayList<>();
    }

    // 도서관에 책 등록하기
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " 책이 도서관에 등록되었습니다.");
    }

    // 도서관에 등록된 책 조회하기
    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("등록된 책이 없습니다.");
        } else {
            for (Book book : books) {
                book.printBookInfo();
            }
        }
    }

    // 대여 가능한 책 조회하기
    public void showAbleBooks() {
        boolean foundAbleBook = false;
        for (Book book : books) {
            if (!book.rentalAble()) {
                book.printBookInfo();
                foundAbleBook = true;
            }
        }
        if (!foundAbleBook) {
            System.out.println("현재 대여 가능한 책이 없습니다.");
        }
    }

    // 책 대여하기
    public void rentBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.rentBook();
                return;
            }
        }
        System.out.println(title + " 책을 도서관에서 찾을 수 없습니다.");
    }

    // 책 반납하기
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println(title + " 책을 도서관에서 찾을 수 없습니다.");
    }
}

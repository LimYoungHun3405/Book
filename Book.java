public class Book {
    private String title;  // 책 제목
    private String author; // 저자
    private boolean rentalAble;  // 대여 여부

    // 생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.rentalAble = false;  // 기본적으로 책은 대여되지 않은 상태
    }

    // getter, setter 메서드
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean rentalAble() {
        return rentalAble;
    }

    public void rentBook() {
        if (!rentalAble) {
            rentalAble = true;
            System.out.println(title + " 책이 대여되었습니다.");
        } else {
            System.out.println(title + " 책은 이미 대여되었습니다.");
        }
    }

    public void returnBook() {
        if (rentalAble) {
            rentalAble = false;
            System.out.println(title + " 책이 반납되었습니다.");
        } else {
            System.out.println(title + " 책은 이미 반납되었습니다.");
        }
    }

    // 책 정보 출력
    public void printBookInfo() {
        String rentalStatus = rentalAble ? "대여중입니다. " : "대여가 가능합니다. ";
        System.out.println("책 제목: " + title + ", 저자: " + author + ", 상태: " + rentalStatus );
    }
}

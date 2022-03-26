package ClassEx23_58;

// interface는 필드(선택)와 추상메서드로 구성된 클래스
// 무조건 추상메서드이기 떄문에 abstract키워드 생략가능
interface Lendable {
    void checkOut(String borrower, String date);
    void checkIn();
}

class CDInfo {
    String registerNo;
    String title;

    CDInfo(String regitsterNo, String title) {
        this.registerNo = regitsterNo;
        this.title = title;
    }
}

class SeparateVolume implements Lendable {
    String requestNo; // 청구번호
    String bookTitle; // 제목
    String writer; // 저자
    String borrower; // 대출인
    String checkOutDate; // 대출일
    byte state; // 대출상태

    SeparateVolume(String requestNo, String bookTitle, String writer) {
        this.requestNo = requestNo;
        this.bookTitle = bookTitle;
        this.writer = writer;
    }

    public void checkOut(String borrower, String date) {
        if (state != 0)
            return;
        this.borrower = borrower;
        this.checkOutDate = date;
        this.state = 1;

        System.out.println("*" + bookTitle + "이(가) 대출되었습니다.");
        System.out.println("대출인:" + borrower);
        System.out.println("대출일:" + date + "\n");
    }

    public void checkIn() {
        this.borrower = null;
        this.checkOutDate = null;
        this.state = 0;
    }
}

class AppCDInfo extends CDInfo implements Lendable {
    String borrower;
    String checkOutDate;
    byte state;

    AppCDInfo(String registerNo, String title) {
        super(registerNo, title);
    }

    public void checkOut(String borrower, String date) {
        if (state != 0)
            return;
        this.borrower = borrower;
        this.checkOutDate = date;
        this.state = 1;

        System.out.println("*" + title + "CD가 대출되었습니다.");
        System.out.println("대출인:" + borrower);
        System.out.println("대출일:" + date + "\n");
    }

    public void checkIn() {
        this.borrower = null;
        this.checkOutDate = null;
        this.state = 0;

        System.out.println("*" + title + "CD가 반납되었습니다. \n");
    }
}

public class InterfaceExample_13 {
    public static void main(String[] args) {
        SeparateVolume obj1 = new SeparateVolume("863ㅂ774개", "개미", "베르베르");
        AppCDInfo obj2 = new AppCDInfo("2005-7001", "Redhat Fedora");
        obj1.checkOut("김영숙", "20210324");
        obj2.checkOut("박희경", "20210324");
        obj1.checkIn();
        obj2.checkIn();
    }
}

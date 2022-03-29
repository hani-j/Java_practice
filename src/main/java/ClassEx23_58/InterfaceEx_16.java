package ClassEx23_58;

interface Lendable2 {
    void checkOut(String borrower, String date);
    void checkIn();
}

class CDInfo2 {
    String registerNo;
    String title;

    CDInfo2(String registerNo, String title) {
        this.registerNo = registerNo;
        this.title = title;
    }
}

class SeparateVolume2 implements Lendable2 {
    String requestNo;
    String bookTitle;
    String writer;
    String borrower;
    String checkOutDate;
    byte state;

    SeparateVolume2(String requestNo, String bookTitle, String writer) {
        this.requestNo = requestNo;
        this.bookTitle = bookTitle;
        this.writer = writer;
    }

    public void checkOut(String borrower, String date) {
        if(state != 0)
            return;
        this.borrower = borrower;
        this.checkOutDate = date;
        this.state = 1;

        System.out.println("*"+bookTitle+"이(가) 대출되었습니다.");
        System.out.println("대출인:"+borrower);
        System.out.println("대출일:"+date+"\n");
    }

    public void checkIn() {
        this.borrower = null;
        this.checkOutDate = null;
        this.state = 0;

        System.out.println("*"+bookTitle+"이(가) 반납되었습니다.\n");
    }
}

class AppCDInfo2 extends CDInfo2 implements Lendable2 {
    String borrower;
    String checkOutDate;
    byte state;

    AppCDInfo2(String registerNo, String title) {
        super(registerNo, title);
    }

    public void checkOut(String borrower, String date) {
        if(state != 0)
            return;
        this.borrower = borrower;
        this.checkOutDate = date;
        this.state = 1;

        System.out.println("*"+title+"CD가 대출되었습니다.");
        System.out.println("대출인:"+borrower);
        System.out.println("대출일:"+date+"\n");
    }

    public void checkIn() {
        this.borrower = null;
        this.checkOutDate = null;
        this.state = 0;

        System.out.println("*"+title+"CD가 반납되었습니다.\n");
    }
}

public class InterfaceEx_16 {
    public static void main(String[] args) {
        Lendable2 arr[] = new Lendable2[3];
        arr[0]=new SeparateVolume2("883 o","푸코의 전자","에코");
        arr[1]=new SeparateVolume2("609.2","서양미술사","곰브리치");
        arr[2]=new AppCDInfo2("02-17","XML을 위한 자바 프로그래밍");

        checkOutAll(arr,"정하은","20220329");
    }

    public static void checkOutAll(Lendable2 arr[], String borrower, String date) {
        for (int cnt = 0; cnt<arr.length; cnt++)
            arr[cnt].checkOut(borrower, date);
    }
}

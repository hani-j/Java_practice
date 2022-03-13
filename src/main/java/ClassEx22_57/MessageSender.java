package ClassEx22_57;

public abstract class MessageSender { // 상속 목적
    String title;
    String senderName;

    MessageSender(String title, String senderName) {
        this.title = title;
        this.senderName = senderName;
    }
    abstract void sendMessage(String recipient);
    // 추상 메서드는 선언만 하고 내용이 없는 메서드 {} 넣으면 오류
    // 추상 메서드가 선언되어 있는 클래스는 반드시 추상 클래스가 되어야 한다.
    // 자식 클래스에서 추상메서드를 완성해라
    void sendMessage2(String recipient) {}
    // 추상클래스는 일반 메서드도 가질 수 있다.
}

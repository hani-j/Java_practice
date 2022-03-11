package ClassEx20_55;

class Speaker { // final : 상속 금지
    private int volumRate;

    public void showCurrentState() {
        System.out.println("볼륨크기 : " + volumRate);
    }
    public void setVolum(int vol) {volumRate = vol;}
}

class BaseEnSpeaker extends Speaker {
    private int baseRate;

    public void showCurrentState() { // 부모 자식 명칭 재활용 : overriding
        super.showCurrentState();
        System.out.println("베이스 크기 : " + baseRate);
    }
    public void setBaseRate(int base) {baseRate = base;}
}

public class Overriding_08 {
    public static void main(String[] args) {
        BaseEnSpeaker bs = new BaseEnSpeaker();
        bs.setVolum(10);
        bs.setBaseRate(20);
        bs.showCurrentState();
    }
}

package ClassEx23_58;

class TV3 {
    public void onTV() {
        System.out.println("영상 출력 중");
    }
}

interface Computer3 {
    public void dataReceive();
}

class ComputerImpl {
    public void dataReceive() {
        System.out.println("영상 데이터 수신 중");
    }
}

class IPTV extends TV3 implements Computer3 {
    ComputerImpl comp = new ComputerImpl();

    public void dataReceive() {
        comp.dataReceive();
    }

    public void powerOn() {
        dataReceive();
        onTV();
    }
}

public class MultilInheriAlternative_12 {
    public static void main(String[] args) {
        IPTV ip = new IPTV();
        ip.powerOn();
    }
}

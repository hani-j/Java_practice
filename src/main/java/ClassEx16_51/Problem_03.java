package ClassEx16_51;

import java.util.Scanner;

class SungJuk {
    private String name;
    private int kor;
    private int eng;
    private int tot;
    private int rank;

    SungJuk(String name, int kor, int eng) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.tot = tot;
        this.rank = rank;
    }

    public int getKor() {        return kor;}

    public void setKor(int kor) {this.kor = kor;}

    public int getEng() {return eng;}

    public void setEng(int eng) {this.eng = eng;}

    public int getTot() {return tot;}

    public void setTot(int tot) {this.tot = tot;}

    public String getName() {return name;}

    public int getRank() {return rank;}

    public void clearRank() {rank = 1;}

    public void plusRank() {rank++;}

    void disp() {
        System.out.println(name + "님의 총점은 " + tot + "점이고, 순위는 " + rank +
                "등 입니다.");
    }
}

public class Problem_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("학생 수 입력 : ");
        int inwon = in.nextInt();
        SungJuk su[] = new SungJuk[inwon];

        for (int i = 0; i < inwon; i++) {
            System.out.print(i + 1 + "번째 학생의 이름 : ");
            String name = in.next();
            System.out.print(i + 1 + "번째 학생의 국어 점수 : ");
            int kor = in.nextInt();
            System.out.print(i + 1 + "번째 학생의 영어 점수 : ");
            int eng = in.nextInt();

            su[i] = new SungJuk(name, kor, eng);
            su[i].setTot(kor + eng);
        }

        for (int i = 0; i < inwon; i++) {
            su[i].clearRank();
            for (int j = 0; j < inwon; j++) {
                if (su[i].getTot() < su[j].getTot()) {
                    su[i].plusRank();
                }
            }
        }
        for (int i = 0; i < inwon; i++) {
            su[i].disp();
        }
    }
}

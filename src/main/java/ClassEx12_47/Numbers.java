package ClassEx12_47;

public class Numbers {
    int num[];

    Numbers(int num[]) {
        this.num = num;
    }

    public int getTotal() {
        int total = 0;
        for (int cnt = 0; cnt < num.length; cnt++)
            total += num[cnt];
        return total;
    }

    public int getAverage() {
        int average = getTotal() / num.length;
        return average;
    }
}

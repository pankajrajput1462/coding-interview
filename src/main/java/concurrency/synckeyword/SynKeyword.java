package concurrency.synckeyword;

public class SynKeyword {
    private int sum = 0;

    public synchronized void calculateSync() {
        setSum(getSum() + 1);
    }

    public void calculate() {
        setSum(getSum() + 1);
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

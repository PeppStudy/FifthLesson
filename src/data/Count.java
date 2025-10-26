package data;

public class Count {

    private float initialSum;
    private int initialTerm;

    public Count(float initialSum, int initialTerm) {
        this.initialSum = initialSum;
        this.initialTerm = initialTerm;
    }

    public float calculate() {
        float sum = initialSum;

        for(int i = 1; i <= initialTerm; i++) {
            sum += sum * 0.07;
        }
        return sum;
    }
}

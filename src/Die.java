import java.util.concurrent.ThreadLocalRandom;
public class Die {

    public static int roll(int numSides) {
        int value = ThreadLocalRandom.current().nextInt(1, numSides);
        return value;
    }
    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    @Override
    public String toString() {
        return "Die{" +
                "numSides=" + numSides +
                ", value=" + value +
                '}';
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getNumSides() {
        return numSides;
    }

    public int getValue() {
        return value;
    }

    public Die(int numSides, int value) {
        this.numSides = numSides;
        this.value = value;
    }

    public Die(int numSides) {
        this.value = 1;
    }
    public Die(){}

    private int numSides = 6;
    private int value = 1;
}

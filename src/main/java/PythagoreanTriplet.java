import java.util.ArrayList;
import java.util.List;
public class PythagoreanTriplet {
    private int sum;
    private int factorLimit;
    private int a;
    private int b;
    private int c;
    public PythagoreanTriplet() {
    }
    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static PythagoreanTriplet makeTripletsList() {
        return new PythagoreanTriplet();
    }
    public PythagoreanTriplet withFactorsLessThanOrEqualTo(int factorLimit) {
        this.factorLimit = factorLimit;
        return this;
    }
    public PythagoreanTriplet thatSumTo(int sum) {
        this.sum = sum;
        return this;
    }
    public List<PythagoreanTriplet> build() {
        List<PythagoreanTriplet> resp = new ArrayList<>();
        for (int i = 1; i <= factorLimit; i++) {
            for (int j = i+1; j <= factorLimit; j++) {
                int k = sum - i -j;
                        if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2)) {
                            resp.add(new PythagoreanTriplet(i, j, k));
                }
            }
        }
        return resp;
    }
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        PythagoreanTriplet other = (PythagoreanTriplet) obj;
        if ((this.a == other.a) && (this.b == other.b) && (this.c == other.c)) {
            return true;
        }
        return false;
    }
}

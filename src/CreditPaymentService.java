public class CreditPaymentService {
    public int calculate(int sum, int time, double percent) {
        int n = time * 12;
        double m = percent / 1200;
        double u = 1 + m;
        double y = Math.pow(u, n);
        double k = m * y / (y - 1);
        double result = sum * k;

        return (int) result;
    }
}
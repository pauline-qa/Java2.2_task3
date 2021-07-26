public class CreditPaymentService {
    public double calculate(long loanAmount, double interestRate, int interestPeriod) {
        double monthlyInterestRate = (interestRate / 100) / 12;
        double denominator = 1 - Math.pow(1 + monthlyInterestRate, -interestPeriod);
        long annuityPayment = (long) (loanAmount * (monthlyInterestRate / denominator));
        return annuityPayment;
    }
}

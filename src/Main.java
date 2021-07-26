public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long loanAmount = 1_000_000;
        double interestRate = 9.99;
        int interestPeriod = 24;
        long annuityPayment = (long) service.calculate(loanAmount, interestRate, interestPeriod);
        System.out.println(annuityPayment);

        long annuityPayment12months = (long) service.calculate(1_000_000, 9.99, 12);
        System.out.println(annuityPayment12months);

        long annuityPayment36months = (long) service.calculate(1_000_000, 9.99, 36);
        System.out.println(annuityPayment36months);
    }
}

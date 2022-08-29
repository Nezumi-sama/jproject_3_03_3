public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000, period;

        period = 1;
        System.out.println(service.calculate(amount, period));

        period = 2;
        System.out.println(service.calculate(amount, period));

        period = 3;
        System.out.println(service.calculate(amount, period));

    }
}

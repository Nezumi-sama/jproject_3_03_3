public class CreditPaymentService {
    public int calculate(int amount, int year) {
        int monthlyPayment;
        double monthPercent, k;

        //расчет % в месяц в долях
        monthPercent = 9.99 / (100 * 12);

        //расчет коэффициента
        k = monthPercent + monthPercent / (Math.pow(1 + monthPercent, year * 12) - 1);

        //расчет ежемесячного платежа
        monthlyPayment = (int) (k * amount);

        return monthlyPayment;
    }
}


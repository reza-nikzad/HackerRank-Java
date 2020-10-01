import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormat {
    public static void main(String[] args) {
        double no = 1234567.89;
        NumberFormat numberUS = NumberFormat.getCurrencyInstance(Locale.US);
        String currencyUS = numberUS.format(no);
        System.out.println("US: "+currencyUS);

        NumberFormat numberIN = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String currencyIN = numberIN.format(no);
        System.out.println("IN: "+currencyIN);

        NumberFormat numberCH = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String currencyCH = numberCH.format(no);
        System.out.println("CH: "+currencyCH);

        NumberFormat numberFormatFr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String currencyFr = numberFormatFr.format(no);
        System.out.println("Fr: "+currencyFr);
    }
}

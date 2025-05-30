import java.text.NumberFormat;
import java.util.Locale;

public class Util {
    public static String formatarMoeda(double valor) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return formatter.format(valor);
    }
}

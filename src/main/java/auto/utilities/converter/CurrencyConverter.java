package auto.utilities.converter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author ChungND1
 * Convert currency for calculative type (BigDecimal)
 */
public class CurrencyConverter {

     public BigDecimal stringToCurrency(String stringCurrency) {
        String newString = stringCurrency.replaceAll("[^\\d]+", "");
        return new BigDecimal(newString);
    }

    String stringSpace(String stringCurrency) {
        return stringCurrency.replaceAll(" ", "");
    }

    String formatCurrency(BigDecimal value) {
        NumberFormat format = NumberFormat.getInstance(new Locale("en", "US"));
        format.setMinimumFractionDigits(2);
        format.setMaximumFractionDigits(5);
        format.setRoundingMode(RoundingMode.HALF_EVEN);
        return format.format(value);
    }

    String formatCurrency(BigDecimal value,Locale locale) {
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        format.setMinimumFractionDigits(2);
        format.setMaximumFractionDigits(5);
        format.setRoundingMode(RoundingMode.HALF_EVEN);
        return format.format(value);
    }

    String formatUSDCurrency(BigDecimal value) {
        return formatCurrency(value,new Locale("en", "US"));
    }

    String formatVNDCurrency(BigDecimal value) {
        return formatCurrency(value,new Locale("vi", "VN"));
    }
}

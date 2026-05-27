package felipeschwartz.com.github.request.converters;
import felipeschwartz.com.github.exception.UnsupportedMathOperationException;
import org.springframework.stereotype.Component;

@Component
public class NumberConverter {

    public Double convertToDouble(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) throw new UnsupportedMathOperationException("Please set a numeric value!");
        String number = strNumber.trim().replace(",", ".");
        try {
            return Double.parseDouble(number);
        } catch (NumberFormatException e) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
    }

    public int convertToInt(String index) {
        if (index == null || index.isEmpty()) throw new UnsupportedMathOperationException("Please set a numeric value!");
        try {
            return Integer.parseInt(index);
        } catch (NumberFormatException e) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
    }

    public boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}

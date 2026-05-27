package felipeschwartz.com.github.services;
import felipeschwartz.com.github.exception.UnsupportedMathOperationException;
import org.springframework.stereotype.Service;

@Service
public class MathService {


    public double sum(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public double subtraction(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    public double multiplication(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    public double division(double numberOne, double numberTwo) {
        if (numberTwo == 0.0) {
            throw new UnsupportedMathOperationException("Divisão por zero não é permitida.");
        }
        return numberOne / numberTwo;
    }

    public double mean(double numberOne, double numberTwo) {
        return (numberOne + numberTwo) / 2.0;
    }

    public double squareRoot(double number) {
        if (number < 0.0) {
            throw new UnsupportedMathOperationException("Não existe raiz real para número negativo.");
        }
        return Math.sqrt(number);
    }
    public double nthRoot(double radicand, int index) {
        if (index == 0) {
            throw new IllegalArgumentException("O índice da raiz não pode ser 0.");
        }

        // Para radicando negativo:
        // - índice par => não existe raiz real
        // - índice ímpar => existe, e o resultado é negativo
        if (radicand < 0) {
            if (index % 2 == 0) {
                throw new IllegalArgumentException("Não existe raiz real para radicando negativo com índice par.");
            }
            return -Math.pow(-radicand, 1.0 / index);
        }

        return Math.pow(radicand, 1.0 / index);
    }

}

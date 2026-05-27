package felipeschwartz.com.github.controllers;
import felipeschwartz.com.github.services.MathService;
import felipeschwartz.com.github.request.converters.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    private final MathService mathService;
    private final NumberConverter converter;

    public MathController(MathService mathService, NumberConverter converter) {
        this.mathService = mathService;
        this.converter = converter;
    }
    
    // http://localhost:8080/math/sum/3/5

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable String numberOne, @PathVariable String numberTwo) {
        return mathService.sum(
                converter.convertToDouble(numberOne),
                converter.convertToDouble(numberTwo)
        );
    }

    // http://localhost:8080/math/subtraction/3/5
    @RequestMapping("subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(@PathVariable String numberOne, @PathVariable String numberTwo) {
        return mathService.subtraction(
                converter.convertToDouble(numberOne),
                converter.convertToDouble(numberTwo)
        );
    }

    // http://localhost:8080/math/multiplication/3/5
    @RequestMapping("multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(@PathVariable String numberOne, @PathVariable String numberTwo) {
        return mathService.multiplication(
                converter.convertToDouble(numberOne),
                converter.convertToDouble(numberTwo)
        );
    }

    // http://localhost:8080/math/division/3/5
    @RequestMapping("division/{numberOne}/{numberTwo}")
    public Double division(@PathVariable String numberOne, @PathVariable String numberTwo) {
        return mathService.division(
                converter.convertToDouble(numberOne),
                converter.convertToDouble(numberTwo)
        );
    }

    // http://localhost:8080/math/mean/3/5
    @RequestMapping("mean/{numberOne}/{numberTwo}")
    public Double mean(@PathVariable String numberOne, @PathVariable String numberTwo) {
        return mathService.mean(
                converter.convertToDouble(numberOne),
                converter.convertToDouble(numberTwo)
        );
    }

    // http://localhost:8080/math/squareroot/81
    @RequestMapping("squareroot/{number}")
    public Double squareroot(@PathVariable String number) {
        return mathService.squareRoot(converter.convertToDouble(number));
    }

    // http://localhost:8080/math/root/3/8
    @RequestMapping("root/{index}/{radicand}")
    public Double root(@PathVariable String index, @PathVariable String radicand) {
        int n = converter.convertToInt(index);
        double x = converter.convertToDouble(radicand);
        return mathService.nthRoot(x, n);
    }
}

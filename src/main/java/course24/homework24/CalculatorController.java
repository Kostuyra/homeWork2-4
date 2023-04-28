package course24.homework24;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
class CalculateController {
	private final CalculateServiceInterface calculateService;

	public CalculateController(CalculateServiceInterface calculateService) {
		this.calculateService = calculateService;
	}

	@GetMapping()
	String homeCalculator() {
		return calculateService.welcomeMessage();
	}

	@GetMapping(path = "/plus")
	String plusCalculator(@RequestParam() double num1, @RequestParam() double num2) {
		return calculateService.calculate("plus", num1, num2);
	}

	@GetMapping(path = "/minus")
	String minusCalculator(@RequestParam() double num1, @RequestParam() double num2) {
		return calculateService.calculate("minus", num1, num2);
	}

	@GetMapping(path = "/multiply")
	String multiplyCalculator(@RequestParam() double num1, @RequestParam double num2) {
		return calculateService.calculate("multiply", num1, num2);
	}

	@GetMapping(path = "/division")
	String divisionCalculator(@RequestParam() double num1, @RequestParam double num2) {
		if (calculateService.checkBeforeDivision(num2)){
			return "На ноль делить нельзя!";
		}
		return calculateService.calculate("division", num1, num2);
	}

}

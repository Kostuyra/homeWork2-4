package course24.homework24;

import org.springframework.stereotype.Service;


@Service
public class CalculateService implements CalculateServiceInterface {

	public String welcomeMessage() {
		return "Добро пожаловать в калькулятор";
	}

	public String calculate(String oper, double num1, double num2) {
		double result = 0.0;
		if (oper.equals(" + ")) {
			result = num1 + num2;
		} else if (oper.equals(" - ")) {
			result = num1 - num2;
		} else if (oper.equals(" * ")) {
			result = num1 * num2;
		} else if (oper.equals(" / ")) {
			result = num1 / num2;
		}
		return num1 + oper + num2 + " = " + result;
	}

	public Boolean checkBeforeDivision(double num) {
		if (num == 0) {
			return true;
		} else {
			return false;
		}
	}
}

package course24.homework24;

import org.springframework.stereotype.Service;


@Service
public class CalculateService implements CalculateServiceInterface {

	public String welcomeMessage() {
		return "Добро пожаловать в калькулятор";
	}

	public String calculate(String oper, double num1, double num2) {
		double result = 0.0;
		String sign = "";
		if (oper.equals("plus")) {
			result = num1 + num2;
			sign = " + ";
		} else if (oper.equals("minus")) {
			result = num1 - num2;
			sign = " - ";
		} else if (oper.equals("multiply")) {
			result = num1 * num2;
			sign = " * ";
		} else if (oper.equals("division")) {
			result = num1 / num2;
			sign = " / ";
		}
		return num1 + sign + num2 + " = " + result;
	}

	public Boolean checkBeforeDivision(double num) {
		if (num == 0) {
			return true;
		} else {
			return false;
		}
	}
}

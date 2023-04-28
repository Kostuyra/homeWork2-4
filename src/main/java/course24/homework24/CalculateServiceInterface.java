package course24.homework24;

public interface CalculateServiceInterface {
	String welcomeMessage();
	String calculate(String oper, double num1, double num2);
	Boolean checkBeforeDivision(double num);

}

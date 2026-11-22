package ObjectClass;

public class calculatorCodes {
	double sum = 0;
    void insert(double number1, double number2) {
    	sum += number1 + number2;
    }
    
    void insert(double number1) {
    	sum += number1;
    }
    
    double rotate_the_value_to_main() {
    	return sum;
    }
}

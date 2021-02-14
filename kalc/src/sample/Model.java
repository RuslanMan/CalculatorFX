package sample;

public class Model {
    public static double calculation(double a, double b, String operator){
        switch (operator){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                if(b == 0){
                    return 0;
                }
                else {
                    return a / b;
                }
        }

        return 0;
    }
}

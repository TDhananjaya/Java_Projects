import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numberOne=0,numberTwo=0,result=0;
        boolean isNumber;
        String operator,operatorNotation=null;
        System.out.println("Please enter a number : ");
        numberOne = scanner.nextDouble();
        System.out.println("Please enter the Second number : ");
        numberTwo =scanner.nextDouble();
        System.out.println("Please enter a operator : ");
        operator=scanner.next();

        switch(operator.trim()){

            case "+":
                result = add(numberOne,numberTwo);
                operatorNotation="adittion";
                break;
            case "*":
                result=multiply(numberOne,numberTwo);
                operatorNotation="multiplication";
                break;
            case "/":
                result=divide(numberOne,numberTwo);
                operatorNotation="division";
                break;
            case "-":
                result=substract(numberOne,numberTwo);
                operatorNotation="substraction";
                break;
            default:
                System.out.println("There is no such operator");


        }

        if(operatorNotation!=null)
            System.out.println("The "+operatorNotation+" of the "+numberOne+" and "+numberTwo+ " is " +result);


    }//main


    private static double add(double a,double b){

        return a+b;

    }

    private static double multiply(double a,double b){

        return a*b;

    }

    private static double divide(double a,double b){

        return a/b;

    }

    private static double substract(double a,double b){

        return a-b;

    }
}//class

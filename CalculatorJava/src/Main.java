import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter operator: ");
        char operator = input.next().charAt(0);
        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

/*
        if(operator=="mul"){
            erg=firstInput*secondInput;
            executed=true;
        }
        if(operator=="add"){
            erg=firstInput+secondInput;
            executed=true;
        }
        if(operator=="sub"){
            erg=firstInput-secondInput;
            executed=true;
        }
        if(executed==false){
            System.out.println("Ungueltiger Parameter!");
        }
        else {
            System.out.println("Das ergebnis ist: "+erg);
        }

*/
       /* switch(operator) {
            case : "mul";
            ergebnis= firstInput*secondInput break;
        }*/

    }
}

import java.util.Scanner;
import java.lang.Math;

class calculator {
    Scanner input = new Scanner(System.in);
    Double num1, num2, result;

    void addition() {
        System.out.print("enter first number : ");
        double num1 = input.nextDouble();
        System.out.print("enter second number :");
        double num2 = input.nextDouble();
        result = num1 + num2;
        System.out.println("addition is  = " + result);
    }

    void subtract() {
        System.out.print("enter first number : ");
        num1 = input.nextDouble();
        System.out.print("enter second number : ");
        num2 = input.nextDouble();
        result = num1 - num2;
        System.out.println("subtraction is = " + result);
    }

    void multiplication() {
        System.out.print("enter first number : ");
        num1 = input.nextDouble();
        System.out.print("enter second number : ");
        num2 = input.nextDouble();
        result = num1 * num2;
        System.out.println("division is  = " + result);
    }

    void remainder() {
        System.out.print("enter first number : ");
        num1 = input.nextDouble();
        System.out.print("enter second number : ");
        num2 = input.nextDouble();
        result = num1 % num2;
        System.out.println("reaminder is  = " + result);
    }

    void division() {
        System.out.print("enter first number : ");
        num1 = input.nextDouble();
        System.out.print("enter second number : ");
        num2 = input.nextDouble();
        if (num2 != 0) {
            System.out.println("division is   = " + (num1 / num2));
        } else {
            System.out.println("cannot divide by zero\nplease enter non zero number");
        }
    }

    double factorial(double num) {

        if (num == 0 || num == 1) {
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }

    void binaryToDecimal() {
        System.out.print("enter binary number : ");
        String binary = input.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("decimal of binary  " + binary + " is = " + decimal);
    }

    void decimalToBinary() {
        System.out.println("enter decimal number : ");
        int decimal = input.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("binary of deciaml " + decimal + " is " + binary);
    }

    void DecimalToOctal() {
        System.out.println("enter decimal number : ");
        int decimal = input.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.println("octal of decimal " + decimal + " is " + octal);
    }

    void OctalToDecimal() {
        System.out.print("enter number in octal : ");
        String octal = input.nextLine();
        int decimal = Integer.parseInt(octal, 8);
        System.out.println("octal of decimal " + octal + " is " + decimal);
    }

    void DecimalToHexadecimal() {
        System.out.print("enter decimal number : ");
        int decimal = input.nextInt();
        String hex = Integer.toHexString(decimal);
        System.out.println("hex  of deciaml " + decimal + " is " + hex);
    }

    void HexadecimalToDecimal() {
        System.out.print("enter hexadecimal number :  ");
        String hex = input.nextLine();
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("decimal  of hexadecimal  " + hex + " is " + decimal);
    }

    public static void main(String[] args) {
        calculator cal = new calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("1:addition");
        System.out.println("2:substraction");
        System.out.println("3:multiplication");
        System.out.println("4:division");
        System.out.println("5:remainder");
        System.out.println("6:square root");
        System.out.println("7:exponentiation");
        System.out.println("8:angle to radian");
        System.out.println("9:angle in degree");
        System.out.println("10:maximum value bw two value");
        System.out.println("11:minimum value bw two value");
        System.out.println("12:sin value");
        System.out.println("13:cos value");
        System.out.println("14:tan value");
        System.out.println("15:cosec value");
        System.out.println("16:sec value");
        System.out.println("17:cot value");
        System.out.println("18:exponential ");
        System.out.println("19:log base e");
        System.out.println("20:log base 10");
        System.out.println("21:round off ceil value");
        System.out.println("22:sign of b on a");
        System.out.println("23:round off floor value");
        System.out.println("24:absolute value");
        System.out.println("25. factorial");
        System.out.println("26. binary to decimal ");
        System.out.println("27. decimal to binary");
        System.out.println("28. decimal to octal");
        System.out.println("29. octal to decimal");
        System.out.println("30. decimal to hexadecimal ");
        System.out.println("31. hexadecimal to decimal \n ");
        System.out.println("-----------------------------------------------------------");
        System.out.println("");

        double a, b, res;

        System.out.print("enter your choice of operation : ");
        int operation = input.nextInt();
        switch (operation) {
            case 1:
                cal.addition();
                break;
            case 2:
                cal.subtract();
                break;
            case 3:
                cal.multiplication();
                break;
            case 4:
                cal.division();
                break;
            case 5:
                cal.remainder();
                break;
            case 6:
                System.out.print("enter number :  ");
                a = input.nextDouble();
                System.out.println("square root is = " + Math.sqrt(a));
                break;
            case 7:
                System.out.print("enter base : ");
                a = input.nextDouble();
                System.out.print("enter the exponent : ");
                b = input.nextDouble();
                System.out.println("exponentiation is = " + Math.pow(a, b));
                break;
            case 8:
                System.out.print("enter angle in degree : ");
                a = input.nextDouble();
                System.out.println("angle in radian is=" + Math.toRadians(a));
                break;
            case 9:
                System.out.print("enter angle in radian : ");
                a = input.nextDouble();
                System.out.println("angle in degree is = " + Math.toDegrees(a));
                break;
            case 10:
                System.out.print("enter first number : ");
                a = input.nextDouble();
                System.out.print("enter second number : ");
                b = input.nextDouble();
                System.out.println("maximum value is = " + Math.max(a, b));
                break;
            case 11:
                System.out.print("enter first number : ");
                a = input.nextDouble();
                System.out.print("enter second number : ");
                b = input.nextDouble();
                System.out.println("minimum value is = " + Math.min(a, b));
                break;
            case 12:
                System.out.print("enter value : ");
                a = input.nextDouble();
                System.out.println("sin value is = " + Math.sin(a));
                break;

            case 13:
                System.out.print("enter value : ");
                a = input.nextDouble();
                System.out.println("cos value is = " + Math.cos(a));
                break;
            case 14:
                System.out.print("enter value :");
                a = input.nextDouble();
                System.out.println("tan value is = " + Math.tan(a));
                break;
            case 15:
                System.out.print("enter value : ");
                a = input.nextDouble();
                System.out.println("cosec value  is = " + 1 / Math.sin(a));
                break;
            case 16:
                System.out.print("enter value : ");
                a = input.nextDouble();
                System.out.println("sec value is = " + 1 / Math.cos(a));
                break;
            case 17:
                System.out.print("enter value : ");
                a = input.nextDouble();
                System.out.println("cot value  is = " + 1 / Math.tan(a));
                break;
            case 18:
                System.out.print("enter value : ");
                a = input.nextDouble();
                System.out.println("exponential is = " + Math.exp(a));
                break;
            case 19:
                System.out.print("enter value : ");
                a = input.nextDouble();
                System.out.println("log e value is = " + Math.log(a));
                break;
            case 20:
                System.out.print("enter value : ");
                a = input.nextDouble();
                System.out.println("log 10 value  is = " + Math.log10(a));
                break;
            case 21:
                System.out.print("enter value : ");
                a = input.nextDouble();
                System.out.println("round off ceil value is = " + Math.ceil(a));
                break;
            case 22:
                System.out.print("enter first number : ");
                a = input.nextDouble();
                System.out.print("enter second number : ");
                b = input.nextDouble();
                System.out.println("sign of b on a is = " + Math.copySign(a, b));
                break;
            case 23:
                System.out.print("enter number : ");
                a = input.nextDouble();
                System.out.println("round off floor is = " + Math.floor(a));
                break;
            case 24:
                System.out.println("enter number : ");
                a = input.nextDouble();
                System.out.println("absolute value  is = " + Math.abs(a));
                break;
            case 25:
                System.out.print("enter number : ");
                a = input.nextDouble();
                res = cal.factorial(a);
                System.out.println("factorial of " + a + " = " + res);
                break;
            case 26:
                cal.binaryToDecimal();
                break;
            case 27:
                cal.decimalToBinary();
                break;
            case 28:
                cal.DecimalToOctal();
                break;
            case 29:
                cal.OctalToDecimal();
                break;
            case 30:
                cal.DecimalToHexadecimal();
                break;
            case 31:
                cal.HexadecimalToDecimal();
                break;
            default:
                System.out.println("invalid operation");
                break;
        }
    }
}

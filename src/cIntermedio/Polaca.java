package cIntermedio;

import java.util.Stack;

public class Polaca {

    public static Double polaca(String expresion) {
        Stack<Double> stack = new Stack<>();
        StringBuilder exp = new StringBuilder(expresion);
        exp.reverse();
        for (int i = 0; i < exp.length(); i++) {
            char car = exp.charAt(i);
            if (jerarquia(car)>0) {
                double op1=stack.pop();
                double op2=stack.pop();
                double aux = operacion(op1, op2, car);
                stack.push(aux);
            }else{
                stack.push((double)(car-'0'));
            }
        }
        double resultado=stack.pop();
        return resultado;
    }

    public static Double operacion(double op1, double op2, char operador) {
        switch (operador) {
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
            case '*':
                return op1 * op2;
            case '/':
                return op1 / op2;
        }
        return 0.0;
    }

    public static int jerarquia(char car) {
        switch (car) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}

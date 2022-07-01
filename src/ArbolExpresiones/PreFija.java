package ArbolExpresiones;

public class PreFija {

    public static OpePila Conversion(String infijo) {

        infijo += ')';
        int tamaño = infijo.length();
        OpePila salida = new OpePila(tamaño);
        OpePila pila = new OpePila(tamaño);
        pila.push('(');
        try {
            for (int i = tamaño - 1; i >= 0; i--) {
                char caracter = infijo.charAt(i);

                switch (caracter) {
                    case '(':
                        while (pila.nextPop() != ')') {
                            salida.push(pila.pop());
                        }
                        pila.pop();
                        break;
                    case '+':
                    case '-':
                    case '^':
                    case '*':
                    case '/':
                        while (Jerarquia(caracter) <= Jerarquia(pila.nextPop())) {
                            salida.push(pila.pop());
                        }
                        pila.push(caracter);
                        break;
                    case ')':
                        pila.push(caracter);
                        break;

                    default:
                        salida.push(caracter);
                }
            }
        } catch (Throwable e) {

        }
        return salida;
    }
    public static int Jerarquia(char ope) {
    int jerarquia = 0;
    String op=String.valueOf(ope);
    if (op.equals(")")){
        jerarquia = 1;
    }
    if (op.equals("^")){
        jerarquia = 4;
    }
    if (op.equals("*") || op.equals("/")){
        jerarquia = 3;
    }
    if (op.equals("+") || op.equals("-")){
        jerarquia = 2;
    }
    if (op.equals("(")){
        jerarquia = 5;
    }
    return jerarquia;
    }
}

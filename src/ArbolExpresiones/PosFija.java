
package ArbolExpresiones;

public class PosFija {
    public static OpePila Conversion(String infijo) {
	
            infijo +=')'; 
		int tamaño = infijo.length();
		OpePila salida = new OpePila(tamaño);
		OpePila pila = new OpePila(tamaño);
		pila.push('('); 
		for (int i = 0; i < tamaño; i++) {
			char caracter = infijo.charAt(i);
			switch (caracter) {
			case '(':
				pila.push(caracter);
				break;
			case '+':
                        case '-':
                        case '^':
                        case '*':
                        case '/':
				while (Jerarquia(caracter) <= Jerarquia(pila.nextPop())){
					salida.push(pila.pop());}
				pila.push(caracter);
				break;
			case ')':
				while (pila.nextPop() != '(')
					salida.push(pila.pop());
				pila.pop();
				break;
			default:
				salida.push(caracter);
			}
		}
		return salida;
	}
   
   public static int Jerarquia(char ope) {
    int jerarquia = 0;
    String op=String.valueOf(ope);
    if (op.equals(")")){
        jerarquia = 5;
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
        jerarquia = 1;
    }
    return jerarquia;
    }
}

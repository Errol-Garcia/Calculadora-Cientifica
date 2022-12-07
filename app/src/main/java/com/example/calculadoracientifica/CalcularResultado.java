package com.example.calculadoracientifica;

import java.util.Arrays;
import java.util.Stack;

public class CalcularResultado {
    String[] operadores = {"+", "-", "×", "÷", "^", "log", "sin", "cos", "tan", "(", ")"};
    //String[] operadores = {"+", "-", "*", "/", "^"};
    int[] precedencia = {0, 0, 1, 1, 2, 3, 3, 3, 3, 3, 3};
    String textoDisplay;
    double resultado;

    public CalcularResultado() {
        this.textoDisplay = "";
        this.resultado = 0.;
    }

    public void recibirDisplay(String texto) {
        this.textoDisplay = texto;
        //System.out.println("Texto display = " + textoDisplay);

        Stack<String> polacaInversa = notacionPolacaInversa(textoDisplay);

        //System.out.println("\nPolaca inversa = " + polacaInversa);

        Stack<String> invertida = invertida(polacaInversa);
         evaluar(invertida);

        //System.out.println("\nInvertida = " + invertida);
        //System.out.println("\nEvaluar invertida = " + evaluar(invertida));
        //System.out.println("Resultado = " + resultado);
    }

    public double evaluar(Stack<String> pilaInvertida) {
        Stack<Double> pilaResultado = new Stack<>();
        int n = pilaInvertida.size();
        for (int i = 0; i < n; i++) {
            String token = pilaInvertida.pop();
            if (es_un_numero(token)) {
                pilaResultado.push(Double.parseDouble(token));
            } else {
                Double operadorDerecha = pilaResultado.pop();
                Double operadorIzquierda = pilaResultado.pop();
                Double resultado = operar(operadorIzquierda, operadorDerecha, token);
                pilaResultado.push(resultado);
            }

            //System.out.println("\nToken [" + i + "] = " + token);
            //System.out.println("\nPila resultado [" + i + "] = " + pilaResultado);
        }

        //System.out.println("\nPila resultado = " + pilaResultado);

        resultado = pilaResultado.peek();
        return resultado;
    }

    public Stack<String> invertida(Stack<String> np1) {
        Stack<String> invertida = new Stack();
        int n = np1.size();
        for (int i = 0; i < n; i++) {
            invertida.push(np1.pop());
        }
        return invertida;
    }

    public Stack<String> notacionPolacaInversa(String inOrden) {
        String[] tokens = tokenizar(inOrden);

        //tokenizar
        //System.out.println("\nTokens a Token\n");
        int cont = 0;
        for (String token : tokens) {
            System.out.println("Token [" + cont + "] = " + token);
            cont++;
        }

        //Dos pilas
        //System.out.println("\nDos pilas");
        Stack<String> pilaOperacion = new Stack<>();
        Stack<String> pilaOperadores = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (es_un_numero(tokens[i])) {
                //Numero
                //System.out.println("\nTokens[" + i + "] = " + tokens[i] + " numero");
                pilaOperacion.push(tokens[i]);
            } else {
                //Operador
                //System.out.println("\nTokens[" + i + "] = " + tokens[i] + " operador");
                if (pilaOperadores.size() == 0) {
                    pilaOperadores.push(tokens[i]);
                } else {
                    String cima = pilaOperadores.peek();
                    while (cima != null && esMenorOIgual(tokens[i], cima)) {
                        pilaOperacion.push(pilaOperadores.pop());
                        cima = pilaOperadores.peek();
                    }
                    pilaOperadores.push(tokens[i]);
                }
            }
            //System.out.println("");
            //System.out.println("----------");
            //System.out.println("\nPila operacion = " + pilaOperacion);
            //System.out.println("Pila operadores = " + pilaOperadores);
            //System.out.println("----------");
        }

        int n = pilaOperadores.size();
        for (int i = 0; i < n; i++) {
            pilaOperacion.push(pilaOperadores.pop());
        }
        //System.out.println("\nPila Operacion = " + pilaOperacion);

        return pilaOperacion;
    }

    public boolean esMenorOIgual(String operadores1, String operadores2) {
        //op1 -> operadores
        //p_op1 -> precedencia operadores
        int precedenciaOperadores1 = getPrecedencia(operadores1);
        int precedenciaOperadores2 = getPrecedencia(operadores2);

        if (precedenciaOperadores1 <= precedenciaOperadores2) {
            return true;
        }
        return false;
    }

    public int getPrecedencia(String op) {
        for (int i = 0; i < operadores.length; i++) {
            if (op.equals(operadores[i])) {
                return precedencia[i];
            }
        }
        return -1;
    }

    public String[] tokenizar(String operacion) {
        for (int i = 0; i < operadores.length; i++) {
            if (operadores[i].equals("×")) {
                operacion = operacion.replace(operadores[i], "#" + "*" + "#");
            } else if (operadores[i].equals("÷")) {
                operacion = operacion.replace(operadores[i], "#" + "/" + "#");
            } else {
                operacion = operacion.replace(operadores[i], "#" + operadores[i] + "#");
            }
            //"+", "-", "×", "÷", "^"
            //operacion = operacion.replace(operadores[i], "#" + operadores[i] + "#");
            //System.out.println("Texto display = " + operacion);
        }

        for (int i = 0; i < operadores.length; i++) {
            if (operadores[i].equals("×")) {
                operadores[i] = "*";
            } else if (operadores[i].equals("÷")) {
                operadores[i] = "/";
            }
        }

        //System.out.println("\nNuevos operadores = " + operadores);
        //System.out.println("\nNuevos operadores = " + Arrays.toString(operadores));
        String[] tokens = operacion.split("#");
        return tokens;
    }

    private boolean es_un_numero(String token) {
        for (int i = 0; i < operadores.length; i++) {
            if (token.equals(operadores[i])) {
                return false;
            }
        }
        return true;
    }

    private Double operar(Double operadorIzquierda, Double operadorDerecha, String operador) {
        switch (operador) {
            case "+":
                return operadorIzquierda + operadorDerecha;
            case "-":
                return operadorIzquierda - operadorDerecha;
            case "*":
                return operadorIzquierda * operadorDerecha;
            case "/":
                return operadorIzquierda / operadorDerecha;
            case "^":
                return Math.pow(operadorIzquierda, operadorDerecha);
        }
        return -1.;
    }

    public String getResultado() {
        return "" + resultado;
    }
}

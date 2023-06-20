/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilas1;

/**
 *
 * @author Stefanny
 */
import java.util.Scanner;
import java.util.Stack;

public class DecimalABinario {
    public static String decimalABinario(int decimal) {
        Stack<Integer> stack = new Stack<>();

        if (decimal == 0) {
            return "0";
        }

        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal = decimal / 2;
        }

        StringBuilder binario = new StringBuilder();
        while (!stack.isEmpty()) {
            binario.append(stack.pop());
        }

        return binario.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        int numDecimal = scanner.nextInt();
        String numBinario = decimalABinario(numDecimal);
        System.out.println("El número binario equivalente a " + numDecimal + " es: " + numBinario);
    }
}


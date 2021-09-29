package com.mycompany.proyecto.Math_Socket_Project_1;

import java.util.Random;
import java.util.Scanner;

public class Challenge_box {

    private static int x, y;
    private static float resp;

    /**
     * Genera los numeros random que hacen el problema
     */
    static int generate_random() {
        int max = 50, min = 1;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return random_int;
    }

    /**
     * Genera el signo del problema de forma random
     */
    static char generate_random_c() {
        Random random = new Random();
        String setOfChar = "+-*/";
        int randomInt = random.nextInt(setOfChar.length());
        char randomChar = setOfChar.charAt(randomInt);
        return randomChar;
    }

    /**
     * Genera el problema matematico de forma random
     */
    public static void generate_problem() {
        x = Challenge_box.generate_random();
        y = Challenge_box.generate_random();
        char simb = Challenge_box.generate_random_c();
        if (simb == '+') {
            System.out.println(x + " + " + y + " = ?");
            resp = x + y;
        }
        if (simb == '-') {
            System.out.println(x + " - " + y + " = ?");
            resp = x - y;
        }
        if (simb == '*') {
            System.out.println(x + " x " + y + " = ?");
            resp = x * y;
        }
        if (simb == '/') {
            System.out.println(x + " / " + y + " = ?");
            resp = x / y;
        }
    }

}

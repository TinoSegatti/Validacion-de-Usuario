package main;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();
            sc.nextLine(); 

            int i = 0;
            while (i < n) {
                String user = sc.nextLine();

                if (user.length() < 8) {
                    System.out.println("Invalid: " + user);
                } else if (Character.isDigit(user.charAt(0)) || noValido(user.charAt(0))){
                    System.out.println("Invalid: " + user);
                } else if (user.contains("?") || user.contains("@")) {
                    System.out.println("Invalid: "+ user);
                } else {
                    System.out.println("Valid: " + user);
                }

                i++;
            }

        } catch (Exception e) {
            System.out.println("Ocurrió una excepción: " + e.getMessage());
        }
    }

    public static boolean noValido(char caracter) {
        return !Character.isLetterOrDigit(caracter) && !Character.isWhitespace(caracter);
    }
}

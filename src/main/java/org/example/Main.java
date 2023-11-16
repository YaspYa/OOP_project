package org.example;

public class Main {
    public static void main(String[] args) {
        // Розкоментуй, якщо хочеш потестувати
        // Figure[][] position = new Figure[8][8];
        // position[7][7] = new Rook(7, 7, true);
        // position[2][7] = new Rook(2, 7, false);
        // position[0][7] = new Rook(0, 7, true);
        // Main.print_position(position);
        // System.out.println("");
        // position[2][7].move(position, 0, 7);
        // Main.print_position(position);
    }

    public static void print_position(Figure[][] position) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (position[i][j] != null) {
                    if (position[i][j].is_white()) {
                        System.out.printf("W " + position[i][j].get_name() + "   ");
                    } else {
                        System.out.printf("B " + position[i][j].get_name() + "   ");
                    }
                } else {
                    System.out.printf("null     ");
                }
            }
            System.out.println("");
        }
    }
}
package ship;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var kongou = new ship[4];
        kongou[0] = new ship("BB", "KONGOU", "Kongou", 31720, 220);
        kongou[1] = new ship("BB", "KONGOU", "Hiei", 36600, 222);
        kongou[2] = new ship("BB", "KONGOU", "kirishima", 36668, 222);
        kongou[3] = new ship("BB", "KONGOU", "kirishima", 32156, 222);

        for (ship e : kongou) {
            System.out.println("\nThe ship name is " + e.getShipName());
            System.out.println("The ship class is " + e.getShipClassName());
            System.out.println("The ship type is " + e.getShipType());
            System.out.println("The ship length is " + e.getAllLength());
            System.out.println("The ship weight is " + e.getAllWeight());
        }
    }
}
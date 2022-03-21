package ship;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the ship type: ");
        String shipType = in.nextLine();

        System.out.print("Enter the ship class: ");
        String shipClassName = in.nextLine();

        System.out.print("Enter the ship name: ");
        String shipName = in.nextLine();

        System.out.print("Enter the weight of the ship: ");
        int allWeight = in.nextInt();

        System.out.print("Enter the length of the ship: ");
        int allLength = in.nextInt();

        var kongou = new ship(shipType, shipClassName, shipName, allWeight, allLength);

        System.out.println("\nThe ship name is " + kongou.getShipName());
        System.out.println("The ship class is " + kongou.getShipClassName());
        System.out.println("The ship type is " + kongou.getShipType());
        System.out.println("The ship length is " + kongou.getAllLength());
        System.out.println("The ship weight is " + kongou.getAllWeight());
    }
}
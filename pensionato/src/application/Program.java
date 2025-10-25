package application;

import entities.Rent;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent[] rooms = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int roomsRent = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < roomsRent; i++) {
            System.out.printf("Rent #%d\n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();

            rooms[roomNumber] = new Rent(name, email);
            System.out.println();
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++ ) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }


        }

        sc.close();

    }
}

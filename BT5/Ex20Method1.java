package BT5;

import java.util.Random;
import java.util.Scanner;

public class Ex20Method1 {
    private String com_ai;
    private String player;
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    public String getCom_ai() {
        int number = random.nextInt(3);
        switch (number) {
            case 0 -> com_ai = "Bao";
            case 1 -> com_ai = "Bua";
            case 2 -> com_ai = "Keo";
        }
        return com_ai;
    }

    public String getPlayer() {
        while(true) {
            System.out.print("Keo/Bua/Bao : ");
            player = sc.nextLine();
            if(player.equalsIgnoreCase("Keo") || player.equalsIgnoreCase("Bua") || player.equalsIgnoreCase("Bao")) {
                break;
            } else {
                continue;
            }
        }
        return player;
    }
}

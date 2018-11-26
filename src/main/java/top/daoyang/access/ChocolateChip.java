package top.daoyang.access;

import top.daoyang.access.dessert.Cookie;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {System.out.println("ChocolateChip constructor");}

    public void chomp() {super.bite();}

    public static void main(String[] args) {
        ChocolateChip chocolate = new ChocolateChip();
        chocolate.chomp();
    }
}
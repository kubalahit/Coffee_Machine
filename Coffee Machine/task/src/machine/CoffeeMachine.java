package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int numberOfCups = scanner.nextInt();
        int waterForHowManyCoffees = water / 200;
        int milkForHowManyCoffees = milk / 50;
        int beansForHowManyCoffees = coffeeBeans / 15;
        int howManyCupsMachineCanMake = Math.min(waterForHowManyCoffees, milkForHowManyCoffees);
        if (beansForHowManyCoffees < howManyCupsMachineCanMake) howManyCupsMachineCanMake = beansForHowManyCoffees;
        if(howManyCupsMachineCanMake == numberOfCups) System.out.println("Yes, I can make that amount of coffee");
        if(howManyCupsMachineCanMake > numberOfCups) System.out.println("Yes, I can make that amount of coffee" +
                "(and even " + (howManyCupsMachineCanMake - numberOfCups) + " more than that)");
        if(howManyCupsMachineCanMake < numberOfCups) System.out.println("No, I can make only"
                + howManyCupsMachineCanMake + "cup(s) of coffee");
    }
}

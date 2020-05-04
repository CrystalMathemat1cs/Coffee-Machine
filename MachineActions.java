package machine;

import java.util.Scanner;

public class MachineActions {
    static int currentWater = 400;
    static int currentCoffee = 120;
    static int currentMilk = 540;
    static int currentCups = 9;
    static int currentMoney = 550;
    States state;

    public MachineActions(String userInput) {
        switch (userInput) {
            case "buy":
                state = States.RUNNING;
                break;

            case "fill":
                state = States.FILLING;
                break;

            case "take":
                state = States.TAKING_MONEY;
                break;

            case "remaining":
                state = States.REMAINING;
                break;

            case "exit":
                state = States.OFF;
        }
    }

    public static void makeEspresso() {
        if (currentWater < Beverages.ESPRESSO.getWater())
            System.out.println("Sorry, not enough water!");

        else if (currentCoffee < Beverages.ESPRESSO.getCoffee())
            System.out.println("Sorry, not enough coffee!");

        else if (currentCups == 0)
            System.out.println("Sorry, not enough cups");

        else {
            currentWater -= Beverages.ESPRESSO.getWater();
            currentMilk -= Beverages.ESPRESSO.getMilk();
            currentCoffee -= Beverages.ESPRESSO.getCoffee();
            currentMoney += Beverages.ESPRESSO.getCost();
            currentCups--;
            System.out.println("I have enough resources, making you coffee!\n");
        }
    }

    public static void makeLatte() {
        if (currentWater < Beverages.LATTE.getWater())
            System.out.println("Sorry, not enough water!");

        else if (currentCoffee < Beverages.LATTE.getCoffee())
            System.out.println("Sorry, not enough coffee!");

        else if (currentMilk < Beverages.LATTE.getMilk())
            System.out.println("Sorry, not enough milk!");

        else if (currentCups == 0)
            System.out.println("Sorry, not enough cups");

        else {
            currentWater -= Beverages.LATTE.getWater();
            currentMilk -= Beverages.LATTE.getMilk();
            currentCoffee -= Beverages.LATTE.getCoffee();
            currentMoney += Beverages.LATTE.getCost();
            currentCups--;
            System.out.println("I have enough resources, making you coffee!\n");
        }
    }

    public static void makeCappuccino() {
        if (currentWater < Beverages.CAPPUCCINO.getWater())
            System.out.println("Sorry, not enough water!");

        else if (currentCoffee < Beverages.CAPPUCCINO.getCoffee())
            System.out.println("Sorry, not enough coffee!");

        else if (currentMilk < Beverages.CAPPUCCINO.getMilk())
            System.out.println("Sorry, not enough milk!");

        else if (currentCups == 0)
            System.out.println("Sorry, not enough cups");

        else {
            currentWater -= Beverages.CAPPUCCINO.getWater();
            currentMilk -= Beverages.CAPPUCCINO.getMilk();
            currentCoffee -= Beverages.CAPPUCCINO.getCoffee();
            currentMoney += Beverages.CAPPUCCINO.getCost();
            currentCups--;
            System.out.println("I have enough resources, making you coffee!\n");
        }
    }

    public static void remaining() {
        System.out.println("The coffee machine has: \n" + currentWater + " ml of water \n" +
                currentMilk + " ml of milk \n" + currentCoffee + " g of coffee beans \n"
                + currentCups + " disposable cups \n" + currentMoney + " of money \n" );

    }

    public static void takeMoney() {
        System.out.println("I gave you $" + currentMoney);
        currentMoney = 0;
    }

    public static void chooseCoffee() {
        Scanner in = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte," +
                " 3 - cappuccino, back - to main menu");
        String coffeeType = in.next();

        switch (coffeeType) {
            case "1":
                MachineActions.makeEspresso();
                break;
            case "2":
                MachineActions.makeLatte();
                break;
            case "3":
                MachineActions.makeCappuccino();
            case "back":
        }
    }

    public static void fillMachine() {
        Scanner in2 = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add: ");
        int fillWater = in2.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        int fillMilk = in2.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int fillCoffee = in2.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int fillCups = in2.nextInt();

        currentWater += fillWater;
        currentMilk += fillMilk;
        currentCoffee += fillCoffee;
        currentCups += fillCups;
    }
}

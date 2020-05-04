package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void console(States machineState) {

        switch (machineState) {
            case RUNNING:
                MachineActions.chooseCoffee();
                break;
            case TAKING_MONEY:
                MachineActions.takeMoney();
                break;
            case REMAINING:
                MachineActions.remaining();
                break;
            case FILLING:
                MachineActions.fillMachine();
                break;
            case OFF:
                System.exit(0);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            MachineActions instance = new MachineActions(scanner.next());
            console(instance.state);
        }
























/*        while(condition) {

            System.out.println("Write action (fill, buy, take, remaining, exit) :");
            String action = scanner.next();

            if (action.equals("buy")) {

                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String choice = scanner.next();

                if (choice.equals("back")) {
                    continue;
                }
                else if (choice.equals("1")) {
                    if (currentWater < 250)
                        System.out.println("Sorry, not enough water!");

                    else if (currentCoffee < 16)
                        System.out.println("Sorry, not enough coffee!");

                    else if (currentCups == 0)
                        System.out.println("Sorry, not enough cups");

                    else {
                        currentWater -= 250;
                        currentCoffee -= 16;
                        currentMoney += 4;
                        currentCups--;
                        System.out.println("I have enough resources, making you a coffee!\n");
                    }

                }
                else if (choice.equals("2")) {
                    if (currentWater < 350)
                        System.out.println("Sorry, not enough water!");
                    else if (currentMilk < 75)
                        System.out.println("Sorry, not enough milk!");
                    else if (currentCoffee < 20)
                        System.out.println("Sorry, not enough coffee!");
                    else if (currentCups == 0)
                        System.out.println("Sorry, not enough cups!");
                    else {
                        currentWater -= 350;
                        currentMilk -= 75;
                        currentCoffee -= 20;
                        currentMoney += 7;
                        currentCups--;
                        System.out.println("I have enough resources, making you a coffee!\n");
                    }
                }
                else if (choice.equals("3")) {
                    if (currentWater < 200)
                        System.out.println("Sorry, not enough water!");
                    else if (currentMilk < 100)
                        System.out.println("Sorry, not enough milk!");
                    else if (currentCoffee < 12)
                        System.out.println("Sorry, not enough coffee!");
                    else if (currentCups == 0)
                        System.out.println("Sorry, not enough cups!");
                    else {
                        currentWater -= 200;
                        currentMilk -= 100;
                        currentCoffee -= 12;
                        currentMoney += 6;
                        currentCups--;
                        System.out.println("I have enough resources, making you a coffee!\n");
                    }
                }
            }
            else if (action.equals("fill")) {
                System.out.println("Write how many ml of water do you want to add: ");
                int fillWater = scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add: ");
                int fillMilk = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                int fillCoffee = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                int fillCups = scanner.nextInt();

                currentWater += fillWater;
                currentMilk += fillMilk;
                currentCoffee += fillCoffee;
                currentCups += fillCups;
            }
            else if (action.equals("take")) {
                System.out.println("I gave you $" + currentMoney + "\n");
                currentMoney = 0;
            }
            else if (action.equals("remaining"))
                System.out.println("The coffee machine has: \n" + currentWater + " ml of water \n" + currentMilk + " ml of milk \n"
                        + currentCoffee + " g of coffee beans \n" + currentCups + " disposable cups \n" + currentMoney + " of money" );

            else if (action.equals("exit")) {
                condition = false;
            }
        }*/

    }
}

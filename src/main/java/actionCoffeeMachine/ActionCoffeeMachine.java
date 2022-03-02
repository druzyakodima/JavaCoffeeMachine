package actionCoffeeMachine;
import java.util.Scanner;


public class ActionCoffeeMachine {

    Scanner scanner = new Scanner(System.in);
    IngredientsCoffeeMachine ingredients = new IngredientsCoffeeMachine();
    int takePlasticCups = 1;

    public void action() {
        while (true) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
            String answer = scanner.next();
            switch (Actions.findByValue(answer)) {
                case BUY:
                    buy();
                    break;
                case FILL:
                    fill();
                    break;
                case TAKE:
                    take();
                    break;
                case REMAINING:
                    ingredients.printInformationCoffeeMachine();
                    break;
                case EXIT:
                    System.exit(0);
            }
        }
    }

    private void buy() {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String number = scanner.next();
        switch (number) {
            case "1":
                if (ingredients.enoughIngredients(CoffeeType.ESPRESSO) == -1) {
                    action();
                }
                ingredients.setWater(ingredients.getWater() - CoffeeType.ESPRESSO.water);
                ingredients.setCoffeeBeans(ingredients.getCoffeeBeans() - CoffeeType.ESPRESSO.beans);
                ingredients.setPlasticCups(ingredients.getPlasticCups() - takePlasticCups);
                ingredients.setMoney(ingredients.getMoney() + CoffeeType.ESPRESSO.money);
                break;
            case "2":
                if (ingredients.enoughIngredients(CoffeeType.LATTE) == -1) {
                    action();
                }
                ingredients.setWater(ingredients.getWater() - CoffeeType.LATTE.water);
                ingredients.setMilk(ingredients.getMilk() - CoffeeType.LATTE.milk);
                ingredients.setCoffeeBeans(ingredients.getCoffeeBeans() - CoffeeType.LATTE.beans);
                ingredients.setPlasticCups(ingredients.getPlasticCups() - takePlasticCups);
                ingredients.setMoney(ingredients.getMoney() + CoffeeType.LATTE.money);
                break;
            case "3":
                if (ingredients.enoughIngredients(CoffeeType.CAPPUCCINO) == -1) {
                    action();
                }
                ingredients.setWater(ingredients.getWater() - CoffeeType.CAPPUCCINO.water);
                ingredients.setMilk(ingredients.getMilk() - CoffeeType.CAPPUCCINO.milk);
                ingredients.setCoffeeBeans(ingredients.getCoffeeBeans() - CoffeeType.CAPPUCCINO.beans);
                ingredients.setPlasticCups(ingredients.getPlasticCups() - takePlasticCups);
                ingredients.setMoney(ingredients.getMoney() + CoffeeType.CAPPUCCINO.money);
                break;
            case "back":
                System.out.println();
                action();
        }
    }

    private void fill() {
        System.out.println("Write how many ml of water you want to add:");
        int waterAdd = scanner.nextInt() + ingredients.getWater();
        ingredients.setWater(waterAdd);
        System.out.println("Write how many ml of milk you want to add:");
        int milkAdd = scanner.nextInt() + ingredients.getMilk();
        ingredients.setMilk(milkAdd);
        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffeeBeansAdd = scanner.nextInt() + ingredients.getCoffeeBeans();
        ingredients.setCoffeeBeans(coffeeBeansAdd);
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int plasticCupsAdd = scanner.nextInt() + ingredients.getPlasticCups();
        ingredients.setPlasticCups(plasticCupsAdd);
        System.out.println();
    }

    private void take() {
        System.out.printf("\nI gave you $%d\n", ingredients.getMoney());
        int moneyTake = ingredients.getMoney() - ingredients.getMoney();
        ingredients.setMoney(moneyTake);
        System.out.println();
    }
}
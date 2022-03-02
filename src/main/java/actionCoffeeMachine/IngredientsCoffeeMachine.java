package actionCoffeeMachine;

public class IngredientsCoffeeMachine {

    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int plasticCups = 9;
    private int money = 550;

    protected void printInformationCoffeeMachine() {
        System.out.printf("\nThe coffee machine has:\n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n" +
                "%d disposable cups\n" +
                "$%d of money\n", getWater(), getMilk(), getCoffeeBeans(), getPlasticCups(), getMoney());
    }

    protected int enoughIngredients(CoffeeType coffeeType) {
        if (getWater() < coffeeType.water) {
            System.out.println("Sorry, not enough water!\n");
            return -1;
        } else if (getCoffeeBeans() < coffeeType.beans) {
            System.out.println("Sorry, not enough coffee beans!\n");
            return -1;
        } else if (getMilk() < coffeeType.milk) {
            System.out.println("Sorry, not enough milk!\n");
            return -1;
        }
        System.out.println("I have enough resources, making you a coffee!\n");
        return 1;
    }


    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getPlasticCups() {
        return plasticCups;
    }

    public int getMoney() {
        return money;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public void setPlasticCups(int plasticCups) {
        this.plasticCups = plasticCups;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

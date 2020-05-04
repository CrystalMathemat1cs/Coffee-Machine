package machine;

public enum Beverages {
    ESPRESSO(16, 0, 250, 4),
    LATTE(20, 75, 350, 7),
    CAPPUCCINO(12, 100, 200, 6);

    int coffee;
    int milk;
    int water;
    int cost;

    Beverages(int coffee, int milk, int water, int cost) {
        this.coffee = coffee;
        this.milk = milk;
        this.water = water;
        this.cost = cost;
    }

    public int getCoffee() {
        return coffee;
    }

    public int getMilk() {
        return milk;
    }

    public int getWater() {
        return water;
    }

    public int getCost() {
        return cost;
    }
}

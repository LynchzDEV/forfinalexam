package method;

import java.util.Arrays;

public class FruitCollection {

    private Fruit[] fruits;
    private int count;

    public FruitCollection(int size) {
        if (size < 1) {
            size = 1;
        }
        fruits = new Fruit[size];
    }

    public int getCount() {
        return count;
    }

    public boolean isFull() {
        return count >= fruits.length;
    }

    public boolean addFruit(String name, double price, int quality) {
        if (isFull()) {
            return false;
        }
        fruits[count++] = new Fruit(name, price, quality);
        return true;
    }

    public Fruit getFruitAt(int slot) {
        if (slot > 0 && slot <= count) {
            return fruits[slot];
        }
        return null;
    }

    public boolean expand(int size) {
        if (size < 1) {
            return false;
        }

        Fruit[] temp = new Fruit[fruits.length + size];
        for (int i = 0; i < fruits.length; i++) {
            temp[i] = fruits[i];
        }
        fruits = temp;
        return true;
    }

    public int searchForFruitName(String name) {
        if (name == null) {
            return -1;
        }
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == null) continue;
            if (fruits[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "FruitCollection{" + "fruits=" + Arrays.toString(fruits) + ", count=" + count + '}';
    }
}

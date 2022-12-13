package method;

public class Fruit {

    private String name;
    private double price;
    private int quality;

    public Fruit(String name, double price, int quality) {
        if (name == null) {
            this.name = null;
        } else {
            this.name = name;
        }

        if (price <= 0.0) {
            this.price = 0.0;
        }

        if (quality < 1) {
            this.quality = 1;
        } else if (quality > 10) {
            this.quality = 10;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public String toString() {
        return "fckingmethod{" + "name=" + name + ", price=" + price + ", quality=" + quality + '}';
    }

    public boolean equals(Fruit f) {
        return this.name.equals(f.name) && this.price == f.price && this.quality == f.quality;
    }

    public int compareTo(Fruit f) {
        if (this.quality > f.quality || f.name == null) {
            return 1;
        } else if (this.quality < f.quality) {
            return -1;
        }
        return 0;
    }
}

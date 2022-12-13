package fruit;

import java.util.Objects;

public class fruit {
    private String name;
    private double price;
    private int quality;

    public fruit(String name, double price, int quality) {
        if (name==null || name.isBlank()){
            this.name = "";
        }else {
            this.name = name;
        }
        if (price < 0.0){
            this.price = 0.0;
        }else {
            this.price = price;
        }
        if (quality > 10){
            this.quality=10;
        } else if (quality < 0) {
            this.quality=0;
        }else {
            this.quality = quality;
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
        return String.format("%s (price:%f, quality:%d)",name,price,quality);
    }

    public boolean equals(fruit f) {
        return this.name.equals(f.name) && this.quality == f.quality && this.price == f.price;
    }

    public int compareTo(fruit f){
        if (this.quality > f.quality || f == null) {
            return 1;
        } else if (this.quality == f.quality ) {
            return 0;
        }else {
            return -1;
        }
    }



}

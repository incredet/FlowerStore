package flower.store;

import lombok.Getter;
import lombok.Setter;


@Setter
public class Flower {
    @Getter
    private FlowerColor color;
    private double sepalLength;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower (Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.price = flower.price;
        this.flowerType = flower.flowerType;
    }
    public String getColor() {
        return color.toString();
    }
}

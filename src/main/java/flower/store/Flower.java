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

    public String getColor() {
        return color.toString();
    }
}

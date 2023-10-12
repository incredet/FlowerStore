package flower.store;

import java.util.ArrayList;
import java.util.List;
public class FlowerBucket {
    private int quantity;
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public double qetPrice() {
        double price = 0;
        for (FlowerPack flowerPack:flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
}

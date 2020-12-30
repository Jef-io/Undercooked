package level.tools;

public class Delivery extends DishTool{
    public Delivery(int posX, int posY) {
        super(posX, posY);
    }

    public String toString() {
        return "delivery";
    }

    public String imgPath() {
        return "/IB/tools/delivery.png";
    }
}

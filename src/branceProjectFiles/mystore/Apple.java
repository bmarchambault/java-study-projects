package branceProjectFiles.mystore;

public class Apple extends Computer implements Product {
    private double price;
    private int stock;

    public Apple(boolean isLaptop, String type) {
        super(isLaptop, type);
        super.setOS("macOS");//hardcoded
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    @Override
    public int getStock() {
        return this.stock;
    }

    @Override
    public void setStock(int newStock) {
        this.stock = newStock;
    }
}

package branceProjectFiles.mystore;

public class Windows extends Computer implements Product {
    private double price;
    private int stock;

    public Windows(String OS, boolean isLaptop, String type) {
        super(isLaptop, type);
        super.setOS(OS);
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double newPrice) {
        this.price = price;
    }

    @Override
    public int getStock() {
        return this.stock;
    }

    @Override
    public void setStock(int newStock) {
        this.stock = stock;
    }
}


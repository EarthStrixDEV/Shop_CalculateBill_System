public class Goods implements Sellable{
    final private String name;
    final double price;
    final int count;

    public Goods(String name, double price ,int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return String.format("%-20s %d %12.2f",name ,getCount() ,getCount()*getPrice());
    }
}

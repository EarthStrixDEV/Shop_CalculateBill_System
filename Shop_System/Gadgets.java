public class Gadgets extends Goods{
    final private int age;
    public Gadgets(String name ,double price ,int count ,int age) {
        super(name ,price ,count);
        this.age = age;
    }

    @Override
    public double getPrice() {
        double depreciation = 2500 * age;
        return Math.max(7500 ,super.getPrice() - depreciation);
    }
}

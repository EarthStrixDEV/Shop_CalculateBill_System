import java.util.ArrayList;

public class Cart {
    final private ArrayList<Sellable> items;

    Cart() {
        items = new ArrayList<>();

    }

    public void addItem(Sellable item) {
        items.add(item);

    }

    public void removeItem(Sellable item){
        items.remove(item);

    }

    public double totalPrice() {
        double sum = 0;
        for (Sellable item: items) {
            sum += item.getPrice() * item.getCount();
        }
        return sum;
    }

    public void printItem() {
        for (Sellable item: items) {
            System.out.println(item);
        }
    }

    public String display() {
        String nameShop = "CPE Shop Bill";
        return nameShop;
    }
}

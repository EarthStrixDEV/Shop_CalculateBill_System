import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Cart cart = new Cart();

        System.out.println("ยินดีต้อนรับสู่ร้าน CPE Shop");
        System.out.println();

        System.out.println("กดยกเลิก | พิมพ์ : 'cancel' | ที่ช่องกรอกชื่อรายการสินค้า");
        System.out.println();

        String cancel_text = "cancel";

        while (true) {

            Scanner goods_req = new Scanner(System.in);
            System.out.print("กรอกชื่อรายการสินค้า : ");
            String goods_inp = goods_req.next();

            if (goods_inp.equals(cancel_text)) {
                break;
            }

            Scanner goods_price_req = new Scanner(System.in);
            System.out.print("กรอกราคาสินค้า : ");
            int goods_price_inp = goods_price_req.nextInt();

            Scanner goods_count_req = new Scanner(System.in);
            System.out.print("กรอกจำนวนสินค้า : ");
            int goods_count_inp = goods_count_req.nextInt();

            Scanner goods_age_req = new Scanner(System.in);
            System.out.print("กรอกอายุของสินค้า : ");
            int goods_age_inp = goods_age_req.nextInt();

            cart.addItem(new Gadgets(goods_inp ,goods_price_inp ,goods_count_inp ,goods_age_inp));

            System.out.println();
        }

        System.out.println();
        System.out.println(String.format("%24s" ,cart.display()));
        System.out.println("====================================");
        System.out.println("Item-------------Count---------Price");
        cart.printItem();
        System.out.println("====================================");
        System.out.println(String.format("Total : %5.2f", cart.totalPrice()));

        System.out.println();
    }
}

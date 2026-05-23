class Cart{
    int amount=0;
    int item=0;
    void addToCart(int price){
        amount+=price;
        item++;
    }
    void printstatus(){
        System.out.println("Total amount: "+amount);
        System.out.println("Total items: "+item);
    }
}

public class mg{
    public static void main(String[] args) {
        Cart cart1 = new Cart();
        cart1.addToCart(100);
        cart1.addToCart(200);
        cart1.printstatus();
    }
}
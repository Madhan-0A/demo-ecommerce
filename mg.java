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
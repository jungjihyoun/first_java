public class MarketGood {
    private String name;
    private  int retailPrice; //상품의 출시 가격
    private int discountRate ; //상품의 할인율. 단위: %

    public MarketGood(String name, int retailPrice, int discountRaate){
        this.name = name;
        this.retailPrice = retailPrice;
        if (discountRaate <0 & discountRaate>100){
            this.discountRate = 0;
        }else{
            this.discountRate = discountRaate;
        }
    }
    public MarketGood(String name, int retailPrice){
        this.name = name;
        this.retailPrice = retailPrice;
        this.discountRate = 0;
    }

    public String getName() {
        return name;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public void setDiscountRate(int discountRate){
        this.discountRate = discountRate;
    }

    public int getDiscountRate(){
        return discountRate;
    }

    public int getDiscountedPrice(){
        return (int) (retailPrice * (1 - discountRate / 100.0));
    }


}

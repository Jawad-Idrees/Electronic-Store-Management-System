package package1;

public class Mobiles extends Product {
    private String brand;
   public Mobiles() {}
    public Mobiles(String name, int price, int quantity,double rating,int code, String brand) {
        super(name, price, quantity,rating,code);
        this.brand = brand;
       
    }

    public String get_brand() {
        return brand;
    }
    
    public void set_brand(String brand) {
        this.brand = brand;
    }
    
    
 
}

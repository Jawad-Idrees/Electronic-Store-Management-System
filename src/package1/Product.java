package package1;
import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private long price;
    private int quantity;
    private int code;
    private double rating;
    Product(){}
    public Product(String name, long price, int quantity, double rating, int code) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.code=code;
        this.rating=rating;
        
    }
    public String get_name() {
        return name;
    }
    public void set_name(String name) {
        this.name = name;
    }
    public long get_price() {
        return price;
    }

    public void setprice(long price) {
        this.price = price;
    }
    public int get_code() {
        return code;
    }
    
    public int get_quantity() {
        return quantity;
    }
    public void set_quantity(int quantity) {
        this.quantity = quantity;
    }
    public double get_rating() {
        return rating;
    }
    public void set_rating(double rating) {
        this.rating = rating;
    }
    public static int generator() {
		return 1000+((int) (Math.random()*9999));
		
	}
}

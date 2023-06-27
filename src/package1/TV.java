package package1;

public class TV extends Product {
    private int screenSize;
    
    public TV() {}
    public TV(String name, int price, int quantity,double rating,int code, int screenSize) {
        super(name, price, quantity,rating,code);
        this.screenSize = screenSize;
       
    }
    
    public int get_screen() {
        return screenSize;
    }
    
    public void set_screen(int screenSize) {
        this.screenSize = screenSize;
    }
   
 
    
}
class Main{
	
	
}
package package1;

public class Ref extends Product {

    private String size;
    public Ref() {}
    
    public Ref(String name, long price, int quantity,double rating,int code,  String size) {
        super(name, price, quantity,rating,code);
      this.size=size;
       
    }
    

    public String get_size() {
        return size;
    }
    
    public void setsize(String size) {
        this.size = size;
    }
    
    
}
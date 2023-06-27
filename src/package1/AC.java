package package1;

public class AC extends Product {
    private int tons;
    AC(){}
    public AC(String name, long price, int quantity,double rating,int code, int tons) {
        super(name, price, quantity,rating,code);
        this.tons = tons;
    }
   
    public int get_tons() {
        return tons;
    }
    public void settons(int tons) {
        this.tons = tons;
    }
	
	
}



//public class Main{
//	public static void main(String[] args) {
//		Object[][] obj= new Object[30][4];
//		AC a= new AC("fadf",232,3,23,323);
//		obj[1][1]=a.get_name();
//		
//	
//	}
//}
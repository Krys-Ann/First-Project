
public class House {
	
	private int id;       
	private float price;    
	private String location; 
	private String advertiser;
	private Photo image = new Photo();


	public House(int i, float pe, String lo, String ad, Photo img){
		id = i;       
		price = pe;    
		location = lo; 
		advertiser = ad;
		image = img; 
	}
	
	public House(){
		id = 0;       
		price = 0;    
		location = ""; 
		advertiser = "";
		image = new Photo(0,0,""); 
	}
	
	public void setID(int i){
		id = i; 
	}
	public int getID(){
		return id;
	}
	
	public void setPrice(float pe){
		price = pe;
	}
	public float getPrice(){
		return price;
	}
	
	
	public void setLocation(String lo){
		location = lo;  
	}
	public String getLocation(){
		return location;
	}
	
	
	public void setAdvertiser(String ad){
		advertiser = ad; 
	}
	public String getAdvertiser(){
		return advertiser;
	}
	
	public void ToString() {
		System.out.println(id + " " + price + " " + location + " " + advertiser + " " + image.getHeight() + " " + image.getWidth() + " " + image.getType());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}

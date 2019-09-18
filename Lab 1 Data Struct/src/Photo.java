
public class Photo {
	private int height; 
	private int width; 
	private String type; 

	
	public Photo(int he, int wi, String tp){
		height = he; 
		width = wi; 
		type = tp; 
	}
	
	public Photo(){
		height = 0;
		width = 0;
		type = "";
	}
	
	public void setHeight(int he){
		height = he; 
	}
	public int getHeight(){
		return height;
	}
	
	public void setWidth(int wi){
		width = wi;
	}
	public int getWidth(){
		return width;
	}
	
	
	public void setType(String tp){
		type = tp; 
	}
	public String getType(){
		return type;
	}
	
	public void ToString(){
		System.out.println(height + " " + width + " " + type);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

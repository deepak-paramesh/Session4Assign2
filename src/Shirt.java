
public class Shirt {
	
	private int collor_size;
	private int sleeve_length;
	private String material;

	Shirt(){
		 collor_size = 20;
		 sleeve_length = 30;
		 material = "Linen";
	}
	
	Shirt(int collor_size, int sleeve_length, String material){
		
		this.collor_size = collor_size;
		this.sleeve_length = sleeve_length;
		this.material = material;
	}

	public int getCollor_size() {
		return collor_size;
	}

	public void setCollor_size(int collor_size) {
		this.collor_size = collor_size;
	}

	public int getSleeve_length() {
		return sleeve_length;
	}

	public void setSleeve_length(int sleeve_length) {
		this.sleeve_length = sleeve_length;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void display(){
		System.out.println("Shirt information : \n " + "Collor size : "+collor_size + "\n Sleeve Length : " + sleeve_length + "\n Material used : " + material );
	}
	
}

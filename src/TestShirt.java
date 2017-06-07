
public class TestShirt {

	public static void main(String[] args) {
			
		Shirt s1 = new Shirt();
		s1.display();
		
		Shirt s2 = new Shirt( 10,20,"Cotton");
		s2.display();
		
		Shirt s3 = new Shirt();
		s3.setCollor_size(12);
		s3.setSleeve_length(22);
		s3.setMaterial("WOOL");
		
		s3.display();
		

	}

}
	
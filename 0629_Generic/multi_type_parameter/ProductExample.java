package multi_type_parameter;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("����ƮTv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		System.out.println(tvModel);
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("����");
		Car car = product2.getKind();
		String carModel = product2.getModel();
		System.out.println(carModel);
	}
}

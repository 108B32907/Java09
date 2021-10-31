package Java09.src;

public class Class18 {

	public static void main(String[] args) {
		( 
				new CCircle(3.0) { //建立匿名內部類別建構元
				void show() { //建立匿名內部類別函數
					System.out.println(radius*radius*pi);
				}
			}
		)
		.show(); //使用匿名內部類別函數
	}
	static class CCircle{
		public double pi=3.14;
		public double radius;
		
		public CCircle(double r) {
			radius=r;
		}
	}

}

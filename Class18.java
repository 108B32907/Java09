package Java09.src;

public class Class18 {

	public static void main(String[] args) {
		( 
				new CCircle(3.0) { //�إ߰ΦW�������O�غc��
				void show() { //�إ߰ΦW�������O���
					System.out.println(radius*radius*pi);
				}
			}
		)
		.show(); //�ϥΰΦW�������O���
	}
	static class CCircle{
		public double pi=3.14;
		public double radius;
		
		public CCircle(double r) {
			radius=r;
		}
	}

}

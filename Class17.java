package Java09.src;

class Namecard{
	private String name;
	private String address;
	private Phone data;  //Phone���O�������ܼ�data

	class Phone{ //�w�q�������O
		public String company; //�w�q�������O�ܼ�
		public String cell; //�w�q�������O�ܼ�
		public Phone(String s1,String s2) {  //Phone�غc��
			company=s1;
			cell=s2;
		}
	}
	public Namecard(String n,String a,String s1,String s2) {
		name=n;
		address=a;
		data=new Phone(s1,s2); //�q�~�����O�I�s�������O
	}
	public void show() {
		System.out.println(name+" "+address+" "+data.company+" "+data.cell);
	}
}

public class Class17 {

	public static void main(String[] args) {
		Namecard first=new Namecard("Andy","123City","2345-6789","0911-336600");
		first.show();
	}

}

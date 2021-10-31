package Java09.src;

class Namecard{
	private String name;
	private String address;
	private Phone data;  //Phone類別的物件變數data

	class Phone{ //定義內部類別
		public String company; //定義內部類別變數
		public String cell; //定義內部類別變數
		public Phone(String s1,String s2) {  //Phone建構元
			company=s1;
			cell=s2;
		}
	}
	public Namecard(String n,String a,String s1,String s2) {
		name=n;
		address=a;
		data=new Phone(s1,s2); //從外部類別呼叫內部類別
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

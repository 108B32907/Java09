class CRationala{
	public int n;
	public int d;
	public void setN(int num) {
		n=num;
	}
	public void setD(int num) {
		d=num;
	}
	public void show() {
		System.out.println(n+"/"+d);
	}
	public void setND(int num,int den) {
		n=num;
		d=den;
	}
	
}
public class Class10a {

	public static void main(String[] args) {
		CRationala aaa=new CRationala();
		aaa.setN(2);
		aaa.setD(5);
		aaa.show();
		aaa.setND(10, 7);
		aaa.show();
	}

}

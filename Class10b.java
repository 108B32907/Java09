class CRationalb{
	public static int n;
	public static int d;
	public static void setN(int num) {
		n=num;
	}
	public static void setD(int num) {
		d=num;
	}
	public static void setND(int num,int den) {
		n=num;
		d=den;
	}
	
}
public class Class10b {
	
	public static void show(CRationalb cr){ //���O:CRationalb ����:cr
		System.out.println(cr.n+"/"+cr.d); //�Ψӿ�X���G
	}

	public static void main(String[] args) {
		CRationalb aaa=new CRationalb();
		aaa.setN(2);
		aaa.setD(5);
		aaa.setND(10, 7);
		show(aaa); 
		}

}

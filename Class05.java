class CCount{
	public static int cnt=0; //�w�q���O�ܼ�cnt
	public CCount() {
		count();
	}
	public static void count(){ //(e)���O���
		cnt++; 
		System.out.println(cnt);
	}
	public static void setZero() {
		cnt=0;
		System.out.println(cnt);
	}
	public static void setValue(int n) {
		cnt=n; //(d) ���O�ܼ�,�ܧ�Y�@�Ӫ���cnt,�Ҧ���cnt����ۧ���
		System.out.println(cnt);
	}
}
public class Class05 {

	public static void main(String[] args) {
		CCount obj=new CCount();
		CCount.count();
		CCount.setZero();
		CCount.setValue(7);
	}

}

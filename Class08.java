class CWin{
	static int cnt=0; // (f)�w�q���O�ܼ�,�ܧ�Y�@�Ӫ���cnt,�Ҧ���cnt����ۧ���
	static String color;
	static int height;
	static int width;
	
	public static void count() { //(g)���O���
		cnt++;
	}
	public static void cwin(String str,int h,int w) {
		color = str;
		height=h;
		width=w;
		count();
		System.out.println(cnt);
	}
	public static void cwin() {
		color="Red";
		height=2;
		width=2;
		count();
		System.out.println(cnt);
	}
	public static void setZero() {
		cnt=0;
		System.out.println(cnt);
	}
	public static void setValue(int n) {
		cnt=n;
		System.out.println(cnt);
	}
}
public class Class08 {

	public static void main(String[] args) {
		CWin.cwin("blue",3,5);
		CWin.cwin();
		CWin.setZero();
		CWin.setValue(10);
	}

}

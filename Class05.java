class CCount{
	public static int cnt=0; //定義類別變數cnt
	public CCount() {
		count();
	}
	public static void count(){ //(e)類別函數
		cnt++; 
		System.out.println(cnt);
	}
	public static void setZero() {
		cnt=0;
		System.out.println(cnt);
	}
	public static void setValue(int n) {
		cnt=n; //(d) 類別變數,變更某一個物件的cnt,所有的cnt都跟著改變
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

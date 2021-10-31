class add{
	static int sum=0; //定義類別變數
	public static void add2n(int n) { //定義類別函數
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
		sum=0; //每次計算完就將sum歸零
	}
	
}
public class Class06 {

	public static void main(String[] args) {
		add.add2n(5);
		add.add2n(10);

	}

}

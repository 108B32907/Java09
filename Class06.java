class add{
	static int sum=0; //�w�q���O�ܼ�
	public static void add2n(int n) { //�w�q���O���
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
		sum=0; //�C���p�⧹�N�Nsum�k�s
	}
	
}
public class Class06 {

	public static void main(String[] args) {
		add.add2n(5);
		add.add2n(10);

	}

}

class power{
	static int sum=0; //�w�q���O�ܼ�
	public static void power(int x,int n) { //�w�q���O���
		sum+=Math.pow(x, n); //�ϥΤ��ؼƾǨ��
		System.out.println(sum);
		sum=0; //�C���I�s��ƫ� �Nsum�����k�s
	}
}
public class Class07 {

	public static void main(String[] args) {
		power.power(2, 5);
		power.power(3, 2);
	}

}

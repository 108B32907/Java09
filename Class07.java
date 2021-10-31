class power{
	static int sum=0; //﹚竡摸跑计
	public static void power(int x,int n) { //﹚竡摸ㄧ计
		sum+=Math.pow(x, n); //ㄏノず计厩ㄧ计
		System.out.println(sum);
		sum=0; //–Ω㊣ㄧ计 盢sum耴箂
	}
}
public class Class07 {

	public static void main(String[] args) {
		power.power(2, 5);
		power.power(3, 2);
	}

}

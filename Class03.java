class caaa{  //(c)�@�� Java �ɥu��@�� public ���O�A�B�������ɦW�ۦP 
	private int value; // (d) private�令public ���|�v�T��X���ȡC�]�����b�P�@�����O�̨ϥ�
	
	public caaa(){
		this.value=10; //value���ȳ]��10
		System.out.println("value="+value);
	}
	
	public caaa(int i){ //�I�s���غc���ɻݭn��i����
		value=i; 
		System.out.println("value="+value);
	}
	
}
public class Class03 {

	public static void main(String[] args) {
		caaa obj1=new caaa(); // (b) caaa()�o�ӫغc���Q�I�s
		caaa obj2=new caaa(12); // (b) caaa(int i)�o�ӫغc���Q�I�s

	}

}

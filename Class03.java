class caaa{  //(c)一個 Java 檔只能一個 public 類別，且必須跟檔名相同 
	private int value; // (d) private改成public 不會影響輸出的值。因為都在同一個類別裡使用
	
	public caaa(){
		this.value=10; //value的值設為10
		System.out.println("value="+value);
	}
	
	public caaa(int i){ //呼叫此建構元時需要給i的值
		value=i; 
		System.out.println("value="+value);
	}
	
}
public class Class03 {

	public static void main(String[] args) {
		caaa obj1=new caaa(); // (b) caaa()這個建構元被呼叫
		caaa obj2=new caaa(12); // (b) caaa(int i)這個建構元被呼叫

	}

}

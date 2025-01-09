package introduction;

public class methodsDemo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		methodsDemo d =new methodsDemo();
		String name=d.getDate();
		System.out.println(name);
		
		
		
		methodsDemo2 d2 =new methodsDemo2();
		
		d2.getUserDate();
		
		getDate2();
		
	

	}
	
	public String getDate()
	{
		System.out.println("helloworid");
		return "d";
	}
	
	public static String getDate2()
	{
		System.out.println("hhelloworid");
		return "d";
	}


}

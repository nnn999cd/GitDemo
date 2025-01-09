package introduction;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int myNum=5;
		String n ="Academy";
		char Letter='r';
		double des=5.99;
		boolean myCade= true;
		System.out.println(myNum+"つだけなんですね");
		System.out.println(n);
		
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		arr[4] = 1;
		
		int [] arr2 = {1,2,4,5,6};
		
		System.out.println(arr2);
		
		
		//for
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr2[i]);
		
		}
		
		String[] name = {"C","b","C"};
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		
		}
		
		
		for(String s:name)
		{
			System.out.println(s);
			
		}
		
	}

}

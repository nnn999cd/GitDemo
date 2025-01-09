package introduction;

public class CoreJavaBrashUp3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//Stringで用意する文字列はオブジェクトである
		
		//文字列リテラルでは、基本的に同じ名前で同じ複数の値がある場合、新しいオブジェクトは作られず、既存のものを参照する
		//しかし、newを使用する場合は既存の同じ値があっても新たなオブジェクトが作成される。
		
		String s="aaa";
		
		//String s1= new String("ddd");
		
		//split():（）の中で指定した記号で文字を区切り、個別の文字として認識する
		String s2="aaa bbb CCC";
		String[] splittedString=s2.split("bbb");
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		for(int i=s2.length()-1;i>=0;i--)
		{
			System.out.println(s2.charAt(i));
		}
	}

}

package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class corejavaBrshUp2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int [] arr2 = {1,2,4,5,6};
		
		//配列を２倍したい
		
		//2の倍数があるか確認（チェック）したい
		
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i] % 2 ==0)
			{
				System.out.println(arr2[i]);
				break;
			}
			else
			{
				System.out.println(arr2[i]+"　これは奇数");
			}
		}

		
		ArrayList<String> a  = new ArrayList<String>();
		a.add("Shetty");
		a.add("academy");
		a.add("WWW");
		
		System.out.println(a.get(2));
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("*************");
		for(String val :a)
		{
			System.out.println(val);
		}
		
		System.out.println(a.contains("nnn"));
		//配列をリストに変更
		String []name= {"aaa","bbb","ccc"};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("ccc"));
		

	}

}

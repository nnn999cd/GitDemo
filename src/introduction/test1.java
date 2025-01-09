package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
	
	public void regular(){
	
	ArrayList<String> names= new ArrayList<String>();
	
	names.add("Don");
	names.add("Abhijest");
	names.add("Alekhya");
	names.add("Adam");
	names.add("Ram");
	int count =0;
	
	
	for(int i=0;i<names.size();i++) {
		String actual= names.get(i);
		if(actual.startsWith("A"))
		{
			count++;
		}
		
	}
	System.out.println(count);
	
	}
	@Test
	public void stringFilter()
	{
		ArrayList<String> names= new ArrayList<String>();
		
		names.add("Don");
		names.add("Abhijest");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		
		//一度フィルターを作ると、終了を宣言するまでそのフィルターは終了せず使いまわせる
		Long d= names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(d);
		Stream.of("Don","Abhijest","Alekhya","Adam","Ram").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
			
			
		}
	
	@Test
	public void streamMap()
	{	ArrayList<String> names= new ArrayList<String>();
	
	names.add("Don");
	names.add("Abhijest");
	names.add("Alekhya");
	names.add("Adam");
	names.add("Ram");
		
	//forEach　引数を渡す＆繰り返しを行う	
		
		
		Stream.of("Don","Abhijest","Alekhya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		List<String>names1 = Arrays.asList("Don","Abhijest","Alekhya","Adam","Ram");
		names1.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		Stream<String> newStrem = Stream.concat(names.stream(),names1.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		boolean flag=newStrem.anyMatch(s->s.equalsIgnoreCase("Adam"));
		Assert.assertTrue(flag);
				
		
		
		
	}
	
	@Test
	public void streamCollet()
	{
		List<String> ls=Stream.of("Don","Abhijest","Alekhya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		
		List<Integer>values=Arrays.asList(3,2,2,7,5,1,9,7);
		
		//distinct：重複のない要素だけ返す
		values.stream().distinct().forEach(s->System.out.println(s));
		values.stream().sorted();
		
		
	}
	


	}



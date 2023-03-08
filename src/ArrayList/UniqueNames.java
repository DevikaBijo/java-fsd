package ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UniqueNames {

	public static void main(String[] args) {
		System.out.println("enter students article");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split("[, ; : . ? !]");
		List<String>w=Arrays.asList(arr);
		List<String>words=w.stream().filter(val->!val.isEmpty()).collect(Collectors.toList());
		List<String>unique=words.stream().map(val->val.toLowerCase()).distinct().sorted().collect(Collectors.toList());
		System.out.println("number of words:" +w.size());
		System.out.println("number of unique  words:" +words.size());
		System.out.println(w);
		System.out.println(words);
		
		
	}

}

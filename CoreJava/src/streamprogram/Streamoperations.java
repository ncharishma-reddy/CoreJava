package streamprogram;
import java.util.Arrays;
import java.util.stream.Stream;
public class Streamoperations {
	public static void main(String[]args)
	{
		Integer[] values=new Integer[] {1,2,3,4,5};
		Stream<Integer> stream=Arrays.stream(values);
		System.out.println("square of no"+Arrays.toString(values));
		stream.map(num->num*num).forEach(ele->System.out.println(ele));
	}

}
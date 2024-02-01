
package strings;
import java.util.*;

public class string1 {

	public static void main(String[] args) {
		
//StringTokenizer
		String str = "the lazy fox jumped over the brown fence";
		StringTokenizer tokenizer = new StringTokenizer(str);
		while (tokenizer.hasMoreTokens()) {
		System.out.println((tokenizer.nextToken()+" "));
		}	
//string join
		String[] elements = { "foo", "bar", "foobar" };
		String singleString = String.join(" + ", elements);
		System.out.println(singleString);
//string joiner
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		// The last two arguments are optional,
		// they define prefix and suffix for the result string
		sj.add("foo");
		sj.add("bar");
		sj.add("foobar");
		System.out.println(sj);
//join collector
//		
		/*
		Stream<String> stringStream = Stream.of("foo", "bar", "foobar");
		String joined = stringStream.collect(Collectors.joining(", "));
		System.out.println(joined); // Prints "foo, bar, foobar"
	*/
		StringBuilder sb = new StringBuilder("a");
		String s = sb.append("b").append('v').toString();
		System.out.println(s);
//StringBuilder
		StringBuilder buf = new StringBuilder(30); // Default is 16 characters
		buf.append("0123456789");
		buf.append("0123456789"); // Would cause a reallocation of the internal buffer otherwise
		String result = buf.toString();
		System.out.println(buf);
//reverse string
		String code = "code";
		System.out.println(" before reverse= "+code);
		StringBuilder s1 = new StringBuilder(code);
		code = s1.reverse().toString();
		System.out.println(" after reverse="+code);
	String o="";
		char[] array = code.toCharArray();
		for (int index = array.length-1; index>=0; index--) {
			o+=array[index];
		}
		// print reversed
		System.out.println(o);
//s.trim
		String z = new String(" Hello World!! ");
		String t = z.trim();
		
		System.out.println(t);
//replace
		String re = "popcorn";
		System.out.println(re.replace('p','W'));
		String su = "spiral metal petal et al.";
		System.out.println(su.replaceAll("(etal)","$1lica"));
	}

}

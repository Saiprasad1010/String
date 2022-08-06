package stringdemo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Saiprasad";
		String n = "Patil";
		String ss=new String ("Java");
		String a="";
		System.out.println(s.toUpperCase());
		System.out.println(s.replace('i', 'a'));
		System.out.println(s.equals(n));
		System.out.println(s.charAt(5));
		System.out.println(s.concat(n));
		System.out.println(ss.codePointBefore(3));
		System.out.println(a.isEmpty());
		System.out.println(n.length());
		System.out.println(ss.toLowerCase());
		System.out.println(ss.endsWith(a));
		System.out.println(n.startsWith(s));
		System.out.println(n.indexOf('i'));
		System.out.println(n.indexOf(3));
		System.out.println(ss.compareTo(s));
		System.out.println(ss.isBlank());
		System.out.println(n.repeat(5));
		System.out.println(n.lastIndexOf(n));
		System.out.println(n.trim());
		System.out.println(s.strip());
		System.out.println(s.hashCode());
		System.out.println(s.valueOf(5));
		System.out.println(s.valueOf(1));
		
		
		
		
		
		
		
		
		
		

	}

}

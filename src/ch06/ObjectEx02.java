package ch06;

class Person {
	String name = "È«±æµ¿";
	int age = 15;
	String job = "ÇÐ»ý";
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", job=" + job + "]";
	}
	
	
}

public class ObjectEx02 {

	public static void main(String[] args) {
		Integer num = 10;
		String s = num.toString();
		System.out.println(s);
		
		Person p = new Person();
		System.out.println(p.toString());
		System.out.println(p);
		
		StringBuilder sb = new StringBuilder();
		sb.append("¾È³ç");
		sb.append("¹Ý°¡¿ö");
		
		System.out.println(sb.toString());
	}

}

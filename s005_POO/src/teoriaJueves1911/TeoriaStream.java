package teoriaJueves1911;

import java.util.List;

public class TeoriaStream {

	public static void main(String[] args) {
		
		ejemploStream();
		
		
	}

	public static void ejemploStream() {
		List<String > lenguajes = List.of(
				"Java",
				"Python",
				"JavaScript",
				"C#");
		
		lenguajes.stream()
				.forEach(System.out::println);
		
		System.out.println();
		
		lenguajes.stream()
				.filter(libro -> libro.contains("Java"))
				.forEach(System.out::println);
		
		System.out.println();
		
		lenguajes.stream()
				.filter(libro -> libro.length() < 3)
				.forEach(System.out::println);
	}
	
}

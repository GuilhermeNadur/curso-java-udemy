package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS", "PHP", "C#");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem1);
		
		Integer ultimaNumero1 = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimaNumero1);
		
		String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem2);
		
		// Mostrando que � poss�vel especificar na chamada do m�todo
		Integer ultimaNumero2 = ListaUtil.<Integer>getUltimo2(nums);
		System.out.println(ultimaNumero2);
		
	}
}

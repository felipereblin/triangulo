package triangulo;

import java.util.HashSet;
import java.util.Set;

public class Triangulo {

	public Set<String> processaTriangulo(double a, double b, double c) {
		Set<String> propriedades = new HashSet<String>();
		
		double hipotenusa = defineHipotenusa(a, b, c);

		if ((a + b + c - hipotenusa) > hipotenusa) {
			propriedades.add("V�lido");
			if (a == b || b == c || c == a) {
				if (a == b && b == c) {
					propriedades.add("Equil�tero");
				} else {
					propriedades.add("Is�sceles");
				}
			}

			if (a != b && b != c && c != a) {
				propriedades.add("Escaleno");
			}

			if (((a * a + b * b + c * c) - hipotenusa * hipotenusa) == hipotenusa * hipotenusa) {
				propriedades.add("Ret�ngulo");
			}
		} else {
			propriedades.add("Inv�lido");
		}
		
		return propriedades;
	}
	
	public double defineHipotenusa(double a, double b, double c) {
		double hipotenusa = a;
		
		if (hipotenusa < b) {
			hipotenusa = b;
		}

		if (hipotenusa < c) {
			hipotenusa = c;
		}
		return hipotenusa;
	}
}

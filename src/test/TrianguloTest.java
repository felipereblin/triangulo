package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

import triangulo.Triangulo;

public class TrianguloTest {

	@Test
	public void testaProcessaTrianguloValido() {
		Triangulo triangulo = new Triangulo();
		Set<String> propriedade = triangulo.processaTriangulo(6, 7, 8);
		assertEquals(propriedade.toString(), "[Escaleno, Válido]");
	}

	@Test
	public void testaProcessaTrianguloInvalido() {
		Triangulo triangulo = new Triangulo();
		Set<String> propriedade = triangulo.processaTriangulo(9, 1, 2);
		assertEquals(propriedade.toString(), "[Inválido]");
	}
}

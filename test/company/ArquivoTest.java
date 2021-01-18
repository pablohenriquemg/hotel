package company;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ArquivoTest {

	@Test(expected = RuntimeException.class)
	public void lerArquivoFalhaTest() {
		Arquivo.lerArquivoResource("test");
	}

	@Test
	public void lerArquivoTest() {
		assertNotNull(Arquivo.lerArquivoResource("input.txt"));
	}
}

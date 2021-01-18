package company;

import java.io.File;
import java.nio.file.Files;

public abstract class Arquivo {

	public static String lerArquivoResource(String nomeArquivo) {
		try {
			String fileName = nomeArquivo;
			ClassLoader classLoader = Executor.class.getClassLoader();

			File file = new File(classLoader.getResource(fileName).getFile());

			return new String(Files.readAllBytes(file.toPath()));
		} catch (Exception e) {
			throw new RuntimeException("falha ler arquivo");
		}
	}

}

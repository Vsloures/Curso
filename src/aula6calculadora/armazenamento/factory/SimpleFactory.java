package aula6calculadora.armazenamento.factory;

import aula6calculadora.armazenamento.Armazenamento;
import aula6calculadora.armazenamento.ArmazenamentoArquivo;
import aula6calculadora.armazenamento.ArmazenamentoH2;

public class SimpleFactory {
	public static final String ARQ = "ARQ";
	public static final String H2 = "H2";

	private SimpleFactory() {
		
	}

	public static Armazenamento createAramazenamento(String tipo) throws Exception {
		if (tipo.equals(ARQ)) {
			return new ArmazenamentoArquivo();
		} else if(tipo.equals(H2)) {
			return new ArmazenamentoH2();
		} else {
			throw new Exception("Tipo de armazenamento não existe: "+ tipo);
		}
	}

}

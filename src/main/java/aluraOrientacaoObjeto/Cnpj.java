package aluraOrientacaoObjeto;

public class Cnpj {
    private String valor;

    public Cnpj(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    public boolean ehValido() {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto()
                && segundoDigitoVerificador() == segundoDigitoCorreto();
    }
    private int primeiroDigitoVerificador() {
        // Extrai o primeiro d�gito verificador do CNPJ armazenado
        // no atributo valor
    	return 0;
    }
    private int primeiroDigitoCorreto() {
        // Calcula o primeiro d�gito verificador correto para
        // o CNPJ armazenado no atributo valor
    	return 0;
    }
    private int segundoDigitoVerificador() {
        // Extrai o segundo d�gito verificador do CNPJ armazenado
        // no atributo valor
    	return 0;
    }
    private int segundoDigitoCorreto() {
        // Calcula o segundo d�gito verificador correto para
        // o CNPJ armazenado no atributo valor
    	return 0;
    }
}
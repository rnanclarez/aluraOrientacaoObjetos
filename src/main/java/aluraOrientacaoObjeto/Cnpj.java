package aluraOrientacaoObjeto;

public class Cnpj implements Documento {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cnpj other = (Cnpj) obj;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	
	@Override
    public String toString() {
        return this.valor;
    }
    
}
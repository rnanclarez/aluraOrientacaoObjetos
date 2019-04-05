package aluraOrientacaoObjeto;

public class Divida {
	private double total;

	private String credor;
	private Documento documentoCredor;
	private Pagamentos pagamentos = new Pagamentos();

	public double getValorAPagar() {
		return this.total - this.pagamentos.getValorPago();
	}

	public void registra(Pagamento pagamento) {
		// a classe agora delega o registro de um pagamento para seu atributo pagamentos
		pagamentos.registra(pagamento);
	}

	public boolean cnpjValido() {
		return primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj()
				&& segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
	}


	public String getCredor() {
		return this.credor;
	}
	public Documento getDocumentoCredor() {
        return this.documentoCredor;
      }
      public void setDocumentoCredor(Documento documentoCredor) {
        this.documentoCredor = documentoCredor;
      }

	public double getTotal() {
		return this.total;
	}

	private int primeiroDigitoCorretoParaCnpj() {
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo valor
		return 0;
	}

	private int primeiroDigitoVerificadorDoCnpj() {
		// Extrai o primeiro dígito verificador do CNPJ armazenado
		// no atributo valor
		return 0;
	}

	private int segundoDigitoCorretoParaCnpj() {
		// Calcula o segundo dígito verificador correto para
		// o CNPJ armazenado no atributo valor
		return 0;
	}

	private int segundoDigitoVerificadorDoCnpj() {
		// Extrai o segundo dígito verificador do CNPJ armazenado
		// no atributo valor
		return 0;
	}



	public void setCredor(String credor) {
		this.credor = credor;
	}

	public void setTotal(double total) {
		this.total = total;
	}


}

package aluraOrientacaoObjeto;

import java.util.ArrayList;
import java.util.Calendar;

public class Divida {
	private double total;

	private String credor;
	private Cnpj cnpjCredor;
	private Pagamentos pagamentos = new Pagamentos();
	
	public double valorAPagar() {
        return this.total - this.pagamentos.getValorPago();
      }

	public boolean cnpjValido() {
		return primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj()
				&& segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
	}

	public Cnpj getCnpjCredor() {
		return this.cnpjCredor;
	}

	public String getCredor() {
		return this.credor;
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

	public void setCnpjCredor(Cnpj cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Pagamentos getPagamentos() {
		return pagamentos;
	}

}

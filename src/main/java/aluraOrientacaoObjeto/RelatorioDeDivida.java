package aluraOrientacaoObjeto;

import java.text.NumberFormat;
import java.util.Locale;

public class RelatorioDeDivida {
	private Divida divida;

	public RelatorioDeDivida(Divida divida) {
		// TODO Auto-generated constructor stub
		this.divida = divida;
	}

	public void geraRelatorio(NumberFormat formatadorDeNumero) {
		System.out.println("Credor: " + divida.getCredor());
		System.out.println("Cnpj credor: " + divida.getCnpjCredor());

		// utilizamos o formatador recebido como parâmetro do método
		System.out.println("Valor a pagar: " + formatadorDeNumero.format(divida.getValorAPagar()));
		System.out.println("Valor total: " + formatadorDeNumero.format(divida.getTotal()));
	}

	public static void main(String[] args) {
		Divida divida = new Divida();
		divida.setCredor("Credor 1");
		divida.setCnpjCredor(new Cnpj("00.000.000/0001-01"));
		divida.setTotal(3000);

		Pagamento pagamento1 = new Pagamento();
		pagamento1.setValor(100);
		divida.registra(pagamento1);

		// temos uma formatação que usa os padrões brasileiros
		NumberFormat formatadorBrasileiro = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

		// temos agora uma formatação que usa os padrões dos Estados Unidos
		NumberFormat formatadorAmericano = NumberFormat.getCurrencyInstance(new Locale("en", "US"));

		RelatorioDeDivida relatorio = new RelatorioDeDivida(divida);

		// geramos o relatório com o formatador brasileiro
		relatorio.geraRelatorio(formatadorBrasileiro);

		// e agora com o formatador americano na mesma instância de RelatorioDeDivida
		relatorio.geraRelatorio(formatadorAmericano);
	}

}

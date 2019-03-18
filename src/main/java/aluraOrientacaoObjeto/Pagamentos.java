package aluraOrientacaoObjeto;

import java.util.ArrayList;
import java.util.Calendar;

public class Pagamentos extends ArrayList<Pagamento> {

	private double valorPago;

	public Pagamentos pagamentosAntesDe(Calendar data) {
		Pagamentos pagamentosFiltrados = new Pagamentos();
		for (Pagamento pagamento : this) {
			if (pagamento.getData().before(data)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public Pagamentos pagamentosDo(String cnpjPagador) {
		Pagamentos pagamentosFiltrados = new Pagamentos();
		for (Pagamento pagamento : this) {
			if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public Pagamentos pagamentosComValorMaiorQue(double valorMinimo) {
		Pagamentos pagamentosFiltrados = new Pagamentos();
		for (Pagamento pagamento : this) {
			if (pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public void registra(Pagamento pagamento) {
		double valor = pagamento.getValor();
		if (valor < 0) {
			throw new IllegalArgumentException("Valor invalido para pagamento");
		}
		if (valor > 100) {
			valor = valor - 8;
		}
		this.valorPago += valor;
		this.add(pagamento);
	}

	public double getValorPago() {
		return this.valorPago;
	}
}
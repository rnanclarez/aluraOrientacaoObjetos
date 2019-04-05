package aluraOrientacaoObjeto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

public class Pagamentos {
    private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();

	private double valorPago;

	public Pagamentos pagamentosAntesDe(Calendar data) {
		Pagamentos pagamentosFiltrados = new Pagamentos();
		for (Pagamento pagamento : this.pagamentos) {
			if (pagamento.getData().before(data)) {
				pagamentosFiltrados.pagamentos.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public Pagamentos pagamentosDo(String cnpjPagador) {
		Pagamentos pagamentosFiltrados = new Pagamentos();
		for (Pagamento pagamento : this.pagamentos) {
			if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
				pagamentosFiltrados.pagamentos.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public Pagamentos pagamentosComValorMaiorQue(double valorMinimo) {
		Pagamentos pagamentosFiltrados = new Pagamentos();
		for (Pagamento pagamento : this.pagamentos) {
			if (pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.pagamentos.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public void registra(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
      }

	public double getValorPago() {
		return this.valorPago;
	}
}
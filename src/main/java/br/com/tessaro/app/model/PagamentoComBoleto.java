package br.com.tessaro.app.model;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;

import br.com.tessaro.app.model.enums.EstadoPagamento;

@JsonTypeName("pagamentoComBoleteo")
public class PagamentoComBoleto extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Instant dataVencimento;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Instant dataPagamento;
	
	public PagamentoComBoleto() {
		super();
	}
	
	public PagamentoComBoleto(Long id, EstadoPagamento estado, Pedido pedido, Instant dataVencimento, Instant dataPagamento) {
		super(id, estado, pedido);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}

	public Instant getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Instant dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Instant getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Instant dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
}

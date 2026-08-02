package br.com.kentec.asterion.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="movimento_financeiro")
@SuppressWarnings("serial")
public class MovimentoFinanceiro implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="numero_documento", nullable = true, length = 32)
	private String numeroDocumento;
	
	@Column(name="dataReceita", nullable = true, length = 10)
	@JsonFormat(pattern="yyyy-MM-dd")
	private String dataReceita;
	
	@Column(name="dataDespesa", nullable = true, length = 10)
	@JsonFormat(pattern="yyyy-MM-dd")
	private String dataDespesa;
	
	@Column(name="dataRecebimento", nullable = true, length = 10)
	@JsonFormat(pattern="yyyy-MM-dd")
	private String dataRecebimento;
	
	@Column(name="dataPagamento", nullable = true, length = 10)
	@JsonFormat(pattern="yyyy-MM-dd")
	private String dataPagemento;
	
	@Column(name="status_recebimento", nullable = true, length = 16)
	private String statusRecimento;
	
	@Column(name="status_pagamento", nullable = true, length = 16)
	private String statusPagamento;
	
	@Column(name="tipo_recebimento", nullable = true, length = 8)
	private String tipoRecebimento;
	
	@Column(name="tipo_pagamento", nullable = true, length = 8)
	private String tipoPagemento;
	
	@Column(name="forma_recebimento", nullable = true, length = 8)
	private String formaRecebimento;
	
	@Column(name="forma_pagamento", nullable = true, length = 8)
	private String formaPagemento;
	
	@Column(name="valor", precision = 15, scale = 2, nullable = false)
	private BigDecimal valor;
	
	@Column(name="observacao", nullable = true, length = 128)
	private String obersevacao;
	
	@ManyToOne
	@JoinColumn(name = "id_user", nullable = false)
	private User user = new User();
	
	@ManyToOne
	@JoinColumn(name = "id_periodo", nullable = false)
	private Periodo periodo = new Periodo();
	
	@ManyToOne
	@JoinColumn(name = "id_descricao_receita", nullable = false)
	private DescricaoReceita descricaoReceita = new DescricaoReceita();
	
	
	@ManyToOne
	@JoinColumn(name = "id_descricao_despesa", nullable = false)
	private DescricaoDespesa descricaoDespesa = new DescricaoDespesa();
	
	public MovimentoFinanceiro() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getDataReceita() {
		return dataReceita;
	}

	public void setDataReceita(String dataReceita) {
		this.dataReceita = dataReceita;
	}

	public String getDataDespesa() {
		return dataDespesa;
	}

	public void setDataDespesa(String dataDespesa) {
		this.dataDespesa = dataDespesa;
	}

	public String getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(String dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public String getDataPagemento() {
		return dataPagemento;
	}

	public void setDataPagemento(String dataPagemento) {
		this.dataPagemento = dataPagemento;
	}

	public String getStatusRecimento() {
		return statusRecimento;
	}

	public void setStatusRecimento(String statusRecimento) {
		this.statusRecimento = statusRecimento;
	}

	public String getStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	public String getTipoRecebimento() {
		return tipoRecebimento;
	}

	public void setTipoRecebimento(String tipoRecebimento) {
		this.tipoRecebimento = tipoRecebimento;
	}

	public String getTipoPagemento() {
		return tipoPagemento;
	}

	public void setTipoPagemento(String tipoPagemento) {
		this.tipoPagemento = tipoPagemento;
	}

	public String getFormaRecebimento() {
		return formaRecebimento;
	}

	public void setFormaRecebimento(String formaRecebimento) {
		this.formaRecebimento = formaRecebimento;
	}

	public String getFormaPagemento() {
		return formaPagemento;
	}

	public void setFormaPagemento(String formaPagemento) {
		this.formaPagemento = formaPagemento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getObersevacao() {
		return obersevacao;
	}

	public void setObersevacao(String obersevacao) {
		this.obersevacao = obersevacao;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	public DescricaoReceita getDescricaoReceita() {
		return descricaoReceita;
	}

	public void setDescricaoReceita(DescricaoReceita descricaoReceita) {
		this.descricaoReceita = descricaoReceita;
	}

	public DescricaoDespesa getDescricaoDespesa() {
		return descricaoDespesa;
	}

	public void setDescricaoDespesa(DescricaoDespesa descricaoDespesa) {
		this.descricaoDespesa = descricaoDespesa;
	}

	@Override
	public String toString() {
		return "MovimentoFinanceiro [id=" + id + ", numeroDocumento=" + numeroDocumento + ", dataReceita=" + dataReceita
				+ ", dataDespesa=" + dataDespesa + ", dataRecebimento=" + dataRecebimento + ", dataPagemento="
				+ dataPagemento + ", statusRecimento=" + statusRecimento + ", statusPagamento=" + statusPagamento
				+ ", tipoRecebimento=" + tipoRecebimento + ", tipoPagemento=" + tipoPagemento + ", formaRecebimento="
				+ formaRecebimento + ", formaPagemento=" + formaPagemento + ", valor=" + valor + ", obersevacao="
				+ obersevacao + ", user=" + user + ", periodo=" + periodo + ", descricaoReceita=" + descricaoReceita
				+ ", descricaoDespesa=" + descricaoDespesa + "]";
	}	
}

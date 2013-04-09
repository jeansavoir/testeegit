package br.com.locadora.entity;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="locacao")
public class Locacao implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idlocacao")
	private Integer idLocacao;
	@Column(name="dataemprestimo", nullable=false, updatable=false)
	private Date dataEmprestimo;
	@Column(name="horaemprestimo", nullable=false, updatable=false)
	private Time horaEmprestimo;
	@Column(name="datadevolucao", nullable=false)
	private Date dataDevolucao;
	@Column(nullable=false,length=50)
	private String observacao;
	@ManyToOne
	@JoinColumn(name="id_midia")
	private Midia midia;
	
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	
	public Locacao() {
	
	}


	
	
	public Locacao(Integer idLocacao, Date dataEmprestimo, Time horaEmprestimo,
			Date dataDevolucao, String observacao) {
		super();
		this.idLocacao = idLocacao;
		this.dataEmprestimo = dataEmprestimo;
		this.horaEmprestimo = horaEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.observacao = observacao;
	}




	public Locacao(Integer idLocacao, Date dataEmprestimo, Time horaEmprestimo,
			Date dataDevolucao, String observacao, Midia midia, Cliente cliente) {
		super();
		this.idLocacao = idLocacao;
		this.dataEmprestimo = dataEmprestimo;
		this.horaEmprestimo = horaEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.observacao = observacao;
		this.midia = midia;
		this.cliente = cliente;
	}
	
	
	@Override
	public String toString() {
		return idLocacao + "," + dataEmprestimo + "," + horaEmprestimo + ',' + dataDevolucao + "," + observacao;
	}




	public Integer getIdLocacao() {
		return idLocacao;
	}




	public void setIdLocacao(Integer idLocacao) {
		this.idLocacao = idLocacao;
	}




	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}




	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}




	public Time getHoraEmprestimo() {
		return horaEmprestimo;
	}




	public void setHoraEmprestimo(Time horaEmprestimo) {
		this.horaEmprestimo = horaEmprestimo;
	}




	public Date getDataDevolucao() {
		return dataDevolucao;
	}




	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}




	public String getObservacao() {
		return observacao;
	}




	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}




	public Midia getMidia() {
		return midia;
	}




	public void setMidia(Midia midia) {
		this.midia = midia;
	}




	public Cliente getCliente() {
		return cliente;
	}




	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
			
			
	
	
	
}

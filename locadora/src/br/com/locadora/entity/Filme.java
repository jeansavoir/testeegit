package br.com.locadora.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="filme")
public class Filme implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idfilme")
	private Integer idFilme;
	@Column(length=50, nullable=false)
	private String  descricao;
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date data;
	
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categoria categoria;
	
	
	public Filme() {
		
	}

	
	
	public Filme(Integer idFilme, String descricao, Date data,
			Categoria categoria) {
		super();
		this.idFilme = idFilme;
		this.descricao = descricao;
		this.data = data;
		this.categoria = categoria;
	}



	@Override
	public String toString() {
		return idFilme + "," + descricao + "," + data;
	}


	public Integer getIdFilme() {
		return idFilme;
	}


	public void setIdFilme(Integer idFilme) {
		this.idFilme = idFilme;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}



	public Categoria getCategoria() {
		return categoria;
	}



	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}

package br.com.locadora.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="midia")
public class Midia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idmidia")
	private Integer idMidia;
	@Column(length=1,nullable=false)
	private String inutilizada;
	@ManyToOne
	@JoinColumn(name="id_filme")
	private Filme filme;
	
	public Midia() {
	
	}

	public Midia(Integer idMidia, String inutilizada, Filme filme) {
		super();
		this.idMidia = idMidia;
		this.inutilizada = inutilizada;
		this.filme = filme;
	}
	
	@Override
	public String toString() {
		return idMidia + "," + inutilizada;
	}

	public Integer getIdMidia() {
		return idMidia;
	}

	public void setIdMidia(Integer idMidia) {
		this.idMidia = idMidia;
	}

	public String getInutilizada() {
		return inutilizada;
	}

	public void setInutilizada(String inutilizada) {
		this.inutilizada = inutilizada;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	
	
	
}

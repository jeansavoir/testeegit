package br.com.locadora.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="endereco")
public class Endereco implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idendereco")
	private Integer idEndereco;
	@Column(nullable=false)
	private String rua;

	@Column(nullable=false)
	private Integer numero;

	@Column(nullable=false,length=10)
	private String bairro;	

	@Column(nullable=false,length=10)
	private String cidade;

	@Column(nullable=false,length=2)
	private String uf;

	@Column(nullable=false,length=10)
	private String cep;

	@Column(nullable=false,length=30)
	private String complemento;
	
	@OneToOne(mappedBy="endereco")
	private Cliente cliente;
	
	
	public Endereco() {
		
	}


	
	
	public Endereco(Integer idEndereco, String rua, Integer numero,
			String bairro, String cidade, String uf, String cep,
			String complemento) {
		super();
		this.idEndereco = idEndereco;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.complemento = complemento;
	}




	public Endereco(Integer idEndereco, String rua, Integer numero,
			String bairro, String cidade, String uf, String cep,
			String complemento, Cliente cliente) {
		super();
		this.idEndereco = idEndereco;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.complemento = complemento;
		this.cliente = cliente;
	}
	
	
	@Override
	public String toString() {
		return idEndereco + "," + rua + "," + numero + "," + bairro + "," + cidade + "," + uf + "," + cep + "," + complemento;
	}




	public Integer getIdEndereco() {
		return idEndereco;
	}




	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}




	public String getRua() {
		return rua;
	}




	public void setRua(String rua) {
		this.rua = rua;
	}




	public Integer getNumero() {
		return numero;
	}




	public void setNumero(Integer numero) {
		this.numero = numero;
	}




	public String getBairro() {
		return bairro;
	}




	public void setBairro(String bairro) {
		this.bairro = bairro;
	}




	public String getCidade() {
		return cidade;
	}




	public void setCidade(String cidade) {
		this.cidade = cidade;
	}




	public String getUf() {
		return uf;
	}




	public void setUf(String uf) {
		this.uf = uf;
	}




	public String getCep() {
		return cep;
	}




	public void setCep(String cep) {
		this.cep = cep;
	}




	public String getComplemento() {
		return complemento;
	}




	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}




	public Cliente getCliente() {
		return cliente;
	}




	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}

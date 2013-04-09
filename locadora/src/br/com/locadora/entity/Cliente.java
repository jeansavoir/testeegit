package br.com.locadora.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
	
	
	private static final long serialVersionUID = 3L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idcliente")
	private Integer idCliente;
	@Column(nullable=false,length=30)
	private String nome;
	@Column(nullable=false,length=10)
	private String telefone;
	@Column(nullable=false,length=10)
	private String celular;
	@Column(nullable=false,unique=true,length=30)
	private String email;
	
	@OneToOne
	@JoinColumn(name="id_endereco")
	private Endereco endereco;
	@OneToMany(mappedBy="cliente")
	private List<Locacao> locacoes;
	
	public Cliente() {
	
	}

	
	
	
	public Cliente(Integer idCliente, String nome, String telefone,
			String celular, String email) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
	}




	public Cliente(Integer idCliente, String nome, String telefone,
			String celular, String email, Endereco endereco,
			List<Locacao> locacoes) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.endereco = endereco;
		this.locacoes = locacoes;
	}
	
	
	
	@Override
	public String toString() {
		return idCliente + "," + nome + "," + telefone + "," + celular + "," + email;
	}




	public Integer getIdCliente() {
		return idCliente;
	}




	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getTelefone() {
		return telefone;
	}




	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}




	public String getCelular() {
		return celular;
	}




	public void setCelular(String celular) {
		this.celular = celular;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public Endereco getEndereco() {
		return endereco;
	}




	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}




	public List<Locacao> getLocacoes() {
		return locacoes;
	}




	public void setLocacoes(List<Locacao> locacoes) {
		this.locacoes = locacoes;
	}
	
	
	
	
	
}

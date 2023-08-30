package entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table 
public class Forum implements Serializable {

	private static final long serialVersionUID = 1L;
	
@Id
	private int idforum;
	private String assunto;
	private String descricao;
	private Set<Usuario> usuarios = new HashSet<>(0);

	public int getId() {
		return idforum;
	}

	public void setId(int id) {
		this.idforum = id;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}

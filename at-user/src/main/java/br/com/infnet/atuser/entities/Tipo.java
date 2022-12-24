package br.com.infnet.atuser.entities;

import java.util.Objects;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tipo")
public class Tipo implements Serializable {
 	private static final long serialVersionUID = 1L;
	
	@Id
 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tipoNome;
	
	public Tipo() {
		
	}

	public Tipo(Long id, String tipoNome) {
		super();
		this.id = id;
		this.tipoNome = tipoNome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoNome() {
		return tipoNome;
	}

	public void setTipoNome(String tipoNome) {
		this.tipoNome = tipoNome;
	}

	@Override
 	public int hashCode() {
 		final int prime = 31;
 		int result = 1;
 		result = prime * result + ((tipoNome == null) ? 0 : tipoNome.hashCode());
 		return result;
 	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tipo other = (Tipo) obj;
		if (tipoNome == null) {
 			if (other.tipoNome != null)
 				return false;
 		} else if (!tipoNome.equals(other.tipoNome))
 			return false;
 		return true;
	}
	
	
	 

}

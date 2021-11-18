package mx.edu.uacm.onetone.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Detalle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String proveedor;
	
	private String tecnologia;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "telefono_id")
	private Telefono telefono;
	
	public Detalle() {
		
	}
	
	

	public Detalle(String proveedor, String tecnologia) {
		super();
		this.proveedor = proveedor;
		this.tecnologia = tecnologia;
	}


	

	public Telefono getTelefono() {
		return telefono;
	}



	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}
	
	
}

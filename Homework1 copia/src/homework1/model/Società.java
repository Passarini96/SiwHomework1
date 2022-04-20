package homework1.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Società {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable=false)
	private String ragioneSociale;
	
	@Column(nullable=false)
	private String via;

	@Column(nullable=false)
	private int civico;
	
	
	@Column(nullable=false)
	private String comune;
	
	@Column(nullable=false)
	private String provincia;
	
	@Column(nullable=false)
	private String cap;
	
	@Column(nullable=false)
	private long telefono;
	
	
	
	
	
	
	
	


	
	public Società(long id, String ragioneSociale, String via, int civico, String comune, String provincia, String cap,
			long telefono) {
		super();
		this.id = id;
		this.ragioneSociale = ragioneSociale;
		this.via = via;
		this.civico = civico;
		this.comune = comune;
		this.provincia = provincia;
		this.cap = cap;
		this.telefono = telefono;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getRagioneSociale() {
		return ragioneSociale;
	}


	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}


	public String getVia() {
		return via;
	}


	public void setVia(String via) {
		this.via = via;
	}


	public int getCivico() {
		return civico;
	}


	public void setCivico(int civico) {
		this.civico = civico;
	}


	public String getComune() {
		return comune;
	}


	public void setComune(String comune) {
		this.comune = comune;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public String getCap() {
		return cap;
	}


	public void setCap(String cap) {
		this.cap = cap;
	}


	public long getTelefono() {
		return telefono;
	}


	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}




	
	
	
	
	
	
}

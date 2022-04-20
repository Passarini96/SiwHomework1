package homework1.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Docente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable= false)
	private String nome;
	private String cognome;
	
	@Column(nullable= false)
	private LocalDate dataDiNascita;
	
	@Column(nullable=false)
	private String luogoDiNascita;
	
	
	@Column(nullable=false)
	private String partitaIVA;
	
	
	// ho messo il cascade su entrambe le associazioni per garantire una migliore pesistenza	
	@OneToMany(mappedBy="docente" ,cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	private List<JPACorso>corsi;

	
	
	
	public Docente(long id, String nome, String cognome, LocalDate dataDiNascita, String luogoDiNascita, String partitaIVA) {
		
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.luogoDiNascita = luogoDiNascita;
		this.partitaIVA = partitaIVA;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}

	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}

	public String getPartitaIVA() {
		return partitaIVA;
	}

	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}

	public List<JPACorso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<JPACorso> corsi) {
		this.corsi = corsi;
	}

	
	
	
}

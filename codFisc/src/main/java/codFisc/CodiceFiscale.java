package codFisc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CodiceFiscale", schema= "fiscale")
public class CodiceFiscale {

	@Id
	@GeneratedValue
	private int idFiscale;
	@Column
	private String nome;
	@Column
	private String cognome;
	@Column
	private String dataNascita;
	@Column
	private String comuneNascita;
	@Column
	private int sesso;
	@Column
	private String Fiscal;
	
	public CodiceFiscale() {
		super();
	}

	public CodiceFiscale(String nome, String cognome, String dataNascita, String comuneNascita, int sesso) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.comuneNascita = comuneNascita;
		this.sesso = sesso;
	}

	public int getIdFiscale() {
		return idFiscale;
	}

	public void setIdFiscale(int idFiscale) {
		this.idFiscale = idFiscale;
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

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getComuneNascita() {
		return comuneNascita;
	}

	public void setComuneNascita(String comuneNascita) {
		this.comuneNascita = comuneNascita;
	}

	public int getSesso() {
		return sesso;
	}

	public void setSesso(int sesso) {
		this.sesso = sesso;
	}

	public String getFiscal() {
		return Fiscal;
	}

	public void setFiscal(String fiscal) {
		Fiscal = fiscal;
	}

	@Override
	public String toString() {
		return "CodiceFiscale [idFiscale=" + idFiscale + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita="
				+ dataNascita + ", comuneNascita=" + comuneNascita + ", sesso=" + sesso + ", Fiscal=" + Fiscal + "]";
	}
	
	
	
	
}

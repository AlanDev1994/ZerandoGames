package alan.zerando.games.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "zerandogames")
public class ZerandoGames {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idGame")
	private Long idGame;
	@Column(name = "nomeGame")
	private String nomeGame;
	@Column(name = "console")
	private String console;
	@Column(name = "genero")
	private String genero;
	@Column(name = "tipo")
	private String tipo;
	@Column(name = "dataInicio")
	private LocalDate dataInicio;
	@Column(name = "condicoesZeramento")
	private String condicoesZeramento;
	
	public Long getIdGame() {
		return idGame;
	}
	public void setIdGame(Long idGame) {
		this.idGame = idGame;
	}
	public String getNomeGame() {
		return nomeGame;
	}
	public void setNomeGame(String nomeGame) {
		this.nomeGame = nomeGame;
	}
	public String getConsole() {
		return console;
	}
	public void setConsole(String console) {
		this.console = console;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getCondicoesZeramento() {
		return condicoesZeramento;
	}
	public void setCondicoesZeramento(String condicoesZeramento) {
		this.condicoesZeramento = condicoesZeramento;
	}

	
	
	

}

package company.core;

import java.math.BigDecimal;

public class Hotel {

	public Hotel(String nome, BigDecimal semanaRegular, BigDecimal semanaReward, BigDecimal fimSemanaRegular,
			BigDecimal fimSemanaReward, int classificacao) {
		super();
		this.nome = nome;
		this.semanaRegular = semanaRegular;
		this.semanaReward = semanaReward;
		this.fimSemanaRegular = fimSemanaRegular;
		this.fimSemanaReward = fimSemanaReward;
		this.classificacao = classificacao;
	}

	private String nome;
	private BigDecimal semanaRegular;
	private BigDecimal semanaReward;
	private BigDecimal fimSemanaRegular;
	private BigDecimal fimSemanaReward;
	private int classificacao;
	
	public String getNome() {
		return nome;
	}
	public BigDecimal getSemanaRegular() {
		return semanaRegular;
	}
	public BigDecimal getSemanaReward() {
		return semanaReward;
	}
	public BigDecimal getFimSemanaRegular() {
		return fimSemanaRegular;
	}
	public BigDecimal getFimSemanaReward() {
		return fimSemanaReward;
	}
	public int getClassificacao() {
		return classificacao;
	}

	

}

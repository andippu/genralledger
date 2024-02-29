package journal.ledgerjournal.models;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BEBAN_SUSUT_DTL")
@IdClass(BebanSusutDetailCompKey.class)
public class BebanSusutDetail {
	@Id
	@Column(name="SUSUT_NO",length=80,  nullable = false)
	private String susutNo;
	
	@Id
	@Column(name="PERIODE",length=7,  nullable = false)
	private String susutPeriode;
	
	@Column(name="SUSUT")
	private BigDecimal susutSusut;
		
	@Column(name="AKUMULASI")
	private BigDecimal susutAkumulasi;
	
	@Column(name="NILAI_BUKU")
	private BigDecimal susutNilaiBuku;
	

}

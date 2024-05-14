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
@Table(name = "GL_JOUR_DET")
@IdClass(GlJouDtlCompKey.class)
public class GlJourDetail {
	
	@Id
	@Column(name="JOU_KEY",length=20,  nullable = false)
	private String glJourDtlKey;
	
	@Id
	@Column(name="JOUD_PARAM2",length=20,  nullable = false)
	private Integer glJourDtlParam2;
	
	@Column(name="JOU_PARAM",length=20,  nullable = false)
	private Integer glJourDtlParam;
	
	@Column(name="JOU_ACC",length=20,  nullable = false)
	private Integer glJourDtlAcc;
	
	@Column(name="ALD_STATUS",length=2,  nullable = false)
	private String glJourDtlStatus;

	@Column(name="AC_USER_CRE",length=20)
	 private String fmFPosUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date fmFPosDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String fmFPosUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date fmFPosDateUpd;
	
}

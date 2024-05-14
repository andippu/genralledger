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
@Table(name = "GL_FU_DET")
@IdClass(GlFuDetailCompKey.class)
public class GlFuDetail {
	
	@Id
	@Column(name="FU_SEQ", nullable = false)
	private Integer glFuDtlSeq;
	
	@Id
	@Column(name="FUD_SEQ_DET", nullable = false)
	private Integer glPlDtlSeq;
	
	@Column(name="FU_CODE",length=20,  nullable = false)
	private String glFuDtlCode;

	@Column(name="FUD_ACC_BEG",length=20,  nullable = false)
	private String glFuDtlAccBeg;
	
	@Column(name="FUD_ACC_END",length=20,  nullable = false)
	private String glFuDtlAccEnd;
	
	@Column(name="FUD_STATUS",length=2,  nullable = false)
	private String glFuDtlStatus;
	
	 @Column(name="AC_USER_CRE",length=20)
	 private String fmFPosUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date fmFPosDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String fmFPosUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date fmFPosDateUpd;

}

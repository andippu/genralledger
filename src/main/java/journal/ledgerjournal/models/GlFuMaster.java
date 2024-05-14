package journal.ledgerjournal.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GL_FU_MSTR")
public class GlFuMaster {
	
	@Id
	@Column(name="FU_SEQ", nullable = false)
	private Integer glFuSeq;
	
	@Column(name="FU_CODE",length=20,  nullable = false)
	private String glFuCode;
	
	@Column(name="FU_DESC",length=50,  nullable = false)
	private String glFuDesc;
	
	@Column(name="FU_STATUS",length=2,  nullable = false)
	private String glFuStatus;
	
	 @Column(name="AC_USER_CRE",length=20)
	 private String fmFPosUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date fmFPosDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String fmFPosUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date fmFPosDateUpd;

}

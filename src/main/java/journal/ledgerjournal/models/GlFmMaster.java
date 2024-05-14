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
@Table(name = "GL_FM_MSTR")
public class GlFmMaster {

	 @Id
	 @Column(name="FM_FPOS",length=20,  nullable = false)
	 private String fmFPos;
	 
	 @Column(name="FM_DESC",length=50,  nullable = false)
	 private String fmFPosDesc;
	 
	 @Column(name="FM_TYPE",length=1,  nullable = false)
	 private String fmFPosType;
	 	 
	 @Column(name="FM_LEVEL")
	 private Integer fmFPosLevel;
	 
	 @Column(name="FM_SUM_INTO",length=1,  nullable = false)
	 private String fmFPosSumInto;
	 
	 @Column(name="FM_DB_CR",length=1,  nullable = false)
	 private String fmFPosDbCr;
	 
	 @Column(name="FM_HEADER",length=1,  nullable = false)
	 private String fmFPosHeader;
	 
	 @Column(name="FM_NEW_PAGE",length=1,  nullable = false)
	 private String fmFPosNewPage;
	 
	 @Column(name="FM_TOTAL",length=1,  nullable = false)
	 private String fmFPosFmTotal;
	 
	 @Column(name="FM_UNDERLINE",length=1,  nullable = false)
	 private String fmFPosUnderLine;
	 
	 @Column(name="FM_SKIP",length=1,  nullable = false)
	 private String fmFPosSkip;
	 
	 @Column(name="AC_STATUS",length=2,  nullable = false)
	 private String fmFPosStatus;
	 
	 @Column(name="AC_USER_CRE",length=20)
	 private String fmFPosUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date fmFPosDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String fmFPosUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date fmFPosDateUpd;
	
}

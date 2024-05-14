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
@Table(name = "GL_SAC_MSTR")
public class GlSacMaster {
	
	@Id
	@Column(name="SAC_ACC",length=20,  nullable = false)
	private String glamSacCode;
	
	@Column(name="SAC_SUB",length=20,  nullable = false)
	private String glamSacSub;

	@Column(name="ASC_DESC",length=50,  nullable = false)
	private String glamSacDesc;
	
	@Column(name="ASC_STATUS",length=2,  nullable = false)
	private String glamSaStatus;
	
	 @Column(name="AC_USER_CRE",length=20)
	 private String fmFPosUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date fmFPosDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String fmFPosUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date fmFPosDateUpd;
}

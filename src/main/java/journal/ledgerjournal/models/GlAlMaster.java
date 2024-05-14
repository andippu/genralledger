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
@Table(name = "GL_AL_MSTR")
public class GlAlMaster {
	
	@Id
	@Column(name="AL_CODE",length=20,  nullable = false)
	private String glAlCode;
	
	@Column(name="AL_DESC",length=50,  nullable = false)
	private String glAlDesc;
	
	@Column(name="AL_STATUS",length=2,  nullable = false)
	private String glAlStatus;
	
	@Column(name="AC_USER_CRE",length=20)
	 private String fmFPosUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date fmFPosDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String fmFPosUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date fmFPosDateUpd;
	
	

}

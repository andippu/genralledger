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
@Table(name = "GL_TYPE_MSTR")
public class GlTypeMaster {
	
	@Id
	@Column(name="TYPE_CODE",length=10,  nullable = false)
	private String glamTyCode;
	
	@Column(name="TYPE_DESC",length=50,  nullable = false)
	private String glamTyDesc;
	
	@Column(name="AC_STATUS",length=2,  nullable = false)
	private String glamTyStatus;
	
	 @Column(name="AC_USER_CRE",length=20)
	 private String fmFPosUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date fmFPosDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String fmFPosUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date fmFPosDateUpd;


	

}

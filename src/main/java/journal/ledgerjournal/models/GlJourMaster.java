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
@Table(name = "GL_JOUR_MSTR")
public class GlJourMaster {
	
	@Id
	@Column(name="JOU_KEY",length=20,  nullable = false)
	private String glJouKey;
	
	@Column(name="JOU_DESC",length=50,  nullable = false)
	private String glJouDesc;
	
	@Column(name="JOU_ACC",length=20,  nullable = false)
	private String glJouAcc;
	
	@Column(name="JOU_PARAM",length=20)
	private String glJouParam;
	
	@Column(name="JOU_STATUS",length=2 )
	private String glJouStatus;
	
	 @Column(name="AC_USER_CRE",length=20)
	 private String fmFPosUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date fmFPosDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String fmFPosUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date fmFPosDateUpd;	    

}

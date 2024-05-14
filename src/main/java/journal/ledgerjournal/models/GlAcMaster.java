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
@Table(name = "GL_AC_MSTR")
public class GlAcMaster {
	@Id
	@Column(name="AC_CODE",length=20,  nullable = false)
	private String glamAcCode;
	
	@Column(name="AC_DESC",length=50,  nullable = false)
	private String glamAcDesc;

	@Column(name="AC_DESC2",length=50)
	private String glamAcDesc2;
	
	@Column(name="AC_FPOS",length=20,  nullable = false)
	private String glamAcFPos;
	
	@Column(name="AC_GROUP",length=2,  nullable = false)
	private String glamAcGroup;

	@Column(name="AC_TYPE",length=10,  nullable = false)
	private String glamAcType;
	
	@Column(name="AC_ENT",length=10,  nullable = false)
	private String glamAcEnt;
	
	@Column(name="AC_OFF",length=20,  nullable = false)
	private String glamAcOffice;
	
	@Column(name="AC_ACC",length=20,  nullable = false)
	private String glamAcAccount;
	
	@Column(name="AC_SUB",length=20,  nullable = false)
	private String glamAcSub;
	
	@Column(name="AC_CC",length=20,  nullable = false)
	private String glamAcCc;
	
	@Column(name="AC_PL",length=20,  nullable = false)
	private String glamAcPl;
	
	@Column(name="AC_PJ",length=20,  nullable = false)
	private String glamAcPj;
	
	@Column(name="AC_FU1",length=20 )
	private String glamAcFu1;
	
	@Column(name="AC_FU2",length=20 )
	private String glamAcFu2;
	
	@Column(name="AC_FU3",length=20 )
	private String glamAcFu3;
	
	@Column(name="AC_FU4",length=20 )
	private String glamAcFu4;
	
	@Column(name="AC_FU5",length=20 )
	private String glamAcFu5;
	
	@Column(name="AC_STATUS",length=2 )
	private String glamAcStatus;
	
	 @Column(name="AC_USER_CRE",length=20)
	 private String fmFPosUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date fmFPosDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String fmFPosUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date fmFPosDateUpd;
	  
}

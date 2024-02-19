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
@Table(name = "MASTER_JURNAL")
@IdClass(MasterJurnalCompKey.class)
public class MasterJurnal {
	   
	   @Id
	   @Column(name="MJ_NO_VOUCHER",length=14,  nullable = false)
	   private String mjNoVoucher;
	   
	   @Id
	   @Column(name="MJ_DATE")
	   private Date mjDate;

	   @Column(name="MJ_CHGUSER",length=40)
	   private String mjChgUser;
	   
	   
	   @Column(name="MJ_CHGDATE")
	   private Date mjChgDate;
	   
	   @Column(name="MJ_CUS_CODE",length=6)
	   private String mjCusCode;	   
	   
	   @Column(name="TRANS_DATE")
	   private Date mjTransDate;
	   
	   @Column(name="MJ_CREDATE")
	   private Date mjCreDate;	   
	   
	   @Column(name="MJ_CREUSER")
	   private String mjCreUser;

}


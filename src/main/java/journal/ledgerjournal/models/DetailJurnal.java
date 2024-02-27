package journal.ledgerjournal.models;

import java.math.BigDecimal;

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
@Table(name = "DETAIL_JURNAL")
@IdClass(DetailJurnalCompKey.class)
public class DetailJurnal {
	
	   @Id
	   @Column(name="DJ_MJ_NO_VOUCHER",length=14,  nullable = false)
	   private String djMjNoVoucher;
	   
	   @Id
	   @Column(name="DJ_SEQ")
	   private Integer djSeq;
	   
	   @Column(name="DJ_MJ_DATE")
	   private Date djMjDate;
	   
	   @Column(name="DJ_ACC_NO",length=7)
	   private String djAccNo;
	   
	   @Column(name="DJ_DEBET_VALUE")
	   private BigDecimal djDebetValue;
	   
	   @Column(name="DJ_CREDIT_VALUE")
	   private BigDecimal djCreditValue;
	   
	   @Column(name="DJ_DESC", length=100 )
	   private String djDesc;
	   
	   @Column(name="DJ_CHGUSER", length=40 )
	   private String djChgUser;
	   
	   @Column(name="DJ_CHGDATE" )
	   private Date djChgDate;
	   
	   @Column(name="DJ_STAT",  length=1  )
	   private String djStat;

	   @Column(name="DJ_SPL_CODE",  length=10  )
	   private String djSplCode;
	   
	   @Column(name="REM_NO",  length=50  )
	   private String djRemNo;
	   
	   @Column(name="TRANS_DATE"  )
	   private Date djTransDate;
	   
	   @Column(name="DJ_CREUSER", length=40 )
	   private String djCreUser;
	   
	   @Column(name="DJ_CREDATE" )
	   private Date djCreDate;
	
	

}

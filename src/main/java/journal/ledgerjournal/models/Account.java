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
@Table(name = "ACCOUNT")
public class Account {
	
	 @Id
	 @Column(name="ACC_NO",length=7,  nullable = false)
	 private String accNo;
	 
	 @Column(name="ACC_DESC",length=100,  nullable = false)
	 private String accDesc;
	 
	 @Column(name="ACC_CHGUSER",length=40)
	 private String accChgUser;
	 
	 @Column(name="ACC_CHGDATE")
	 private Date accChgDate;
	 
	 @Column(name="ACC_DB_CR",length=1)
	 private String accDbCr;
	 
	 @Column(name="ACC_NILAI")
	 private BigInteger accNilai;
	 
	 @Column(name="ACC_SLD_AKHIR")
	 private BigInteger accSldAkhir;
	 
	 @Column(name="ACC_CREUSER",length=40)
	 private String accCreUser;
	 
	 @Column(name="ACC_CREDATE")
	 private Date accCreDate;

}

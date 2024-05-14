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
@Table(name = "ACCOUNT_TYPE")
public class AccountType {

	 @Id
	 @Column(name="ACCTYPE_NO",length=2,  nullable = false)
	 private String accTyNo;
	 
	 @Column(name="ACCTYPE_DESCRIPTION",length=50,  nullable = false)
	 private String accTyDesc;
	 
	 @Column(name="ACCTYPE_CREATEDBY",length=20  )
	 private String accTyCreatedBy;
	 
	 @Column(name="ACCTYPE_CREATEDDATE")
	 private Date accTyCreatedDate;
	 
	 @Column(name="ACCTYPE_UPDATEDBY",length=20)
	 private String accTyUpdatedBy;
	 
	 @Column(name="ACCTYPE_UPDATEDDATE")
	 private Date accTyUpdatedDate;
	 
}

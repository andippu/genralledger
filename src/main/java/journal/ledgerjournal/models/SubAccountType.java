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
@Table(name = "SUB_ACCOUNT_TYPE")
public class SubAccountType {
	
	 @Id
	 @Column(name="SUBACCTYPE_NO",length=2,  nullable = false)
	 private String subAccTyNo;	 
	 
	 @Column(name="ACCTYPE_NO",length=2,  nullable = false)
	 private String accTyNo;
	 
	 @Column(name="SUBACCTYPE_DESCRIPTION",length=50,  nullable = false)
	 private String subAccTyDesc;
	 
	 @Column(name="SUBACCTYPE_CREATEDBY",length=20  )
	 private String subAccTyCreatedBy;
	 
	 @Column(name="SUBACCTYPE_CREATEDDATE")
	 private Date subAccTyCreatedDate;
	 
	 @Column(name="SUBACCTYPE_UPDATEDBY",length=20)
	 private String subAccTyUpdatedBy;
	 
	 @Column(name="SUBACCTYPE_UPDATEDDATE")
	 private Date subAccTyUpdatedDate; 
	      
}

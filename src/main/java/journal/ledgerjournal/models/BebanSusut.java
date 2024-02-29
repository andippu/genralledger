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
@Table(name = "BEBAN_SUSUT_INSERT")
public class BebanSusut {
	
	 @Id
	 @Column(name="SUSUT_NO",length=80,  nullable = false)
	 private String susutNo;
	 
	 @Column(name="SUSUT_TIPE",length=20)
	 private String susutTipe;
	 
	 @Column(name="SUSUT_DEPT",length=20)
	 private String susutDept;
	 
	 @Column(name="SUSUT_NOPOL",length=100)
	 private String susutNopol;
	
	 @Column(name="SUSUT_BARANG",length=500)
	 private String susutBarang;
	 
	 @Column(name="SUSUT_MERK",length=300)
	 private String susutMerk;
	 
	 @Column(name="SUSUT_TGL_PEROLEHAN")
	 private Date susutTglPerolehan;
	
	 @Column(name="SUSUT_HRG_PEROLEHAN")
	 private BigDecimal susutHrgPerolehan;
	 
	 @Column(name="SUSUT_AWAL")
	 private Date susutAwal;
	 
	 @Column(name="SUSUT_AKHIR")
	 private Date susutAkhir;
	 
	 @Column(name="SUSUT_BEBAN")
	 private BigDecimal susutBeban;
	 
	 @Column(name="CREATED_DATE")
	 private Date susutCreDate;
	 
	 @Column(name="BEBAN_SUSUT")
	 private BigDecimal susutBebanSusut;
	 
	 @Column(name="SUSUT_QTY")
	 private Integer susutQty;

	 @Column(name="PEMILIK",length=199)
	 private String susutPemilik;
	 
	 @Column(name="TAHUN_BPKB",length=12)
	 private String susutBpkb;
	 
	 @Column(name="ACTIVE",length=300)
	 private String susutActive;

}

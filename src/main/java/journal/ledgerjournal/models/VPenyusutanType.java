package journal.ledgerjournal.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "V_PENYUSUTAN_TYPE")
public class VPenyusutanType {
	@Id
	 @Column(name="SUSUT_TIPE",length=20,  nullable = false)
	 private String susutTipe;

}

package journal.ledgerjournal.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MasterJurnalCompKey implements Serializable {
   private String mjNoVoucher;
   private Date mjDate;
}

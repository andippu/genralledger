package journal.ledgerjournal.repository;


import journal.ledgerjournal.models.DetailJurnal;
import journal.ledgerjournal.models.DetailJurnalCompKey;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface IDetailJurnalRepository extends JpaRepository<DetailJurnal, String>{
	List<DetailJurnal> findByDjMjNoVoucherOrderByDjSeq(String voucher);
	
	@Query(value="SELECT * FROM DETAIL_JURNAL s WHERE s.DJ_MJ_NO_VOUCHER=?1 AND s.DJ_SEQ=?2",nativeQuery = true)
	List<DetailJurnal> getDtlJurSingle(String voucher, Integer djSeq);

}

package journal.ledgerjournal.services;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import journal.ledgerjournal.models.ReportBukuBesarAll;
import journal.ledgerjournal.models.ReportJurnalAll;
import journal.ledgerjournal.models.ReportJurnalSupp;
import journal.ledgerjournal.models.ReportNeracaAll;
import journal.ledgerjournal.repository.IReportBukuBesarAllRepository;
import journal.ledgerjournal.repository.IReportJurnalAllRepository;
import journal.ledgerjournal.repository.IReportJurnalSuppRepository;
import journal.ledgerjournal.repository.IReportNeracaAllRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;



import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint; 
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

@Service
public class ServiceReportsGL {	
	@Autowired
	IReportJurnalAllRepository repoRJAll;
	@Autowired
	IReportBukuBesarAllRepository repoRBBA;
	@Autowired
	IReportNeracaAllRepository repoRNAL;
	@Autowired
	IReportJurnalSuppRepository repojSUP;
	
	public void LapJurnalAll(String Period, String voucher, HttpServletResponse response) throws JRException, IOException {
		List<ReportJurnalAll> RJALL= repoRJAll.findByRjalPeriodAndRjalVoucherNoContainingOrderByRjalVoucherNo(Period, voucher);
		File file = ResourceUtils.getFile("classpath:LAP_JURNAL_ALL.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(RJALL);		
		Map<String, Object> parameters = new HashMap<>();	
		parameters.put("pvoucher", "aaa");	
		parameters.put("phari", "01");
		parameters.put("ptype", voucher);	
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	public void LapJurnalAllDesc(String Period, String voucher, HttpServletResponse response) throws JRException, IOException {
		List<ReportJurnalAll> RJALL= repoRJAll.findByRjalPeriodAndRjalVoucherNoContainingOrderByRjalVoucherNo(Period, voucher);
		File file = ResourceUtils.getFile("classpath:LAP_JURNAL_ALL_DESC.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(RJALL);		
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("pvoucher", "aaa");	
		parameters.put("phari", "01");
		parameters.put("ptype", voucher);	
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	public void LapBukuBesarAllc(String Period, String ac1, String ac2,  HttpServletResponse response) throws JRException, IOException {
		String temp=repoRBBA.getBukuBesarAll(Period, ac1, ac2);
		List<ReportBukuBesarAll> RBBA= repoRBBA.findAll();
		File file = ResourceUtils.getFile("classpath:LAP_BK_BESAR_ALL.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(RBBA);		
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("pvoucher", "aaa");	
		parameters.put("phari", "01");	
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	public void LapBukuBesarHutang(String Period, String ac1, String ac2,  HttpServletResponse response) throws JRException, IOException {
		String temp=repoRBBA.getBukuBesarHutang(Period, ac1, ac2);
		List<ReportBukuBesarAll> RBBH= repoRBBA.findAll();
		File file = ResourceUtils.getFile("classpath:LAP_BK_BESAR_ALL.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(RBBH);		
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("pvoucher", "aaa");	
		parameters.put("phari", "01");	
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	public void LapNeracaAll(String period, String ac1, String ac2,  HttpServletResponse response) throws JRException, IOException {
		System.out.println(period+ " - "+ac1+" - "+ac2);
		String temp=repoRNAL.getNeracaAll(period, ac1, ac2);
		System.out.println(temp);
		List<ReportNeracaAll> RNAL= repoRNAL.findAll();
		File file = ResourceUtils.getFile("classpath:LAP_NERACA_ALL.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(RNAL);		
		Map<String, Object> parameters = new HashMap<>();
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	public String getTbToExcel(String period, String ac1, String ac2) {
		return repoRNAL.getTbToExcel(period, ac1, ac2);
	}
	
	public String getTbToExcelAll(String period, String ac1, String ac2) {
		return repoRNAL.getTbToExcelAll(period, ac1, ac2);
	}
	
	public void LapJurnalSupp(String Period, String voucher,  HttpServletResponse response) throws JRException, IOException {
		List<ReportJurnalSupp> JSUP= repojSUP.findByRjsuPeriodAndRjsuVoucherNoContaining(Period, voucher);
		File file = ResourceUtils.getFile("classpath:LAP_JURNAL_SUPP.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(JSUP);		
		Map<String, Object> parameters = new HashMap<>();	
		parameters.put("ptype", voucher);	
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	

}

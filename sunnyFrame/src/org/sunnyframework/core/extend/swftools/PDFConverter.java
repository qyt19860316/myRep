package org.sunnyframework.core.extend.swftools;

/**
 * PDF文档转换接口
 * @author sunyard
 *
 */
public interface PDFConverter {
	public void convert2PDF(String inputFile,String pdfFile,String extend);
	public void convert2PDF(String inputFile,String extend);

}

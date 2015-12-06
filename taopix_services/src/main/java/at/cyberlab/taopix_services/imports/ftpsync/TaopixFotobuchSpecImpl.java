package at.cyberlab.taopix_services.imports.ftpsync;

import java.util.HashMap;

/**
 * Implementiert die Properties für ein Taopix Fotobuch
 * @author gfr
 *
 */
public class TaopixFotobuchSpecImpl implements TaopixFotobuchSpec {



	private String cover2FileName;
	private String coverFileName;
	private int pageCount;
	private String pagesFileName;
	private String paperCode;
	private String paperName;
	private String productCode;
	private String productHeight;
	private String productName;
	private String productWidth;
	private int qty;

	
	public TaopixFotobuchSpecImpl() {
		super();
	}
	
	public TaopixFotobuchSpecImpl(HashMap<String, String> propertyList) {
		super();
		if (propertyList!=null&&propertyList.size()>0){
			this.setCover2FileName(propertyList.get("cover2outputfilename"));
			this.setCoverFileName(propertyList.get("cover1outputfilename"));
			this.setPageCount(Integer.parseInt(propertyList.get("pagecount")));
			this.setPagesFileName(propertyList.get("pagesoutputfilename"));
			this.setPaperCode(propertyList.get("papercode"));
			this.setPapername(propertyList.get("papername"));
			this.setProductCode(propertyList.get("productcode"));
			this.setProductHeight(propertyList.get("productheight"));
			this.setProductName(propertyList.get("productname"));
			this.setProductWidth(propertyList.get("productwidth"));
			this.setQty(Integer.parseInt(propertyList.get("qty")));
		}
	}
	
	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#getCover2FileName()
	 */
	public String getCover2FileName() {
		return cover2FileName;
	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#getCoverFileName()
	 */
	public String getCoverFileName() {
		return coverFileName;
	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#getPageCount()
	 */
	public int getPageCount() {
		return pageCount;
	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#getPagesFileName()
	 */
	public String getPagesFileName() {
		return pagesFileName;
	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#getPaperCode()
	 */
	public String getPaperCode() {
		return paperCode;
	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#getPaperName()
	 */
	public String getPaperName() {
		return paperName;
	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#getProductCode()
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#getProductHeight()
	 */
	public String getProductHeight() {
		return productHeight;
	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#getProductName()
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#getProductWidth()
	 */
	public String getProductWidth() {
		return productWidth;
	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#getQty()
	 */
	public int getQty() {
		return qty;
	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#setCover2FileName(java.lang.String)
	 */
	public void setCover2FileName(String filename) {
		this.cover2FileName=filename;

	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#setCoverFileName(java.lang.String)
	 */
	public void setCoverFileName(String filename) {
		this.coverFileName=filename;

	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#setPageCount(int)
	 */
	public void setPageCount(int pagecount) {
		this.pageCount=pagecount;

	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#setPagesFileName(java.lang.String)
	 */
	public void setPagesFileName(String filename) {
		this.pagesFileName=filename;

	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#setPaperCode(java.lang.String)
	 */
	public void setPaperCode(String papercode) {
		this.paperCode=papercode;

	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#setPapername(java.lang.String)
	 */
	public void setPapername(String papername) {
		this.productName=papername;

	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#setProductCode(java.lang.String)
	 */
	public void setProductCode(String productcode) {
		this.productCode=productcode;

	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#setProductHeight(java.lang.String)
	 */
	public void setProductHeight(String productheight) {
		this.productHeight=productheight;

	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#setProductName(java.lang.String)
	 */
	public void setProductName(String productname) {
		this.productName=productname;

	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#setProductWidth(java.lang.String)
	 */
	public void setProductWidth(String productwidth) {
		this.productWidth=productwidth;

	}

	/**
	 * @see com.tomagency.cyberlab.server.imports.TaopixFotobuchSpec#setQty(int)
	 */
	public void setQty(int qty) {
		this.qty=qty;

	}

}

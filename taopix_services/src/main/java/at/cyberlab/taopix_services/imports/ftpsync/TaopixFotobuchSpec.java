package at.cyberlab.taopix_services.imports.ftpsync;

/**
 * Beschreibt die Properties eines Taopix Fotobuchs
 * @author gfr
 *
 */
public interface TaopixFotobuchSpec {
	
	public String getProductCode();
	public void setProductCode(String productcode);
	public String getProductName();
	public void setProductName(String productname);
	public String getProductHeight();
	public void setProductHeight(String productheight);
	public String getProductWidth();
	public void setProductWidth(String productwidth);
	public String getPaperCode();
	public void setPaperCode(String papercode);
	public String getPaperName();
	public void setPapername(String papername);
	public int getQty();
	public void setQty(int qty);
	public int getPageCount();
	public void setPageCount(int pagecount);
	public String getPagesFileName();
	public void setPagesFileName(String filename);
	public String getCoverFileName();
	public void setCoverFileName(String filename);
	public String getCover2FileName();
	public void setCover2FileName(String filename);
	

}

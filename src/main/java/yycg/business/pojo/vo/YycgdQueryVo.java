package yycg.business.pojo.vo;

import java.util.List;

import yycg.base.pojo.po.Usergys;
import yycg.base.pojo.po.Useryy;
import yycg.base.pojo.vo.PageQuery;

public class YycgdQueryVo {

	// 接收页面批量参数
	private List<YycgdmxCustom> yycgdmxCustoms;
	
	//采购单批量信息
	private List<YycgdCustom> yycgdCustoms;
	//入库信息
	private List<YycgdrkCustom> yycgdrkCustoms;

	private String businessyear;// 年份

	private PageQuery pageQuery;// 分页参数

	private Useryy useryy;// 医院信息
	private Usergys usergys;//供货商信息
	private YycgdCustom yycgdCustom;// 采购单基本信息
	private YycgdmxCustom yycgdmxCustom;// 采购单明细
	private YpxxCustom ypxxCustom;// 药品信息

	private GysypmlCustom gysypmlCustom;// 供货商药品目录

	public YycgdCustom getYycgdCustom() {
		return yycgdCustom;
	}

	public void setYycgdCustom(YycgdCustom yycgdCustom) {
		this.yycgdCustom = yycgdCustom;
	}

	public String getBusinessyear() {
		return businessyear;
	}

	public void setBusinessyear(String businessyear) {
		this.businessyear = businessyear;
	}

	public YycgdmxCustom getYycgdmxCustom() {
		return yycgdmxCustom;
	}

	public void setYycgdmxCustom(YycgdmxCustom yycgdmxCustom) {
		this.yycgdmxCustom = yycgdmxCustom;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public YpxxCustom getYpxxCustom() {
		return ypxxCustom;
	}

	public void setYpxxCustom(YpxxCustom ypxxCustom) {
		this.ypxxCustom = ypxxCustom;
	}

	public GysypmlCustom getGysypmlCustom() {
		return gysypmlCustom;
	}

	public void setGysypmlCustom(GysypmlCustom gysypmlCustom) {
		this.gysypmlCustom = gysypmlCustom;
	}

	public Useryy getUseryy() {
		return useryy;
	}

	public void setUseryy(Useryy useryy) {
		this.useryy = useryy;
	}

	public List<YycgdmxCustom> getYycgdmxCustoms() {
		return yycgdmxCustoms;
	}

	public void setYycgdmxCustoms(List<YycgdmxCustom> yycgdmxCustoms) {
		this.yycgdmxCustoms = yycgdmxCustoms;
	}

	public List<YycgdCustom> getYycgdCustoms() {
		return yycgdCustoms;
	}

	public void setYycgdCustoms(List<YycgdCustom> yycgdCustoms) {
		this.yycgdCustoms = yycgdCustoms;
	}

	public List<YycgdrkCustom> getYycgdrkCustoms() {
		return yycgdrkCustoms;
	}

	public void setYycgdrkCustoms(List<YycgdrkCustom> yycgdrkCustoms) {
		this.yycgdrkCustoms = yycgdrkCustoms;
	}

	public Usergys getUsergys() {
		return usergys;
	}

	public void setUsergys(Usergys usergys) {
		this.usergys = usergys;
	}

}

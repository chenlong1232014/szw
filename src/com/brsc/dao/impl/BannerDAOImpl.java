/**
 * 
 */
package com.brsc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.brsc.dao.BannerDAOI;
import com.brsc.po.BannerPO;
import com.brsc.po.wrapper.BannerPOWrapper;
import com.brsc.po.wrapper.POWrapper;
import com.brsc.util.DBUtil;

/**
 * 栏目数据库访问对象接口实现类
 * @author Administrator
 *
 */
public class BannerDAOImpl implements BannerDAOI {


	@Override
	public boolean addObj(BannerPO obj) {
		String sql ="insert into banner values(?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(obj.getId());
		params.add(obj.getName());
		params.add(obj.getMemo());
	
		return DBUtil.cud(sql,params);
	}


	@Override
	public boolean delObj(Integer id) {
		String sql = "delete from banner where id = ?";
		List<Object> params = new ArrayList<Object>();
		params.add(id);

		return DBUtil.cud(sql,params);
	}


	@Override
	public boolean uptObj(BannerPO obj) {
		String sql = "update banner set name = ? , memo = ?  where id = ?";
		List<Object> params = new ArrayList<Object>();
		
		params.add(obj.getName());
		params.add(obj.getMemo());
		params.add(obj.getId());

		return DBUtil.cud(sql,params);
	}

	@Override
	public BannerPO getObjById(Integer id) {
		String sql = "select *from banner where id = ?";
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		POWrapper wrapper = new BannerPOWrapper();
		List<Object> objects = DBUtil.getAllObjects(sql, params,wrapper);
		List<BannerPO> BannerPOs = obj2banner(objects);
		return BannerPOs.size()>0?BannerPOs.get(0):null;
	}

	@Override
	public List<BannerPO> getObjs() {
		String sql = "select * from banner";
		POWrapper wrapper = new BannerPOWrapper();
		List<Object> objects = DBUtil.getAllObjects(sql,null,wrapper);
		List<BannerPO> bannerPOs = obj2banner(objects);
		return  bannerPOs;
	}
	/**
	 * Object对象转BannerPO对象
	 * @param objects Object对象
	 * @return BannerPO对象集合
	 */
	private List<BannerPO> obj2banner(List<Object> objects) {
		List<BannerPO> bannerPOs = new ArrayList<BannerPO>();

		for(Object obj:objects){
			bannerPOs.add((BannerPO)obj);
		}		
		return bannerPOs;
	}

}

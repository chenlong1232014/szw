/**
 * 
 */
package com.brsc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.brsc.dao.NewsDAOI;
import com.brsc.po.NewsPO;
import com.brsc.po.wrapper.NewsPOWrapper;
import com.brsc.po.wrapper.POWrapper;
import com.brsc.util.DBUtil;

/**
 * 新闻数据库访问对象接口实现类
 * @author Administrator
 *
 */
public class NewsDAOImpl implements NewsDAOI {

	@Override
	public boolean addObj(NewsPO obj) {
		String sql ="insert into news values(?,?,?,?,?,?,?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(obj.getId());
		params.add(obj.getTitle());
		params.add(obj.getContent());
		params.add(obj.getDisplayDate());
		params.add(obj.getIssuedDate());
		params.add(obj.getBanner_id());
		params.add(obj.getSmallPicUrl());
		params.add(obj.getBigPicUrl());
		params.add(obj.getAuthor());
		params.add(obj.getClickNum());
	
		return DBUtil.cud(sql,params);
	}

	@Override
	public boolean delObj(Integer id) {
		String sql = "delete from news where id = ?";
		List<Object> params = new ArrayList<Object>();
		params.add(id);

		return DBUtil.cud(sql,params);
	}

	@Override
	public boolean uptObj(NewsPO obj) {
		String sql = "update news set title = ? ,content = ?,displayDate = ?,issuedDate = ?,banner_id = ? ,smallPicUrl = ?,bigPicUrl = ?,author = ? , clickNum = ? where id = ?";
		List<Object> params = new ArrayList<Object>();
		
		params.add(obj.getTitle());
		params.add(obj.getContent());
		params.add(obj.getDisplayDate());
		params.add(obj.getIssuedDate());
		params.add(obj.getBanner_id());
		params.add(obj.getSmallPicUrl());
		params.add(obj.getBigPicUrl());
		params.add(obj.getAuthor());
		params.add(obj.getClickNum());
		params.add(obj.getId());

		return DBUtil.cud(sql,params);
	}

	@Override
	public NewsPO getObjById(Integer id) {
		String sql = "select *from news where id = ?";
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		POWrapper wrapper = new NewsPOWrapper();
		List<Object> objects = DBUtil.getAllObjects(sql, params,wrapper);
		List<NewsPO> newsPOs = obj2news(objects);
		return newsPOs.size()>0?newsPOs.get(0):null;
	}
	@Override
	public List<NewsPO> getObjs() {
		String sql = "select *from news order by issuedDate desc";
		POWrapper wrapper = new NewsPOWrapper();
		List<Object> objects = DBUtil.getAllObjects(sql, null,wrapper);
		List<NewsPO> newsPOs = obj2news(objects);
		return  newsPOs;
	}

	@Override
	public List<NewsPO> getNewsByBannerId(Integer bid) {
		String sql = "select *from news where banner_id = ? order by issuedDate desc";
		List<Object> params = new ArrayList<Object>();
		params.add(bid);
		POWrapper wrapper = new NewsPOWrapper();
		List<Object> objects = DBUtil.getAllObjects(sql, params,wrapper);
		List<NewsPO> newsPOs = obj2news(objects);
		return  newsPOs;
	}
	/**
	 * Object集合转NewsPO集合
	 * @param objects Object集合
	 * @return NewsPO集合
	 */
	private List<NewsPO> obj2news(List<Object> objects) {
		List<NewsPO> newsPOs = new ArrayList<NewsPO>();

		for(Object obj:objects){
			newsPOs.add((NewsPO)obj);
		}		
		return newsPOs;
	}
}

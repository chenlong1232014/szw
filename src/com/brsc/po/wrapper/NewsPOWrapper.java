/**
 * 
 */
package com.brsc.po.wrapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.brsc.po.NewsPO;

/**
 * 新闻包装类
 * @author Administrator
 *
 */
public class NewsPOWrapper implements POWrapper {


	@Override
	public List<Object> wrap(ResultSet rs) {
		NewsPO newsPO = null;
		List<Object> newsPOs = new ArrayList<Object>();
		try {
			while (rs.next()) {
				newsPO = new NewsPO();
				newsPO.setId(rs.getInt("id"));
				newsPO.setTitle(rs.getString("title"));
				newsPO.setContent(rs.getString("content"));
				newsPO.setDisplayDate(rs.getDate("displayDate"));
				newsPO.setIssuedDate(rs.getDate("issuedDate"));
				newsPO.setBanner_id(rs.getInt("banner_id"));
				newsPO.setSmallPicUrl(rs.getString("smallPicUrl"));
				newsPO.setBigPicUrl(rs.getString("bigPicUrl"));
				newsPO.setAuthor(rs.getString("author"));
				newsPO.setClickNum(rs.getInt("clickNum"));
				
				newsPOs.add(newsPO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return newsPOs;	
	}

}

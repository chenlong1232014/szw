/**
 * 
 */
package com.brsc.po.wrapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.brsc.po.BannerPO;

/**
 * 栏目包装类
 * @author Administrator
 *
 */
public class BannerPOWrapper implements POWrapper {

	@Override
	public List<Object> wrap(ResultSet rs) {
		
		BannerPO bannerPO = null;
		List<Object> bannerPOs = new ArrayList<Object>();
		try {
			while (rs.next()) {
				bannerPO = new BannerPO();
				bannerPO.setId(rs.getInt("id"));
				bannerPO.setName(rs.getString("name"));
				bannerPO.setMemo(rs.getString("memo"));
				
				bannerPOs.add(bannerPO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return bannerPOs;
	}

}

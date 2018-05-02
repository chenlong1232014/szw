/**
 * 
 */
package com.brsc.util;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import com.brsc.po.wrapper.POWrapper;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author Administrator
 * 
 */
public final class DBUtil {

	/** c3p0数据源对象 */
	private static ComboPooledDataSource dataSource;
	/** 静态块初始化数据源对象 */
	static {
		dataSource = new ComboPooledDataSource();
		// 加载配置文件信息
		ResourceBundle bundle = ResourceBundle.getBundle("config/db/db");
		String dataBaseFile = bundle.getString("databasefile");
		bundle = ResourceBundle.getBundle("config/db/" + dataBaseFile);
		// 设置数据源对象属性
		try {
			dataSource.setDriverClass(bundle.getString("db.driver"));
			dataSource.setJdbcUrl(bundle.getString("db.url"));
			dataSource.setUser(bundle.getString("db.user"));
			dataSource.setPassword(bundle.getString("db.password"));
			dataSource.setMaxPoolSize(30);
			dataSource.setMinPoolSize(10);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 私有构造函数防止类被实例化
	 */
	private DBUtil() {

	}

	/**
	 * 从连接池获取数据库连接对象
	 * 
	 * @return 连接对象
	 */
	public static Connection getConnection() {
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 关闭数据库
	 * 
	 * @param conn
	 *            数据库连接对象
	 * @param pstat
	 *            预处理对象
	 * @param rs
	 *            结果集对象
	 */
	public static void close(Connection conn, PreparedStatement pstat,
			ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (pstat != null)
				pstat.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 数据库增删改操作
	 * 
	 * @param sql
	 *            sql语句
	 * @param params
	 *            sql中问号参数
	 * @return 是否操作成功
	 */
	public static boolean cud(String sql, List<Object> params) {
		Connection conn = null;
		PreparedStatement pstat = null;

		boolean flag = false;

		try {
			// 获取连接对象
			conn = dataSource.getConnection();

			// 获取语句对象
			pstat = conn.prepareStatement(sql);

			// 设置参数
			if (params != null)
				for (int idx = 0; idx < params.size(); idx++)
					pstat.setObject(idx + 1, params.get(idx));

			int result = pstat.executeUpdate();
			if (result > 0) {
				flag = true;
				System.out.println("执行完成");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstat, null);
		}
		return flag;
	}

	/**
	 * 获取数据库所有对象
	 * 
	 * @param sql
	 *            查询语句
	 * @param params
	 *            查询条件参数
	 * @param wrapper
	 *            对象包装类
	 * @return 对象List集合
	 */
	public static List<Object> getAllObjects(String sql, List<Object> params,
			POWrapper wrapper) {
		Connection conn = null;
		PreparedStatement pstat = null;
		ResultSet rs = null;
		List<Object> objects = null;

		try {
			// 获取连接对象
			conn = dataSource.getConnection();
			// 获取语句对象
			pstat = conn.prepareStatement(sql);

			if (params != null)
				for (int idx = 0; idx < params.size(); idx++)
					pstat.setObject(idx + 1, params.get(idx));
			rs = pstat.executeQuery();

			objects = wrapper.wrap(rs);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstat, rs);
		}
		return objects;
	}
}

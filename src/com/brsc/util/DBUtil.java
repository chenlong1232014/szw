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

	/** c3p0����Դ���� */
	private static ComboPooledDataSource dataSource;
	/** ��̬���ʼ������Դ���� */
	static {
		dataSource = new ComboPooledDataSource();
		// ���������ļ���Ϣ
		ResourceBundle bundle = ResourceBundle.getBundle("config/db/db");
		String dataBaseFile = bundle.getString("databasefile");
		bundle = ResourceBundle.getBundle("config/db/" + dataBaseFile);
		// ��������Դ��������
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
	 * ˽�й��캯����ֹ�౻ʵ����
	 */
	private DBUtil() {

	}

	/**
	 * �����ӳػ�ȡ���ݿ����Ӷ���
	 * 
	 * @return ���Ӷ���
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
	 * �ر����ݿ�
	 * 
	 * @param conn
	 *            ���ݿ����Ӷ���
	 * @param pstat
	 *            Ԥ�������
	 * @param rs
	 *            ���������
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
	 * ���ݿ���ɾ�Ĳ���
	 * 
	 * @param sql
	 *            sql���
	 * @param params
	 *            sql���ʺŲ���
	 * @return �Ƿ�����ɹ�
	 */
	public static boolean cud(String sql, List<Object> params) {
		Connection conn = null;
		PreparedStatement pstat = null;

		boolean flag = false;

		try {
			// ��ȡ���Ӷ���
			conn = dataSource.getConnection();

			// ��ȡ������
			pstat = conn.prepareStatement(sql);

			// ���ò���
			if (params != null)
				for (int idx = 0; idx < params.size(); idx++)
					pstat.setObject(idx + 1, params.get(idx));

			int result = pstat.executeUpdate();
			if (result > 0) {
				flag = true;
				System.out.println("ִ�����");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstat, null);
		}
		return flag;
	}

	/**
	 * ��ȡ���ݿ����ж���
	 * 
	 * @param sql
	 *            ��ѯ���
	 * @param params
	 *            ��ѯ��������
	 * @param wrapper
	 *            �����װ��
	 * @return ����List����
	 */
	public static List<Object> getAllObjects(String sql, List<Object> params,
			POWrapper wrapper) {
		Connection conn = null;
		PreparedStatement pstat = null;
		ResultSet rs = null;
		List<Object> objects = null;

		try {
			// ��ȡ���Ӷ���
			conn = dataSource.getConnection();
			// ��ȡ������
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

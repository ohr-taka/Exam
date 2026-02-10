package dao;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Dao {
		
	//DataSource ds
	static DataSource ds;
	
	
	//getConnection()
	public Connection getConnection() throws Exception{
		
		if(ds == null) {
			//InitialContextを初期化
			InitialContext ic = new InitialContext();
			//データベースへ接続
			ds = (DataSource) ic.lookup("java:/comp/env/jdbc/exam");
		}

		//データベースへのコネクション返却
		return ds.getConnection();
	}

}

package projetoBancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {

	private String url;
	private String usuario;
	private String senha;
	private static Connection con;

	protected Conexao() {
		this.url = "jdbc:postgresql://localhost:5432/projetoDois";
		this.usuario = "postgres";
		this.senha = "@456789456789!";

		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão Realizada com Sucesso!!!");
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected int executaSQL(String sql) {

		try {
			Statement stm = con.createStatement();
			int res = stm.executeUpdate(sql);
			return res;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	protected ResultSet executaBusca(String sql) {

		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			return rs;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	protected void fecharConexao() {
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

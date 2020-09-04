package projetoBancoDeDados;

import java.sql.ResultSet;

public class Main {

	public static void main(String[] args) {
		
		Conexao con = new Conexao();
		SQL sql = new SQL();
		ResultSet rs = con.executaBusca(sql.consultarVisao());
		//rs = con.executaBusca(sql.consultaComNULL());
		
		try {
			//con.executaSQL(sql.criaVisao());
			//con.executaSQL(sql.criaVisaoDois());
			//con.executaSQL(sql.criaVisaoTres());
			//con.executaSQL(sql.deletaVisao());
			//while (rs.next()) {
			//	String nome = rs.getString("nome");
				
			//	System.out.println("Nome: " + nome);
			//}
			//con.executaSQL(sql.inserirNaVisao());
			//con.executaSQL(sql.atualizarVisao());
			//con.executaSQL(sql.inserirSQLPersonalizado());
			//con.executaSQL(sql.deletarDaVisao());
			//while (rs.next()) {
			//	String nome = rs.getString("nome");
				
			//	System.out.println("Nome(s): " + nome);
			//}
			
			
			con.fecharConexao();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

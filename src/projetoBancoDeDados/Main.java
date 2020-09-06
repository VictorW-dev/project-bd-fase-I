package projetoBancoDeDados;

import java.sql.ResultSet;

public class Main {

	public static void main(String[] args) {
		
		Conexao con = new Conexao();
		SQL sql = new SQL();
		ResultSet rs; 
		//rs = con.executaBusca(sql.consultarVisao());
		//rs = con.executaBusca(sql.consultaComNULL());
		//rs = con.executaBusca(sql.consultaAninhadaIN());
		//rs = con.executaBusca(sql.consultaAninhadaExists());
		//rs = con.executaBusca(sql.consultaOperadoresConjunto());
		//rs = con.executaBusca(sql.consultaQuantificadores());
		//rs = con.executaBusca(sql.consultaCase());
		rs = con.executaBusca(sql.consultaWith());
		
		try {
			//con.executaSQL(sql.criaVisao());
			//con.executaSQL(sql.criaVisaoDois());
			//con.executaSQL(sql.criaVisaoTres());
			//con.executaSQL(sql.deletaVisao());
			
			// CONSULTAR VISÃO
			
			//while (rs.next()) {
			//	String nome = rs.getString("nome");
				
			//	System.out.println("Nome: " + nome);
			//}
			
			//con.executaSQL(sql.inserirNaVisao());
			
			//con.executaSQL(sql.atualizarVisao());
			
			//con.executaSQL(sql.inserirSQLPersonalizado());
			
			//con.executaSQL(sql.deletarDaVisao());
			
			// CONSULTA COM NULL
			
			//while (rs.next()) {
			//	String nome = rs.getString("nome");
				
			//	System.out.println("Nome(s): " + nome);
			//}
			
			// CONSULTA ANINHANDA IN
			
			//while (rs.next()) {
			//	String nome = rs.getString("nome");
			//	String cpf = rs.getString("cpf");
				
			//	System.out.println("Nome: " + nome);
			//	System.out.println("CPF: " + cpf);
			//}
			
			// CONSULTA ANINHADA EXISTS
			
			//while (rs.next()) {
			//	String nome = rs.getString("nome");
				
			//	System.out.println("Nome: " + nome);
			//}
			
			// CONSULTA COM OPERADORES DE CONJUNTO
			
			//while (rs.next()) {
			//	String nome = rs.getString("nome");
			//	String cpf = rs.getString("cpf");
				
			//	System.out.println("Nome: " + nome);
			//	System.out.println("CPF: " + cpf + "\n");
			//}
			
			// CONSULTA COM QUANTIFICADORES
			
			//while (rs.next()) {
			//	String nome = rs.getString("nome");
			//	String cpf = rs.getString("cpf");
					
			//	System.out.println("Nome: " + nome);
			//	System.out.println("CPF: " + cpf + "\n");
			//}
			
			// CONSULTA COM CASE
			
			//while (rs.next()) {
			//	String nome = rs.getString("nome");
			//	String depart = rs.getString("case");
			//	String cpf = rs.getString("cpf");
			 // java.math.BigDecimal salario = rs.getBigDecimal("salario");
					
			//	System.out.println("Departamento: " + depart + " - Nome: " + nome + " | CPF: " + cpf);
			//	System.out.println("Salário: R$ " + salario + "\n");

			//}
			
			// CONSULTA COM WITH
			
			while (rs.next()) {
				String nome = rs.getString("nome");
				String cpf = rs.getString("cpf");
				char sexo = rs.getString("sexo").charAt(0);
				java.math.BigDecimal salario = rs.getBigDecimal("salario");
				
				System.out.println("Nome: " + nome + " - Sexo: " + sexo + " | CPF: " + cpf);
				System.out.println("Salário: R$ " + salario + "\n");
			}
			
			
			rs.close();
			con.fecharConexao();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

package projetoBancoDeDados;

import java.util.Scanner;

public class SQL {
	
	protected String criaVisao() { 
		try {
			System.out.println("Visão criada com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "CREATE VIEW InfoDepto AS SELECT D.nome,  COUNT(*) " + 
			"FROM  Departamento  d, Funcionario  f " + 
			"WHERE d.id = f.id_departamento GROUP  BY d.nome";
	}
	
	protected String criaVisaoDois() { 
		try {
			System.out.println("Visão criada com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "CREATE VIEW InfoDeptoSalario AS SELECT D.nome,  COUNT(*), SUM(salario) " + 
				"FROM  Departamento  d, Funcionario  f " + 
				"WHERE d.id = f.id_departamento GROUP  BY d.nome";
	}
	
	protected String criaVisaoTres() { 
		try {
			System.out.println("Visão criada com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "CREATE VIEW InfoProj AS SELECT * " + 
			"FROM  Projeto " + 
			"WHERE id_departamento = 1";
	}
	
	protected String deletaVisao() {
		try {
			System.out.println("Visão deletada com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "DROP VIEW InfoDeptoSalario";
	}
	
	protected String consultarVisao() {
		return "SELECT nome FROM InfoDepto WHERE COUNT >= 7 ";
	}
	
	protected String atualizarVisao() {
		try {
			System.out.println("Visão atualiazda com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "UPDATE InfoProj SET id_departamento = 2 "
				+ "WHERE nome = 'Campanha Mídias Sociais'";
	}
	
	protected String inserirSQLPersonalizado() {
		Scanner sc = new Scanner(System.in);
		String sql = "";
		try {
			System.out.println("Digite o comando SQL desejado: ");
			sql = sc.nextLine();
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sql;
	}
	
	protected String inserirNaVisao() {
		try {
			System.out.println("Visão atualiazda com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "INSERT INTO InfoProj VALUES (4, 'Campanha Mídias Sociais', 1)";
	}
	
	protected String deletarDaVisao() {
		try {
			System.out.println("Visão atualiazda com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "DELETE FROM InfoProj WHERE nome = 'Produto B'";
	}
	
	protected String consultaComNULL() {
		return "SELECT Nome FROM Funcionario WHERE id_departamento IS NULL";
	}
	
}

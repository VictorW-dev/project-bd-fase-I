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
	
	protected String consultaAninhadaIN() {
		return "SELECT f.nome, f.cpf FROM funcionario f "
				+ "WHERE f.cpf  in "
				+ "(SELECT cpf_funcionario FROM dependente "
				+ "WHERE  cpf_funcionario  = f.cpf And "
				+ "sexo = 'M')";
	}
	
	protected String consultaAninhadaExists() {
		return "SELECT f.nome FROM funcionario f "
				+ "WHERE EXISTS (SELECT nome FROM dependente "
				+ "WHERE f.cpf  = cpf_funcionario and sexo = 'F' GROUP BY nome)";
	}
	
	protected String consultaOperadoresConjunto() {
		return "SELECT nome, cpf FROM funcionario f "
				+ "WHERE  NOT EXISTS (( SELECT id FROM departamento "
				+ "WHERE cpf_gerente = '33344555587') "
				+ "EXCEPT ( SELECT id FROM departamento d "
				+ "WHERE d.cpf_gerente = '33344555587'))";
	}
	
	protected String consultaQuantificadores() {
		return "SELECT nome, cpf FROM funcionario "
				+ "WHERE salario < ANY "
				+ "(SELECT salario FROM funcionario)";
	}
	
	protected String consultaWith() {
		return "With CTE AS " + 
				"(Select " + 
				"nome, cpf, sexo, salario " + 
				"FROM Funcionario ) " + 
				"Select * From CTE";
	}
	
	protected String consultaCase() {
		return "SELECT nome, "
				+ "CASE "
				+ "WHEN id_departamento = 1 THEN 'Desenvolvimento' "
				+ "WHEN id_departamento = 2 THEN 'Marketing' "
				+ "WHEN id_departamento IS NULL THEN 'Sem Departamento' "
				+ "END, cpf, salario "
				+ "FROM Funcionario";
	}
	
}

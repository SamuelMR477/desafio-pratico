package dao;

import java.sql.PreparedStatement;
import conexao.Conexao;
import entify.Aluno;

public class AlunoDAO {
    
    public void cadastrarAluno (Aluno aluno){

        String sql = "insert into aluno(nome, idade, nota_primeiro_semestre, nota_segundo_semestre, nome_professor, numero_sala) values (?, ?, ?, ?, ?, ?);";

        PreparedStatement ps = null;

        try {

            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setInt(2, aluno.getIdade());
            ps.setFloat(3, aluno.getNota_primeiro_semestre());
            ps.setFloat(4, aluno.getNota_segundo_semestre());
            ps.setString(5, aluno.getNome_professor());
            ps.setInt(6, aluno.getNumero_sala());

            ps.execute();
            ps.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    
    }

    public void deletarAluno(Aluno aluno){

        String sql = "DELETE FROM aluno WHERE id=(?)";

        PreparedStatement ps = null;
        
        try {
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, aluno.getID());

            ps.execute();
            ps.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizarDados(Aluno aluno){
        
        String sql = "UPDATE aluno SET nome=(?), idade=(?), nota_primeiro_semestre=(?), nota_segundo_semestre=(?), nome_professor=(?), numero_sala=(?) WHERE id=(?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(7, aluno.getID());
            ps.setString(1, aluno.getNome());
            ps.setInt(2, aluno.getIdade());
            ps.setFloat(3, aluno.getNota_primeiro_semestre());
            ps.setFloat(4, aluno.getNota_segundo_semestre());
            ps.setString(5, aluno.getNome_professor());
            ps.setInt(6, aluno.getNumero_sala());

            ps.execute();
            ps.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

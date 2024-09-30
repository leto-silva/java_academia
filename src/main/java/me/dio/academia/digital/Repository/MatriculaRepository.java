package me.dio.academia.digital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import me.dio.academia.digital.entity.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{
	
	//List<Matricula> findByAlunoBairro(String bairro);
	//@Query("FROm matricula m where m.aluno.bairro = :bairro ")
	
	@Query( value = "Select m.* From tb_matriculas m " +
			"Inner Join tb_alunos a ON m.aluno_id = a.id " +
			"Where a.bairro = :bairro", nativeQuery = true)
	List<Matricula> findAlunosMatriculadosBairro(String bairro);

}

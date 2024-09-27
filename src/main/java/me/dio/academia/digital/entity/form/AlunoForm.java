package me.dio.academia.digital.entity.form;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {
   //
   @NotEmpty(message = "Preencha o campo corretamente.")
   @Size(min =3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
   private String nome;
   
   @NotEmpty(message = "Preencha o campo corretamente.")
   @CPF(message = "'$(validateValue' é inválido!")
   private String cpf;
   
   @NotEmpty(message = "Preencha o campo corretamente.")
   @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
   private String bairro;

   @NotNull(message = "Prencha o campo corretamente.")
   @Past(message = "Data '${validatedValue}' é inválida.")
   private LocalDate dataDeNascimento;

}

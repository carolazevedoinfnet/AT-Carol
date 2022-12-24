package br.com.infnet.atprofessor.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.infnet.atprofessor.entities.Aluno;


@Component
@FeignClient(name = "at-aluno", path = "/alunos")


public interface AlunoFeignClient {
	
	@GetMapping(value = "/{id}")
	ResponseEntity<Aluno> findById(@PathVariable Long id);

}
  
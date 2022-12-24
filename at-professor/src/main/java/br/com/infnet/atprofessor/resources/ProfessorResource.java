package br.com.infnet.atprofessor.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import br.com.infnet.atprofessor.entities.Professor;
import br.com.infnet.atprofessor.services.ProfessorService;

@RestController
@RequestMapping (value = "/professores")

public class ProfessorResource {
	
	@Autowired
	private ProfessorService service;
	
	@HystrixCommand(fallbackMethod = "getProfessorAlternative")
	
	@GetMapping(value = "/{alunoId}/nota/{nota}")
	public ResponseEntity<Professor> getProfessor(@PathVariable Long alunoId, @PathVariable Integer nota) {
		Professor professor = service.getProfessor(alunoId, nota);
		return ResponseEntity.ok(professor);
	}
	
	public ResponseEntity<Professor> getProfessorAlternative(Long alunoId, Integer nota) {
		Professor professor = new Professor("Carolina", "Microserviços","AT", 7);
 		return ResponseEntity.ok(professor);
 	}

}
 
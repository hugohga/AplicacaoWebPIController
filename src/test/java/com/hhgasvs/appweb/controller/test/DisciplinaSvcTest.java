package com.hhgasvs.appweb.controller.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.hhgasvs.appweb.disciplina.controller.Disciplina;
import com.hhgasvs.appweb.disciplina.controller.Disciplina;
import com.hhgasvs.appweb.disciplina.controller.DisciplinaSvc;


public class DisciplinaSvcTest {
	
	private DisciplinaSvc disciplinaService = new DisciplinaSvc();

	@Test
	public void testDisciplinaAddAndList() throws Exception {
		String nome = "PI";
		String codigo = "EEL24";
		String professor = "CAZE";
		String sala = "H208";
		String horario[] = {"SEG 8-10","QUA 8-10"};
		String curso = "ENGENHARIA ELETRONICA";
		Disciplina disciplina = new Disciplina(nome, codigo, professor, sala, horario, curso);

		boolean ok = disciplinaService.addDisciplina(disciplina);
		assertTrue(ok);
		
		List<Disciplina> disciplinas = disciplinaService.getDisciplinaList();
		assertTrue(disciplinas.contains(disciplina));
	}

}

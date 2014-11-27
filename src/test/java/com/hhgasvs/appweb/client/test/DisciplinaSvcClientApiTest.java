package com.hhgasvs.appweb.client.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import com.hhgasvs.appweb.disciplina.client.DisciplinaSvcApi;
import com.hhgasvs.appweb.disciplina.controller.Disciplina;

import retrofit.RestAdapter;
import retrofit.RestAdapter.LogLevel;


public class DisciplinaSvcClientApiTest {

	private final String TEST_URL = "http://54.69.181.220:8080/webpi-controller-1.0";

	private DisciplinaSvcApi disciplinaService = new RestAdapter.Builder()
			.setEndpoint(TEST_URL)
			.setLogLevel(LogLevel.FULL)
			.build()
			.create(DisciplinaSvcApi.class);

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

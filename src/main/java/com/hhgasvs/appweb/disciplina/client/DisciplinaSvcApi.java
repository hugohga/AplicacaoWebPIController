package com.hhgasvs.appweb.disciplina.client;

import java.util.List;

import com.hhgasvs.appweb.disciplina.controller.Disciplina;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;

public interface DisciplinaSvcApi {
	
	public static final String DISCIPLINA_SVC_PATH = "/disciplina";

	@GET(DISCIPLINA_SVC_PATH)
	public List<Disciplina> getDisciplinaList();
	
	@POST(DISCIPLINA_SVC_PATH)
	public boolean addDisciplina(@Body Disciplina d);
	
}
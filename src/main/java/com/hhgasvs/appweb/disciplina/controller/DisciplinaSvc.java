package com.hhgasvs.appweb.disciplina.controller;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.hhgasvs.appweb.disciplina.client.DisciplinaSvcApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DisciplinaSvc implements DisciplinaSvcApi {
	
	private List<Disciplina> disciplinas = new CopyOnWriteArrayList<Disciplina>();

	@RequestMapping(value=DISCIPLINA_SVC_PATH, method=RequestMethod.POST)
	public @ResponseBody boolean addDisciplina(@RequestBody Disciplina d){
		return disciplinas.add(d);
	}
	
	@RequestMapping(value=DISCIPLINA_SVC_PATH, method=RequestMethod.GET)
	public @ResponseBody List<Disciplina> getDisciplinaList(){
		return disciplinas;
	}

}

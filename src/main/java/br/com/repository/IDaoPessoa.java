package br.com.repository;

import java.util.Date;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.entidades.Estados;
import br.com.entidades.Pessoa;

public interface IDaoPessoa {

	Pessoa consultarUsuario(String login, String senha);
		
	List<SelectItem> listaEstados();

	List<Pessoa> relatorioPessoa(String nome, Date dataIni, Date dataFim);
	
}

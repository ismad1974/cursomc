package com.nelioalves.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1= new Categoria(1,"Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		Categoria cat3 = new Categoria(3, "Limpeza");
		Categoria cat4 = new Categoria(4, "Laticínio");
		Categoria cat5 = new Categoria(5, "Frios");
		Categoria cat6 = new Categoria(6, "Açougue");
		Categoria cat7 = new Categoria(7, "Pães e Biscoito");
		Categoria cat8 = new Categoria(8, "Utensílios Doméstico");
		
		List<Categoria> list = new ArrayList<>();
		list.add(cat1);
		list.add(cat2);
		list.add(cat3);
		list.add(cat4);
		list.add(cat5);
		list.add(cat6);
		list.add(cat7);
		list.add(cat8);
		
		
		return list;
	}

}

package org.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springmvc.daos.ProdutoDAO;
import org.springmvc.models.Produto;

@Controller
public class ProdutosController {

	@Autowired
	private ProdutoDAO produtoDAO;
	
	@RequestMapping("produtos/form")
	public String form() {
		return "produtos/form";
	}
	
	@RequestMapping("/produtos")
	public String gravar(Produto produto) {
		produtoDAO.gravar(produto);
		return  "/produtos/ok";
	}
	
}

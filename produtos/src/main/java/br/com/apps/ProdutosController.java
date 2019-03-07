package br.com.apps;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("v1/produtos")
public class ProdutosController {
	
	@GetMapping
	public List<String> getTodos() {
		return Stream.of("Produto 01","Produto 02","Produto 03","Produto 04").collect(Collectors.toList());
	}

}

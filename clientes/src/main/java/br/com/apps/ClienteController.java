package br.com.apps;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("v1/clientes")
public class ClienteController {
	
	@GetMapping
	public List<String> getTodos() {
		return Stream.of("Cliente 01","Cliente 02","Cliente 03","Cliente 04", "Cliente 05").collect(Collectors.toList());
	}

}

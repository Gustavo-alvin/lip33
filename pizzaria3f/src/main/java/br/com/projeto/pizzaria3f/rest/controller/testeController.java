package br.com.projeto.pizzaria3f.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class testeController {

	@GetMapping("test")
	public String getTest() {
		return "Hello Wolrd";
	}

	// -> END POINT
	@GetMapping("menssage")
	public String getMassage() {
		return "Como é assustador saber que morra uma parte sua em cada pessoa que vc conhece";
	}

	@GetMapping("recado")
	public String getRecado() {
		return "I AM LOUCO";
	}

}

package br.com.santander.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.santander.api.documents.Gasto;
import br.com.santander.api.responses.Response;
import br.com.santander.api.services.GastoService;

@RestController
@RequestMapping(path = "/api/gastos")
public class GastoController {

	@Autowired
	private GastoService gastoService;

	@GetMapping
	public ResponseEntity<Response<List<Gasto>>> listarTodos() {
		return ResponseEntity.ok(new Response<List<Gasto>>(this.gastoService.listarTodos()));
	}
}
package es.uned.master.java.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import es.uned.master.java.beans.Usuario;
import es.uned.master.java.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/signup")
	public String showSingUpform(Usuario usuario){
		return "add-user";
	}
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("usuarios", this.usuarioRepository.findAll());
		return "index";
		
	}
	
	@PostMapping("/adduser")
	public String addUser(@Valid Usuario usuario, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-user";
		}
		
		this.usuarioRepository.save(usuario);
		model.addAttribute("usuarios", this.usuarioRepository.findAll());
		return "index";
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateForm(@PathVariable("id") long id, Model model) {
		Usuario usuario = this.usuarioRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException ("Usuario invalido Id:"+id));
		model.addAttribute("usuario", usuario);
		return "update-user";
	}
	
	@PostMapping("/update/{id}")
	public String updateUser(@PathVariable("id") long id, @Valid Usuario usuario, 
							BindingResult result, Model model) {
		if (result.hasErrors()) {
			usuario.setId(id);
			return "update-user";
		}
		
		this.usuarioRepository.save(usuario);
		model.addAttribute("usuarios", this.usuarioRepository.findAll());
		return "index";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model){

		Usuario usuario = this.usuarioRepository.findById(id)
							.orElseThrow(() -> new IllegalArgumentException ("Usuario inválido Id:"+id));
		
			this.usuarioRepository.delete(usuario);
			model.addAttribute("usuarios", this.usuarioRepository.findAll());
			return "index";
	}
}

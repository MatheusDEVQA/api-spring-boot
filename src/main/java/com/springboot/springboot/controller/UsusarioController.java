package com.springboot.springboot.controller;

import com.springboot.springboot.model.Usuario;
import com.springboot.springboot.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsusarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    public  void postUsuario(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

    @GetMapping
    public List<Usuario> getAllUsuarios(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Usuario getByIdUsuario(@PathVariable("id") Integer id){
        return repository.findById(id);
    }

    @PutMapping
    public void updateUsuario(@RequestBody Usuario usuario){
        repository.update(usuario);
    }

    @DeleteMapping
    public void deleteUsuario(@PathVariable("id") Integer id){
        repository.delete(id);
    }

}

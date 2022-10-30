package com.springboot.springboot.repository;

import com.springboot.springboot.handler.BusinessException;
import com.springboot.springboot.handler.ResponseError;
import com.springboot.springboot.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario) {
        if (usuario.getLogin()==null)
            throw new BusinessException("É obrigatório o campo login");
        System.out.println("SAVE - Recebeu o usuario na camada repository");

        System.out.println(usuario);
    }

    public void update(Usuario usuario) {
        System.out.println("UPDATE - ATualizou o usuario na camda repository");
        System.out.println(usuario);
    }

    public void delete(Integer id) {
        System.out.println("DELETE/id - REcebeu o id %id para excluir o usuario");
        System.out.println(id);
    }


    public List<Usuario> findAll() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Matehus", "senha"));
        usuarios.add(new Usuario("Elenice", "secret"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("Getid - REcebeu o id: %d para exibir o usuario", id));
        return new Usuario("Matheus","SECRET");
    }
}

package com.example.app.userresource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.entities.Users;
import com.example.app.services.UserService;

@RestController //  indicar que a classe é um controlador REST, ou seja, ela irá tratar requisições HTTP e retornar respostas no formato JSON ou XML.
@RequestMapping(value = "/users") // Ela pode ser usada para definir o caminho (URL) e o tipo de método HTTP (GET, POST, etc.).
public class UsersResource {

    @Autowired //  Resolve a injeção dependencia de associação de um objeto a outro.
    private UserService service;

    
    @GetMapping //mapear requisições HTTP do tipo GET para um método específico.
    public ResponseEntity<List<Users>> findAll(){
        List<Users> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")    // @PathVariable - extrair valores de variáveis presentes na URL e passá-los como parâmetro para o método do controlador.
    public ResponseEntity<Users> findbyID(@PathVariable long id){ // O valor de {id} na URL será passado para o parâmetro 'id'.
        Users obj = service.findbyID(id);
        return ResponseEntity.ok().body(obj);
    }
}

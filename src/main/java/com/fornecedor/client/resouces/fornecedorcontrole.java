package com.fornecedor.client.resouces;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fornecedor.client.entidades.Fornecedor;
import com.fornecedor.client.serviços.ServiçoFornecedor;

@RestController
public class fornecedorcontrole {

  private ServiçoFornecedor serviçofornecedor;
    @GetMapping("fornecedores/{id}")
    public Fornecedor getFornecedor(@PathVariable int id){
      return serviçofornecedor.getFornecedorById(id);
    }


    @GetMapping("fornecedores")
    public List<Fornecedor> GetFornecedores(){
        return serviçofornecedor.getFornecedor();
    }
}

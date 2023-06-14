package com.fornecedor.client.serviços;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fornecedor.client.entidades.Fornecedor;
import com.fornecedor.client.repositorios.RepositorioDornecedor;

@Service
public class ServiçoFornecedor {
    private RepositorioDornecedor clientRepository;

    public List<Fornecedor> getFornecedor(){
        return clientRepository.findAll();
    }
}

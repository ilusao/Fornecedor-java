package com.fornecedor.client.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fornecedor.client.entidades.Fornecedor;

public interface RepositorioDornecedor extends JpaRepository <Fornecedor,Integer>{
    
}

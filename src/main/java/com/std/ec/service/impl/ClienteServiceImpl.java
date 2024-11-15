/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.std.ec.service.impl;

import com.std.ec.model.entity.Cliente;
import com.std.ec.repository.ClienteRepository;
import com.std.ec.service.IClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author WALTER ROSERO
 */
@Service
public class ClienteServiceImpl implements IClienteService{

    @Autowired
    private ClienteRepository cliienteRepository;
    
    @Override
    public List<Cliente> listar() {
       return (List<Cliente>) cliienteRepository.findAll();
    }

    @Override
    public Cliente guardar(Cliente cliente) {
       return cliienteRepository.save(cliente);
    }

    @Override
    public Cliente buscarId(Integer idEntity) {
        return cliienteRepository.findById(idEntity).orElse(null);
    }

    @Override
    public void eliminar(Cliente cliente) {
        cliienteRepository.delete(cliente);
    }
    
}

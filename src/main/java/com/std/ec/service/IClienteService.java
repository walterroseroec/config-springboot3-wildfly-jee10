/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.std.ec.service;

import com.std.ec.model.entity.Cliente;
import java.util.List;

/**
 *
 * @author WALTER ROSERO
 */
public interface IClienteService {

    List<Cliente> listar();

    Cliente guardar(Cliente cliente);

    Cliente buscarId(Integer idEntity);

    void eliminar(Cliente cliente);

}

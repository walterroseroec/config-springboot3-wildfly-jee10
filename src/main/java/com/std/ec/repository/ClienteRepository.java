/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.std.ec.repository;

import com.std.ec.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author WALTER ROSERO
 */
public interface ClienteRepository  extends  CrudRepository<Cliente, Integer>{
    
}

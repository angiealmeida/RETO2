/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.interfaces.InterfaceUser;
import Reto2_Web.modelo.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Angie Almeida
 */
@Repository
public class UserRepositorio {

    @Autowired
    private InterfaceUser userCrudRepository;
    /**
     * Lista
     * @return 
     */
    public List<User> getAll() {
        return (List<User>) userCrudRepository.findAll();
    }
    /**
     * 
     * @param id
     * @return 
     */
    public Optional<User> getUser(int id) {
        return userCrudRepository.findById(id);
    }
    /**
     * Crear
     * @param user
     * @return 
     */
    public User create(User user) {
        return userCrudRepository.save(user);
    }
    /**
     * Actualizar
     * @param user 
     */
    public void update(User user) {
        userCrudRepository.save(user);
    }
    /**
     * Eliminar
     * @param user 
     */
    public void delete(User user) {
        userCrudRepository.delete(user);
    }
    /**
     * Verificar existencia
     * @param email
     * @return 
     */
    public boolean emailExists(String email) {
        Optional<User> usuario = userCrudRepository.findByEmail(email);

        return !usuario.isEmpty();
    }
    /**
     * Autentificar
     * @param email
     * @param password
     * @return 
     */
    public Optional<User> authenticateUser(String email, String password) {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }

}

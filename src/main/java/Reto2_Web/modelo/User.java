/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Angie Almeida
 */
@Document(collection = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    /**
     * Id del usuario
     */
    private Integer id;
    /**
     * Identificación del usuario
     */
    private String identification;
    /**
     * Nombre del usuario
     */
    private String name;
    /**
     * Dirección del usuario
     */
    private String address;
    /**
     * Celular del usuario
     */
    private String cellPhone;
    /**
     * Correo electrónico del usuario
     */
    private String email;
    /**
     * Contraseña del usuario
     */
    private String password;
    /**
     * Zona del usuario
     */
    private String zone;
    /**
     * Tipo del usuario
     */
    private String type;
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.controlador;

import Reto2_Web.servicio.ChocolateService;
import Reto2_Web.modelo.Chocolate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Angie Almeida
 */
@RestController
@RequestMapping("/api/chocolate")
@CrossOrigin("*")
public class ChocolateController {
       @Autowired
    private ChocolateService accessoryService;
     
       /**
        * 
        * @return
        * GET
        */
     @GetMapping("/all")
    public List<Chocolate> getAll() {
        return accessoryService.getAll();
    }
    
    /**
     * 
     * @param reference
     * @return 
     * GET
     */
    @GetMapping("/{reference}")
    public Optional<Chocolate> getClothe(@PathVariable("reference") String reference) {
        return accessoryService.getClothe(reference);
    }

    /**
     * 
     * @param gadget
     * @return 
     * POST
     */
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Chocolate create(@RequestBody Chocolate gadget) {
        return accessoryService.create(gadget);
    }
    
    /**
     * 
     * @param gadget
     * @return 
     * PUT
     */
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Chocolate update(@RequestBody Chocolate gadget) {
        return accessoryService.update(gadget);
    }

    /**
     * 
     * @param reference
     * @return 
     * DELETE
     */
    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return accessoryService.delete(reference);
    } 
    
}

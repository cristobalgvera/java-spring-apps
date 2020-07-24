package cl.awakelab.resttests.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"/test", "/index"})
public class IndexRESTController {

    @PostMapping(value = {"/", ""}) // Create
    public String postMap() {
        // Create functions with services
        return "<h1>Hola POST</h1>";
    }

    @GetMapping(value = {"/", ""}) // Read
    public String getMap() {
        // Read functions with services
        return "<h1>Hola GET</h1>";
    }

    @PutMapping(value = {"/", ""}) // Update
    public String putMap() {
        // Update functions with services
        return "<h1>Hola PUT</h1>";
    }

    @DeleteMapping(value = {"/", ""}) // Delete
    public String deleteMap() {
        // Delete functions with services
        return "<h1>Hola DELETE</h1>";
    }

}

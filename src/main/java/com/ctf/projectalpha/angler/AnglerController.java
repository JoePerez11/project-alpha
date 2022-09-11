/*This is the api layer of the app. */
package com.ctf.projectalpha.angler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/angler")
public class AnglerController {
   private final AnglerService anglerService;

   @Autowired
   // This auto instantiates args below.
    public AnglerController(AnglerService anglerService) {
        this.anglerService = anglerService;
    }
    @GetMapping
    public List<Angler> getAnglers(){
        return anglerService.getAnglers();
    }
}

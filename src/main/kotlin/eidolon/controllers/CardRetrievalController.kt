package eidolon.controllers.CardRetrievalController

import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin

import eidolon.services.CardService.*
import eidolon.entities.CardEntity.*



@RestController
@CrossOrigin
class CardRetrievalController(private val service: CardService) {

  @GetMapping("/card/{name}")
  fun retrieveCardByName(@PathVariable name: String): Card? {
    return service.findCardByName(name);
  }
  @GetMapping("/card/test")
  fun test(@RequestBody name: String): Card? {
    return service.findCardByName(name);
  }
  @GetMapping("/card/code/{code}")
  fun retrieveCardByCode(@PathVariable code: String): Card? {
    return service.findCardByCode(code);
  }
  // @GetMapping("/card/multiple/{names}")
  // fun retrieveCardsByNames(@PathVariable names: List<String>): List<Card>{
  //   return service.findCardsByNames(names);
  // }
  @PostMapping("/cards")
  fun retrieveCardsByNames(@RequestBody names: List<String>): List<Card>{
    return service.findCardsByNames(names);
  }

}
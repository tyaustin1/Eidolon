package eidolon.controllers.CardRetrievalController

import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController
import eidolon.services.CardService.*
import eidolon.entities.CardEntity.*



@RestController
class CardRetrievalController(private val service: CardService) {

  @GetMapping("/card/{name}")
  fun retrieveCardByName(@PathVariable name: String): Card? {
    return service.findCardByName(name);
  }
  @GetMapping("/card/code/{code}")
  fun retrieveCardByCode(@PathVariable code: String): Card? {
    return service.findCardByCode(code);
  }

}
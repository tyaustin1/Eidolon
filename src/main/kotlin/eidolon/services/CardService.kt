package eidolon.services.CardService

import eidolon.repositories.CardRepository.*
import eidolon.entities.CardEntity.*
import org.springframework.stereotype.Component;

@Component
class CardService(private val repository: CardRepository) {

  fun findCardByName(name: String): Card? {
    return repository.findByname(name)
  }

  fun findCardByCode(code: String): Card? {
    return repository.findBycode(code)
  }

}
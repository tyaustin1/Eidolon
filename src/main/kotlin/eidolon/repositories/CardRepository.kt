package eidolon.repositories.CardRepository

import org.springframework.data.repository.CrudRepository
import eidolon.entities.CardEntity.*

interface CardRepository : CrudRepository<Card, String> {
  fun findByname(name: String): Card?
  fun findBycode(code: String): Card?
}
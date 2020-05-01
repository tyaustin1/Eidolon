package eidolon.entities.CardEntity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue

@Entity
class Card(
    var name: String,
    var imageUrl: String,
    var code: String,
    @Id @GeneratedValue var id: Long? = null 
)
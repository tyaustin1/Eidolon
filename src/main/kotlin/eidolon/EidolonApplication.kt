package eidolon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EidolonApplication

fun main(args: Array<String>) {
	runApplication<EidolonApplication>(*args)
}

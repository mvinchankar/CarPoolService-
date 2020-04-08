package com.carpool

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CarpoolApplication

fun main(args: Array<String>) {
    runApplication<CarpoolApplication>(*args)
}

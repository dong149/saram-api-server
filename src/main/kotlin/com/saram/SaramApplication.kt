package com.saram

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SaramApplication

fun main(args: Array<String>) {
    runApplication<SaramApplication>(*args)
}

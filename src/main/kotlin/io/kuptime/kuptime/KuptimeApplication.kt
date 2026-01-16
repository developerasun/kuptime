package io.kuptime.kuptime

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication class KuptimeApplication

fun main(args: Array<String>) {
  runApplication<KuptimeApplication>(*args)
}

@RestController
class Health {
  @GetMapping("/")
  fun isHealthy(): String {

    return "ok"
  }
}

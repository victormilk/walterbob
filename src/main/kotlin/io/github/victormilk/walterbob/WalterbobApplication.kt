package io.github.victormilk.walterbob

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WalterbobApplication

fun main(args: Array<String>) {
    runApplication<WalterbobApplication>(*args)
}

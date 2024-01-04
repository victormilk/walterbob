package io.github.victormilk.walterbob.modules.work.application.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/works")
class WorkController {

    @GetMapping
    suspend fun getWorks(): String {
        println("Chamouu")
        return "dev -> works"
    }
}

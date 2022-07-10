package com.saram.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/profiles")
class ProfileController {
    @GetMapping("/{id}")
    fun getProfileDto(@PathVariable id: Long) {

    }
}
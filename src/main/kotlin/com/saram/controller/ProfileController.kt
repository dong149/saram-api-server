package com.saram.controller

import com.saram.model.dto.request.ProfileRequestDto
import com.saram.service.ProfileService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/profiles")
class ProfileController(
    private val profileService: ProfileService
) {
    @GetMapping("/{id}")
    fun getProfileDto(@PathVariable id: Long) {
    }

    @PutMapping
    fun updateProfile(@RequestBody profileRequestDto: ProfileRequestDto): ResponseEntity<Void> {
        profileService.updateProfile(profileRequestDto)

        return ResponseEntity(HttpStatus.CREATED)
    }
}
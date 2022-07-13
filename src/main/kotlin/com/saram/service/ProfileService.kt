package com.saram.service

import com.saram.exception.ErrorCode
import com.saram.exception.SaramException
import com.saram.model.domain.User
import com.saram.model.dto.request.ProfileRequestDto
import com.saram.repository.UserRepository
import com.saram.utils.logger
import org.springframework.stereotype.Service

@Service
class ProfileService(private val userRepository: UserRepository) {
    private val log = logger()

    fun updateProfile(profileRequestDto: ProfileRequestDto) {
        var user = userRepository.findById(profileRequestDto.id).orElseThrow {
            log.error("there is no user, user id = {}", profileRequestDto.id)
            throw SaramException(ErrorCode.USER_NOT_FOUND)
        }

        updateUser(user, profileRequestDto)
    }

    private fun updateUser(user: User, profileRequestDto: ProfileRequestDto): User {
        user.description = profileRequestDto.description

        return user
    }
}
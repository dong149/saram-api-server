package com.saram.exception

import org.springframework.http.HttpStatus

class SaramException(
    status: HttpStatus,
    message: String
) : Throwable(message) {
    constructor(errorCode: ErrorCode) : this(errorCode.status, errorCode.message)
    constructor(errorCode: ErrorCode, message: String) : this(errorCode.status, message)
}

enum class ErrorCode(
    val status: HttpStatus,
    val message: String
) {
    USER_NOT_FOUND(HttpStatus.BAD_REQUEST, "존재하지 않는 유저입니다."),
}
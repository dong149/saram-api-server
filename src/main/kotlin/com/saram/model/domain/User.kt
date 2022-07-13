package com.saram.model.domain

import javax.persistence.*

@Entity
@Table(name = "users")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    @Column(nullable = false)
    var name: String? = null,
    @Column(nullable = false)
    var password: String? = null,
    @Column(nullable = false)
    var email: String? = null,
    @Column(nullable = false)
    var description: String? = null,
    // TODO : enum 으로 변경
    @Column(nullable = false)
    var university: String? = null,
) : BaseEntity()
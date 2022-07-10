package com.saram.model.domain

import javax.persistence.*

@Entity
@Table(name = "users")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    @Column(nullable = false)
    val name: String? = null,
    @Column(nullable = false)
    val password: String? = null,
    @Column(nullable = false)
    val email: String? = null,
) : BaseEntity()
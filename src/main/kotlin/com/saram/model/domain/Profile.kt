package com.saram.model.domain

import javax.persistence.*

@Entity
@Table(name = "profiles")
class Profile(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    @Column(nullable = false)
    val description: String? = null,
    // TODO : enum 으로 변경
    @Column(nullable = false)
    val university: String? = null,
) : BaseEntity()
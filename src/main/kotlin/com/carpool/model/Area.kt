package com.carpool.model

import javax.persistence.*

@Entity
@Table(name = "puneareas")
class Area {

    val areas: String = ""
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0
    override fun toString(): String {
        return "Area(id=$id, nameOfArea=$areas)"
    }
}

package com.carpool.service

import com.carpool.model.Area
import com.carpool.repository.ListOfAreaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
class CarPoolService {

    @Autowired
    lateinit var repository: ListOfAreaRepository

    fun getListOfAreasInPune(): List<Area> {
        val listOfAreas = repository.findAll()
        return (listOfAreas)
    }
//    fun addAreaToList(areas: String): ResponseEntity<String> {
//        val area = Area()
//        area.nameOfArea = areas
//        repository.save(area)
//        return ResponseEntity.ok("Area Added !!!!!")
//    }
}

package com.carpool.controller

import com.carpool.model.Area
import com.carpool.service.CarPoolService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = ["*"], allowedHeaders = ["*"])
@RestController
class CarPoolController {

    @Autowired
    lateinit var service : CarPoolService

    @RequestMapping("/welcome")
    fun getMessage() :ResponseEntity<String>{
        return ResponseEntity.ok("Welcome to Car Pool Service!!!!!")
    }

    @RequestMapping("/listOfAreas")
    fun getListOfAreasInPune() : List<Area>{
        return service.getListOfAreasInPune();
    }
//
//    @RequestMapping("/addAreas")w
//    fun addAreaToList(@RequestParam area: String): ResponseEntity<String> {
//        return service.addAreaToList(area)
//    }
//
}

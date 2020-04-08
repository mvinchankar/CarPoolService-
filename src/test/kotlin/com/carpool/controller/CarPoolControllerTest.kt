package com.carpool.controller

import com.carpool.model.Area
import com.carpool.repository.ListOfAreaRepository
import com.carpool.service.CarPoolService
import io.mockk.*
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.springframework.http.ResponseEntity


class CarPoolControllerTest {

    @InjectMockKs
    lateinit var controller  : CarPoolController

    @MockK
    lateinit var service: CarPoolService

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
    }

    @Test
    fun shouldReturnWelcomeMessage() {
        val message = controller.getMessage()
        assertEquals("Welcome to Car Pool Service!!!!!",message.body)
    }

    @Test
    fun shouldReturnListOfAreasInPune() {
        val mockList = mockk<List<Area>>()
        every { service.getListOfAreasInPune() } returns mockList
        val listOfAreas = controller.getListOfAreasInPune()
        assertEquals(listOfAreas,mockList)
    }
}


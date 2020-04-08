package com.carpool.service

import com.carpool.model.Area
import com.carpool.repository.ListOfAreaRepository
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class CarPoolServiceTest {

    @InjectMockKs
    lateinit var service: CarPoolService

    @MockK
    lateinit var repository: ListOfAreaRepository

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
    }

    @Test
    fun getListOfAreasInPune() {
        val mockedList = mockk<List<Area>>()
        every { repository.findAll() }returns mockedList
        val listOfAreas = service.getListOfAreasInPune()
        assertEquals(mockedList,listOfAreas)
    }
}

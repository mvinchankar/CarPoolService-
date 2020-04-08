package com.carpool.repository

import com.carpool.model.Area
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ListOfAreaRepository : JpaRepository<Area, Long>{

}

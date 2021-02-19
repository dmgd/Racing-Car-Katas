package tddmicroexercises.leaderboard

import org.junit.Assert.assertEquals
import org.junit.Test

class RaceTest {

    @Test
    fun isShouldCalculateDriverPoints() {
        val driver1 = Driver("Nico Rosberg", "DE")
        val driver2 = Driver("Lewis Hamilton", "UK")
        val driver3 = Driver("Sebastian Vettel", "DE")
        val race = Race("Australian Grand Prix", driver1, driver2, driver3)
        assertEquals(25, race.getPoints(driver1))
        assertEquals(18, race.getPoints(driver2))
        assertEquals(15, race.getPoints(driver3))
    }

}



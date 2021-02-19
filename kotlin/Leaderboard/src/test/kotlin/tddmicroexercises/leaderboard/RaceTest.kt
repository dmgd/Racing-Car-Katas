package tddmicroexercises.leaderboard

import org.junit.Assert.assertEquals
import org.junit.Test

class RaceTest {

    @Test
    fun isShouldCalculateDriverPoints() {
        val race = Race("Australian Grand Prix", driver1, driver2, driver3)
        assertEquals(25, race.getPoints(driver1))
        assertEquals(18, race.getPoints(driver2))
        assertEquals(15, race.getPoints(driver3))
    }

    @Test
    fun isShouldNotFailWhenDriverWasNotInTopThree() {
        val driver4 = Driver("Jordan", "NZ")
        val race = Race("Australian Grand Prix", driver1, driver2, driver3, driver4)
        assertEquals(0, race.getPoints(driver4))
    }

    @Test
    fun isShouldNotFailWhenDriverWasNotInRace() {
        val unknownDriver = Driver("Jordan", "NZ")
        val race = Race("Australian Grand Prix", driver1, driver2, driver3)
        assertEquals(0, race.getPoints(unknownDriver))
    }

    private val driver1 = Driver("Nico Rosberg", "DE")
    private val driver2 = Driver("Lewis Hamilton", "UK")
    private val driver3 = Driver("Sebastian Vettel", "DE")
}



package tddmicroexercises.leaderboard

import org.junit.Assert
import org.junit.Test

class RaceTest {

    @Test
    fun isShouldCalculateDriverPoints() {
        // setup

        // act

        // verify
        Assert.assertEquals(25, race1.getPoints(driver1))
        Assert.assertEquals(18, race1.getPoints(driver2))
        Assert.assertEquals(15, race1.getPoints(driver3))
    }

}

private val driver1 = Driver("Nico Rosberg", "DE")
private val driver2 = Driver("Lewis Hamilton", "UK")
private val driver3 = Driver("Sebastian Vettel", "DE")

private val race1 = Race("Australian Grand Prix", driver1, driver2, driver3)

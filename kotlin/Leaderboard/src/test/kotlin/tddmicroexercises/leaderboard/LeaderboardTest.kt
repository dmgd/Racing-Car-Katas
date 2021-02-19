package tddmicroexercises.leaderboard

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class LeaderboardTest {

    @Test
    fun itShouldSumThePoints() {
        // setup

        // act
        val results = Leaderboard(race1, race2, race3).driverResults()

        // verify
        assertTrue("results $results", results.containsKey("Lewis Hamilton"))
        assertEquals((18 + 18 + 25).toLong(), (results.get("Lewis Hamilton") as Int).toLong())
    }

    @Test
    fun isShouldFindTheWinner() {
        // setup

        // act
        val result = Leaderboard(race1, race2, race3).driverRankings()

        // verify
        assertEquals("Lewis Hamilton", result.get(0))
    }

    @Test
    fun itShouldKeepAllDriversWhenSamePoints() {
        // setup
        // bug, drops drivers with same points
        val winDriver1 = Race("Australian Grand Prix", driver1, driver2, driver3)
        val winDriver2 = Race("Malaysian Grand Prix", driver2, driver1, driver3)
        val exEquoLeaderBoard = Leaderboard(winDriver1, winDriver2)

        // act
        val rankings = exEquoLeaderBoard.driverRankings()

        // verify
        assertEquals(arrayListOf(driver1.name, driver2.name, driver3.name), rankings)
        // note: the order of driver1 and driver2 is JDK/platform dependent
    }

}

private val driver1 = Driver("Nico Rosberg", "DE")
private val driver2 = Driver("Lewis Hamilton", "UK")
private val driver3 = Driver("Sebastian Vettel", "DE")

private val race1 = Race("Australian Grand Prix", driver1, driver2, driver3)
private val race2 = Race("Malaysian Grand Prix", driver3, driver2, driver1)
private val race3 = Race("Chinese Grand Prix", driver2, driver1, driver3)

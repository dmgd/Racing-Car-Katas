package tddmicroexercises.leaderboard

import java.util.*

class Leaderboard(private vararg val races: Race) {

    fun driverResults(): Map<String, Int> {
        val results = HashMap<String, Int>()
        for (race in races) {
            for (driver in race.drivers) {
                val driverName = race.getDriverName(driver)
                val points = race.getPoints(driver)
                if (results.containsKey(driverName)) {
                    results[driverName!!] = results[driverName]!!.plus(points)
                } else {
                    results[driverName!!] = 0 + points
                }
            }
        }
        return results
    }

    fun driverRankings(): List<String> {
        val results = driverResults()
        val resultsList = ArrayList(results.keys)
        Collections.sort(resultsList, DriverByPointsDescendingComparator(results))
        return resultsList
    }

    private class DriverByPointsDescendingComparator constructor(private val results: Map<String, Int>) :
        Comparator<String> {

        override fun compare(driverName1: String, driverName2: String): Int {
            return -results[driverName2]?.let { results[driverName1]!!.compareTo(it) }!!
        }
    }

}

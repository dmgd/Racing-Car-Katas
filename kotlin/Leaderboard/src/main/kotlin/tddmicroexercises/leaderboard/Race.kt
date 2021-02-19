package tddmicroexercises.leaderboard

class Race(private val name: String, vararg val drivers: Driver) {

    fun getPoints(driver: Driver) =
        when (drivers.indexOf(driver)) {
            0 -> 25
            1 -> 18
            2 -> 15
            else -> 0
        }

    fun getDriverName(driver: Driver) =
        driver.name.takeIf { driver in drivers }

    override fun toString() =
        name
}

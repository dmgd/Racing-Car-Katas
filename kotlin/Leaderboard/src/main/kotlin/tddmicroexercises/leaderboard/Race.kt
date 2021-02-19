package tddmicroexercises.leaderboard

class Race(private val name: String, vararg val drivers: Driver) {

    fun getPoints(driver: Driver) =
        POINTS[drivers.indexOf(driver)]

    fun getDriverName(driver: Driver) =
        driver.name.takeIf { driver in drivers }

    override fun toString() = name

    companion object {
        private val POINTS = arrayOf(25, 18, 15)
    }
}

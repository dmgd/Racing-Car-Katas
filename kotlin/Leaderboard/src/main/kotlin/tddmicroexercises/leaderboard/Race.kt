package tddmicroexercises.leaderboard

class Race(private val name: String, vararg drivers: Driver) {
    val results: List<Driver>
    private val driverNames: MutableMap<Driver, String>

    init {
        this.results = arrayListOf(*drivers)
        this.driverNames = HashMap()
        for (driver in results) {
            this.driverNames[driver] = driver.name
        }
    }

    fun position(driver: Driver): Int {
        return this.results.indexOf(driver)
    }

    fun getPoints(driver: Driver): Int {
        return Race.POINTS[position(driver)]
    }

    fun getDriverName(driver: Driver): String? {
        return this.driverNames[driver]
    }

    override fun toString(): String {
        return name
    }

    companion object {

        private val POINTS = arrayOf(25, 18, 15)
    }
}

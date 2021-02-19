package tddmicroexercises.leaderboard

object TestData {

    val driver1: Driver = Driver("Nico Rosberg", "DE")
    val driver2: Driver = Driver("Lewis Hamilton", "UK")
    val driver3: Driver = Driver("Sebastian Vettel", "DE")
    val driver4: SelfDrivingCar = SelfDrivingCar("1.3", "Acme")

    val race1: Race = Race("Australian Grand Prix", driver1, driver2, driver3)
    val race2: Race = Race("Malaysian Grand Prix", driver3, driver2, driver1)
    val race3: Race = Race("Chinese Grand Prix", driver2, driver1, driver3)
    val race4: Race = Race("Fictional Grand Prix 1", driver1, driver2, driver4)
    val race5: Race = Race("Fictional Grand Prix 2", driver4, driver2, driver1)
    val race6: Race = Race("Fictional Grand Prix 3", driver2, driver1, driver4)

    val sampleLeaderboard1: Leaderboard = Leaderboard(race1, race2, race3)
}

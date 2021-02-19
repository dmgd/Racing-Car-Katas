package tddmicroexercises.leaderboard

object TestData {

    var driver1: Driver = Driver("Nico Rosberg", "DE")
    var driver2: Driver = Driver("Lewis Hamilton", "UK")
    var driver3: Driver = Driver("Sebastian Vettel", "DE")
    var driver4: SelfDrivingCar = SelfDrivingCar("1.2", "Acme")

    var race1: Race = Race("Australian Grand Prix", driver1, driver2, driver3)
    var race2: Race = Race("Malaysian Grand Prix", driver3, driver2, driver1)
    var race3: Race = Race("Chinese Grand Prix", driver2, driver1, driver3)
    var race4: Race = Race("Fictional Grand Prix 1", driver1, driver2, driver4)
    var race5: Race = Race("Fictional Grand Prix 2", driver4, driver2, driver1)
    var race6: Race = Race("Fictional Grand Prix 3", driver2, driver1, driver4)

    var sampleLeaderboard1: Leaderboard = Leaderboard(race1, race2, race3)
    var sampleLeaderboard2: Leaderboard = Leaderboard(race4, race5, race6)

    init {
         driver4.algorithmVersion = "1.3"
    }
}

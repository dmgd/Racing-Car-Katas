package tddmicroexercises.leaderboard

object SelfDrivingCar : Driver("", "") { val algorithmVersion = "" }
fun SelfDrivingCar(algorithmVersion: String, country: String) = Driver("Self Driving Car - $country ($algorithmVersion)", country)

package tddmicroexercises.leaderboard

data class Driver(val name: String, val country: String)

fun SelfDrivingCar(algorithmVersion: String, country: String) = Driver("Self Driving Car - $country ($algorithmVersion)", country)

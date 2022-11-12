package study.step3.racingcar.car

object CarFactory {
    fun createCars(count: Int): List<Car> {
        return (1..count).map { StandardCar() }
    }
}

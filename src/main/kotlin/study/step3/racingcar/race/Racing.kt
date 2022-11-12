package study.step3.racingcar.race

import study.step3.racingcar.car.Car
import study.step3.racingcar.util.Generator

class Racing(private val cars: List<Car>, private val attempts: Int) {
    fun race(generator: Generator): List<List<Int>> {
        val result = mutableListOf<List<Int>>()

        repeat((1..this.attempts).count()) {
            result.add(attempt(generator))
        }

        return result
    }

    private fun attempt(generator: Generator): List<Int> {
        moveCars(generator)
        return getCarsPosition()
    }

    private fun getCarsPosition() = cars.map { car -> car.position }

    private fun moveCars(generator: Generator) {
        cars.forEach { car -> car.move(generator.power()) }
    }
}

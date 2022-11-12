package study.step3.racingcar

import study.step3.racingcar.car.CarFactory
import study.step3.racingcar.io.InputView
import study.step3.racingcar.io.OutputView
import study.step3.racingcar.race.Racing
import study.step3.racingcar.util.RandomNumberGenerator

fun main() {
    val input = InputView()
    val output = OutputView()

    output.writeLine("차의 갯수를 입력해주세요.")
    val countOfCars = input.getValue().toInt()

    output.writeLine("시도할 횟수를 입력해주세요.")
    val attempts = input.getValue().toInt()

    val racing = Racing(CarFactory.createCars(countOfCars), attempts)
    val generator = RandomNumberGenerator(MAX_RANDOM_NUMBER)

    val raceResult = racing.race(generator)

    raceResult.forEach { attempt ->
        attempt.forEach { position: Int -> output.writeLine("-".repeat(position)) }
        println()
    }
}

const val MAX_RANDOM_NUMBER = 9

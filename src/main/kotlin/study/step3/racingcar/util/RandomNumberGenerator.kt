package study.step3.racingcar.util

import kotlin.random.Random

class RandomNumberGenerator(val max: Int) : Generator {
    override fun power(): Int {
        return Random.nextInt(this.max)
    }
}

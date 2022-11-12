package study.step3.racingcar.car

class StandardCar(position: Int = DEFAULT_POSITION) : Car {
    override var position: Int = position
        private set

    override fun move(power: Int) {
        if (power >= FORWARD_NUMBER) position++
    }

    companion object {
        const val DEFAULT_POSITION: Int = 1
        const val FORWARD_NUMBER: Int = 4
    }
}

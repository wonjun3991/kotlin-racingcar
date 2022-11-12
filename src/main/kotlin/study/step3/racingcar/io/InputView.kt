package study.step3.racingcar.io

class InputView : Input {
    override fun getValue(): String {
        val input = readlnOrNull()
        require(!input.isNullOrEmpty())

        return input
    }
}

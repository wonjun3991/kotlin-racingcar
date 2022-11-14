package study.racingcar.io

object InputView {
    fun getCarsName(): List<String> {
        println("주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
        return readln().split(",")
    }

    fun getAttempts(): Int {
        println("시도할 횟수는 몇 회인가요?")
        return readln().toInt()
    }
}

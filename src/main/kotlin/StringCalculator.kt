class StringCalculator {

    fun add(input: String): Int {
        val numbers = input.removeDelimiter()
            .ifEmpty { ZERO_STRING }
            .split(getDelimiterFromInput(input), NEW_LINE_MARK)
            .map { it.toInt() }
            .filter { it <= 1000 }

        return numbers.sum()
    }

    private fun String.removeDelimiter() = if (inputHasDelimiter(this)) this.substring(4) else this
    private fun getDelimiterFromInput(input: String) = if(inputHasDelimiter(input)) input[2].toString() else COMMA_MARK
    private fun inputHasDelimiter(input: String) = input.startsWith("//")

    companion object {
        private const val COMMA_MARK = ","
        private const val NEW_LINE_MARK = "\n"
        private const val ZERO_STRING = "0"
    }
}

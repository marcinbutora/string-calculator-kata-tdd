import org.junit.jupiter.api.BeforeEach
import spock.lang.Specification

class StringCalculatorTest extends Specification {
    private StringCalculator stringCalculator

    @BeforeEach
    void setup() {
        stringCalculator = new StringCalculator()
    }

    def "should return 0 when given empty string"() {
        given:
            def emptyString = stringCalculator.add("")
        expect:
        emptyString == 0
    }

    def "should return number when gives is number"() {
        given:
            def number = stringCalculator.add("1")
        expect:
            number == 1
    }

    def "should add two numbers separated comma"() {
        given:
            def numbers = stringCalculator.add("1,2")
        expect:
            numbers == 3
    }

    def "should add two numbers separated comma and new line tag"() {
        given:
        def numbers = stringCalculator.add("1,2\n3")
        expect:
            numbers == 6
    }
}

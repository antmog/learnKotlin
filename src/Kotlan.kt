import java.util.*
import java.util.regex.Pattern

fun joinOptions(options: Collection<String>) =
        options.joinToString(prefix = "[", postfix = "]")

fun main() {
    println(joinOptions(Arrays.asList("a", "b", "c")))

    val asPredicate = Pattern.compile(getPattern()).asPredicate()
    println(asPredicate.test("26 RRR 1991"))
    println(asPredicate.test("26 N 1991"))
    println(asPredicate.test("26 JUN 1991"))
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
        (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
)

fun containsEven(collection: Collection<Int>): Boolean =
        collection.any { it % 2 == 0 }

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"
// https://regex101.com/
fun getPattern() = """\d{2} ${month} \d{4}"""



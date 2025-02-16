fun main() {
    (0..99).chunked(10).forEach { chunk ->
        println(chunk.joinToString("  ") { String.format("%04d", it * it) })
    }
}
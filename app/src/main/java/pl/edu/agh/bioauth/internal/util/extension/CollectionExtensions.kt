package pl.edu.agh.bioauth.internal.util.extension

internal operator fun <K, V> Map<K, V>.plus(other: Map<K, V>): Map<K, List<V>> =
    (this.asSequence() + other.asSequence())
        .distinct()
        .groupBy({ it.key }, { it.value })

internal fun <T, I : Iterable<T>> I.splitBy(predicate: (T) -> Boolean): Pair<List<T>, List<T>> {
    val positives = filter(predicate)
    val negatives = filterNot(predicate)

    return Pair(positives, negatives)
}

internal fun List<Int>.median(): Int? =
    if (isNotEmpty()) sorted().run { ((get(size / 2)) + get((size - 1) / 2)) / 2 }
    else null

internal fun <K, I: Iterable<T>, T> List<Map<K, I>>.flattenMapList(): Map<K, List<T>> =
    this.asSequence()
        .flatMap { it.asSequence() }
        .groupBy({ it.key }, { it.value })
        .mapValues { it.value.flatten() }

internal fun <T> List<T>.takeHalf(): List<T> = shuffled().take(size / 2)

internal operator fun <T> List<T>.times(value: Int): List<T> =
    generateSequence { asSequence() }
        .take(value)
        .flatMap { it }
        .toList()

internal inline fun <T: Number, R: Number> List<T>.mapWithPrevious(transform: (prev: T?, T) -> R): List<R> {
    val resultList = mutableListOf<R>()
    for (i in indices) {
        resultList.add(transform(getOrNull(i - 1), get(i)))
    }
    return resultList
}

internal inline fun <T> List<T>.indexOfFirstOrNull(predicate: (T) -> Boolean): Int? {
    val index = indexOfFirst(predicate)
    return if (index >= 0) index else null
}

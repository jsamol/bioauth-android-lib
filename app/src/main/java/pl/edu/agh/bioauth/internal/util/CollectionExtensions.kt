package pl.edu.agh.bioauth.internal.util

operator fun <K, V> Map<K, V>.plus(other: Map<K, V>): Map<K, List<V>> =
    (this.asSequence() + other.asSequence())
        .distinct()
        .groupBy({ it.key }, { it.value })
        .toMap()
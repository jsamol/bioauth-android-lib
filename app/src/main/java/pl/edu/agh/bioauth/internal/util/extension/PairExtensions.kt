package pl.edu.agh.bioauth.internal.util.extension

internal fun <A, B> Pair<List<A>, List<B>>.unwrap(firstList: MutableList<A>, secondList: MutableList<B>) {
    if (firstList.isNotEmpty()) firstList.clear()
    if (secondList.isNotEmpty()) secondList.clear()

    firstList.addAll(first)
    secondList.addAll(second)
}
package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val from = a.toCharArray().toMutableList()
        val to = b.toCharArray().toMutableList()

        var count = 0

        for (cTo in to) {
            while (from.size != 0) {
                if (from[0] == cTo || from[0].toUpperCase() == cTo) {
                    count ++
                    break
                }
                from.removeAt(0)
            }
        }
        return if (count == to.size) {
            "YES"
        } else {
            "NO"
        }

    }
}

fun isValid(s: String): Boolean {
    val stack = mutableListOf<Char>()
    val map = mapOf(')' to '(', '}' to '{', ']' to '[')
    for (char in s) {
        if (char in map.values) {
            stack.add(char)
        } else if (stack.isNotEmpty() && stack.last() == map[char]) {
            stack.removeAt(stack.size - 1)
        } else {
            return false
        }
    }
    return stack.isEmpty()
}

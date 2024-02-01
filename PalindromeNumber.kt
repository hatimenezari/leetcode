fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    var reversed = 0
    var num = x
    while (num != 0) {
        reversed = reversed * 10 + num % 10
        num /= 10
    }
    return x == reversed
}

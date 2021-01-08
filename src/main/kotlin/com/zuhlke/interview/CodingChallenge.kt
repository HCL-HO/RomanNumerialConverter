package com.zuhlke.interview

class CodingChallenge {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            print(getNumberFromRomanNumerial("XCIV"))
        }

        fun getNumberFromRomanNumerial(rn: String): Int {
            print("for rn $rn \n")
            val largestNumIndex = findAtomIndexFromRN(rn)
            val largestNum = rnMap[rn[largestNumIndex].toString()]!!
            var result: Int = largestNum

            if (largestNumIndex > 0) {
                val minus = getNumberFromRomanNumerial(rn.substring(0, largestNumIndex))
                result -= minus
                print("$result minus $minus \n")
            }

            if (rn.length - 1 > largestNumIndex) {
                val add =
                    getNumberFromRomanNumerial(rn.substring(largestNumIndex + 1, rn.length))
                result += add
                print("$result add $add \n")
            }

            return result
        }

        fun findAtomIndexFromRN(rnSplit: String): Int {
            var atom = -1
            var index = 0
            rnSplit.forEachIndexed() { i, rn ->
                val num = rnMap.get(rn.toString())
                if (num != null && (atom == -1 || num > atom)) {
                    atom = num
                    index = i
                }
            }
            return index
        }

        enum class RNEnum(val number: Int){
            I(1), V(5), X(10),L(50), C(100), D(500), M(1000)
        }

        const val RN_1 = "I"
        const val RN_5 = "V"
        const val RN_10 = "X"
        const val RN_50 = "L"
        const val RN_100 = "C"
        const val RN_500 = "D"
        const val RN_1000 = "M"

        val rnMap = hashMapOf(
            RN_1 to 1,
            RN_5 to 5,
            RN_10 to 10,
            RN_50 to 50,
            RN_100 to 100,
            RN_500 to 500,
            RN_1000 to 1000,
        )
    }
}

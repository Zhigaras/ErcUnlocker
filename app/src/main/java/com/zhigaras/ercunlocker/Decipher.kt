package com.zhigaras.ercunlocker

object Decipher {
    
    fun encrypt(sequence: String): String {
        
        val erc = sequence.replace("-", "").replace(" ", "").trim()
        val firstPart = erc.substring(0, 8)
        val secondPart = erc.substring(8)
        
        val firstBinary = firstPart.toLong(16).toString(2).padStart(32, '0')
        val secondBinary = secondPart.toLong(16).toString(2).padStart(32, '0')
        
        val secondPartReversed = secondBinary.reversed()
        val xorResult =
            (firstBinary.toBigInteger(2) xor secondPartReversed.toBigInteger(2)).toString(2)
                .padStart(32, '0')
        
        val const = 0xE010A11
        val xorMinusConst =
            (xorResult.toBigInteger(2) - const.toBigInteger()).toString(16).padStart(8, '0')
        
        return xorMinusConst.uppercase()
    }
    
}
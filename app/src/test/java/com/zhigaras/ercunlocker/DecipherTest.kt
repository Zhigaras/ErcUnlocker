package com.zhigaras.ercunlocker

import org.junit.Assert.*
import org.junit.Test

class DecipherTest {
    
    private val testMap = mapOf(
        "0053343100533431" to "7E7EF420",
        "0073846700738467" to "D8514056",
        "8B25C26AA1A1751F" to "658A3DDE",
        "1001873102009F50" to "0CF77D60",
        "0061673100616731" to "7E86D720",
        "44D2E2017F1F5C09" to "C6E710EE",
        "0053061600530616" to "5A32C205",
        "0071276400712764" to "18949F53",
        "0075818500758185" to "93F32574",
        "A7401308993FEB17" to "4196E580",
        "A2D51F2511894364" to "7616849C",
        "C1C08752B3BF5EF1" to "40B9708E",
        "100347800202213F" to "DE85FDAF",
        "0075818593F32574" to "20D0443B",
        "D9C2645468EBEA00" to "CB94A931",
        "00605227D6294A16" to "5A31BC3B",
        "208400C200000000" to "1282F6B1",
        "9008551382079562" to "C8A0AB41",
        "0123456789ABCDEF" to "E88F86E5",
        "C0804126B27F37B5" to "5F6BB55A",
        "D5B90C13EA35C84C" to "D9A99633",
//        "00A0A96400000000" to "F29F9F53",
        "A7401999993F75A8" to "A4EDDAEF",
        "1011573102102F50" to "0CE45560",
        "0074763200747632" to "3E194E21",
        "0053511100535111" to "7AD89100",
        "0010138020000715" to "9AEF0973"
    )
    
    
    @Test
    fun `calc test`() {
        testMap.forEach { (k, v) ->
            assertEquals(Decipher.encrypt(k), v)
        }
    }
}
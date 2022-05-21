package com.example.xpstockbeta1.listas

class listaNombres(var celularIngresado: String){

    operator fun invoke(): Array<String?> {
        val celularIng = celularIngresado
        return revisar(celularIng)
    }
}

    fun revisar(celular: String):Array<String?>{

        val celularAhComparar = celular.uppercase()
        val listaAuxiliar = arrayOfNulls<String?>(290)
        var aux = 0

        val producto = Array(13) { arrayOfNulls<String>(290) }


        producto[0][1] = "1"//id
        producto[1][1] = "samsungA01 big M"
        producto[2][1] = "A01 big M"//modelo
        producto[4][1] = "A01"

        producto[0][2] = "2"//id
        producto[1][2] = "samsung A01"
        producto[2][2] = "A01 small F"//modelo
        producto[2][2] = "A01"

        producto[0][3] = "3"//id
        producto[1][3] = "samsungA01 core"
        producto[2][3] = "A01 core"//modelo
        producto[3][3] = "A01"

        producto[0][4] = "4"//id
        producto[1][4] = "samsungA02S"
        producto[2][4] = "A02S"//modelo
        producto[3][4] = "A02core"
        producto[4][4] = "A02"
        producto[5][4] = "samsungA02core"

        producto[0][5] = "5"//id
        producto[1][5] = "samsungA03"
        producto[2][5] = "A03"//modelo

        producto[0][6] = "6"//id
        producto[1][6] = "samsung A03S"
        producto[2][6] = "A03S"//modelo
        producto[3][6] = "A03"

        producto[0][7] = "7"//id
        producto[1][7] = "samsungA03 Core"
        producto[2][7] = "A03 Core"//modelo
        producto[3][7] = "A03"

        producto[0][8] = "8"//id
        producto[1][8] = "samsungA10"
        producto[2][8] = "A10"

        producto[0][9] = "9"//id
        producto[1][9] = "samsungA10 W/F"
        producto[2][9] = "A10 W/F"//modelo
        producto[3][9] = "W/F"
        producto[4][9] = "samsungA10"
        producto[4][9] = "A10"

        producto[0][10] = "10"//id
        producto[1][10] = "samsungA10 E"
        producto[2][10] = "A10 E"//modelo
        producto[3][10] = "A10"

        producto[0][11] = "11"//id
        producto[1][11] = "samsungA10S"
        producto[2][11] = "A10S"//modelo
        producto[3][11] = "A10"

        producto[0][12] = "12"//id
        producto[1][12] = "samsungA11"
        producto[2][12] = "A11"//modelo

        producto[0][13] = "13"//id
        producto[1][13] = "samsungA12"
        producto[2][13] = "A12"//modelo

        producto[0][14] = "14"//id
        producto[1][14] = "samsungA20"
        producto[2][14] = "A20"//modelo

        producto[0][15] = "15"//id
        producto[1][15] = "samsungA20 W/F"
        producto[2][15] = "A20 W/F"//modelo
        producto[3][15] = "samsungA20"
        producto[4][15] = "W/F"
        producto[5][15] = "A20"

        producto[0][16] = "16"//id
        producto[1][16] = "samsungA20S"
        producto[2][16] = "A20S"//modelo
        producto[3][16] = "A20"


        producto[0][17] = "17"//id
        producto[1][17] = "samsungA21"
        producto[2][17] = "A21"//modelo

        producto[0][18] = "18"//id
        producto[1][18] = "samsungA21S"
        producto[2][18] = "A21S"//modelo
        producto[3][18] = "A21"

        producto[0][19] = "19"//id
        producto[1][19] = "samsungA22  4G W/F"
        producto[2][19] = "A22  4G W/F"//modelo
        producto[3][19] = "samsungA22"
        producto[4][19] = "A22"
        producto[5][19] = "samsungA22  4G"
        producto[6][19] = "A22  4G"
        producto[7][19] = "W/F"

        //Numero 20 disponible xd

        producto[0][21] = "21"//id
        producto[1][21] = "samsungA225G W/F"
        producto[2][21] = "A22  5G W/F"//modelo
        producto[3][21] = "samsungA225G"
        producto[4][21] = "samsungA22"
        producto[5][21] = "5G "
        producto[6][21] = "W/F"

        producto[0][22] = "22"//id
        producto[1][22] = "samsungA260"
        producto[2][22] = "A260"//modelo
        producto[3][22] = "A2core"
        producto[4][22] = "samsungA2core"
        producto[6][22] = "A2"

        producto[0][23] = "23"//id
        producto[1][23] = "samsungA30"
        producto[2][23] = "A30"//modelo

        producto[0][24] = "24"//id
        producto[1][24] = "samsungA30 W/F"
        producto[2][24] = "A30 W/F"//modelo
        producto[3][24] = "A30"
        producto[4][24] = "samsungA30"

        producto[0][25] = "25"//id
        producto[1][25] = "samsungA30S"
        producto[2][25] = "A30S"//modelo
        producto[3][25] = "A30"

        producto[0][26] = "26"//id
        producto[1][26] = "samsungA30S W/F"
        producto[2][26] = "A30S W/F"//modelo
        producto[3][26] = "A30S"
        producto[4][26] = "samsungA30S"

        producto[0][27] = "27"//id
        producto[1][27] = "samsungA31"
        producto[2][27] = "A315"//modelo
        producto[3][27] = "A31"
        producto[4][27] = "samsungA315"

        producto[0][28] = "28"//id
        producto[1][28] = "samsungA31"
        producto[2][28] = "A31"//modelo
        producto[3][28] = "samsungA315"
        producto[4][28] = "A315W/F"
        producto[5][28] = "A315W/F"
        producto[8][28] = " W/F"

        producto[0][29] = "29"//id
        producto[1][29] = "samsungA32 4G W/F"
        producto[2][29] = "A32 4G W/F"//modelo
        producto[3][29] = "samsungA325 4G W/F"
        producto[4][29] = "A325 4G W/F"
        producto[5][29] = "samsungA32 4G"
        producto[6][29] = "samsungA325 4G"
        producto[7][29] = "A32 4G"
        producto[8][29] = "A325 4G"
        producto[9][29] = "w/f"
        producto[10][29] = "a32"
        producto[11][29] = "samsunga32"

        producto[0][30] = "30"//id
        producto[1][30] = "samsungA50"
        producto[2][30] = "A50"//modelo

        producto[0][31] = "31"//id
        producto[1][31] = "samsungA50 W/F"
        producto[2][31] = "A50 W/F"//modelo
        producto[3][31] = "SamsungA50"
        producto[4][31] = "A50 "
        producto[5][31] = "W/F"

        producto[0][32] = "32"//id
        producto[1][32] = "samsungA50S"
        producto[2][32] = "A50S"//modelo

        producto[0][33] = "33"//id
        producto[1][33] = "samsungA50S W/F"
        producto[2][33] = "A50S W/F"//modelo
        producto[3][33] = "samsungA50S"
        producto[4][33] = "A50S"
        producto[5][33] = " W/F"

        producto[0][34] = "34"//id
        producto[1][34] = "samsungA510"
        producto[2][34] = "A510"//modelo
        producto[3][34] = "samsungA52016"
        producto[4][34] = "A52016"
        producto[5][34] = "samsungA5"
        producto[6][34] = "A5"

        producto[0][35] = "35"//id
        producto[1][35] = "samsungA515"
        producto[2][35] = "A515 "//modelo
        producto[3][35] = "samsungA51 BIG"
        producto[4][35] = "A51 BIG"
        producto[5][35] = "A51"
        producto[6][35] = "samsungA51"

        producto[0][36] = "36"//id
        producto[1][36] = "samsungA515W/F"
        producto[2][36] = "A515W/F"//modelo
        producto[3][36] = "samsungA51 BIG W/F"
        producto[4][36] = "A51 BIG W/F"
        producto[5][36] = "samsungA51 BIG"
        producto[6][36] = "A51 BIG"
        producto[7][36] = "samsungA515"
        producto[8][36] = "A515"
        producto[9][36] = "samsungA51"
        producto[10][36] = "A51 BIG"

        producto[0][37] = "37"//id
        producto[1][37] = "samsungA51 W/F"
        producto[2][37] = "A51W/F"//modelo
        producto[3][37] = "samsungA515 W/F"
        producto[4][37] = "A515W/F"
        producto[5][37] = "samsungA51"
        producto[6][37] = "A51"
        producto[7][37] = "samsungA515"
        producto[8][37] = "A515"

        producto[0][38] = "38"//id
        producto[1][38] = "samsungA515SMALL"
        producto[2][38] = "A515SMALL"//modelo
        producto[3][38] = "samsungA51"
        producto[4][38] = "A51 SMALL"
        producto[5][38] = "a51"

        producto[0][39] = "39"//id
        producto[1][39] = "samsungA515SMALL"
        producto[2][39] = "A515SMALL"//modelo
        producto[3][39] = "samsungA51"
        producto[4][39] = "A51 SMALL"
        producto[5][39] = "a51"

        producto[0][40] = "40"//id
        producto[1][40] = "samsungA525 "
        producto[2][40] = "A52/A525  4G W/F"//modelo
        producto[3][40] = "samsungA52"
        producto[4][40] = "A52"

        producto[0][41] = "41"//id
        producto[1][41] = "samsungA525"
        producto[2][41] = "A52/A525 5G W/F"//modelo
        producto[3][41] = "samsungA52"
        producto[4][41] = "A52"
        producto[5][41] = "samsungA525g"
        producto[6][41] = "A525g"

        producto[0][42] = "42"//id
        producto[1][42] = "samsungA52017 BIG"
        producto[2][42] = "A52017 BIG"//modelo
        producto[3][42] = "samsungA520"
        producto[4][42] = "A520"
        producto[5][42] = "550"
        producto[6][42] = "samsungA5"
        producto[7][42] = "a5"
        producto[8][42] = "A52017"

        producto[0][43] = "43"//id
        producto[1][43] = "samsungA52018"
        producto[2][43] = "A52018"//modelo
        producto[3][43] = "samsungA530"
        producto[4][43] = "A530"
        producto[5][43] = "samsungA5"
        producto[6][43] = "a5"

        producto[0][44] = "44"//id
        producto[1][44] = "samsungJ8 plus"
        producto[2][44] = "J8 plus"//modelo
        producto[3][44] = "samsungA6 plus"
        producto[4][44] = "A6 plus"
        producto[5][44] = "samsungJ8"
        producto[6][44] = "j8"
        producto[7][44] = "samsungA6"
        producto[8][44] = "a6"
        producto[9][44] = "samsungA6+"
        producto[10][44] = "a6+"

        producto[0][45] = "45"//id
        producto[1][45] = "samsungA70"
        producto[2][45] = "A70"//modelo


        producto[0][46] = "46"//id
        producto[1][46] = "samsungA70 BIG"
        producto[2][46] = "A70 BIG"//modelo
        producto[3][46] = "samsungA70"
        producto[4][46] = "A70"
        producto[5][46] = "0"
        producto[6][46] = "0"
        producto[7][46] = "0"
        producto[8][46] = "0"

        producto[0][47] = "47"//id
        producto[1][47] = "samsungA70 BIG W/F"
        producto[2][47] = "A70 BIG W/F"//modelo
        producto[3][47] = "samsungA70 BIG"
        producto[4][47] = "A70 BIG"
        producto[5][47] = "samsungA70"
        producto[6][47] = "a70"
        producto[7][47] = "0"
        producto[8][47] = "0"

        producto[0][48] = "48"//id
        producto[1][48] = "samsungA70 SMALL"
        producto[2][48] = "A70 SMALL"//modelo
        producto[3][48] = "samsungA70"
        producto[4][48] = "a70"

        producto[0][49] = "49"//id
        producto[1][49] = "samsungA70 SMALL W/F"
        producto[2][49] = "A70 SMALL W/F"//modelo
        producto[3][49] = "samsungA70 SMALL"
        producto[4][49] = "A70 SMALL"
        producto[5][49] = "samsungA70"
        producto[6][49] = "A70"

        producto[0][50] = "50"//id
        producto[1][50] = "samsungA72016"
        producto[2][50] = "A72016"//modelo
        producto[3][50] = "samsungA710"
        producto[4][50] = "samsungA7"
        producto[5][50] = "a7"

        producto[0][51] = "51"//id
        producto[1][51] = "samsungA71"
        producto[2][51] = "A71"//modelo
        producto[3][51] = "samsungA715"
        producto[4][51] = "A715"

        producto[0][52] = "52"//id
        producto[1][52] = "samsungA71 BIg W/F"
        producto[2][52] = "A715/"//modelo
        producto[3][52] = "samsungA715"
        producto[4][52] = "A71 BIg W/F"
        producto[5][52] = "samsungA71 BIg"
        producto[6][52] = "A71 BIg"
        producto[7][52] = "samsungA71"
        producto[8][52] = "A71"

        producto[0][53] = "53"//id
        producto[1][53] = "samsungA71 big"
        producto[2][53] = "A715/A71 big"//modelo
        producto[3][53] = "A71 big"
        producto[4][53] = "samsungA715"
        producto[5][53] = "A715"
        producto[6][53] = "samsungA71"
        producto[7][53] = "a71"

        producto[0][54] = "54"//id
        producto[1][54] = "samsungA71 SMALL"
        producto[2][54] = "A715/A71 SMALL"//modelo
        producto[3][54] = "A71 SMALL"
        producto[4][54] = "samsungA715"
        producto[5][54] = "A715"
        producto[6][54] = "samsungA71"
        producto[7][54] = "a71"

        producto[0][55] = "55"//id
        producto[1][55] = "samsungA71 SMALL"
        producto[2][55] = "A715/A71 SMALL W/F"//modelo
        producto[3][55] = "A71 SMALL"
        producto[4][55] = "samsungA715"
        producto[5][55] = "A715"
        producto[6][55] = "samsungA71"
        producto[7][55] = "a71"

        producto[0][56] = "56"//id
        producto[1][56] = "samsungA725"
        producto[2][56] = "A72/A725  4G W/F"//modelo
        producto[3][56] = "A725"
        producto[4][56] = "samsungA72"
        producto[5][56] = "A72"


        producto[0][57] = "57"//id
        producto[1][57] = "samsungA72017"
        producto[2][57] = "samsungA720"//modelo
        producto[3][57] = "A72017"
        producto[4][57] = "A720"
        producto[5][57] = "samsungA7"
        producto[6][57] = "a7"

        producto[0][58] = "58"//id
        producto[1][58] = "samsungA8 plus"
        producto[2][58] = "samsungA730"//modelo
        producto[3][58] = "a8plus"
        producto[4][58] = "a730"
        producto[5][58] = "a8+"
        producto[6][58] = "samsungA8+"

        producto[0][59] = "59"//id
        producto[1][59] = "samsungA72018"
        producto[2][59] = "samsungA750"//modelo
        producto[3][59] = "a72018"
        producto[4][59] = "A750"
        producto[5][59] = "a7"
        producto[6][59] = "samsungA7"


        producto[0][60] = "60"//id
        producto[1][60] = "samsungA80"
        producto[2][60] = "A80"//modelo

        producto[0][61] = "61"//id
        producto[1][61] = "samsungA80 W/F"
        producto[2][61] = "A80 W/F"//modelo
        producto[3][61] = "samsungA80"
        producto[4][61] = "A80"

        producto[0][62] = "62"//id
        producto[1][62] = "samsungA920"
        producto[2][62] = "A920"//modelo
        producto[3][62] = "samsung2018"
        producto[4][62] = "A92018"
        producto[5][62] = "a9"

        producto[0][63] = "63"//id
        producto[1][63] = "samsungA90"
        producto[2][63] = "A90"//modelo

        producto[0][64] = "64"//id
        producto[1][64] = "samsungA90 W/F"
        producto[2][64] = "A90 W/F"//modelo
        producto[3][64] = "samsungA90"
        producto[4][64] = "A90"

        producto[0][65] = "65"//id
        producto[1][65] = "samsungJ260"
        producto[2][65] = "J260"//modelo
        producto[3][65] = "samsungJ2 core"
        producto[4][65] = "J2 core"
        producto[5][65] = "J2"//incell
        producto[6][65] = "samsungJ2"//cof

        producto[0][66] = "66"//id
        producto[1][66] = "samsungJ3"
        producto[2][66] = "J3"//modeloell

        producto[0][67] = "67"//id
        producto[1][67] = "samsungJ327"
        producto[2][67] = "J327"//modelo
        producto[3][67] = "samsungJ3 Pro"
        producto[4][67] = "J3 Pro"
        producto[5][67] = "j3"//incell
        producto[6][67] = "samsungj3"//cof

        producto[0][68] = "68"//id
        producto[1][68] = "samsungJ4"
        producto[2][68] = "J4"//modelol

        producto[0][69] = "69"//id
        producto[1][69] = "samsungJ4 plus"
        producto[2][69] = "J4 plus"//modelo
        producto[3][69] = "samsungJ6 plus"
        producto[4][69] = "J6 plus"
        producto[5][69] = "samsungJ4"//incell
        producto[6][69] = "samsungJ6"//cof
        producto[7][69] = "j6"
        producto[8][69] = "j4"

        producto[0][70] = "70"//id
        producto[1][70] = "samsungJ5"
        producto[2][70] = "J5"//modelo

        producto[0][71] = "71"//id
        producto[1][71] = "samsungJ5 PRIME"
        producto[2][71] = "J5 PRIME"//modelo
        producto[3][71] = "samsungJ5"
        producto[4][71] = "J5 "

        producto[0][72] = "72"//id
        producto[1][72] = "samsungJ510"
        producto[2][72] = "J510"//modelo
        producto[3][72] = "samsungJ52016"
        producto[4][72] = "J52016"
        producto[5][72] = "J5"
        producto[6][72] = "samsungJ5"

        producto[0][73] = "73"//id
        producto[1][73] = "samsungJ530"
        producto[2][73] = "J530"//modelo
        producto[3][73] = "samsungJ5pro"
        producto[4][73] = "J5pro"
        producto[5][73] = "samsungJ5"

        producto[0][74] = "74"//id
        producto[1][74] = "samsungJ6"
        producto[2][74] = "J6"//modelo

        producto[0][75] = "75"//id
        producto[1][75] = "samsungJ7"
        producto[2][75] = "J7"//modelo

        producto[0][76] = "76"//id
        producto[1][76] = "samsungJ7PRIME"
        producto[2][76] = "J7PRIME"//modelo
        producto[3][76] = "samsungJ7"
        producto[4][76] = "J7"

        producto[0][77] = "77"//id
        producto[1][77] = "samsungJ701"
        producto[2][77] = "J701"//modelo
        producto[3][77] = "samsungJ7 neo"
        producto[4][77] = "J7 neo"
        producto[5][77] = "samsungJ7"

        producto[0][78] = "78"//id
        producto[1][78] = "samsungJ710"
        producto[2][78] = "J710"//modelo
        producto[3][78] = "j7"
        producto[4][78] = "samsungj7"

        producto[0][79] = "79"//id
        producto[1][79] = "samsungJ720"
        producto[2][79] = "J720 "//modelo
        producto[3][79] = "samsungJ7 Duo"
        producto[4][79] = "J7 Duo"
        producto[5][79] = "samsungj7"
        producto[6][79] = "j7"

        producto[0][80] = "80"//id
        producto[1][80] = "samsungJ727"
        producto[2][80] = "J727"//modelo
        producto[3][80] = "samsungj7v"
        producto[4][80] = "J7V"
        producto[5][80] = "J7"
        producto[6][80] = "samsungj7"

        producto[0][81] = "81"//id
        producto[1][81] = "samsungJ730"
        producto[2][81] = "J730"//modelo
        producto[3][81] = "samsungJ7 pro"
        producto[4][81] = "J7 pro"
        producto[5][81] = "samsungj7"
        producto[6][81] = "j7"

        producto[0][82] = "82"//id
        producto[1][82] = "samsungJ8"
        producto[2][82] = "J8"//modelo

        producto[0][83] = "83"//id
        producto[1][83] = "samsungM01"
        producto[2][83] = "M01"//modelo

        producto[0][84] = "84"//id
        producto[1][84] = "samsungM10" //marca
        producto[2][84] = "M10"//modelo

        producto[0][85] = "85"//id
        producto[1][85] = "samsungM12" //marca
        producto[2][85] = "M12 "//modelo
        producto[3][85] = "samsungM127" //original
        producto[4][85] = "M127" //oled

        producto[0][86] = "86"//id
        producto[1][86] = "samsungM20" //marca
        producto[2][86] = "M20"//modelo

        producto[0][87] = "87"//id
        producto[1][87] = "samsungM21" //marca
        producto[2][87] = "M21"//modelo

        producto[0][88] = "88"//id
        producto[1][88] = "samsungM30" //marca
        producto[2][88] = "M30"//modelo
        producto[3][88] = "samsungM31" //original
        producto[4][88] = "M31" //oled
        producto[5][88] = "samsungM30S" //incell
        producto[6][88] = "M30S" // cof

        producto[0][89] = "89"//id
        producto[1][89] = "samsungNOTE 10 plus W/F" //marca
        producto[2][89] = "NOTE 10 plus W/F"//modelo
        producto[3][89] = "samsungNOTE 10 plus" //original
        producto[4][89] = "NOTE 10 plus" //oledll

        producto[0][90] = "90"//id
        producto[1][90] = "samsungNOTE 10 W/F" //marca
        producto[2][90] = "NOTE 10 W/F"//modelo
        producto[3][90] = "samsungNOTE 10 " //original
        producto[4][90] = "NOTE 10" //oled
        producto[5][90] = "10" //incell
        
        producto[0][91] = "91"//id
        producto[1][91] = "samsungNOTE 20 U W/F" //marca
        producto[2][91] = "NOTE 20 U W/F"//modelo
        producto[3][91] = "samsungNOTE 20 U" //original
        producto[4][91] = "NOTE 20 U " //oled

        producto[0][92] = "92"//id
        producto[1][92] = "samsungNOTE 20 W/F" //marca
        producto[2][92] = "NOTE 20 W/F"//modelo
        producto[3][92] = "samsungNOTE 20" //original
        producto[4][92] = "NOTE 20" //oled

        producto[0][93] = "93"//id
        producto[1][93] = "samsungNOTE 8 W/F" //marca
        producto[2][93] = "NOTE 8 W/F"//modelo
        producto[3][93] = "samsungNOTE 8" //original
        producto[4][93] = "NOTE 8" //oled

        producto[0][94] = "94"//id
        producto[1][94] = "samsungNOTE 9 W/F" //marca
        producto[2][94] = "NOTE 9 W/F"//modelo
        producto[3][94] = "NOTE 9" //original
        producto[4][94] = "samsungNOTE 9" //oled

        producto[0][95] = "95"//id
        producto[1][95] = "samsungS10  W/F" //marca
        producto[2][95] = "S10  W/F"//modelo
        producto[3][95] = "samsungS10" //original
        producto[4][95] = "S10" //oled

        producto[0][96] = "96"//id
        producto[1][96] = "samsungS10 5G W/F" //marca
        producto[2][96] = "S10 5G W/F"//modelo
        producto[3][96] = "samsungS10 5G " //original
        producto[4][96] = "S10 5G" //oled
        producto[5][96] = "samsungS10" //incell
        producto[6][96] = "S10" // cof

        producto[0][97] = "97"//id
        producto[1][97] = "samsungS10 E W/F" //marca
        producto[2][97] = "S10 E W/F"//modelo
        producto[3][97] = "samsungS10 E " //original
        producto[4][97] = "S10 E" //oled
        producto[5][97] = "samsungS10 " //incell
        producto[6][97] = "S10" // cof

        producto[0][98] = "98"//id
        producto[1][98] = "samsungS10  PLUS W/F" //marca
        producto[2][98] = "S10  PLUS W/F"//modelo
        producto[3][98] = "samsungS10  PLUS" //original
        producto[4][98] = "S10  PLUS" //oled
        producto[5][98] = "samsungS10" //incell
        producto[6][98] = "S10" // cof

        producto[0][99] = "99"//id
        producto[1][99] = "samsungS20  W/F" //marca
        producto[2][99] = "S20  W/F"//modelo
        producto[3][99] = "samsungS20 " //original
        producto[4][99] = "S20 " //oled

        producto[0][100] = "100"//id
        producto[1][100] = "samsungS20 FE W/F" //marca
        producto[2][100] = "S20 FE W/F"//modelo
        producto[3][100] = "samsungS20 FE " //original
        producto[4][100] = "S20 FE " //oled
        producto[5][100] = "S20" //incell

        producto[0][101] = "101"//id
        producto[1][101] = "samsungS20 PLUS W/F" //marca
        producto[2][101] = "S20 PLUS W/F"//modelo
        producto[3][101] = "samsungS20 PLUS" //original
        producto[4][101] = "S20 PLUS" //oled
        producto[5][101] = "S20" //incell
        producto[6][101] = "0" // cof
        producto[7][101] = "0" //cog
        producto[8][101] = "0" // tft

        producto[0][102] = "102"//id
        producto[1][102] = "samsungS20 U W/F" //marca
        producto[2][102] = "S20 U W/F"//modelo
        producto[3][102] = "samsungS20 U" //original
        producto[4][102] = "S20 U " //oled
        producto[5][102] = "S20" //incell

        producto[0][103] = "103"//id
        producto[1][103] = "samsungS21 PLUS W/F" //marca
        producto[2][103] = "S21 PLUS W/F"//modelo
        producto[3][103] = "samsungS21 PLUS " //original
        producto[4][103] = "S21 PLUS" //oled
        producto[5][103] = "S21" //incell

        producto[0][104] = "104"//id
        producto[1][104] = "samsungS21 U W/F" //marca
        producto[2][104] = "S21 U W/F"//modelo
        producto[3][104] = "samsungS21 U" //original
        producto[4][104] = "S21 U" //oled
        producto[5][104] = "S21" //incell

        producto[0][105] = "105"//id
        producto[1][105] = "samsungS21 W/F" //marca
        producto[2][105] = "S21 W/F"//modelo
        producto[3][105] = "samsungS21 " //original
        producto[4][105] = "S21 " //oled

        producto[0][106] = "106"//id
        producto[1][106] = "samsungS7 EDGE W/F" //marca
        producto[2][106] = "S7 EDGE W/F"//modelo
        producto[3][106] = "samsungS7 EDGE" //original
        producto[4][106] = "S7 EDGE" //oled
        producto[5][106] = "S7" //incell

        producto[0][107] = "107"//id
        producto[1][107] = "samsungS8 W/F" //marca
        producto[2][107] = "S8 W/F"//modelo
        producto[3][107] = "samsungS8" //original
        producto[4][107] = "s8" //oled

        producto[0][108] = "108"//id
        producto[1][108] = "samsungS8 PLUS  W/F" //marca
        producto[2][108] = "S8 PLUS  W/F"//modelo
        producto[3][108] = "samsungS8 PLUS" //original
        producto[4][108] = "S8 PLUS " //oled
        producto[5][108] = "samsungS8+" //incell
        producto[6][108] = "s8+" // cof

        producto[0][109] = "109"//id
        producto[1][109] = "samsungS9 W/F" //marca
        producto[2][109] = "S9 W/F"//modelo
        producto[3][109] = "samsungS9" //original
        producto[4][109] = "S9" //oled

        producto[0][110] = "110"//id
        producto[1][110] = "samsungS9 plus  W/F" //marca
        producto[2][110] = "S9 plus  W/F"//modelo
        producto[3][110] = "samsungS9 plus" //original
        producto[4][110] = "S9 plus" //oled
        producto[5][110] = "samsungS9+" //incell
        producto[6][110] = "s9+" // cof

        producto[0][111] = "111"//id
        producto[1][111] = "samsungS5" //marca
        producto[2][111] = "S5"//modelo




        //apple



        producto[0][112] = "112"//id
        producto[1][112] = "5"
        producto[2][112] = "5S"//modelo
        producto[3][112] = "IPHONE5S"
        producto[4][112] = "IPHONE5"
        producto[5][112] = "IPH5S"
        producto[6][112] = "S"
        producto[7][112] = "5SIPHONE"

        producto[0][113] = "113"//id
        producto[1][113] = "5"
        producto[2][113] = "5C"//modelo
        producto[3][113] = "IPHONE5C"
        producto[4][113] = "IPHONE5"
        producto[5][113] = "IPH5C"
        producto[6][113] = "C"
        producto[7][113] = "5CIPHONE"

        producto[0][114] = "114"//id
        producto[1][114] = "6"
        producto[2][114] = "6S"//modelo
        producto[3][114] = "IPHONE6S"
        producto[4][114] = "IPHONE6"
        producto[5][114] = "IPH6S"
        producto[6][114] = "S"
        producto[7][114] = "6SIPHONE"


        producto[0][115] = "115"//id
        producto[1][115] = "6"
        producto[2][115] = "6G"//modelo
        producto[3][115] = "IPHONE6G"
        producto[4][115] = "IPHONE6"
        producto[5][115] = "IPH6"
        producto[6][115] = "G"
        producto[7][115] = "6GIPHONE"
        producto[8][115] = "IPH6G"

        producto[0][116] = "116"//id
        producto[1][116] = "6"
        producto[2][116] = "6PLUS"//modelo
        producto[3][116] = "IPHONE6PLUS"
        producto[4][116] = "IPHONE6"
        producto[5][116] = "PLUS"
        producto[6][116] = "IPHONE6+"
        producto[7][116] = "6+"
        producto[8][116] = "6PLUSIPHONE"
        producto[9][116] = "6P"
        producto[10][116] = "IPH6PLUS"
        producto[11][116] = "IPH6PLUS"

        producto[0][117] = "117"//id
        producto[1][117] = "6"
        producto[2][117] = "6SPLUS"//modelo
        producto[3][117] = "IPHONE6SPLUS"
        producto[4][117] = "IPHONE6S"
        producto[5][117] = "IPHONE6"
        producto[6][117] = "6S"
        producto[7][117] = "6PLUS"
        producto[8][117] = "6S+"
        producto[9][117] = "6SPLUSIPHONE"
        producto[10][117] = "PLUS"
        producto[11][117] = "IPH6SPLUS"

        producto[0][118] = "118"//id
        producto[1][118] = "7"
        producto[2][118] = "7G"//modelo
        producto[3][118] = "IPHONE7G"
        producto[4][118] = "IPHONE7"
        producto[5][118] = "G"
        producto[6][118] = "IPH7"
        producto[7][118] = "APPLEIPHONE7"
        producto[8][118] = "7GIPHONE"
        producto[9][118] = "IPH7G"

        producto[0][119] = "119"//id
        producto[1][119] = "7"
        producto[2][119] = "7PLUS"//modelo
        producto[3][119] = "IPHONE7PLUS"
        producto[4][119] = "IPHONE7"
        producto[5][119] = "PLUS"
        producto[8][119] = "7+"
        producto[9][119] = "7PLUSIPHONE"
        producto[10][119] = "IPH7PLUS"

        producto[0][120] = "120"//id
        producto[1][120] = "8"
        producto[2][120] = "8G"//modelo
        producto[3][120] = "IPHONE8G"
        producto[4][120] = "IPHONE8"
        producto[5][120] = "G"
        producto[6][120] = "8GIPHONE"
        producto[7][120] = "IPH8"
        producto[8][120] = "IPH8G"

        producto[0][121] = "121"//id
        producto[1][121] = "8"
        producto[2][121] = "8PLUS"//modelo
        producto[3][121] = "IPHONE8PLUS"
        producto[4][121] = "IPHONE8"
        producto[5][121] = "PLUS"
        producto[8][121] = "8+"
        producto[9][121] = "8PLUSIPHONE"
        producto[10][121] = "IPH8PLUS"
        producto[11][121] = "8P"
        producto[12][121] = "IPH8P"

        producto[0][122] = "122"//id
        producto[1][122] = "IPHONEX"
        producto[2][122] = "X"//modelo
        producto[3][122] = "XIPHONE"
        producto[4][122] = "10"
        producto[5][122] = "IPHONE10"
        producto[6][122] = "EQUIS"
        producto[7][122] = "IPHX"

        producto[0][123] = "123"//id
        producto[1][123] = "IPHONEXS"
        producto[2][123] = "XS"//modelo
        producto[3][123] = "IPHONEX"
        producto[4][123] = "X"
        producto[5][123] = "S"
        producto[6][123] = "IPHONE10S"
        producto[7][123] = "XSIPHONE"
        producto[8][123] = "IPHXS"

        producto[0][124] = "124"//id
        producto[1][124] = "XS"
        producto[2][124] = "Xsamsungax"//modelo
        producto[3][124] = "IPHONEXsamsungAX"
        producto[4][124] = "IPHONEXS"
        producto[5][124] = "MAX"
        producto[6][124] = "XMAX"
        producto[7][124] = "IPHXsamsungAX"

        producto[0][125] = "125"//id
        producto[1][125] = "IPHONEXR"
        producto[2][125] = "XR"//modelo
        producto[3][125] = "IPHONEX"
        producto[4][125] = "X"
        producto[5][125] = "R"
        producto[6][125] = "IPHONE10R"
        producto[7][125] = "XRIPHONE"
        producto[8][125] = "IPHXR"

        producto[0][126] = "126"//id
        producto[1][126] = "IPHONE11"
        producto[2][126] = "11"//modelo
        producto[3][126] = "11IPHONE"
        producto[4][126] = "IPHONE1"
        producto[5][126] = "IPH11"

        producto[0][127] = "127"//id
        producto[1][127] = "11"
        producto[2][127] = "11PRO"//modelo
        producto[3][127] = "IPHONE11PRO"
        producto[4][127] = "PRO"
        producto[5][127] = "IPHONE11"
        producto[6][127] = "IPHONEPRO"
        producto[7][127] = "11PROIPHONE"
        producto[8][127] = "IPH11PRO"

        producto[0][128] = "128"//id
        producto[1][128] = "11"
        producto[2][128] = "11PROMAX"//modelo
        producto[3][128] = "IPHONE11PROMAX"
        producto[4][128] = "IPHONE11PRO"
        producto[5][128] = "IPHONE11"
        producto[6][128] = "11PRO"
        producto[7][128] = "11MAX"
        producto[8][128] = "PROMAX"
        producto[9][128] = "11PROMAXIPHONE"
        producto[9][128] = "IPH11PROMAX"

        producto[0][129] = "129"//id
        producto[1][129] = "12"
        producto[2][129] = "12PRO"//modelo
        producto[3][129] = "IPHONE12"
        producto[4][129] = "IPHONE12PRO"
        producto[5][129] = "IPHONEPRO"
        producto[6][129] = "PRO"
        producto[7][129] = "12IPHONE"
        producto[8][129] = "12PROIPHONE"
        producto[8][129] = "IPH12PRO"

        producto[0][130] = "130"//id
        producto[1][130] = "12"
        producto[2][130] = "12PROMAX"//modelo
        producto[3][130] = "IPHONE12PROMAX"
        producto[4][130] = "IPHONE12PRO"
        producto[5][130] = "IPHONE12"
        producto[6][130] = "12PRO"
        producto[7][130] = "12MAX"
        producto[8][130] = "PROMAX"
        producto[9][130] = "12PROMAXIPHONE"
        producto[9][130] = "IPH12PROMAX"



        //LG



        producto[0][131] = "131"//id
        producto[1][131] = "11"
        producto[2][131] = "K11"//modelo
        producto[3][131] = "LGK11"
        producto[4][131] = "LGK"
        producto[5][131] = "K"
        producto[6][131] = "LG1"
        producto[7][131] = "LGK1"
        producto[8][131] = "K1"
        producto[9][131] = "K11LG"

        producto[0][132] = "132"//id
        producto[1][132] = "6"
        producto[2][132] = "Q6"//modelo
        producto[3][132] = "LGQ6"
        producto[4][132] = "Q"
        producto[5][132] = "LGQ"
        producto[6][132] = "LG6"
        producto[7][132] = "Q6LG"

        producto[0][133] = "133"//id
        producto[1][133] = "60"
        producto[2][133] = "Q60"//modelo
        producto[3][133] = "LGQ60"
        producto[4][133] = "Q6"
        producto[5][133] = "LG60"
        producto[6][133] = "LGQ"
        producto[7][133] = "LGQ6"
        producto[8][133] = "Q60LG"

        producto[0][134] = "134"//id
        producto[1][134] = "30"
        producto[2][134] = "K302018"//modelo
        producto[3][134] = "LGK302018"
        producto[4][134] = "2018"
        producto[5][134] = "LG2018"
        producto[6][134] = "LGK30"
        producto[7][134] = "K30"
        producto[8][134] = "302018"
        producto[9][134] = "LG30"

        producto[0][135] = "135"//id
        producto[1][135] = "42"
        producto[2][135] = "K42"
        producto[3][135] = "LGK42"
        producto[4][135] = "LG42"
        producto[5][135] = "LGK"
        producto[6][135] = "K"
        producto[7][135] = "4"
        producto[8][135] = "LG4"
        producto[9][135] = "K4"

        producto[0][136] = "136"//id
        producto[1][136] = "40S"
        producto[2][136] = "K40S"//modelo
        producto[3][136] = "LG40S"
        producto[4][136] = "40"
        producto[5][136] = "LG40"
        producto[6][136] = "LG4"
        producto[7][136] = "S"
        producto[8][136] = "LGS"
        producto[9][136] = "K4"

        producto[0][137] = "137"//id
        producto[1][137] = "51"
        producto[2][137] = "K51"//modelo
        producto[3][137] = "LGK51"
        producto[4][137] = "LG51"
        producto[5][137] = "LGK"
        producto[6][137] = "K"
        producto[7][137] = "5"
        producto[8][137] = "LG5"
        producto[9][137] = "K5"

        producto[0][138] = "138"//id
        producto[1][138] = "41"
        producto[2][138] = "K41"
        producto[3][138] = "LGK41"
        producto[4][138] = "LG41"
        producto[5][138] = "LGK"
        producto[6][138] = "K"
        producto[7][138] = "4"
        producto[8][138] = "LG4"
        producto[9][138] = "K4"

        producto[0][140] = "140"//id
        producto[1][140] = "52"
        producto[2][140] = "K52"
        producto[3][140] = "LGK52"
        producto[4][140] = "LG52"
        producto[5][140] = "LGK"
        producto[6][140] = "K"
        producto[7][140] = "5"
        producto[8][140] = "LG5"
        producto[9][140] = "K5"



        //Honor



        producto[0][141] = "141"//id
        producto[1][141] = "8X"
        producto[2][141] = "HONOR8X"
        producto[3][141] = "8XHONOR"
        producto[4][141] = "8"
        producto[5][141] = "X"
        producto[6][141] = "HUAWEIHONOR8X"
        producto[7][141] = "8XHONOR"

        producto[0][142] = "142"//id
        producto[1][142] = "10LITE"
        producto[2][142] = "HONOR10LITE"//modelo
        producto[3][142] = "10LITEHONOR"
        producto[4][142] = "HONORLITE"
        producto[5][142] = "LITEHONOR"
        producto[6][142] = "LITE10HONOR"
        producto[7][142] = "10"
        producto[8][142] = "LITE"
        producto[9][142] = "HONOR10"

        producto[0][143] = "143"//id
        producto[1][143] = "10"
        producto[2][143] = "HONOR10"//modelo
        producto[3][143] = "10HONOR"

        producto[0][144] = "144"//id
        producto[1][144] = "50LITE"
        producto[2][144] = "HONOR50LITE"//modelo
        producto[3][144] = "50LITEHONOR"
        producto[4][144] = "HONORLITE"
        producto[5][144] = "LITEHONOR"
        producto[6][144] = "LITE50HONOR"
        producto[7][144] = "50"
        producto[8][144] = "LITE"
        producto[9][144] = "HONOR50"



        //hauwei



        producto[0][145] = "145"//id
        producto[1][145] = "GEELITE"
        producto[2][145] = "GEELITEPLUS"//modelo
        producto[3][145] = "HUAWEIGEELITEPLUS"
        producto[4][145] = "HWGEELITEPLUS"
        producto[5][145] = "HWGEELITE"//incell
        producto[6][145] = "GE"//cof
        producto[7][145] = "HWGE"
        producto[8][145] = "HWGEELITE+"

        producto[0][146] = "146"//id
        producto[1][146] = "MATE"
        producto[2][146] = "MATE8"//modelo
        producto[3][146] = "HUAWEIMATE8"
        producto[4][146] = "HWMATE8"
        producto[5][146] = "HWMATE8"
        producto[6][146] = "MATE8HW"

        producto[0][147] = "147"//id
        producto[1][147] = "MATE"
        producto[2][147] = "MATE10"//modelo
        producto[3][147] = "HUAWEIMATE10"
        producto[4][147] = "HWMATE10"
        producto[5][147] = "HWMATE"//incell
        producto[6][147] = "HW10"//cof
        producto[7][147] = "10"
        producto[8][147] = "MATE10HW"

        producto[0][148] = "148"//id
        producto[1][148] = "NOVA3"
        producto[2][148] = "MATE20LITE"//modelo
        producto[3][148] = "NOVA"
        producto[4][148] = "MATE20"
        producto[5][148] = "HWMATE20LITE"//incell
        producto[6][148] = "HWNOVA3"//cof
        producto[7][148] = "HUAWEIMATE20"
        producto[8][148] = "HUAWEINOVA3"

        producto[0][149] = "149"//id
        producto[1][149] = "MATE20"
        producto[2][149] = "MATE20W/F"//modelo
        producto[3][149] = "HWMATE20"
        producto[4][149] = "HAUWEIMATE20"
        producto[5][149] = "MATE"
        producto[6][149] = "20"
        producto[7][149] = "W/F"

        producto[0][150] = "150"//id
        producto[1][150] = "5T"
        producto[2][150] = "NOVA5T"//modelo
        producto[3][150] = "NOVA5"
        producto[4][150] = "HWNOVA5T"
        producto[5][150] = "HUAWEINOVA5T"
        producto[6][150] = "NOVA"
        producto[7][150] = "NOVA5THW"

        producto[0][151] = "151"//id
        producto[1][151] = "PSMART"
        producto[2][151] = "PSMART2019"//modelo
        producto[3][151] = "HUAWEIPSMART"
        producto[4][151] = "HWPSMART"
        producto[5][151] = "HAUWEIPSMART2019"//incell
        producto[6][151] = "HWPSMART2019"
        producto[7][151] = "2019"
        producto[8][151] = "SMART"

        producto[0][152] = "152"//id
        producto[1][152] = "P10"
        producto[2][152] = "P10LITE"//modelo
        producto[3][152] = "HUAWEIP10LIE"
        producto[4][152] = "HWP10LITE"
        producto[5][152] = "LITE"
        producto[6][152] = "10"//cof
        producto[7][152] = "HWP10"
        producto[8][152] = "HUAWEIP10"

        producto[0][153] = "153"//id
        producto[1][153] = "P10"
        producto[2][153] = "P10SELFIE"//modelo
        producto[3][153] = "HWP10SELFIE"
        producto[4][153] = "HUAWEIP10SELFIE"
        producto[5][153] = "SELFIE"//incell
        producto[6][153] = "HWP10"//cof
        producto[7][153] = "HAUWEIP10"
        producto[8][153] = "P10SELFIEHW"

        producto[0][154] = "154"//id
        producto[1][154] = "P20"
        producto[2][154] = "P20LITE"//modelo
        producto[3][154] = "HUWEIP20LITE"
        producto[4][154] = "HWP20LITE"
        producto[5][154] = "LITE"//incell
        producto[6][154] = "HWP20"//cof
        producto[7][154] = "HAUWEIP20"
        producto[8][154] = "P20LITEHW"

        producto[0][155] = "155"//id
        producto[1][155] = "30"
        producto[2][155] = "P30"//modelo
        producto[3][155] = "HUAWEIP30"
        producto[4][155] = "HWP30"
        producto[5][155] = "HUAWEIP"//incell
        producto[6][155] = "HWP"//cof
        producto[7][155] = "HW30"

        producto[0][156] = "156"//id
        producto[1][156] = "P30"
        producto[2][156] = "P30LITE"//modelo
        producto[3][156] = "HUWEIP30LITE"
        producto[4][156] = "HWP30LITE"
        producto[5][156] = "LITE"//incell
        producto[6][156] = "HWP30"//cof
        producto[7][156] = "HAUWEIP30"
        producto[8][156] = "P30LITEHW"

        producto[0][157] = "157"//id
        producto[1][157] = "P30"
        producto[2][157] = "P30PRO"//modelo
        producto[3][157] = "HUWEIP30PRO"
        producto[4][157] = "HWP30PRO"
        producto[5][157] = "PRO"//incell
        producto[6][157] = "HWP30"//cof
        producto[7][157] = "HAUWEIP30"
        producto[8][157] = "P30PROHW"

        producto[0][158] = "158"//id
        producto[1][158] = "P40"
        producto[2][158] = "P40PRO"//modelo
        producto[3][158] = "HUWEIP40PRO"
        producto[4][158] = "HWP40PRO"
        producto[5][158] = "PRO"//incell
        producto[6][158] = "HWP40"//cof
        producto[7][158] = "HAUWEIP40"
        producto[8][158] = "P40PROHW"

        producto[0][159] = "159"//id
        producto[1][159] = "P9"
        producto[2][159] = "P9LITE"//modelo
        producto[3][159] = "HUWEIP9LITE"
        producto[4][159] = "HWP9LITE"
        producto[5][159] = "LITE"//incell
        producto[6][159] = "HWP9"//cof
        producto[7][159] = "HAUWEIP9"
        producto[8][159] = "P9LITEHW"

        producto[0][160] = "160"//id
        producto[1][160] = "P9"
        producto[2][160] = "P9LITE2017"//modelo
        producto[3][160] = "HUAWEIP9LITE2017"
        producto[4][160] = "HWP9LITE2017"
        producto[5][160] = "LITE"
        producto[6][160] = "2017"
        producto[7][160] = "HUAWEIP9LITE"
        producto[8][160] = "HWP9LITE"

        producto[0][161] = "161"//id
        producto[1][161] = "Y6"
        producto[2][161] = "Y62018"//modelo
        producto[3][161] = "HUAWEIY6"
        producto[4][161] = "HWY6"
        producto[5][161] = "2018"//incell
        producto[6][161] = "Y"//cof
        producto[7][161] = "HWY"
        producto[8][161] = "HAUWEIY"

        producto[0][162] = "162"//id
        producto[1][162] = "Y6S2019"
        producto[2][162] = "Y62019"//modelo
        producto[3][162] = "Y6"
        producto[4][162] = "Y6S"
        producto[5][162] = "HWY6S"//incell
        producto[6][162] = "HUWEIY6S"//cof
        producto[7][162] = "HWY6"
        producto[8][162] = "HAUWEIY6"
        producto[9][162] = "2019"
        producto[10][162] = "Y"

        producto[0][163] = "163"//id
        producto[1][163] = "Y6PRIME"
        producto[2][163] = "Y6PRIME2018"//modelo
        producto[3][163] = "HUAWEIY6PRIME2018"
        producto[4][163] = "HWY6PRIME2018"
        producto[5][163] = "HAUWEIY6PRIME"//incell
        producto[6][163] = "HWY6PRIME"//cof
        producto[7][163] = "Y6"
        producto[8][163] = "2018"

        producto[0][164] = "164"//id
        producto[1][164] = "Y7"
        producto[2][164] = "Y72018"//modelo
        producto[3][164] = "HWY72018"
        producto[4][164] = "HUAWEIWY72018"
        producto[5][164] = "HWY7"
        producto[6][164] = "HAUWEIY7"
        producto[7][164] = "2018"

        producto[0][165] = "165"//id
        producto[1][165] = "Y72019"
        producto[2][165] = "Y7PRIME2019"//modelo
        producto[3][165] = "HWY72019"
        producto[4][165] = "HAUWEIY72019"
        producto[5][165] = "HWY7"
        producto[6][165] = "HUAWEIY7"
        producto[7][165] = "Y7"
        producto[8][165] = "2019"
        producto[9][165] = "HWY7PRIME"
        producto[10][165] = "HAUWEIY7PRIME"

        producto[0][166] = "166"//id
        producto[1][166] = "Y9"
        producto[2][166] = "Y92018"//modelo
        producto[3][166] = "HWY92018"
        producto[4][166] = "HUAWEIWY92018"
        producto[5][166] = "HWY9"
        producto[6][166] = "HAUWEIY9"
        producto[7][166] = "2018"

        producto[0][167] = "167"//id
        producto[1][167] = "Y9"
        producto[2][167] = "Y92019"//modelo
        producto[3][167] = "HWY92019"
        producto[4][167] = "HUAWEIWY92019"
        producto[5][167] = "HWY9"
        producto[6][167] = "HAUWEIY9"
        producto[7][167] = "2019"

        producto[0][168] = "168"//id
        producto[1][168] = "Y9"
        producto[2][168] = "Y9PRIME"//modelo
        producto[3][168] = "HWY9PRIME"
        producto[4][168] = "HUAWEIWY9PRIME"
        producto[5][168] = "HWY9"
        producto[6][168] = "HUAWEIY9"
        producto[7][168] = "PRIME"

        producto[0][169] = "169"//id
        producto[1][169] = "Y9"
        producto[2][169] = "Y9S"//modelo
        producto[3][169] = "HWY9S"
        producto[4][169] = "HUAWEIWY9S"
        producto[5][169] = "HWY9"
        producto[6][169] = "HAUWEIY9"



        //ZTE


        producto[0][170] = "170"//id
        producto[1][170] = "BLADEV20"
        producto[2][170] = "BLADEV20SMART8010"//modelo
        producto[3][170] = "ZTEBLADEV20SMART8010"
        producto[4][170] = "BLADEV20SMART"
        producto[5][170] = "BLADE"
        producto[6][170] = "BLADEV"
        producto[7][170] = "V20"
        producto[8][170] = "ZTEV20"

        producto[0][171] = "171"//id
        producto[1][171] = "A3"
        producto[2][171] = "A3LITE"//modelo
        producto[3][171] = "ZTEA3LITE"
        producto[4][171] = "ZTELITE"
        producto[5][171] = "LITE"
        producto[6][171] = "A3LITEZTE"
        producto[7][171] = "ZTEA3"

        producto[0][172] = "172"//id
        producto[1][172] = "A51"
        producto[2][172] = "BLADEA51"//modelo
        producto[3][172] = "ZTEBLADEA51"
        producto[4][172] = "ZTEA51"
        producto[5][172] = "ZTE51"
        producto[6][172] = "ZTEBLADE"
        producto[7][172] = "BLADEA51ZTE"

        producto[0][173] = "173"//id
        producto[1][173] = "BLADEA602"
        producto[2][173] = "BLADEA602BLACK/GOLDEN"//modelo
        producto[3][173] = "ZTEBLADEA602"
        producto[4][173] = "ZTEBLADE"
        producto[5][173] = "ZTEA602"
        producto[6][173] = "A602"
        producto[7][173] = "BLADEA602ZTE"

        producto[0][174] = "174"//id
        producto[1][174] = "BLADEA7"
        producto[2][174] = "BLADEA72019"//modelo
        producto[3][174] = "ZTEBLADEA72019"
        producto[4][174] = "BLADEA7"
        producto[5][174] = "ZTEBLADEA7"
        producto[6][174] = "2019"
        producto[7][174] = "ZTE2019"
        producto[8][174] = "BLADEA72019ZTE"

        producto[0][175] = "175"//id
        producto[1][175] = "BLADE"
        producto[2][175] = "BLADE V10"//modelo
        producto[3][175] = "V10"
        producto[4][175] = "zte V10"

        producto[0][176] = "176"//id
        producto[1][176] = "BLADEV10"
        producto[2][176] = "BLADEV10VITA"//modelo
        producto[3][176] = "ZTEBLADEV10VITA"
        producto[4][176] = "ZTEBLADEV10"
        producto[5][176] = "BLADE10"
        producto[6][176] = "VITA"
        producto[7][176] = "ZTEVITA"
        producto[8][176] = "BLADEV10VITAZTE"
        producto[9][176] = "zte V10"
        producto[1][176] = "V10"

        producto[0][177] = "177"//id
        producto[1][177] = "BLADEZMAX"
        producto[2][177] = "BLADEZMAX-Z982"//modelo
        producto[3][177] = "ZTEBLADEZMAX-Z982"
        producto[4][177] = "BLADEZMAXZ982"
        producto[5][177] = "ZTEBLADEZMAXZ982"
        producto[6][177] = "Z982"
        producto[7][177] = "BLADEZMAX"
        producto[8][177] = "ZTEBLADEZMAX"
        producto[9][177] = "ZTEZ982"


        producto[0][178] = "178"//id
        producto[1][178] = "L8"
        producto[2][178] = "BLADEL8"//modelo
        producto[3][178] = "ZTEBLADEL8"
        producto[4][178] = "ZTEL8"
        producto[5][178] = "ZTEBLADE"
        producto[6][178] = "BLADEL8ZTE"

        producto[0][179] = "179"//id
        producto[1][179] = "BLADEA7S"
        producto[2][179] = "BLADEA7S2020"//modelo
        producto[3][179] = "BLADEA7S"
        producto[4][179] = "A7S"
        producto[5][179] = "BLADE"
        producto[6][179] = "ZTEBLADE"
        producto[7][179] = "ZTEA7S"
        producto[8][179] = "2020"
        producto[9][179] = "ZTEBLADEA7S2020"
        producto[10][179] = "ZTEBLADEA7S"

        producto[0][180] = "180"//id
        producto[1][180] = "ZMAXPRO"
        producto[2][180] = "ZMAXPRO-Z981"//modelo
        producto[3][180] = "ZMAXPROZ981"
        producto[4][180] = "ZTEMAXPROZ981"
        producto[5][180] = "ZTEMAXPRO"
        producto[6][180] = "ZTEZ981"
        producto[7][180] = "MAXPROZ981ZTE"

        producto[0][181] = "181"//id
        producto[1][181] = "BLADEV9VITA"
        producto[2][181] = "BLADEV9VITA-V0920"//modelo
        producto[3][181] = "ZTEBLADEV9VITA"
        producto[4][181] = "ZTEV0920"
        producto[5][181] = "V0920"
        producto[6][181] = "ZTEV9"
        producto[7][181] = "V9VITA"
        producto[8][181] = "BLADEV9VITAZTE"
        producto[8][181] = "BLADE"

        producto[0][182] = "182"//id
        producto[1][182] = "BLADEA5"
        producto[2][182] = "BLADEA52020"//modelo
        producto[3][182] = "ZTEBLADEA5"
        producto[4][182] = "2020"
        producto[5][182] = "ZTEA5"
        producto[6][182] = "A5"

        producto[0][183] = "183"//id
        producto[1][183] = "L210"
        producto[2][183] = "BLADEL210"//modelo
        producto[3][183] = "ZTEL210"
        producto[4][183] = "ZTEBLADEL210"
        producto[5][183] = "ZTE210"
        producto[6][183] = "210"
        producto[7][183] = "ZTEBLADEL210"
        producto[8][183] = "L210ZTE"



        //motorola



        producto[0][184] = "184"//id
        producto[1][184] = "20" //marca
        producto[2][184] = "E20"//modelo
        producto[3][184] = "E" //original
        producto[5][184] = "MOTOE20" //incell
        producto[6][184] = "MOTOROLAMOTOE20" // cof
        producto[7][184] = "MOTOROLAE20" //cog

        producto[0][185] = "185"//id
        producto[1][185] = "4" //marca
        producto[2][185] = "E4"//modelo
        producto[3][185] = "E" //original
        producto[4][185] = "MOTOE4" //oled
        producto[5][185] = "MOTOROLAE4" //incell

        producto[0][186] = "186"//id
        producto[1][186] = "40" //marca
        producto[2][186] = "E40"//modelo
        producto[3][186] = "E" //original
        producto[4][186] = "MOTOE40" //oled
        producto[5][186] = "MOTOROLAE40" //incell


        producto[0][187] = "187"//id
        producto[1][187] = "E4" //marca
        producto[2][187] = "E4PLUS"//modelo
        producto[3][187] = "MOTOE4PLUS" //original
        producto[4][187] = "MOTOROLAE4PLUS" //oled
        producto[5][187] = "MOTOE4" //incell
        producto[6][187] = "E" // cof

        producto[0][188] = "188"//id
        producto[1][188] = "G6PLAY" //marca
        producto[2][188] = "E5"//modelo
        producto[3][188] = "MOTOG6PLAY" //original
        producto[4][188] = "MOTOE5" //oled
        producto[5][188] = "MOTOROLAG6PLAY" //incell
        producto[6][188] = "MOTOROLAE5" // cof
        producto[7][188] = "E" //cog
        producto[8][188] = "G" // tft

        producto[0][189] = "189"//id
        producto[1][189] = "E5" //marca
        producto[2][189] = "E5PLUS"//modelo
        producto[3][189] = "MOTOE5PLUS" //original
        producto[4][189] = "MOTOROLAE5PLUS" //oled
        producto[5][189] = "MOTOE5" //incell
        producto[6][189] = "E" // cof


        producto[0][190] = "190"//id
        producto[1][190] = "E5PLAYW/F" //marca
        producto[2][190] = "E5PLAY"//modelo
        producto[3][190] = "MOTOE5PLAY" //
        producto[4][190] = "MOTOROLAE5PLAY" //oled
        producto[5][190] = "W/F" //incell
        producto[6][190] = "MOTOE5" // cof

        producto[0][191] = "191"//id
        producto[1][191] = "E5PLAY" //marca
        producto[2][191] = "E5PLAYGO "//modelo
        producto[3][191] = "MOTOROLAE5PLAYGO" //original
        producto[4][191] = "MOTOE5PLAYGO" //oled
        producto[5][191] = "E5" //incell
        producto[6][191] = "GO" // cof
        producto[7][191] = "MOTOE5PLAY" //cog

        producto[0][192] = "192"//id
        producto[1][192] = "motorola" //marca
        producto[2][192] = "E6"//modelo
        producto[3][192] = "325" //original
        producto[4][192] = "0" //oled
        producto[5][192] = "0" //incell
        producto[6][192] = "0" // cof
        producto[7][192] = "0" //cog
        producto[8][192] = "0" // tft

        producto[0][193] = "193"//id
        producto[1][193] = "E6I" //marca
        producto[2][193] = "E6S"//modelo
        producto[3][193] = "MOTOE6I" //original
        producto[4][193] = "MOTOE56S" //oled
        producto[5][193] = "MOTOROLAE6I" //incell
        producto[6][193] = "6I" // cof
        producto[7][193] = "6S" //cog

        producto[0][194] = "194"//id
        producto[1][194] = "E6" //marca
        producto[2][194] = "E6PLAY"//modelo
        producto[3][194] = "MOTOE6PLAY" //original
        producto[4][194] = "MOTOROLAE6PLAY" //oled
        producto[5][194] = "E" //incell

        producto[0][195] = "195"//id
        producto[1][195] = "E6" //marca
        producto[2][195] = "E6PLUS"//modelo
        producto[3][195] = "MOTOE6PLUS" //original
        producto[4][195] = "MOTOROLAE6PLUS" //oled
        producto[5][195] = "E" //incell

        producto[0][196] = "196"//id
        producto[1][196] = "E7POWER" //marca
        producto[2][196] = "E7"//modelo
        producto[3][196] = "E7IPOWER" //original
        producto[4][196] = "MOTOE7" //oled
        producto[5][196] = "MOTOE7POWER" //incell
        producto[6][196] = "MOTO7I" // cof
        producto[7][196] = "MOTOROLAE7POWER" //cog
        producto[8][196] = "MOTOROLARE7" // tft
        producto[8][196] = "MOTOROLARE7I"

        producto[0][197] = "197"//id
        producto[1][197] = "G" //marca
        producto[2][197] = "G5"//modelo
        producto[3][197] = "5" //original
        producto[4][197] = "MOTOG5" //oled
        producto[5][197] = "MOTOROLAG5" //incell

        producto[0][198] = "198"//id
        producto[1][198] = "G5" //marca
        producto[2][198] = "G5G"//modelo
        producto[3][198] = "G" //original
        producto[4][198] = "MOTOG5G" //oled
        producto[5][198] = "MOTOROLAG5G" //incell

        producto[0][199] = "199"//id
        producto[1][199] = "G5G" //marca
        producto[2][199] = "G5GPLUS"//modelo
        producto[3][199] = "MOTOG5GPLUS" //original
        producto[4][199] = "MOTOROLAG5GPLUS" //oled
        producto[5][199] = "MOTOGG5G" //incell
        producto[6][199] = "MOTOG5G" // cof
        producto[7][199] = "MOTOROLAG5G" //cog

        producto[0][200] = "200"//id
        producto[1][200] = "G5" //marca
        producto[2][200] = "G5S"//modelo
        producto[3][200] = "MOTOG5S" //original
        producto[4][200] = "MOTOROLAG5S" //oled

        producto[0][201] = "201"//id
        producto[1][201] = "G5" //marca
        producto[2][201] = "G5PLUS"//modelo
        producto[3][201] = "MOTOG5PLUS" //original
        producto[4][201] = "MOTOROLAG5PLUS" //oled

        producto[0][202] = "202"//id
        producto[1][202] = "G5S" //marca
        producto[2][202] = "G5SPLUS"//modelo
        producto[3][202] = "MOTOG5SPLUS" //original
        producto[4][202] = "MOTOROLAG5SPLUS" //oled
        producto[5][202] = "MOTOG5S" //incell
        producto[6][202] = "MOTOROLAG5S" // cof

        producto[0][203] = "203"//id
        producto[1][203] = "G" //marca
        producto[2][203] = "G6"//modelo
        producto[3][203] = "MOTOROLAG6" //original
        producto[4][203] = "MOTOG6" //oled

        producto[0][204] = "204"//id
        producto[1][204] = "G6" //marca
        producto[2][204] = "G6PLUS"//modelo
        producto[3][204] = "MOTOROLAG6" //original
        producto[4][204] = "MOTOG6" //oled
        producto[5][204] = "MOTOG6PLUS" //incell
        producto[6][204] = "MOTOROLAG6PLUS" // cof

        producto[0][205] = "205"//id
        producto[1][205] = "G7PLUS" //marca
        producto[2][205] = "G7"//modelo
        producto[3][205] = "MOTOG7" //original
        producto[4][205] = "MOTOG7PLUS" //oled
        producto[5][205] = "MOTOROLAG7" //incell
        producto[6][205] = "MOTOROLAG7PLUS" // cof

        producto[0][206] = "206"//id
        producto[1][206] = "G7" //marca
        producto[2][206] = "G7PLAY"//modelo
        producto[3][206] = "MOTOG7PLAY" //original
        producto[4][206] = "MOTOROLAG7PLAY" //oled
        producto[5][206] = "MOTOG7" //incell
        producto[6][206] = "MOTOROLARG7" // cof

        producto[0][207] = "207"//id
        producto[1][207] = "G7" //marca
        producto[2][207] = "G7POWER"//modelo
        producto[3][207] = "MOTOG7POWER" //original
        producto[4][207] = "MOTOROLAG7POWER" //oled
        producto[5][207] = "MOTOROLAG7" //incell
        producto[6][207] = "MOTOROLAG7POWER" // cof

        producto[0][208] = "208"//id
        producto[1][208] = "G" //marca
        producto[2][208] = "G8"//modelo
        producto[3][208] = "MOTOG8" //original
        producto[4][208] = "MOTOROLAG8" //oled

        producto[0][209] = "209"//id
        producto[1][209] = "ONEMACRO" //marca
        producto[2][209] = "G8PLAY"//modelo
        producto[3][209] = "ONE" //original
        producto[4][209] = "G8" //oled
        producto[5][209] = "MOTOONEMACRO" //incell
        producto[6][209] = "MOTOROLAONEMACRO" // cof
        producto[7][209] = "MOTOG8" //cog
        producto[8][209] = "MOTOROLAG8PLAY" // tft

        producto[0][210] = "210"//id
        producto[1][210] = "G8" //marca
        producto[2][210] = "G8PLUS"//modelo
        producto[3][210] = "MOTOG8PLUS" //original
        producto[4][210] = "MOTOROLAG8PLUS" //oled
        producto[5][210] = "MOTOG8" //incell
        producto[6][210] = "MOTOROLAG8" // cof

        producto[0][211] = "211"//id
        producto[1][211] = "G8" //marca
        producto[2][211] = "G8POWER"//modelo
        producto[3][211] = "MOTOG8" //original
        producto[4][211] = "MOTOROLAG8" //oled
        producto[5][211] = "MOTOG8POWER" //incell
        producto[6][211] = "MOTOROLAG8POWER" // cof

        producto[0][212] = "212"//id
        producto[1][212] = "G8" //marca
        producto[2][212] = "G8POWERLITE"//modelo
        producto[3][212] = "G8POWER" //original
        producto[4][212] = "LITE" //oled
        producto[5][212] = "MOTOG8POWERLITE" //incell
        producto[6][212] = "MOTOROLAG8POWERLITE" // cof
        producto[7][212] = "MOTOG8POWER" //cog
        producto[8][212] = "MOTOROLAG8POWER" // tft

        producto[0][213] = "213"//id
        producto[1][213] = "G9PLAY" //marca
        producto[2][213] = "G9"//modelo
        producto[3][213] = "E7PLUS" //original
        producto[4][213] = "E7" //oled
        producto[5][213] = "MOTOG9PLAY" //incell
        producto[6][213] = "MOTOROLAG9PLAY" // cof
        producto[7][213] = "MOTOG9" //cog
        producto[8][213] = "MOTOROLAG9" // tft
        producto[9][213] = "MOTOE7PLUS"
        producto[10][213] = "MOTOROLAE7PLUS"

        producto[0][214] = "214"//id
        producto[1][214] = "G9" //marca
        producto[2][214] = "G9PLUS"//modelo
        producto[3][214] = "MOTOG9" //original
        producto[4][214] = "MOTOROLAG9" //oled
        producto[5][214] = "MOTOG9PLUS" //incell
        producto[6][214] = "MOTOROLAG9PLUS" // cof

        producto[0][215] = "215"//id
        producto[1][215] = "G9" //marca
        producto[2][215] = "G9POWER"//modelo
        producto[3][215] = "MOTOG9" //original
        producto[4][215] = "MOTOROLAG9" //oled
        producto[5][215] = "MOTOG9POWER" //incell
        producto[6][215] = "MOTOROLAG9POWER" // cof

        producto[0][216] = "216"//id
        producto[1][216] = "G30" //marca
        producto[2][216] = "G10"//modelo
        producto[3][216] = "MOTOG10" //original
        producto[4][216] = "MOTOROLAG10" //oled
        producto[5][216] = "MOTOG30" //incell
        producto[6][216] = "MOTOROLAG30" // cof
        producto[7][216] = "G" //cog

        producto[0][217] = "217"//id
        producto[1][217] = "G" //marca
        producto[2][217] = "G20"//modelo
        producto[3][217] = "MOTOG20" //original
        producto[4][217] = "MOTOROLAG20" //oled

        producto[0][218] = "218"//id
        producto[1][218] = "G50" //marca
        producto[2][218] = "G504G"//modelo
        producto[3][218] = "4G" //original
        producto[4][218] = "MOTOG50" //oled
        producto[5][218] = "MOTOROLAG50" //incell
        producto[6][218] = "MOTOG504G" // cof
        producto[7][218] = "MOTOROLAG504G" //cog

        producto[0][219] = "219"//id
        producto[1][219] = "G50" //marca
        producto[2][219] = "G505G"//modelo
        producto[3][219] = "5G" //original
        producto[4][219] = "MOTOG50" //oled
        producto[5][219] = "MOTOROLAG50" //incell
        producto[6][219] = "MOTOG505G" // cof
        producto[7][219] = "MOTOROLAG505G" //cog

        producto[0][220] = "220"//id
        producto[1][220] = "G" //marca
        producto[2][220] = "G60"//modelo
        producto[3][220] = "60" //original
        producto[4][220] = "MOTOG60" //oled
        producto[5][220] = "MOTOROLAG60" //incell

        producto[0][221] = "221"//id
        producto[1][221] = "G" //marca
        producto[2][221] = "G100"//modelo
        producto[3][221] = "100" //original
        producto[4][221] = "MOTOG100" //oled
        producto[5][221] = "MOTOROLAG100" //incell

        producto[0][222] = "222"//id
        producto[1][222] = "MOTOROLAONE" //marca
        producto[2][222] = "ONE"//modelo
        producto[3][222] = "MOTOONE" //original
        producto[4][222] = "1" //oled

        producto[0][223] = "223"//id
        producto[1][223] = "ONE" //marca
        producto[2][223] = "ONEW/F"//modelo
        producto[3][223] = "MOTOROLAONE" //original
        producto[4][223] = "MOTOONE" //oled
        producto[5][223] = "MOTOROLAONEW/F" //incell
        producto[6][223] = "MOTOONEW/F" // cof
        producto[7][223] = "W/F" //cog

        producto[0][224] = "224"//id
        producto[1][224] = "ONE" //marca
        producto[2][224] = "ONEHYPER"//modelo
        producto[3][224] = "HYPER" //original
        producto[4][224] = "MOTOROLAONE" //oled
        producto[5][224] = "MOTOONE" //incell
        producto[6][224] = "MOTOROLAONEHYPER" // cof
        producto[7][224] = "MOTOONEHYPER" //cog

        producto[0][225] = "225"//id
        producto[1][225] = "ONE" //marca
        producto[2][225] = "ONEFUSION"//modelo
        producto[3][225] = "FUSION" //original
        producto[4][225] = "MOTOONE" //oled
        producto[5][225] = "MOTOROLAONE" //incell
        producto[6][225] = "MOTOONEFUSION" // cof
        producto[7][225] = "MOTOROLAONEFUSION" //cog
        producto[8][225] = "FUSSION" // tft

        producto[0][226] = "226"//id
        producto[1][226] = "ONE" //marca
        producto[2][226] = "ONEFUSIONPLUS"//modelo
        producto[3][226] = "FUSION" //original
        producto[4][226] = "MOTOONE" //oled
        producto[5][226] = "MOTOROLAONE" //incell
        producto[6][226] = "MOTOONEFUSIONPLUS" // cof
        producto[7][226] = "MOTOROLAONEFUSIONPLUS" //cog
        producto[8][226] = "PLUS" // tft

        producto[0][227] = "227"//id
        producto[1][227] = "ONE" //marca
        producto[2][227] = "ONEZOOM"//modelo
        producto[3][227] = "ZOOM" //original
        producto[4][227] = "MOTOONE" //oled
        producto[5][227] = "MOTOROLAONE" //incell
        producto[6][227] = "MOTOONEZOOM" // cof
        producto[7][227] = "MOTOROLAONEZOOM" //cog
        producto[8][227] = "ONEZOM" // tft

        producto[0][228] = "228"//id
        producto[1][228] = "ONEACTION" //marca
        producto[2][228] = "ONEVISION"//modelo
        producto[3][228] = "ONE" //original
        producto[4][228] = "MOTOROLAONEACTION" //oled
        producto[5][228] = "MOTOONEACTION" //incell
        producto[6][228] = "MOTOROLAONEVISION" // cof
        producto[7][228] = "MOTOONEVISION" //cog
        producto[8][228] = "MOTOONE" // tft
        producto[9][228] = "MOTOROLAONE" //incell

        producto[0][229] = "229"//id
        producto[1][229] = "EDCH" //marca
        producto[2][229] = "EDGE"//modelo
        producto[3][229] = "MOTOROLAEDGE" //original
        producto[4][229] = "MOTOEDGE" //oled

        producto[0][230] = "230"//id
        producto[1][230] = "GPLAY" //marca
        producto[2][230] = "GPLAY2021"//modelo
        producto[3][230] = "MOTOGPLAY" //original
        producto[4][230] = "MOTOROLAGPLAY" //oled
        producto[5][230] = "MOTOROLAGPLAY2021" //incell
        producto[6][230] = "MOTOGPLAY2021" // cof

        producto[0][231] = "231"//id
        producto[1][231] = "XPLAY" //marca
        producto[2][231] = "XPLAYW/F"//modelo
        producto[3][231] = "MOTOXPLAY" //original
        producto[4][231] = "MOTOROLAXPLAY" //oled
        producto[5][231] = "W/F" //incell
        producto[6][231] = "X" // cof
        producto[7][231] = "MOTOXPLAYW/F" //cog
        producto[8][231] = "MOTOROLAXPLAYW/F" // tft

        producto[0][232] = "232"//id
        producto[1][232] = "Z" //marca
        producto[2][232] = "ZPLAY"//modelo
        producto[3][232] = "MOTOZPLAY" //original
        producto[4][232] = "MOTOROLAZPLAY" //oled
        producto[5][232] = "MOTOZ" //incell
        producto[6][232] = "PLAY" // cof

        producto[0][233] = "233"//id
        producto[1][233] = "Z2" //marca
        producto[2][233] = "Z2PLAY"//modelo
        producto[3][233] = "MOTOZ2PLAY" //original
        producto[4][233] = "MOTOROLAZ2PLAY" //oled
        producto[5][233] = "MOTOZ2" //incell
        producto[6][233] = "PLAY" // cof

        producto[0][234] = "234"//id
        producto[1][234] = "Z3" //marca
        producto[2][234] = "Z3PLAY"//modelo
        producto[3][234] = "MOTOZ3PLAY" //original
        producto[4][234] = "MOTOROLAZ3PLAY" //oled
        producto[5][234] = "MOTOZ3" //incell
        producto[6][234] = "PLAY" // cof

        producto[0][235] = "235"//id
        producto[1][235] = "Z" //marca
        producto[2][235] = "Z4"//modelo
        producto[3][235] = "MOTOZ4" //original
        producto[4][235] = "MOTOROLAZ4" //oled



        //Realme



        producto[0][236] = "236"//id
        producto[1][236] = "21"
        producto[2][236] = "C21"//modelo
        producto[3][236] = "REALMEC21"
        producto[4][236] = "21"
        producto[5][236] = "C"
        producto[6][236] = "REALMEC"
        producto[7][236] = "REALME21"
        producto[8][236] = "C21REALME"

        producto[0][237] = "237"//id
        producto[1][237] = "7"
        producto[2][237] = "REALME7"//modelo
        producto[3][237] = "OPPOREALME7"
        producto[4][237] = "7REALME"



        //oppo



        producto[0][238] = "238"//id
        producto[1][238] = "12"
        producto[2][238] = "A12"//modelo
        producto[3][238] = "OPPOA12"
        producto[4][238] = "A12OPPO"
        producto[5][238] = "A"
        producto[6][238] = "OPPO12"
        producto[7][238] = "OPPOA"

        producto[0][239] = "239"//id
        producto[1][239] = "15"
        producto[2][239] = "A15"//modelo
        producto[3][239] = "OPPOA15"
        producto[4][239] = "A15OPPO"
        producto[5][239] = "A"
        producto[6][239] = "OPPO15"
        producto[7][239] = "OPPOA"

        producto[0][240] = "240"//id
        producto[1][240] = "16"
        producto[2][240] = "A15"//modelo
        producto[3][240] = "OPPOA15"
        producto[4][240] = "A15OPPO"
        producto[5][240] = "A"
        producto[6][240] = "OPPO15"
        producto[7][240] = "OPPOA"

        producto[0][241] = "241"//id
        producto[1][241] = "A53"
        producto[2][241] = "A53-4G"//modelo
        producto[3][241] = "OPPOA53"
        producto[4][241] = "A"
        producto[5][241] = "53"//incell
        producto[6][241] = "OPPOA"
        producto[7][241] = "OPPO53"
        producto[8][241] = "A53OPPO"

        producto[0][242] = "242"//id
        producto[1][242] = "73"
        producto[2][242] = "A73"//modelo
        producto[3][242] = "OPPOA73"
        producto[4][242] = "A73OPPO"
        producto[5][242] = "A"
        producto[6][242] = "OPPO73"
        producto[7][242] = "OPPOA"

        producto[0][243] = "243"//id
        producto[1][243] = "A9"
        producto[2][243] = "A92020"//modelo
        producto[3][243] = "OPPOA9"
        producto[4][243] = "2020"
        producto[5][243] = "OPPOA"//incell
        producto[6][243] = "A9OPPO"
        producto[7][243] = "OPPO9"

        producto[0][244] = "244"//id
        producto[1][244] = "RENO5"
        producto[2][244] = "RENO5LITE "//modelo
        producto[3][244] = "RENO"
        producto[4][244] = "LITE"
        producto[5][244] = "OPPORENO5"//incell
        producto[6][244] = "OPPORENO5LITE"



        //XIAOMI



        producto[0][245] = "245"//id
        producto[1][245] = "xiaomiMI 8" //marca
        producto[2][245] = "MI 8"//modelo
        producto[3][245] = "8" //original

        producto[0][246] = "246"//id
        producto[1][246] = "xiaomi MI 8 LITE" //marca
        producto[2][246] = "MI 8 LITE"//modelo
        producto[3][246] = "xiaomi MI 8" //original
        producto[4][246] = "LITE" //oled


        producto[0][247] = "247"//id
        producto[1][247] = "xiaomiMI 9" //marca
        producto[2][247] = "MI 9"//modelo
        producto[3][247] = "9" //original

        producto[0][248] = "248"//id
        producto[1][248] = "xiaomiMI9PRO" //marca
        producto[2][248] = "MI9T"//modelo
        producto[3][248] = "MI9PRO" //original
        producto[4][248] = "xiaomiMI9T" //oled
        producto[5][248] = "9" //incell
        producto[6][248] = "9T" // cof
        producto[7][248] = "9PRO" //cog

        producto[0][249] = "249"//id
        producto[1][249] = "xiaomiMI 9 LITE" //marca
        producto[2][249] = "MI 9 LITE"//modelo
        producto[3][249] = "LITE" //original
        producto[4][249] = "9" //oled
        producto[5][249] = "xiaomiMI 9" //incell

        producto[0][250] = "250"//id
        producto[1][250] = "xiaomiMI 10 LITE" //marca
        producto[2][250] = "MI 10 LITE"//modelo
        producto[3][250] = "MI 10" //original
        producto[4][250] = "LITE" //oled
        producto[5][250] = "10" //incell
        producto[6][250] = "xiaomiMI 10" // cof

        producto[0][251] = "251"//id
        producto[1][251] = "xiaomiMI 11i" //marca
        producto[2][251] = "MI 11i"//modelo
        producto[3][251] = "MI 11" //original
        producto[4][251] = "11" //oled
        producto[5][251] = "xiaomiMI 11" //incell

        producto[0][252] = "252"//id
        producto[1][252] = "xiaomi MI A5" //marca
        producto[2][252] = "MI A5"//modelo
        producto[3][252] = "5X" //original
        producto[4][252] = "5" //oled
        producto[5][252] = "xiaomi 5X" //incell

        producto[0][253] = "253"//id
        producto[1][253] = "xiaomiMI A2 LITE" //marca
        producto[2][253] = "MI A2 LITE"//modelo
        producto[3][253] = "MI A2" //original
        producto[4][253] = "xiaomiMI A2" //oled
        producto[5][253] = "A2" //incell

        producto[0][254] = "254"//id
        producto[1][254] = "xiaomiMI A3" //marca
        producto[2][254] = "MI A3"//modelo
        producto[3][254] = "A3" //original
        producto[4][254] = "xiaomi A3" //oled

        producto[0][257] = "257"//id
        producto[1][257] = "xiaomi MI NOTE 10" //marca
        producto[2][257] = "MI NOTE 10 "//modelo
        producto[3][257] = "MI NOTE" //original
        producto[4][257] = "10" //oled
        producto[5][257] = "xiaomi MI NOTE" //incell

        producto[0][256] = "256"//id
        producto[1][256] = "xiaomiMI NOTE 10 LITE" //marca
        producto[2][256] = "MI NOTE 10 LITE"//modelo
        producto[3][256] = "MI NOTE 10" //original
        producto[4][256] = "xiaomiMI NOTE 10" //oled
        producto[5][256] = "10" //incell
        producto[6][256] = "LITE" // cof
        producto[7][256] = "xiaomiMI NOTE" //cog

        producto[0][257] = "257"//id
        producto[1][257] = "xiaomiMI NOTE 10 PRO" //marca
        producto[2][257] = "MI NOTE 10 PRO"//modelo
        producto[3][257] = "MI NOTE 10" //original
        producto[4][257] = "xiaomiMI NOTE 10" //oled
        producto[5][257] = "xiaomiMI NOTE" //incell
        producto[6][257] = "NOTE" // cof
        producto[7][257] = "10" //cog

        producto[0][258] = "258"//id
        producto[1][258] = "xiaomi REDMI C3" //marca
        producto[2][258] = "REDMI C3"//modelo
        producto[3][258] = "mi REDMI C3" //original
        producto[4][258] = "c3" //oled
        producto[5][258] = "xiaomic3" //incell
        producto[6][258] = "mic3" // cof

        producto[0][259] = "259"//id
        producto[1][259] = "xiaomi REDMI 4A" //marca
        producto[2][259] = "REDMI 4A"//modelo
        producto[3][259] = "mi REDMI 4A" //original
        producto[4][259] = "4a" //oled
        producto[5][259] = "REDMI" //incell

        producto[0][260] = "260"//id
        producto[1][260] = "xiaomi REDMI 5" //marca
        producto[2][260] = "REDMI 5"//modelo
        producto[3][260] = "mi REDMI 5" //original
        producto[4][260] = "REDMI " //oled
        producto[5][260] = "5" //incell


        producto[0][261] = "261"//id
        producto[1][261] = "xiaomi REDMI 5 PLUS" //marca
        producto[2][261] = "REDMI 5 PLUS"//modelo
        producto[3][261] = "mi REDMI 5 PLUS" //original
        producto[4][261] = "xiaomi REDMI 5" //oled
        producto[5][261] = "redmi" //incell
        producto[6][261] = "5" // cof
        producto[7][261] = "pluss" //cog

        producto[0][262] = "262"//id
        producto[1][262] = "xiaomi REDMI 6" //marca
        producto[2][262] = "REDMI 6"//modelo
        producto[3][262] = "6A" //original
        producto[4][262] = "xiaomi 6a" //oled
        producto[5][262] = "6" //incell
        producto[6][262] = "redmi" // cof
        producto[7][262] = "mi REDMI 6" //cog
        producto[8][262] = "mi 6a" // tft

        producto[0][263] = "263"//id
        producto[1][263] = "xiaomi REDMI 6 PRO" //marca
        producto[2][263] = "REDMI 6 PRO"//modelo
        producto[3][263] = "mi REDMI 6 PRO" //original
        producto[4][263] = "xiaomi REDMI 6" //oled
        producto[5][263] = "mi REDMI 6" //incell
        producto[6][263] = "6" // cof
        producto[7][263] = "redmi" //cog

        producto[0][264] = "264"//id
        producto[1][264] = "xiaomiREDMI 7" //marca
        producto[2][264] = "REDMI 7"//modelo
        producto[3][264] = "mi REDMI 7" //original
        producto[4][264] = "redmi" //oled
        producto[5][264] = "7" //incell

        producto[0][265] = "265"//id
        producto[1][265] = "xiaomiREDMI 7A" //marca
        producto[2][265] = "REDMI 7A"//modelo
        producto[3][265] = "mi REDMI 7A" //original
        producto[4][265] = "7a" //oled
        producto[5][265] = "redmi" //incell
        producto[6][265] = "REDMI 7"//modelo


        producto[0][266] = "266"//id
        producto[1][266] = "xiaomi REDMI 7 PRO" //marca
        producto[2][266] = "REDMI 7 PRO"//modelo
        producto[3][266] = "xiaomi REDMI 7" //original
        producto[4][266] = "miREDMI 7 PRO" //oled
        producto[5][266] = "mi REDMI 7 " //incell
        producto[6][266] = "redmi" // cof
        producto[7][266] = "7" //cog

        producto[0][267] = "267"//id
        producto[1][267] = "xiaomi REDMI 8" //marca
        producto[2][267] = "REDMI 8"//modelo
        producto[3][267] = "8A" //original
        producto[4][267] = "miREDMI 8" //oled
        producto[5][267] = "xioami8a" //incell
        producto[6][267] = "mi8a" // cof
        producto[7][267] = "8" //cog
        producto[8][267] = "redmi" // tft

        producto[0][268] = "268"//id
        producto[1][268] = "xiaomiREDMI 8 PRO" //marca
        producto[2][268] = "REDMI 8 PRO"//modelo
        producto[3][268] = "mi REDMI 8 PRO" //original
        producto[4][268] = "xiaomiREDMI 8" //oled
        producto[5][268] = "mi REDMI 8" //incell
        producto[6][268] = "redmi" // cof
        producto[7][268] = "8" //cog

        producto[0][269] = "269"//id
        producto[1][269] = "xiaomiREDMI 9" //marca
        producto[2][269] = "REDMI 9"//modelo
        producto[3][269] = "redmi" //original
        producto[4][269] = "9" //oled
        producto[5][269] = "mi REDMI 9" //incell

        producto[0][270] = "270"//id
        producto[1][270] = "xiaomi REDMI 9T" //marca
        producto[2][270] = "REDMI 9T"//modelo
        producto[3][270] = "9t" //original
        producto[4][270] = "redmi" //oled
        producto[5][270] = "mi REDMI 9T" //incell


        producto[0][271] = "271"//id
        producto[1][271] = "xiaomi REDMI 9A" //marca
        producto[2][271] = "REDMI 9A"//modelo
        producto[3][271] = "9C" //original
        producto[4][271] = "mi REDMI 9A" //oled
        producto[5][271] = "xiaomi 9c " //incell
        producto[6][271] = "mi 9c" // cof
        producto[7][271] = "9" //cog
        producto[8][271] = "redmi" // tft

        producto[0][272] = "272"//id
        producto[1][272] = "xiaomi REDMI 10" //marca
        producto[2][272] = "REDMI 10"//modelo
        producto[3][272] = "10" //original
        producto[4][272] = "redmi" //oled
        producto[5][272] = "mi REDMI 10" //incell

        producto[0][273] = "273"//id
        producto[1][273] = "xiaomi REDMI GO" //marca
        producto[2][273] = "REDMI GO"//modelo
        producto[3][273] = "mi REDMI GO" //original
        producto[4][273] = "redmi" //oled
        producto[5][273] = "go" //incell

        producto[0][274] = "274"//id
        producto[1][274] = "xiaomi REDMI S2" //marca
        producto[2][274] = "REDMI S2"//modelo
        producto[3][274] = "mi REDMI S2" //original
        producto[4][274] = "redmi" //oled
        producto[5][274] = "s2" //incell

        producto[0][275] = "275"//id
        producto[1][275] = "xiaomiREDMI NOTE 5A" //marca
        producto[2][275] = "REDMI NOTE 5A"//modelo
        producto[3][275] = "mi REDMI NOTE 5A" //original
        producto[4][275] = "xiaomiREDMI NOTE" //oled
        producto[5][275] = "mi REDMI NOTE" //incell
        producto[6][275] = "mi REDMI 5a" // cof
        producto[7][275] = "xiaomiREDMI5a" //cog
        producto[8][275] = "5" // tft
        producto[9][275] = "redmi"

        producto[0][276] = "276"//id
        producto[1][276] = "xiaomi NOTE 5 PRO" //marca
        producto[2][276] = "REDMI NOTE 5"//modelo
        producto[4][276] = "NOTE 5 PRO" //oled
        producto[5][276] = "mi NOTE 5 PRO" //incell
        producto[6][276] = "xiaomi NOTE 5" // cof
        producto[7][276] = "mi NOTE 5" //cog
        producto[8][276] = "5" // tft
        producto[9][276] = "redmi"

        producto[0][277] = "277"//id
        producto[1][277] = "xiaomi NOTE 6 PRO" //marca
        producto[2][277] = "REDMI NOTE 6"//modelo
        producto[4][277] = "NOTE 6 PRO" //oled
        producto[5][277] = "mi NOTE 6 PRO" //incell
        producto[6][277] = "xiaomi NOTE 6" // cof
        producto[7][277] = "mi NOTE 6" //cog
        producto[8][277] = "6" // tft
        producto[9][277] = "redmi"

        producto[0][278] = "278"//id
        producto[1][278] = "xiaomi NOTE 57 PRO" //marca
        producto[2][278] = "REDMI NOTE 7"//modelo
        producto[4][278] = "NOTE 7 PRO" //oled
        producto[5][278] = "mi NOTE 7 PRO" //incell
        producto[6][278] = "xiaomi NOTE 7" // cof
        producto[7][278] = "mi NOTE 7" //cog
        producto[8][278] = "7" // tft
        producto[9][278] = "redmi"

        producto[0][279] = "279"//id
        producto[1][279] = "xiaomiREDMI NOTE 8" //marca
        producto[2][279] = "REDMI NOTE 8"//modelo
        producto[3][279] = "mi REDMI NOTE 8" //original
        producto[4][279] = "REDMI" //oled
        producto[5][279] = "NOTE 8" //incell
        producto[6][279] = "8" // cof

        producto[0][280] = "280"//id
        producto[1][280] = "xiaomi REDMI NOTE 8T" //marca
        producto[2][280] = "REDMI NOTE 8T"//modelo
        producto[3][280] = "mi redmi NOTE 8T" //original
        producto[4][280] = "NOTE 8T" //oled
        producto[5][280] = "8t" //incell
        producto[6][280] = "redmi" // cof


        producto[0][281] = "281"//id
        producto[1][281] = "xiaomiREDMI NOTE 8 PRO" //marca
        producto[2][281] = "REDMI NOTE 8 PRO"//modelo
        producto[3][281] = "mi REDMI NOTE 8 PRO" //original
        producto[4][281] = "mi REDMI NOTE 8" //oled
        producto[5][281] = "NOTE 8" //incell
        producto[6][281] = "xiaomiREDMI NOTE 8" // cof
        producto[7][281] = "redmi" //cog
        producto[8][281] = "8" // tft

        producto[0][282] = "282"//id
        producto[1][282] = "xiaomiREDMI NOTE 9" //marca
        producto[2][282] = "REDMI NOTE 9"//modelo
        producto[3][282] = "mi REDMI NOTE 9" //original
        producto[4][282] = "NOTE 9" //oled
        producto[5][282] = "mi NOTE 9" //incell
        producto[6][282] = "xiaomi NOTE 9" // cof
        producto[7][282] = "9" //cog

        producto[0][283] = "283"//id
        producto[1][283] = "xiaomiREDMI NOTE 9S" //marca
        producto[2][283] = "REDMI NOTE 9S"//modelo
        producto[3][283] = "NOTE 9 PRO" //original
        producto[4][283] = "xiaomi NOTE 9pro" //oled
        producto[5][283] = "mi NOTE 9pro" //incell
        producto[6][283] = "miREDMI NOTE 9S" // cof
        producto[7][283] = "9" //cog
        producto[8][283] = "note9s" // tft

        producto[0][284] = "284"//id
        producto[1][284] = "xiaomiREDMI NOTE 9T" //marca
        producto[2][284] = "REDMI NOTE 9T"//modelo
        producto[3][284] = "NOTE 9T" //original
        producto[4][284] = "miREDMI NOTE 9T" //oled
        producto[5][284] = "9t" //incell

        producto[0][285] = "285"//id
        producto[1][285] = "xiaomiREDMI NOTE 10" //marca
        producto[2][285] = "REDMI NOTE 10"//modelo
        producto[3][285] = "miREDMI NOTE 10" //original
        producto[4][285] = "NOTE 10" //oled
        producto[5][285] = "10" //incell
        producto[6][285] = "redmi" // cof

        producto[0][286] = "286"//id
        producto[1][286] = "xiaomiREDMI NOTE 10S" //marca
        producto[2][286] = "REDMI NOTE 10S"//modelo
        producto[3][286] = "mi REDMI NOTE 10S" //original
        producto[4][286] = "NOTE 10S" //oled
        producto[5][286] = "10s" //incell
        producto[6][286] = "mi NOTE 10S" // cof
        producto[7][286] = "xiaomi NOTE 10S" //cog

        producto[0][287] = "287"//id
        producto[1][287] = "xiaomiREDMI NOTE 10 PRO" //marca
        producto[2][287] = "REDMI NOTE 10 PRO"//modelo
        producto[3][287] = "miREDMI NOTE 10 PRO" //original
        producto[4][287] = "redmi" //oled
        producto[5][287] = "NOTE 10 PRO" //incell

        producto[0][288] = "288"//id
        producto[1][288] = "xiaomiREDMI POCO M3" //marca
        producto[2][288] = "REDMI POCO M3"//modelo
        producto[3][288] = "POCO M3" //original
        producto[4][288] = "mi REDMI POCO M3" //oled
        producto[5][288] = "xioami poco m3" //incell
        producto[6][288] = "mi poco m3" // cof
        producto[7][288] = "poco" //cog
        producto[8][288] = "m3" // tft

        producto[0][289] = "289"//id
        producto[1][289] = "xiaomiREDMI POCO x3" //marca
        producto[2][289] = "REDMI POCO x3"//modelo
        producto[3][289] = "POCO x3" //original
        producto[4][289] = "mi REDMI POCO x3" //oled
        producto[5][289] = "xioami poco x3" //incell
        producto[6][289] = "mi poco x3" // cof
        producto[7][289] = "poco" //cog
        producto[8][289] = "X3" // tft

        for (i in 0 until 290) {
            for (j in 0 until 12) {
                if(celularAhComparar.replace(" ","").replace("SM","SAMSUNG") == producto[j][i].toString().replace(" ","").uppercase()){
                    listaAuxiliar[aux] = producto[0][i].toString()
                    aux+= 1
                }
            }
        }

        val idQueSeManda = arrayOfNulls<String?>(aux)
        for (i in 0 until aux) {
           idQueSeManda[i] = listaAuxiliar[i]
        }

        return idQueSeManda
    }



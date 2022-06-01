package com.example.xpstockbeta1.listas

class listadb(var idCelular: String, var datoRequerido: String)  {


    operator fun invoke(): String {
        val idC = idCelular
        val datoR = datoRequerido
        return stock(idC, datoR)
    }

    public fun stock(idC: String, datoR: String):String{

        val id = idC
        val dato = datoR
        var datoQueSeManda = "0"
        var auxDatoRequerido = 0

        val producto = Array(9) { arrayOfNulls<String>(310) }

        for (i in 1 until 310) {
            producto[3][i] = "0"
            producto[4][i] = "0"
            producto[5][i] = "0"
            producto[6][i] = "0"
            producto[7][i] = "0"
            producto[8][i] = "0"
        }

        producto[0][0] = "id"//id
        producto[1][0] = "marca"
        producto[2][0] = "modelo"//modelo
        producto[3][0] = "original"
        producto[4][0] = "oled"
        producto[5][0] = "incell"
        producto[6][0] = "cof"
        producto[7][0] = "cog"
        producto[8][0] = "tft"

        producto[0][1] = "1"//id
        producto[1][1] = "samsung"
        producto[2][1] = "A01 - big M"//modelo
        producto[3][1] = "320"

        producto[0][2] = "2"//id
        producto[1][2] = "samsung"
        producto[2][2] = "A01 - small F"//modelo
        producto[3][2] = "320"

        producto[0][3] = "3"//id
        producto[1][3] = "samsung"
        producto[2][3] = "A01 core"//modelo
        producto[3][3] = "470"

        producto[0][4] = "4"//id
        producto[1][4] = "samsung"
        producto[2][4] = "A02S/A02core"//modelo
        producto[3][4] = "470"

        producto[0][5] = "5"//id
        producto[1][5] = "samsung"
        producto[2][5] = "A03"//modelo
        producto[3][5] = "500"

        producto[0][6] = "6"//id
        producto[1][6] = "samsung"
        producto[2][6] = "A03S"//modelo
        producto[3][6] = "470"

        producto[0][7] = "7"//id
        producto[1][7] = "samsung"
        producto[2][7] = "A03 Core"//modelo
        producto[3][7] = "500"

        producto[0][8] = "8"//id
        producto[1][8] = "samsung"
        producto[2][8] = "A10"//modelo
        producto[3][8] = "400"

        producto[0][9] = "9"//id
        producto[1][9] = "samsung"
        producto[2][9] = "A10 W/F"//modelo
        producto[3][9] = "430"

        producto[0][10] = "10"//id
        producto[1][10] = "samsung"
        producto[2][10] = "A10 E"//modelo
        producto[3][10] = "440"

        producto[0][11] = "11"//id
        producto[1][11] = "samsung"
        producto[2][11] = "A10S"//modelo
        producto[3][11] = "410"

        producto[0][12] = "12"//id
        producto[1][12] = "samsung"
        producto[2][12] = "A11"//modelo
        producto[3][12] = "470"

        producto[0][13] = "13"//id
        producto[1][13] = "samsung"
        producto[2][13] = "A12"//modelo
        producto[3][13] = "460"

        producto[0][290] = "290"//id
        producto[1][290] = "samsung" //marca
        producto[2][290] = "A13 4G / A135"//modelo
        producto[5][290] = "630" //incell

        producto[0][291] = "291"//id
        producto[1][291] = "samsung" //marca
        producto[2][291] = "A13 5G / A136"//modelo
        producto[5][291] = "530" //incell

        producto[0][14] = "14"//id
        producto[1][14] = "samsung"
        producto[2][14] = "A20"//modelo
        producto[4][14] = "780"
        producto[5][14] = "500"

        producto[0][15] = "15"//id
        producto[1][15] = "samsung"
        producto[2][15] = "A20 W/F"//modelo
        producto[4][15] = "820"

        producto[0][16] = "16"//id
        producto[1][16] = "samsung"
        producto[2][16] = "A20S"//modelo
        producto[3][16] = "470"

        producto[0][17] = "17"//id
        producto[1][17] = "samsung"
        producto[2][17] = "A21"//modelo
        producto[3][17] = "510"

        producto[0][18] = "18"//id
        producto[1][18] = "samsung"
        producto[2][18] = "A21S"//modelo
        producto[3][18] = "510"

        producto[0][19] = "19"//id
        producto[1][19] = "samsung"
        producto[2][19] = "A22  4G W/F"//modelo
        producto[3][19] = "1600"
        producto[4][19] = "1520"    // oled
        producto[5][19] = "580"

        producto[0][20] = "20"//id
        producto[1][20] = "samsung"
        producto[2][20] = "A22  4G/ 5G W/F SMALL"//modelo
        producto[4][20] = "1200"// oled

        producto[0][21] = "21"//id
        producto[1][21] = "samsung"
        producto[2][21] = "A22  5G W/F"//modelo
        producto[5][21] = "510"

        producto[0][291] = "291"//id
        producto[1][291] = "samsung" //marca
        producto[2][291] = "A23 / A235F"//m
        producto[5][291] = "650" //incell

        producto[0][22] = "22"//id
        producto[1][22] = "samsung"
        producto[2][22] = "A260/A2core *"//modelo
        producto[5][22] = "440"

        producto[0][23] = "23"//id
        producto[1][23] = "samsung"
        producto[2][23] = "A30"//modelo
        producto[4][23] = "780"
        producto[5][23] = "630"

        producto[0][24] = "24"//id
        producto[1][24] = "samsung"
        producto[2][24] = "A30 W/F"//modelo
        producto[4][24] = "855"

        producto[0][25] = "25"//id
        producto[1][25] = "samsung"
        producto[2][25] = "A30S"//modelo
        producto[4][25] = "780"
        producto[5][25] = "450"

        producto[0][26] = "26"//id
        producto[1][26] = "samsung"
        producto[2][26] = "A30S W/F"//modelo
        producto[4][26] = "855"

        producto[0][27] = "27"//id
        producto[1][27] = "samsung"
        producto[2][27] = "A315/A31"//modelo
        producto[5][27] = "560"

        producto[0][28] = "28"//id
        producto[1][28] = "samsung"
        producto[2][28] = "A315/A31 W/F"//modelo
        producto[4][28] = "890"
        producto[5][28] = "565"

        producto[0][29] = "29"//id
        producto[1][29] = "samsung"
        producto[2][29] = "A32/A325  4G W/F BIG"//modelo
        producto[3][29] = "1600"
        producto[4][29] = "1450"
        producto[5][29] = "650"

        producto[0][292] = "292"//id
        producto[1][292] = "samsung"
        producto[2][292] = "A32/A325  4G W/F SMALL"//modelo
        producto[4][292] = "1100"

        producto[0][30] = "30"//id
        producto[1][30] = "samsung"
        producto[2][30] = "A50"//modelo
        producto[4][30] = "750"
        producto[5][30] = "540"

        producto[0][31] = "31"//id
        producto[1][31] = "samsung"
        producto[2][31] = "A50 W/F"//modelo
        producto[4][31] = "800"

        producto[0][32] = "32"//id
        producto[1][32] = "samsung"
        producto[2][32] = "A50S"//modelo
        producto[4][32] = "750"
        producto[5][32] = "540"

        producto[0][33] = "33"//id
        producto[1][33] = "samsung"
        producto[2][33] = "A50S W/F"//modelo
        producto[4][33] = "800"

        producto[0][34] = "34"//id
        producto[1][34] = "samsung"
        producto[2][34] = "A510/A5-2016"//modelo
        producto[4][34] = "740"

        producto[0][35] = "35"//id
        producto[1][35] = "samsung"
        producto[2][35] = "A515/A51 BIG"//modelo
        producto[4][35] = "820"
        producto[5][35] = "580"

        producto[0][36] = "36"//id
        producto[1][36] = "samsung"
        producto[2][36] = "A515/A51 BIG W/F"//modelo
        producto[4][36] = "1250"

        producto[0][37] = "37"//id
        producto[1][37] = "samsung"
        producto[2][37] = "A515/A51 W/F"//modelo

        producto[0][38] = "38"//id
        producto[1][38] = "samsung"
        producto[2][38] = "A515/A51 SMALL"//modelo
        producto[4][38] = "825"

        producto[0][39] = "39"//id
        producto[1][39] = "samsung"
        producto[2][39] = "A515/A51 SMALL W/F"//modelo
        producto[4][39] = "870"

        producto[0][40] = "40"//id
        producto[1][40] = "samsung"
        producto[2][40] = "A52/A525  4G W/F"//modelo
        producto[3][40] = "2000"
        producto[4][40] = "1850"
        producto[5][40] = "650"

        producto[0][41] = "41"//id
        producto[1][41] = "samsung"
        producto[2][41] = "A52/A525 5G W/F"//modelo
        producto[3][41] = "2000"
        producto[4][41] = "1850"

        producto[0][42] = "42"//id
        producto[1][42] = "samsung"
        producto[2][42] = "A520/A5-2017 BIG"//modelo
        producto[4][42] = "780"
        producto[5][42] = "550"

        producto[0][43] = "43"//id
        producto[1][43] = "samsung"
        producto[2][43] = "A530/A5-2018"//modelo
        producto[4][43] = "950"
        producto[5][43] = "550"

        producto[0][44] = "44"//id
        producto[1][44] = "samsung"
        producto[2][44] = "A6 plus / J8 plus"//modelo
        producto[4][44] = "770"
        producto[5][44] = "580"

        producto[0][45] = "45"//id
        producto[1][45] = "samsung"
        producto[2][45] = "A70/A70S"//modelo
        producto[5][45] = "600"

        producto[0][46] = "46"//id
        producto[1][46] = "samsung"
        producto[2][46] = "A70/A70S BIG"//modelo
        producto[4][46] = "1450"

        producto[0][47] = "47"//id
        producto[1][47] = "samsung"
        producto[2][47] = "A70/A70S BIG W/F"//modelo
        producto[4][47] = "1535"

        producto[0][48] = "48"//id
        producto[1][48] = "samsung"
        producto[2][48] = "A70/A70S SMALL"//modelo
        producto[4][48] = "750"

        producto[0][49] = "49"//id
        producto[1][49] = "samsung"
        producto[2][49] = "A70/A70S SMALL W/F"//modelo
        producto[4][49] = "890"

        producto[0][50] = "50"//id
        producto[1][50] = "samsung"
        producto[2][50] = "A710/A7-2016"//modelo
        producto[4][50] = "650"
        producto[5][50] = "520"

        producto[0][51] = "51"//id
        producto[1][51] = "samsung"
        producto[2][51] = "A715/A71"//modelo
        producto[5][51] = "650"

        producto[0][52] = "52"//id
        producto[1][52] = "samsung"
        producto[2][52] = "A715/A71 BIF W/F"//modelo
        producto[4][52] = "1900"

        producto[0][53] = "53"//id
        producto[1][53] = "samsung"
        producto[2][53] = "A715/A71 BIG"//modelo
        producto[4][53] = "1860"

        producto[0][54] = "54"//id
        producto[1][54] = "samsung"
        producto[2][54] = "A715/A71 SMALL"//modelo
        producto[4][54] = "870"

        producto[0][55] = "55"//id
        producto[1][55] = "samsung"
        producto[2][55] = "A715/A71 SMALL W/F"//modelo
        producto[4][55] = "910"

        producto[0][56] = "56"//id
        producto[1][56] = "samsung"
        producto[2][56] = "A72/A725  4G W/F"//modelo
        producto[3][56] = "2000"
        producto[4][56] = "1350"
        producto[5][56] = "1000"

        producto[0][57] = "57"//id
        producto[1][57] = "samsung"
        producto[2][57] = "A720/A7-2017"//modelo
        producto[4][57] = "650"
        producto[5][57] = "520"

        producto[0][58] = "58"//id
        producto[1][58] = "samsung"
        producto[2][58] = "A730/A8 plus"//modelo
        producto[4][58] = "860"
        producto[5][58] = "630"

        producto[0][59] = "59"//id
        producto[1][59] = "samsung"
        producto[2][59] = "A750/A7-2018"//modelo
        producto[4][59] = "780"
        producto[5][59] = "620"

        producto[0][60] = "60"//id
        producto[1][60] = "samsung"
        producto[2][60] = "A80"//modelo
        producto[4][60] = "1600"
        producto[5][60] = "740"

        producto[0][61] = "61"//id
        producto[1][61] = "samsung"
        producto[2][61] = "A80 W/F"//modelo
        producto[4][61] = "1650"

        producto[0][62] = "62"//id
        producto[1][62] = "samsung"
        producto[2][62] = "A920 / A9 - 2018"//modelo
        producto[4][62] = "800"

        producto[0][63] = "63"//id
        producto[1][63] = "samsung"
        producto[2][63] = "A90"//modelo
        producto[4][63] = "1600"
        producto[5][63] = "740"

        producto[0][64] = "64"//id
        producto[1][64] = "samsung"
        producto[2][64] = "A90 W/F"//modelo
        producto[4][64] = "1650"

        producto[0][65] = "65"//id
        producto[1][65] = "samsung"
        producto[2][65] = "J260/J2 core*"//modelo
        producto[5][65] = "360"//incell

        producto[0][66] = "66"//id
        producto[1][66] = "samsung"
        producto[2][66] = "J3"//modelo
        producto[4][66] = "595"
        producto[5][66] = "280"//incell

        producto[0][67] = "67"//id
        producto[1][67] = "samsung"
        producto[2][67] = "J327 / J3 Pro *"//modelo
        producto[5][67] = "370"//incell

        producto[0][68] = "68"//id
        producto[1][68] = "samsung"
        producto[2][68] = "J4"//modelo
        producto[4][68] = "610"
        producto[5][68] = "400"//incell

        producto[0][69] = "69"//id
        producto[1][69] = "samsung"
        producto[2][69] = "J4 plus/J6 plus"//modelo
        producto[3][69] = "450"

        producto[0][70] = "70"//id
        producto[1][70] = "samsung"
        producto[2][70] = "J5"//modelo
        producto[4][70] = "595"
        producto[5][70] = "350"

        producto[0][71] = "71"//id
        producto[1][71] = "samsung"
        producto[2][71] = "J5 PRIME"//modelo
        producto[5][71] = "390"

        producto[0][72] = "72"//id
        producto[1][72] = "samsung"
        producto[2][72] = "J510/J5-2016*"//modelo
        producto[4][72] = "595"
        producto[5][72] = "380"

        producto[0][73] = "73"//id
        producto[1][73] = "samsung"
        producto[2][73] = "J530/J5 pro*"//modelo
        producto[4][73] = "580"
        producto[5][73] = "350"

        producto[0][74] = "74"//id
        producto[1][74] = "samsung"
        producto[2][74] = "J6"//modelo
        producto[4][74] = "900"
        producto[5][74] = "460"

        producto[0][75] = "75"//id
        producto[1][75] = "samsung"
        producto[2][75] = "J7"//modelo
        producto[4][75] = "600"
        producto[5][75] = "420"

        producto[0][76] = "76"//id
        producto[1][76] = "samsung"
        producto[2][76] = "J7 PRIME"//modelo
        producto[5][76] = "440"

        producto[0][77] = "77"//id
        producto[1][77] = "samsung"
        producto[2][77] = "J701/J7 neo*"//modelo
        producto[4][77] = "640"
        producto[5][77] = "425"

        producto[0][78] = "78"//id
        producto[1][78] = "samsung"
        producto[2][78] = "J710*"//modelo
        producto[4][78] = "640"
        producto[5][78] = "430"

        producto[0][79] = "79"//id
        producto[1][79] = "samsung"
        producto[2][79] = "J720 / J7 Duo*"//modelo
        producto[4][79] = "650"

        producto[0][80] = "80"//id
        producto[1][80] = "samsung"
        producto[2][80] = "J727 / J7 V *"//modelo
        producto[5][80] = "570"

        producto[0][81] = "81"//id
        producto[1][81] = "samsung"
        producto[2][81] = "J730/J7 pro*"//modelo
        producto[4][81] = "650"
        producto[5][81] = "425"

        producto[0][82] = "82"//id
        producto[1][82] = "samsung"
        producto[2][82] = "J8"//modelo
        producto[4][82] = "820"
        producto[5][82] = "470"

        producto[0][83] = "83"//id
        producto[1][83] = "samsung"
        producto[2][83] = "M01"//modelo
        producto[5][83] = "350"

        producto[0][84] = "84"//id
        producto[1][84] = "samsung" //marca
        producto[2][84] = "M10"//modelo
        producto[5][84] = "450" //incell

        producto[0][85] = "85"//id
        producto[1][85] = "samsung" //marca
        producto[2][85] = "M12 / M127"//modelo
        producto[5][85] = "530" //incell

        producto[0][86] = "86"//id
        producto[1][86] = "samsung" //marca
        producto[2][86] = "M20"//modelo
        producto[3][86] = "500" //original

        producto[0][87] = "87"//id
        producto[1][87] = "samsung" //marca
        producto[2][87] = "M21"//modelo
        producto[5][87] = "750" //incell

        producto[0][88] = "88"//id
        producto[1][88] = "samsung" //marca
        producto[2][88] = "M30 / M30S / M31"//modelo
        producto[5][88] = "570" //incell

        producto[0][89] = "89"//id
        producto[1][89] = "samsung" //marca
        producto[2][89] = "NOTE 10 plus W/F"//modelo
        producto[3][89] = "5500" //original

        producto[0][294] = "294"//id
        producto[1][294] = "samsung" //marca
        producto[2][294] = "NOTE 10 W/F SMALL"//modelo
        producto[3][294] = "1200" //original

        producto[0][90] = "90"//id
        producto[1][90] = "samsung" //marca
        producto[2][90] = "NOTE 10 W/F"//modelo
        producto[3][90] = "4400" //original

        producto[0][91] = "91"//id
        producto[1][91] = "samsung" //marca
        producto[2][91] = "NOTE 20 U W/F"//modelo
        producto[3][91] = "7200" //original

        producto[0][295] = "295"//id
        producto[1][295] = "samsung" //marca
        producto[2][295] = "NOTE 20 U W/F SMALL"//mo
        producto[3][295] = "1300" //original

        producto[0][92] = "92"//id
        producto[1][92] = "samsung" //marca
        producto[2][92] = "NOTE 20 W/F"//modelo
        producto[3][92] = "4000" //original

        producto[0][93] = "93"//id
        producto[1][93] = "samsung" //marca
        producto[2][93] = "NOTE 8 W/F"//modelo
        producto[3][93] = "3500" //original

        producto[0][94] = "94"//id
        producto[1][94] = "samsung" //marca
        producto[2][94] = "NOTE 9 W/F"//modelo
        producto[3][94] = "3600" //original

        producto[0][95] = "95"//id
        producto[1][95] = "samsung" //marca
        producto[2][95] = "S10  W/F"//modelo
        producto[3][95] = "4200" //original

        producto[0][296] = "296"//id
        producto[1][296] = "samsung" //marca
        producto[2][296] = "S10 lite"//modelo
        producto[3][296] = "1200" //original

        producto[0][96] = "96"//id
        producto[1][96] = "samsung" //marca
        producto[2][96] = "S10 5G W/F"//modelo
        producto[3][96] = "4800" //original

        producto[0][97] = "97"//id
        producto[1][97] = "samsung" //marca
        producto[2][97] = "S10 E W/F"//modelo
        producto[3][97] = "2800" //original

        producto[0][98] = "98"//id
        producto[1][98] = "samsung" //marca
        producto[2][98] = "S10  PLUS W/F"//modelo
        producto[3][98] = "5000" //original

        producto[0][99] = "99"//id
        producto[1][99] = "samsung" //marca
        producto[2][99] = "S20  W/F"//modelo
        producto[3][99] = "4500" //original

        producto[0][100] = "100"//id
        producto[1][100] = "samsung" //marca
        producto[2][100] = "S20 FE W/F"//modelo
        producto[3][100] = "2200" //original

        producto[0][101] = "101"//id
        producto[1][101] = "samsung" //marca
        producto[2][101] = "S20 PLUS W/F"//modelo
        producto[3][101] = "5900" //original

        producto[0][102] = "102"//id
        producto[1][102] = "samsung" //marca
        producto[2][102] = "S20 U W/F"//modelo
        producto[3][102] = "5000" //original

        producto[0][103] = "103"//id
        producto[1][103] = "samsung" //marca
        producto[2][103] = "S21 PLUS W/F"//modelo
        producto[3][103] = "4300" //original

        producto[0][104] = "104"//id
        producto[1][104] = "samsung" //marca
        producto[2][104] = "S21 U W/F"//modelo
        producto[3][104] = "6900" //original

        producto[0][105] = "105"//id
        producto[1][105] = "samsung" //marca
        producto[2][105] = "S21 W/F"//modelo
        producto[3][105] = "4100" //original

        producto[0][297] = "297"//id
        producto[1][297] = "samsung" //marca
        producto[2][297] = "S6"//mode
        producto[3][297] = "1200" //original

        producto[0][298] = "298"//id
        producto[1][298] = "samsung" //marca
        producto[2][298] = "S6 EDGE W/F"//mode
        producto[3][298] = "1900" //original

        producto[0][299] = "299"//id
        producto[1][299] = "samsung" //marca
        producto[2][299] = "S7"//mode
        producto[3][299] = "1500" //original

        producto[0][106] = "106"//id
        producto[1][106] = "samsung" //marca
        producto[2][106] = "S7 EDGE W/F"//modelo
        producto[3][106] = "2100" //original

        producto[0][107] = "107"//id
        producto[1][107] = "samsung" //marca
        producto[2][107] = "S8 W/F"//modelo
        producto[3][107] = "3000" //original

        producto[0][300] = "300"//id
        producto[1][300] = "samsung" //marca
        producto[2][300] = "S8 W/F SMALL"//modelo
        producto[3][300] = "1800" //original

        producto[0][108] = "108"//id
        producto[1][108] = "samsung" //marca
        producto[2][108] = "S8 PLUS  W/F"//modelo
        producto[3][108] = "3000" //original

        producto[0][109] = "109"//id
        producto[1][109] = "samsung" //marca
        producto[2][109] = "S9 W/F"//modelo
        producto[3][109] = "2400" //original

        producto[0][110] = "110"//id
        producto[1][110] = "samsung" //marca
        producto[2][110] = "S9 plus  W/F"//modelo
        producto[3][110] = "3000" //original

        producto[0][301] = "301"//id
        producto[1][301] = "samsung" //marca
        producto[2][301] = "S9 plus  W/F small"//model
        producto[3][301] = "1800" //original

        producto[0][111] = "111"//id
        producto[1][111] = "samsung" //marca
        producto[2][111] = "S5"//modelo
        producto[5][111] = "410" //incell



        //Apple



        producto[0][112] = "112"//id
        producto[1][112] = "apple"
        producto[2][112] = "5S"//modelo
        producto[5][112] = "250"//incell

        producto[0][113] = "113"//id
        producto[1][113] = "apple"
        producto[2][113] = "5C"//modelo
        producto[5][113] = "250"

        producto[0][114] = "114"//id
        producto[1][114] = "apple"
        producto[2][114] = "6S"//modelo
        producto[3][114] = "440"
        producto[5][114] = "350"

        producto[0][115] = "115"//id
        producto[1][115] = "apple"
        producto[2][115] = "6G"//modelo
        producto[3][115] = "400"
        producto[5][115] = "335"

        producto[0][116] = "116"//id
        producto[1][116] = "apple"
        producto[2][116] = "6 plus"//modelo
        producto[3][116] = "550"
        producto[5][116] = "400"

        producto[0][117] = "117"//id
        producto[1][117] = "apple"
        producto[2][117] = "6S plus"//modelo
        producto[3][117] = "590"
        producto[5][117] = "410"

        producto[0][118] = "118"//id
        producto[1][118] = "apple"
        producto[2][118] = "7G"//modelo
        producto[3][118] = "500"
        producto[5][118] = "350"

        producto[0][119] = "119"//id
        producto[1][119] = "apple"
        producto[2][119] = "7 plus"//modelo
        producto[3][119] = "590"
        producto[5][119] = "410"

        producto[0][120] = "120"//id
        producto[1][120] = "apple"
        producto[2][120] = "8G"//modelo
        producto[3][120] = "530"
        producto[5][120] = "350"

        producto[0][121] = "121"//id
        producto[1][121] = "apple"
        producto[2][121] = "8 plus"//modelo
        producto[3][121] = "590"
        producto[5][121] = "410"

        producto[0][122] = "122"//id
        producto[1][122] = "apple"
        producto[2][122] = "X"//modelo
        producto[4][122] = "980"
        producto[5][122] = "750"

        producto[0][123] = "123"//id
        producto[1][123] = "apple"
        producto[2][123] = "XS"//modelo
        producto[4][123] = "980"
        producto[5][123] = "850"

        producto[0][124] = "124"//id
        producto[1][124] = "apple"
        producto[2][124] = "XS MAX"//modelo
        producto[4][124] = "1700"
        producto[5][124] = "1100"

        producto[0][125] = "125"//id
        producto[1][125] = "apple"
        producto[2][125] = "XR"//modelo
        producto[5][125] = "1050"

        producto[0][126] = "126"//id
        producto[1][126] = "apple"
        producto[2][126] = "11"//modelo
        producto[5][126] = "1110"

        producto[0][127] = "127"//id
        producto[1][127] = "apple"
        producto[2][127] = "11 PRO"//modelo
        producto[4][127] = "1450"
        producto[5][127] = "950"

        producto[0][128] = "128"//id
        producto[1][128] = "apple"
        producto[2][128] = "11 PRO MAX"//modelo
        producto[4][128] = "2400"

        producto[0][129] = "129"//id
        producto[1][129] = "apple"
        producto[2][129] = "12 / 12 PRO"//modelo
        producto[4][129] = "3100"

        producto[0][130] = "130"//id
        producto[1][130] = "apple"
        producto[2][130] = "12 PRO MAX"//modelo
        producto[4][130] = "4500"



        //LG



        producto[0][131] = "131"//id
        producto[1][131] = "lg"
        producto[2][131] = "K11"//modelo
        producto[3][131] = "420"

        producto[0][132] = "132"//id
        producto[1][132] = "lg"
        producto[2][132] = "Q6"//modelo
        producto[3][132] = "500"

        producto[0][133] = "133"//id
        producto[1][133] = "lg"
        producto[2][133] = "Q60"//modelo
        producto[3][133] = "470"

        producto[0][134] = "134"//id
        producto[1][134] = "lg"
        producto[2][134] = "K30 2018"//modelo
        producto[3][134] = "420"

        producto[0][135] = "135"//id
        producto[1][135] = "lg"
        producto[2][135] = "K42"//modelo
        producto[3][135] = "490"
        producto[5][135] = "500"

        producto[0][136] = "136"//id
        producto[1][136] = "lg"
        producto[2][136] = "K40S"//modelo
        producto[3][136] = "415"

        producto[0][137] = "137"//id
        producto[1][137] = "lg"
        producto[2][137] = "K51"//modelo
        producto[5][137] = "510"

        producto[0][138] = "138"//id
        producto[1][138] = "lg"
        producto[2][138] = "K41"//modelo
        producto[5][138] = "490"

        //id 139 disponible

        producto[0][140] = "140"//id
        producto[1][140] = "lg"
        producto[2][140] = "K52"//modelo
        producto[5][140] = "480"



        //honor



        producto[0][141] = "141"//id
        producto[1][141] = "honor"
        producto[2][141] = "HONOR 8X"//modelo
        producto[5][141] = "650"

        producto[0][142] = "142"//id
        producto[1][142] = "honor"
        producto[2][142] = "HONOR 10 LITE"//modelo
        producto[7][142] = "540"

        producto[0][143] = "143"//id
        producto[1][143] = "honor"
        producto[2][143] = "HONOR 10"//modelo
        producto[5][143] = "395"

        producto[0][144] = "144"//id
        producto[1][144] = "honor"
        producto[2][144] = "HONOR 50 LITE"//modelo
        producto[5][144] = "620"



        // huawei



        producto[0][145] = "145"//id
        producto[1][145] = "huawei"
        producto[2][145] = "GE ELITE PLUS"//modelo
        producto[5][145] = "310"//incell

        producto[0][146] = "146"//id
        producto[1][146] = "huawei"
        producto[2][146] = "MATE 8"//modelo
        producto[5][146] = "470"//incell

        producto[0][147] = "147"//id
        producto[1][147] = "huawei"
        producto[2][147] = "MATE 10"//modelo
        producto[5][147] = "750"//incell

        producto[0][148] = "148"//id
        producto[1][148] = "huawei"
        producto[2][148] = "MATE 20 LITE / NOVA 3"//modelo
        producto[3][148] = "460"

        producto[0][149] = "149"//id
        producto[1][149] = "huawei"
        producto[2][149] = "MATE 20 W/F"//modelo
        producto[4][149] = "1050"

        producto[0][150] = "150"//id
        producto[1][150] = "huawei"
        producto[2][150] = "NOVA 5 T"//modelo
        producto[5][150] = "575"//incell

        producto[0][151] = "151"//id
        producto[1][151] = "huawei"
        producto[2][151] = "P SMART 2019"//modelo
        producto[5][151] = "525"//incell

        producto[0][152] = "152"//id
        producto[1][152] = "huawei"
        producto[2][152] = "P10 LITE"//modelo
        producto[5][152] = "360"//incell

        producto[0][153] = "153"//id
        producto[1][153] = "huawei"
        producto[2][153] = "P10 SELFIE"//modelo
        producto[5][153] = "500"//incell

        producto[0][154] = "154"//id
        producto[1][154] = "huawei"
        producto[2][154] = "P20 LITE"//modelo
        producto[5][154] = "370"//incell

        producto[0][155] = "155"//id
        producto[1][155] = "huawei"
        producto[2][155] = "P30"//modelo
        producto[4][155] = "1200"
        producto[7][155] = "700"

        producto[0][156] = "156"//id
        producto[1][156] = "huawei"
        producto[2][156] = "P30 LITE"//modelo
        producto[6][156] = "700"//cof
        producto[7][156] = "510"

        producto[0][157] = "157"//id
        producto[1][157] = "huawei"
        producto[2][157] = "P30 PRO"//modelo
        producto[4][157] = "1300"

        producto[0][158] = "158"//id
        producto[1][158] = "huawei"
        producto[2][158] = "P40 PRO"//modelo
        producto[3][158] = "4400"

        producto[0][159] = "159"//id
        producto[1][159] = "huawei"
        producto[2][159] = "P9 LITE"//modelo
        producto[5][159] = "400"//incell
        producto[7][159] = "405"

        producto[0][160] = "160"//id
        producto[1][160] = "huawei"
        producto[2][160] = "P9 LITE 2017"//modelo
        producto[7][160] = "380"

        producto[0][161] = "161"//id
        producto[1][161] = "huawei"
        producto[2][161] = "Y6 2018"//modelo
        producto[7][161] = "350"

        producto[0][162] = "162"//id
        producto[1][162] = "huawei"
        producto[2][162] = "Y6 2019 / Y6S 2019"//modelo
        producto[5][162] = "380"//incell

        producto[0][163] = "163"//id
        producto[1][163] = "huawei"
        producto[2][163] = "Y6 PRIME 2018"//modelo
        producto[5][163] = "390"//incell

        producto[0][164] = "164"//id
        producto[1][164] = "huawei"
        producto[2][164] = "Y7 2018"//modelo
        producto[5][164] = "350"//incell

        producto[0][165] = "165"//id
        producto[1][165] = "huawei"
        producto[2][165] = "Y7 PRIME 2019 / Y7 2019"//modelo
        producto[5][165] = "350"//incell

        producto[0][166] = "166"//id
        producto[1][166] = "huawei"
        producto[2][166] = "Y9 2018"//modelo
        producto[5][166] = "360"//incell

        producto[0][167] = "167"//id
        producto[1][167] = "huawei"
        producto[2][167] = "Y9 2019"//modelo
        producto[3][167] = "680"
        producto[6][167] = "630"//cof
        producto[7][167] = "580"

        producto[0][168] = "168"//id
        producto[1][168] = "huawei"
        producto[2][168] = "Y9 PRIME"//modelo
        producto[6][168] = "700"//cof
        producto[7][168] = "460"

        producto[0][169] = "169"//id
        producto[1][169] = "huawei"
        producto[2][169] = "Y9S"//modelo
        producto[6][169] = "700"//cof
        producto[7][169] = "460"



        //zte



        producto[0][170] = "170"//id
        producto[1][170] = "zte"
        producto[2][170] = "BLADE V20 SMART - 8010"//modelo
        producto[3][170] = "650"

        producto[0][171] = "171"//id
        producto[1][171] = "zte"
        producto[2][171] = "A3 LITE"//modelo
        producto[3][171] = "340"

        producto[0][172] = "172"//id
        producto[1][172] = "zte"
        producto[2][172] = "BLADE A51"//modelo
        producto[3][172] = "570"

        producto[0][173] = "173"//id
        producto[1][173] = "zte"
        producto[2][173] = "BLADE A602 BLACK / GOLDEN"//modelo
        producto[3][173] = "380"

        producto[0][174] = "174"//id
        producto[1][174] = "zte"
        producto[2][174] = "BLADE A7 2019"//modelo
        producto[3][174] = "530"

        producto[0][175] = "175"//id
        producto[1][175] = "zte"
        producto[2][175] = "BLADE V10"//modelo
        producto[3][175] = "630"

        producto[0][176] = "176"//id
        producto[1][176] = "zte"
        producto[2][176] = "BLADE V10 VITA"//modelo
        producto[3][176] = "450"

        producto[0][177] = "177"//id
        producto[1][177] = "zte"
        producto[2][177] = "BLADE Z MAX - Z982"//modelo
        producto[3][177] = "430"

        producto[0][178] = "178"//id
        producto[1][178] = "zte"
        producto[2][178] = "BLADE L8"//modelo
        producto[3][178] = "370"

        producto[0][179] = "179"//id
        producto[1][179] = "zte"
        producto[2][179] = "BLADE A7S 2020"//modelo
        producto[3][179] = "600"

        producto[0][180] = "180"//id
        producto[1][180] = "zte"
        producto[2][180] = "Z MAX PRO - Z981"//modelo
        producto[3][180] = "520"

        producto[0][181] = "181"//id
        producto[1][181] = "zte"
        producto[2][181] = "BLADE V9 VITA - V0920"//modelo
        producto[3][181] = "380"

        producto[0][182] = "182"//id
        producto[1][182] = "zte"
        producto[2][182] = "BLADE A5 2020"//modelo
        producto[3][182] = "550"

        producto[0][183] = "183"//id
        producto[1][183] = "zte"
        producto[2][183] = "BLADE L210"//modelo
        producto[3][183] = "460"



        //motorola



        producto[0][184] = "184"//id
        producto[1][184] = "motorola" //marca
        producto[2][184] = "E20"//modelo
        producto[3][184] = "500" //original

        producto[0][185] = "185"//id
        producto[1][185] = "motorola" //marca
        producto[2][185] = "E4"//modelo
        producto[3][185] = "300" //original

        producto[0][186] = "186"//id
        producto[1][186] = "motorola" //marca
        producto[2][186] = "E40"//modelo
        producto[3][186] = "600" //original

        producto[0][187] = "187"//id
        producto[1][187] = "motorola" //marca
        producto[2][187] = "E4 plus"//modelo
        producto[3][187] = "370" //original

        producto[0][188] = "188"//id
        producto[1][188] = "motorola" //marca
        producto[2][188] = "E5 / G6 play"//modelo
        producto[3][188] = "430" //original

        producto[0][189] = "189"//id
        producto[1][189] = "motorola" //marca
        producto[2][189] = "E5 plus"//modelo
        producto[3][189] = "500" //original

        producto[0][190] = "190"//id
        producto[1][190] = "motorola" //marca
        producto[2][190] = "E5 play W/F"//modelo
        producto[3][190] = "500" //original

        producto[0][191] = "191"//id
        producto[1][191] = "motorola" //marca
        producto[2][191] = "E5 play go"//modelo
        producto[3][191] = "400" //original

        producto[0][192] = "192"//id
        producto[1][192] = "motorola" //marca
        producto[2][192] = "E6"//modelo
        producto[3][192] = "325" //original

        producto[0][193] = "193"//id
        producto[1][193] = "motorola" //marca
        producto[2][193] = "E6S / E6i"//modelo
        producto[3][193] = "500" //original

        producto[0][194] = "194"//id
        producto[1][194] = "motorola" //marca
        producto[2][194] = "E6 play"//modelo
        producto[3][194] = "370" //original

        producto[0][195] = "195"//id
        producto[1][195] = "motorola" //marca
        producto[2][195] = "E6 plus"//modelo
        producto[3][195] = "370" //original

        producto[0][196] = "196"//id
        producto[1][196] = "motorola" //marca
        producto[2][196] = "E7 / E7 power / E7i power"//modelo
        producto[3][196] = "480" //original

        producto[0][197] = "197"//id
        producto[1][197] = "motorola" //marca
        producto[2][197] = "G5"//modelo
        producto[3][197] = "275" //original

        producto[0][198] = "198"//id
        producto[1][198] = "motorola" //marca
        producto[2][198] = "G 5G"//modelo
        producto[3][198] = "550" //original

        producto[0][199] = "199"//id
        producto[1][199] = "motorola" //marca
        producto[2][199] = "G 5G plus"//modelo
        producto[3][199] = "750" //original

        producto[0][200] = "200"//id
        producto[1][200] = "motorola" //marca
        producto[2][200] = "G5S"//modelo
        producto[3][200] = "350" //original

        producto[0][201] = "201"//id
        producto[1][201] = "motorola" //marca
        producto[2][201] = "G5 plus"//modelo
        producto[3][201] = "350" //original

        producto[0][202] = "202"//id
        producto[1][202] = "motorola" //marca
        producto[2][202] = "G5s plus"//modelo
        producto[3][202] = "360" //original

        producto[0][203] = "203"//id
        producto[1][203] = "motorola" //marca
        producto[2][203] = "G6"//modelo
        producto[3][203] = "420" //original

        producto[0][204] = "204"//id
        producto[1][204] = "motorola" //marca
        producto[2][204] = "G6 plus"//modelo
        producto[3][204] = "470" //original

        producto[0][205] = "205"//id
        producto[1][205] = "motorola" //marca
        producto[2][205] = "G7 / G7 plus"//modelo
        producto[3][205] = "540" //original

        producto[0][206] = "206"//id
        producto[1][206] = "motorola" //marca
        producto[2][206] = "G7 play"//modelo
        producto[3][206] = "580" //original

        producto[0][207] = "207"//id
        producto[1][207] = "motorola" //marca
        producto[2][207] = "G7 power"//modelo
        producto[3][207] = "440" //original

        producto[0][208] = "208"//id
        producto[1][208] = "motorola" //marca
        producto[2][208] = "G8"//modelo
        producto[3][208] = "440" //original

        producto[0][209] = "209"//id
        producto[1][209] = "motorola" //marca
        producto[2][209] = "G8 play / One Macro"//modelo
        producto[3][209] = "430" //original

        producto[0][210] = "210"//id
        producto[1][210] = "motorola" //marca
        producto[2][210] = "G8 plus"//modelo
        producto[3][210] = "510" //original

        producto[0][211] = "211"//id
        producto[1][211] = "motorola" //marca
        producto[2][211] = "G8 power"//modelo
        producto[3][211] = "520" //original

        producto[0][212] = "212"//id
        producto[1][212] = "motorola" //marca
        producto[2][212] = "G8 power lite"//modelo
        producto[3][212] = "440" //original

        producto[0][213] = "213"//id
        producto[1][213] = "motorola" //marca
        producto[2][213] = "G9 / G9 play / E7 plus"//modelo
        producto[3][213] = "440" //original

        producto[0][214] = "214"//id
        producto[1][214] = "motorola" //marca
        producto[2][214] = "G9 plus"//modelo
        producto[3][214] = "515" //original

        producto[0][215] = "215"//id
        producto[1][215] = "motorola" //marca
        producto[2][215] = "G9 power"//modelo
        producto[3][215] = "540" //original

        producto[0][302] = "302"//id
        producto[1][302] = "motorola" //marca
        producto[2][302] = "G10 play / G Power 2021"//modelo
        producto[3][302] = "510" //original

        producto[0][216] = "216"//id
        producto[1][216] = "motorola" //marca
        producto[2][216] = "G10 / G30"//modelo
        producto[3][216] = "455" //original

        producto[0][217] = "217"//id
        producto[1][217] = "motorola" //marca
        producto[2][217] = "G20"//modelo
        producto[3][217] = "490" //original

        producto[0][303] = "303"//id
        producto[1][303] = "motorola" //marca
        producto[2][303] = "G22"//modelo
        producto[3][303] = "600" //original

        producto[0][304] = "304"//id
        producto[1][304] = "motorola" //marca
        producto[2][304] = "G31 / G41 / G71 OLED"//modelo
        producto[3][304] = "1200" //original

        producto[0][218] = "218"//id
        producto[1][218] = "motorola" //marca
        producto[2][218] = "G50 - 4g"//modelo
        producto[3][218] = "580" //original

        producto[0][219] = "219"//id
        producto[1][219] = "motorola" //marca
        producto[2][219] = "G50 - 5g"//modelo
        producto[3][219] = "600" //original

        producto[0][220] = "220"//id
        producto[1][220] = "motorola" //marca
        producto[2][220] = "G60/G51/G60S/G40 Fusion"//modelo
        producto[3][220] = "700" //original

        producto[0][221] = "221"//id
        producto[1][221] = "motorola" //marca
        producto[2][221] = "G100"//modelo
        producto[3][221] = "760" //original

        producto[0][305] = "305"//id
        producto[1][305] = "motorola" //marca
        producto[2][305] = "G200 / Edge 2021"//modelo
        producto[3][305] = "780" //original

        producto[0][306] = "306"//id
        producto[1][306] = "motorola" //marca
        producto[2][306] = "Gpure"//modelo
        producto[3][306] = "650" //original

        producto[0][222] = "222"//id
        producto[1][222] = "motorola" //marca
        producto[2][222] = "One"//modelo
        producto[3][222] = "540" //original

        producto[0][223] = "223"//id
        producto[1][223] = "motorola" //marca
        producto[2][223] = "One W/F"//modelo
        producto[3][223] = "600" //original

        producto[0][224] = "224"//id
        producto[1][224] = "motorola" //marca
        producto[2][224] = "One hyper"//modelo
        producto[3][224] = "560" //original

        producto[0][225] = "225"//id
        producto[1][225] = "motorola" //marca
        producto[2][225] = "One fusion"//modelo
        producto[3][225] = "500" //original

        producto[0][226] = "226"//id
        producto[1][226] = "motorola" //marca
        producto[2][226] = "One fusion plus"//modelo
        producto[3][226] = "520" //original

        producto[0][227] = "227"//id
        producto[1][227] = "motorola" //marca
        producto[2][227] = "One zoom"//modelo
        producto[3][227] = "825" //original

        producto[0][228] = "228"//id
        producto[1][228] = "motorola" //marca
        producto[2][228] = "One vision / One action"//modelo
        producto[3][228] = "1020" //original

        producto[0][229] = "229"//id
        producto[1][229] = "motorola" //marca
        producto[2][229] = "Edge"//modelo
        producto[3][229] = "3500" //original

        producto[0][230] = "230"//id
        producto[1][230] = "motorola" //marca
        producto[2][230] = "G play 2021"//modelo
        producto[3][230] = "600" //original

        producto[0][307] = "307"//id
        producto[1][307] = "motorola" //marca
        producto[2][307] = "G Stylus 2021"//modelo
        producto[3][307] = "610" //original

        producto[0][231] = "231"//id
        producto[1][231] = "motorola" //marca
        producto[2][231] = "X Play W/F"//modelo
        producto[3][231] = "405" //original

        producto[0][232] = "232"//id
        producto[1][232] = "motorola" //marca
        producto[2][232] = "Z Play"//modelo
        producto[3][232] = "600" //original

        producto[0][233] = "233"//id
        producto[1][233] = "motorola" //marca
        producto[2][233] = "Z2 Play"//modelo
        producto[3][233] = "600" //original

        producto[0][234] = "234"//id
        producto[1][234] = "motorola" //marca
        producto[2][234] = "Z3 Play"//modelo
        producto[3][234] = "760" //original

        producto[0][235] = "235"//id
        producto[1][235] = "motorola" //marca
        producto[2][235] = "Z4"//modelo
        producto[3][235] = "761" //original



        //realme



        producto[0][236] = "236"//id
        producto[1][236] = "realme"
        producto[2][236] = "C 21"//modelo
        producto[5][236] = "450"

        producto[0][237] = "237"//id
        producto[1][237] = "realme"
        producto[2][237] = "Realme 7"//modelo
        producto[5][237] = "575"



        //oppo



        producto[0][238] = "238"//id
        producto[1][238] = "oppo"
        producto[2][238] = "A12"//modelo
        producto[5][238] = "450"//incell

        producto[0][239] = "239"//id
        producto[1][239] = "oppo"
        producto[2][239] = "A15"//modelo
        producto[5][239] = "500"//incell

        producto[0][240] = "240"//id
        producto[1][240] = "oppo"
        producto[2][240] = "A16"//modelo
        producto[5][240] = "460"//incell

        producto[0][241] = "241"//id
        producto[1][241] = "oppo"
        producto[2][241] = "A53 - 4G"//modelo
        producto[5][241] = "550"//incell

        producto[0][242] = "242"//id
        producto[1][242] = "oppo"
        producto[2][242] = "A73"//modelo
        producto[5][242] = "520"//incell

        producto[0][243] = "243"//id
        producto[1][243] = "oppo"
        producto[2][243] = "A9 2020"//modelo
        producto[5][243] = "400"//incell

        producto[0][244] = "244"//id
        producto[1][244] = "oppo"
        producto[2][244] = "RENO 5 LITE "//modelo
        producto[3][244] = "2100"
        producto[5][244] = "720"//incell



        // xiaomi



        producto[0][245] = "245"//id
        producto[1][245] = "xiaomi" //marca
        producto[2][245] = "MI 8"//modelo
        producto[4][245] = "1260" //oled

        producto[0][246] = "246"//id
        producto[1][246] = "xiaomi" //marca
        producto[2][246] = "MI 8 LITE"//modelo
        producto[5][246] = "500" //incell

        producto[0][247] = "247"//id
        producto[1][247] = "xiaomi" //marca
        producto[2][247] = "MI 9"//modelo
        producto[4][247] = "880" //oled
        producto[5][247] = "680" //incell

        producto[0][248] = "248"//id
        producto[1][248] = "xiaomi" //marca
        producto[2][248] = "MI 9T / MI 9PRO"//modelo
        producto[4][248] = "920" //oled
        producto[5][248] = "700" //incell

        producto[0][249] = "249"//id
        producto[1][249] = "xiaomi" //marca
        producto[2][249] = "MI 9 LITE"//modelo
        producto[4][249] = "920" //oled
        producto[5][249] = "680" //incell

        producto[0][250] = "250"//id
        producto[1][250] = "xiaomi" //marca
        producto[2][250] = "MI 10 LITE"//modelo
        producto[4][250] = "1450" //oled

        producto[0][251] = "251"//id
        producto[1][251] = "xiaomi" //marca
        producto[2][251] = "MI 11i"//modelo
        producto[4][251] = "1300" //oled

        producto[0][252] = "252"//id
        producto[1][252] = "xiaomi" //marca
        producto[2][252] = "MI A1 / 5X"//modelo
        producto[5][252] = "360" //incell

        producto[0][253] = "253"//id
        producto[1][253] = "xiaomi" //marca
        producto[2][253] = "MI A2 LITE"//modelo
        producto[5][253] = "460" //incell

        producto[0][254] = "254"//id
        producto[1][254] = "xiaomi" //marca
        producto[2][254] = "MI A3"//modelo
        producto[5][254] = "570" //incell

        producto[0][255] = "255"//id
        producto[1][255] = "xiaomi" //marca
        producto[2][255] = "MI NOTE 10"//modelo
        producto[3][255] = "730" //original

        producto[0][256] = "256"//id
        producto[1][256] = "xiaomi" //marca
        producto[2][256] = "MI NOTE 10 LITE CURVA"//modelo
        producto[3][256] = "750" //original

        producto[0][257] = "257"//id
        producto[1][257] = "xiaomi" //marca
        producto[2][257] = "MI NOTE 10 Pro"//modelo
        producto[3][257] = "830" //original

        producto[0][258] = "258"//id
        producto[1][258] = "xiaomi" //marca
        producto[2][258] = "REDMI C3"//modelo
        producto[5][258] = "550" //incell
        producto[0][259] = "259"//id

        producto[1][259] = "xiaomi" //marca
        producto[2][259] = "REDMI 4A"//modelo
        producto[5][259] = "330" //incell

        producto[0][260] = "260"//id
        producto[1][260] = "xiaomi" //marca
        producto[2][260] = "REDMI 5"//modelo
        producto[5][260] = "530" //incell

        producto[0][261] = "261"//id
        producto[1][261] = "xiaomi" //marca
        producto[2][261] = "REDMI 5 PLUS"//modelo
        producto[5][261] = "460" //incell

        producto[0][262] = "262"//id
        producto[1][262] = "xiaomi" //marca
        producto[2][262] = "REDMI 6 / 6A"//modelo
        producto[5][262] = "395" //incell

        producto[0][263] = "263"//id
        producto[1][263] = "xiaomi" //marca
        producto[2][263] = "REDMI 6 PRO"//modelo
        producto[5][263] = "440" //incell

        producto[0][264] = "264"//id
        producto[1][264] = "xiaomi" //marca
        producto[2][264] = "REDMI 7"//modelo
        producto[5][264] = "435" //incell

        producto[0][265] = "265"//id
        producto[1][265] = "xiaomi" //marca
        producto[2][265] = "REDMI 7A"//modelo
        producto[5][265] = "410" //incell

        producto[0][266] = "266"//id
        producto[1][266] = "xiaomi" //marca
        producto[2][266] = "REDMI 7 PRO"//modelo
        producto[5][266] = "750" //incell

        producto[0][267] = "267"//id
        producto[1][267] = "xiaomi" //marca
        producto[2][267] = "REDMI 8 / 8A"//modelo
        producto[5][267] = "450" //incell

        producto[0][268] = "268"//id
        producto[1][268] = "xiaomi" //marca
        producto[2][268] = "REDMI 8 PRO"//modelo
        producto[5][268] = "570" //incell

        producto[0][269] = "269"//id
        producto[1][269] = "xiaomi" //marca
        producto[2][269] = "REDMI 9"//modelo
        producto[5][269] = "510" //incell

        producto[0][270] = "270"//id
        producto[1][270] = "xiaomi" //marca
        producto[2][270] = "REDMI 9T"//modelo
        producto[4][270] = "980" //oled
        producto[5][270] = "560" //incell

        producto[0][271] = "271"//id
        producto[1][271] = "xiaomi" //marca
        producto[2][271] = "REDMI 9A / 9C"//modelo
        producto[5][271] = "420" //incell

        producto[0][272] = "272"//id
        producto[1][272] = "xiaomi" //marca
        producto[2][272] = "REDMI 10"//modelo
        producto[5][272] = "500" //incell

        producto[0][273] = "273"//id
        producto[1][273] = "xiaomi" //marca
        producto[2][273] = "REDMI GO"//modelo
        producto[5][273] = "330" //incell

        producto[0][274] = "274"//id
        producto[1][274] = "xiaomi" //marca
        producto[2][274] = "REDMI S2"//modelo
        producto[5][274] = "400" //incell

        producto[0][275] = "275"//id
        producto[1][275] = "xiaomi" //marca
        producto[2][275] = "REDMI NOTE 5A"//modelo
        producto[5][275] = "330" //incell

        producto[0][276] = "276"//id
        producto[1][276] = "xiaomi" //marca
        producto[2][276] = "REDMI NOTE 5 / NOTE 5 PRO"//modelo
        producto[5][276] = "460" //incell

        producto[0][277] = "277"//id
        producto[1][277] = "xiaomi" //marca
        producto[2][277] = "REDMI NOTE 6 / NOTE 6 PRO"//modelo
        producto[5][277] = "640" //incell

        producto[0][278] = "278"//id
        producto[1][278] = "xiaomi" //marca
        producto[2][278] = "REDMI NOTE 7 / NOTE 7 PRO"//modelo
        producto[5][278] = "540" //incell

        producto[0][279] = "279"//id
        producto[1][279] = "xiaomi" //marca
        producto[2][279] = "REDMI NOTE 8"//modelo
        producto[5][279] = "520" //incell

        producto[0][280] = "280"//id
        producto[1][280] = "xiaomi" //marca
        producto[2][280] = "REDMI NOTE 8T"//modelo
        producto[5][280] = "590" //incell

        producto[0][281] = "281"//id
        producto[1][281] = "xiaomi" //marca
        producto[2][281] = "REDMI NOTE 8 PRO"//modelo
        producto[5][281] = "510" //incell

        producto[0][282] = "282"//id
        producto[1][282] = "xiaomi" //marca
        producto[2][282] = "REDMI NOTE 9"//modelo
        producto[5][282] = "500" //incell

        producto[0][283] = "283"//id
        producto[1][283] = "xiaomi" //marca
        producto[2][283] = "REDMI NOTE 9S / NOTE 9 PRO"//modelo
        producto[5][283] = "500" //incell

        producto[0][284] = "284"//id
        producto[1][284] = "xiaomi" //marca
        producto[2][284] = "REDMI NOTE 9T"//modelo
        producto[5][284] = "500" //incell

        producto[0][285] = "285"//id
        producto[1][285] = "xiaomi" //marca
        producto[2][285] = "REDMI NOTE 10/Redmi Poco F3"//modelo
        producto[4][285] = "1250" //oled
        producto[5][285] = "750" //incell

        producto[0][286] = "286"//id
        producto[1][286] = "xiaomi" //marca
        producto[2][286] = "REDMI NOTE 10S/Redmi Poco F3"//modelo
        producto[4][286] = "1250" //oled
        producto[5][286] = "945" //incell

        producto[0][287] = "287"//id
        producto[1][287] = "xiaomi" //marca
        producto[2][287] = "REDMI NOTE 10 PRO"//modelo
        producto[4][287] = "3050" //oled

        producto[0][288] = "288"//id
        producto[1][288] = "xiaomi" //marca
        producto[2][288] = "REDMI POCO M3"//modelo
        producto[5][288] = "550" //incell

        producto[0][289] = "289"//id
        producto[1][289] = "xiaomi" //marca
        producto[2][289] = "REDMI POCO X3"//modelo
        producto[5][289] = "550" //incell






        for (i in 0..8) {
            if(dato == producto[i][0].toString()){
                auxDatoRequerido = i
            }

        }
        for (i in 0 until 310) {
            if(id == producto[0][i].toString()){
                datoQueSeManda = producto[auxDatoRequerido][i].toString()
            }

        }

        return datoQueSeManda
    }

}
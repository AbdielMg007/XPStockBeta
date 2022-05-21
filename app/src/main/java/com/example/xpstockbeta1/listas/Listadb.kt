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

        val producto = Array(9) { arrayOfNulls<String>(290) }

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
        producto[4][1] = "0"
        producto[5][1] = "0"
        producto[6][1] = "0"
        producto[7][1] = "0"
        producto[8][1] = "0"

        producto[0][2] = "2"//id
        producto[1][2] = "samsung"
        producto[2][2] = "A01 - small F"//modelo
        producto[3][2] = "320"
        producto[4][2] = "0"
        producto[5][2] = "0"
        producto[6][2] = "0"
        producto[7][2] = "0"
        producto[8][2] = "0"

        producto[0][3] = "3"//id
        producto[1][3] = "samsung"
        producto[2][3] = "A01 core"//modelo
        producto[3][3] = "470"
        producto[4][3] = "0"
        producto[5][3] = "0"
        producto[6][3] = "0"
        producto[7][3] = "0"
        producto[8][3] = "0"

        producto[0][4] = "4"//id
        producto[1][4] = "samsung"
        producto[2][4] = "A02S/A02core"//modelo
        producto[3][4] = "470"
        producto[4][4] = "0"
        producto[5][4] = "0"
        producto[6][4] = "0"
        producto[7][4] = "0"
        producto[8][4] = "0"

        producto[0][5] = "5"//id
        producto[1][5] = "samsung"
        producto[2][5] = "A03"//modelo
        producto[3][5] = "500"
        producto[4][5] = "0"
        producto[5][5] = "0"
        producto[6][5] = "0"
        producto[7][5] = "0"
        producto[8][5] = "0"

        producto[0][6] = "6"//id
        producto[1][6] = "samsung"
        producto[2][6] = "A03S"//modelo
        producto[3][6] = "470"
        producto[4][6] = "0"
        producto[5][6] = "0"
        producto[6][6] = "0"
        producto[7][6] = "0"
        producto[8][6] = "0"

        producto[0][7] = "7"//id
        producto[1][7] = "samsung"
        producto[2][7] = "A03 Core"//modelo
        producto[3][7] = "500"
        producto[4][7] = "0"
        producto[5][7] = "0"
        producto[6][7] = "0"
        producto[7][7] = "0"
        producto[8][7] = "0"

        producto[0][8] = "8"//id
        producto[1][8] = "samsung"
        producto[2][8] = "A10"//modelo
        producto[3][8] = "400"
        producto[4][8] = "0"
        producto[5][8] = "0"
        producto[6][8] = "0"
        producto[7][8] = "0"
        producto[8][8] = "0"

        producto[0][9] = "9"//id
        producto[1][9] = "samsung"
        producto[2][9] = "A10 W/F"//modelo
        producto[3][9] = "430"
        producto[4][9] = "0"
        producto[5][9] = "0"
        producto[6][9] = "0"
        producto[7][9] = "0"
        producto[8][9] = "0"

        producto[0][10] = "10"//id
        producto[1][10] = "samsung"
        producto[2][10] = "A10 E"//modelo
        producto[3][10] = "440"
        producto[4][10] = "0"
        producto[5][10] = "0"
        producto[6][10] = "0"
        producto[7][10] = "0"
        producto[8][10] = "0"

        producto[0][11] = "11"//id
        producto[1][11] = "samsung"
        producto[2][11] = "A10S"//modelo
        producto[3][11] = "410"
        producto[4][11] = "0"
        producto[5][11] = "0"
        producto[6][11] = "0"
        producto[7][11] = "0"
        producto[8][11] = "0"

        producto[0][12] = "12"//id
        producto[1][12] = "samsung"
        producto[2][12] = "A11"//modelo
        producto[3][12] = "470"
        producto[4][12] = "0"
        producto[5][12] = "0"
        producto[6][12] = "0"
        producto[7][12] = "0"
        producto[8][12] = "0"

        producto[0][13] = "13"//id
        producto[1][13] = "samsung"
        producto[2][13] = "A12"//modelo
        producto[3][13] = "460"
        producto[4][13] = "0"
        producto[5][13] = "0"
        producto[6][13] = "0"
        producto[7][13] = "0"
        producto[8][13] = "0"

        producto[0][14] = "14"//id
        producto[1][14] = "samsung"
        producto[2][14] = "A20"//modelo
        producto[3][14] = "0"
        producto[4][14] = "780"
        producto[5][14] = "500"
        producto[6][14] = "0"
        producto[7][14] = "0"
        producto[8][14] = "0"

        producto[0][15] = "15"//id
        producto[1][15] = "samsung"
        producto[2][15] = "A20 W/F"//modelo
        producto[3][15] = "0"
        producto[4][15] = "820"
        producto[5][15] = "0"
        producto[6][15] = "0"
        producto[7][15] = "0"
        producto[8][15] = "0"

        producto[0][16] = "16"//id
        producto[1][16] = "samsung"
        producto[2][16] = "A20S"//modelo
        producto[3][16] = "470"
        producto[4][16] = "0"
        producto[5][16] = "0"
        producto[6][16] = "0"
        producto[7][16] = "0"
        producto[8][16] = "0"

        producto[0][17] = "17"//id
        producto[1][17] = "samsung"
        producto[2][17] = "A21"//modelo
        producto[3][17] = "510"
        producto[4][17] = "0"
        producto[5][17] = "0"
        producto[6][17] = "0"
        producto[7][17] = "0"
        producto[8][17] = "0"

        producto[0][18] = "18"//id
        producto[1][18] = "samsung"
        producto[2][18] = "A21S"//modelo
        producto[3][18] = "510"
        producto[4][18] = "0"
        producto[5][18] = "0"
        producto[6][18] = "0"
        producto[7][18] = "0"
        producto[8][18] = "0"

        producto[0][19] = "19"//id
        producto[1][19] = "samsung"
        producto[2][19] = "A22  4G W/F"//modelo
        producto[3][19] = "1600"
        producto[4][19] = "1520"
        producto[5][19] = "580"
        producto[6][19] = "0"
        producto[7][19] = "0"
        producto[8][19] = "0"

        //Numero 20 disponible xd

        producto[0][21] = "21"//id
        producto[1][21] = "samsung"
        producto[2][21] = "A22  5G W/F"//modelo
        producto[3][21] = "0"
        producto[4][21] = "0"
        producto[5][21] = "510"
        producto[6][21] = "0"
        producto[7][21] = "0"
        producto[8][21] = "0"

        producto[0][22] = "22"//id
        producto[1][22] = "samsung"
        producto[2][22] = "A260/A2core *"//modelo
        producto[3][22] = "0"
        producto[4][22] = "0"
        producto[5][22] = "440"
        producto[6][22] = "0"
        producto[7][22] = "0"
        producto[8][22] = "0"

        producto[0][23] = "23"//id
        producto[1][23] = "samsung"
        producto[2][23] = "A30"//modelo
        producto[3][23] = "0"
        producto[4][23] = "780"
        producto[5][23] = "630"
        producto[6][23] = "0"
        producto[7][23] = "0"
        producto[8][23] = "0"

        producto[0][24] = "24"//id
        producto[1][24] = "samsung"
        producto[2][24] = "A30 W/F"//modelo
        producto[3][24] = "0"
        producto[4][24] = "855"
        producto[5][24] = "0"
        producto[6][24] = "0"
        producto[7][24] = "0"
        producto[8][24] = "0"

        producto[0][25] = "25"//id
        producto[1][25] = "samsung"
        producto[2][25] = "A30S"//modelo
        producto[3][25] = "0"
        producto[4][25] = "780"
        producto[5][25] = "452"
        producto[6][25] = "0"
        producto[7][25] = "0"
        producto[8][25] = "0"

        producto[0][26] = "26"//id
        producto[1][26] = "samsung"
        producto[2][26] = "A30S W/F"//modelo
        producto[3][26] = "0"
        producto[4][26] = "855"
        producto[5][26] = "0"
        producto[6][26] = "0"
        producto[7][26] = "0"
        producto[8][26] = "0"

        producto[0][27] = "27"//id
        producto[1][27] = "samsung"
        producto[2][27] = "A315/A31"//modelo
        producto[3][27] = "0"
        producto[4][27] = "0"
        producto[5][27] = "560"
        producto[6][27] = "0"
        producto[7][27] = "0"
        producto[8][27] = "0"

        producto[0][28] = "28"//id
        producto[1][28] = "samsung"
        producto[2][28] = "A315/A31 W/F"//modelo
        producto[3][28] = "0"
        producto[4][28] = "890"
        producto[5][28] = "565"
        producto[6][28] = "0"
        producto[7][28] = "0"
        producto[8][28] = "0"

        producto[0][29] = "29"//id
        producto[1][29] = "samsung"
        producto[2][29] = "A32/A325  4G W/F"//modelo
        producto[3][29] = "1600"
        producto[4][29] = "1500"
        producto[5][29] = "650"
        producto[6][29] = "0"
        producto[7][29] = "0"
        producto[8][29] = "0"

        producto[0][30] = "30"//id
        producto[1][30] = "samsung"
        producto[2][30] = "A50"//modelo
        producto[3][30] = "0"
        producto[4][30] = "750"
        producto[5][30] = "540"
        producto[6][30] = "0"
        producto[7][30] = "0"
        producto[8][30] = "0"

        producto[0][31] = "31"//id
        producto[1][31] = "samsung"
        producto[2][31] = "A50 W/F"//modelo
        producto[3][31] = "0"
        producto[4][31] = "800"
        producto[5][31] = "0"
        producto[6][31] = "0"
        producto[7][31] = "0"
        producto[8][31] = "0"

        producto[0][32] = "32"//id
        producto[1][32] = "samsung"
        producto[2][32] = "A50S"//modelo
        producto[3][32] = "0"
        producto[4][32] = "750"
        producto[5][32] = "540"
        producto[6][32] = "0"
        producto[7][32] = "0"
        producto[8][32] = "0"

        producto[0][33] = "33"//id
        producto[1][33] = "samsung"
        producto[2][33] = "A50S W/F"//modelo
        producto[3][33] = "0"
        producto[4][33] = "800"
        producto[5][33] = "0"
        producto[6][33] = "0"
        producto[7][33] = "0"
        producto[8][33] = "0"

        producto[0][34] = "34"//id
        producto[1][34] = "samsung"
        producto[2][34] = "A510/A5-2016"//modelo
        producto[3][34] = "0"
        producto[4][34] = "740"
        producto[5][34] = "0"
        producto[6][34] = "0"
        producto[7][34] = "0"
        producto[8][34] = "0"

        producto[0][35] = "35"//id
        producto[1][35] = "samsung"
        producto[2][35] = "A515/A51 BIG"//modelo
        producto[3][35] = "0"
        producto[4][35] = "820"
        producto[5][35] = "580"
        producto[6][35] = "0"
        producto[7][35] = "0"
        producto[8][35] = "0"

        producto[0][36] = "36"//id
        producto[1][36] = "samsung"
        producto[2][36] = "A515/A51 BIG W/F"//modelo
        producto[3][36] = "0"
        producto[4][36] = "1250"
        producto[5][36] = "0"
        producto[6][36] = "0"
        producto[7][36] = "0"
        producto[8][36] = "0"

        producto[0][37] = "37"//id
        producto[1][37] = "samsung"
        producto[2][37] = "A515/A51 W/F"//modelo
        producto[3][37] = "0"
        producto[4][37] = "0"
        producto[5][37] = "620"
        producto[6][37] = "0"
        producto[7][37] = "0"
        producto[8][37] = "0"

        producto[0][38] = "38"//id
        producto[1][38] = "samsung"
        producto[2][38] = "A515/A51 SMALL"//modelo
        producto[3][38] = "0"
        producto[4][38] = "825"
        producto[5][38] = "0"
        producto[6][38] = "0"
        producto[7][38] = "0"
        producto[8][38] = "0"

        producto[0][39] = "39"//id
        producto[1][39] = "samsung"
        producto[2][39] = "A515/A51 SMALL W/F"//modelo
        producto[3][39] = "0"
        producto[4][39] = "870"
        producto[5][39] = "0"
        producto[6][39] = "0"
        producto[7][39] = "0"
        producto[8][39] = "0"

        producto[0][40] = "40"//id
        producto[1][40] = "samsung"
        producto[2][40] = "A52/A525  4G W/F"//modelo
        producto[3][40] = "2000"
        producto[4][40] = "1850"
        producto[5][40] = "650"
        producto[6][40] = "0"
        producto[7][40] = "0"
        producto[8][40] = "0"

        producto[0][41] = "41"//id
        producto[1][41] = "samsung"
        producto[2][41] = "A52/A525 5G W/F"//modelo
        producto[3][41] = "2000"
        producto[4][41] = "1850"
        producto[5][41] = "0"
        producto[6][41] = "0"
        producto[7][41] = "0"
        producto[8][41] = "0"

        producto[0][42] = "42"//id
        producto[1][42] = "samsung"
        producto[2][42] = "A520/A5-2017 BIG"//modelo
        producto[3][42] = "0"
        producto[4][42] = "780"
        producto[5][42] = "550"
        producto[6][42] = "0"
        producto[7][42] = "0"
        producto[8][42] = "0"

        producto[0][43] = "43"//id
        producto[1][43] = "samsung"
        producto[2][43] = "A530/A5-2018"//modelo
        producto[3][43] = "0"
        producto[4][43] = "950"
        producto[5][43] = "0"
        producto[6][43] = "0"
        producto[7][43] = "0"
        producto[8][43] = "0"

        producto[0][44] = "44"//id
        producto[1][44] = "samsung"
        producto[2][44] = "A6 plus / J8 plus"//modelo
        producto[3][44] = "0"
        producto[4][44] = "770"
        producto[5][44] = "660"
        producto[6][44] = "0"
        producto[7][44] = "0"
        producto[8][44] = "0"

        producto[0][45] = "45"//id
        producto[1][45] = "samsung"
        producto[2][45] = "A70"//modelo
        producto[3][45] = "0"
        producto[4][45] = "0"
        producto[5][45] = "600"
        producto[6][45] = "0"
        producto[7][45] = "0"
        producto[8][45] = "0"

        producto[0][46] = "46"//id
        producto[1][46] = "samsung"
        producto[2][46] = "A70 BIG"//modelo
        producto[3][46] = "0"
        producto[4][46] = "1450"
        producto[5][46] = "0"
        producto[6][46] = "0"
        producto[7][46] = "0"
        producto[8][46] = "0"

        producto[0][47] = "47"//id
        producto[1][47] = "samsung"
        producto[2][47] = "A70 BIG W/F"//modelo
        producto[3][47] = "0"
        producto[4][47] = "1535"
        producto[5][47] = "0"
        producto[6][47] = "0"
        producto[7][47] = "0"
        producto[8][47] = "0"

        producto[0][48] = "48"//id
        producto[1][48] = "samsung"
        producto[2][48] = "A70 SMALL"//modelo
        producto[3][48] = "0"
        producto[4][48] = "750"
        producto[5][48] = "0"
        producto[6][48] = "0"
        producto[7][48] = "0"
        producto[8][48] = "0"

        producto[0][49] = "49"//id
        producto[1][49] = "samsung"
        producto[2][49] = "A70 SMALL W/F"//modelo
        producto[3][49] = "0"
        producto[4][49] = "890"
        producto[5][49] = "0"
        producto[6][49] = "0"
        producto[7][49] = "0"
        producto[8][49] = "0"

        producto[0][50] = "50"//id
        producto[1][50] = "samsung"
        producto[2][50] = "A710/A7-2016"//modelo
        producto[3][50] = "0"
        producto[4][50] = "650"
        producto[5][50] = "520"
        producto[6][50] = "0"
        producto[7][50] = "0"
        producto[8][50] = "0"

        producto[0][51] = "51"//id
        producto[1][51] = "samsung"
        producto[2][51] = "A715/A71"//modelo
        producto[3][51] = "0"
        producto[4][51] = "0"
        producto[5][51] = "650"
        producto[6][51] = "0"
        producto[7][51] = "0"
        producto[8][51] = "0"

        producto[0][52] = "52"//id
        producto[1][52] = "samsung"
        producto[2][52] = "A715/A71 BIF W/F"//modelo
        producto[3][52] = "0"
        producto[4][52] = "1900"
        producto[5][52] = "0"
        producto[6][52] = "0"
        producto[7][52] = "0"
        producto[8][52] = "0"

        producto[0][53] = "53"//id
        producto[1][53] = "samsung"
        producto[2][53] = "A715/A71 BIG"//modelo
        producto[3][53] = "0"
        producto[4][53] = "1860"
        producto[5][53] = "0"
        producto[6][53] = "0"
        producto[7][53] = "0"
        producto[8][53] = "0"

        producto[0][54] = "54"//id
        producto[1][54] = "samsung"
        producto[2][54] = "A715/A71 SMALL"//modelo
        producto[3][54] = "0"
        producto[4][54] = "870"
        producto[5][54] = "0"
        producto[6][54] = "0"
        producto[7][54] = "0"
        producto[8][54] = "0"

        producto[0][55] = "55"//id
        producto[1][55] = "samsung"
        producto[2][55] = "A715/A71 SMALL W/F"//modelo
        producto[3][55] = "0"
        producto[4][55] = "910"
        producto[5][55] = "0"
        producto[6][55] = "0"
        producto[7][55] = "0"
        producto[8][55] = "0"

        producto[0][56] = "56"//id
        producto[1][56] = "samsung"
        producto[2][56] = "A72/A725  4G W/F"//modelo
        producto[3][56] = "2000"
        producto[4][56] = "0"
        producto[5][56] = "1150"
        producto[6][56] = "0"
        producto[7][56] = "0"
        producto[8][56] = "0"

        producto[0][57] = "57"//id
        producto[1][57] = "samsung"
        producto[2][57] = "A720/A7-2017"//modelo
        producto[3][57] = "0"
        producto[4][57] = "650"
        producto[5][57] = "520"
        producto[6][57] = "0"
        producto[7][57] = "0"
        producto[8][57] = "0"

        producto[0][58] = "58"//id
        producto[1][58] = "samsung"
        producto[2][58] = "A730/A8 plus"//modelo
        producto[3][58] = "0"
        producto[4][58] = "860"
        producto[5][58] = "630"
        producto[6][58] = "0"
        producto[7][58] = "0"
        producto[8][58] = "0"

        producto[0][59] = "59"//id
        producto[1][59] = "samsung"
        producto[2][59] = "A750/A7-2018"//modelo
        producto[3][59] = "0"
        producto[4][59] = "780"
        producto[5][59] = "620"
        producto[6][59] = "0"
        producto[7][59] = "0"
        producto[8][59] = "0"

        producto[0][60] = "60"//id
        producto[1][60] = "samsung"
        producto[2][60] = "A80"//modelo
        producto[3][60] = "0"
        producto[4][60] = "1600"
        producto[5][60] = "740"
        producto[6][60] = "0"
        producto[7][60] = "0"
        producto[8][60] = "0"

        producto[0][61] = "61"//id
        producto[1][61] = "samsung"
        producto[2][61] = "A80 W/F"//modelo
        producto[3][61] = "0"
        producto[4][61] = "1650"
        producto[5][61] = "0"
        producto[6][61] = "0"
        producto[7][61] = "0"
        producto[8][61] = "0"

        producto[0][62] = "62"//id
        producto[1][62] = "samsung"
        producto[2][62] = "A920 / A9 - 2018"//modelo
        producto[3][62] = "0"
        producto[4][62] = "800"
        producto[5][62] = "0"
        producto[6][62] = "0"
        producto[7][62] = "0"
        producto[8][62] = "0"

        producto[0][63] = "63"//id
        producto[1][63] = "samsung"
        producto[2][63] = "A90"//modelo
        producto[3][63] = "0"
        producto[4][63] = "1600"
        producto[5][63] = "740"
        producto[6][63] = "0"
        producto[7][63] = "0"
        producto[8][63] = "0"

        producto[0][64] = "64"//id
        producto[1][64] = "samsung"
        producto[2][64] = "A90 W/F"//modelo
        producto[3][64] = "0"
        producto[4][64] = "1650"
        producto[5][64] = "0"
        producto[6][64] = "0"
        producto[7][64] = "0"
        producto[8][64] = "0"

        producto[0][65] = "65"//id
        producto[1][65] = "samsung"
        producto[2][65] = "J260/J2 core*"//modelo
        producto[3][65] = "0"
        producto[4][65] = "0"
        producto[5][65] = "360"//incell
        producto[6][65] = "0"//cof
        producto[7][65] = "0"
        producto[8][65] = "0"

        producto[0][66] = "66"//id
        producto[1][66] = "samsung"
        producto[2][66] = "J3"//modelo
        producto[3][66] = "0"
        producto[4][66] = "595"
        producto[5][66] = "280"//incell
        producto[6][66] = "0"//cof
        producto[7][66] = "0"
        producto[8][66] = "0"

        producto[0][67] = "67"//id
        producto[1][67] = "samsung"
        producto[2][67] = "J327 / J3 Pro *"//modelo
        producto[3][67] = "0"
        producto[4][67] = "0"
        producto[5][67] = "370"//incell
        producto[6][67] = "0"//cof
        producto[7][67] = "0"
        producto[8][67] = "0"

        producto[0][68] = "68"//id
        producto[1][68] = "samsung"
        producto[2][68] = "J4"//modelo
        producto[3][68] = "0"
        producto[4][68] = "610"
        producto[5][68] = "400"//incell
        producto[6][68] = "0"//cof
        producto[7][68] = "0"
        producto[8][68] = "0"

        producto[0][69] = "69"//id
        producto[1][69] = "samsung"
        producto[2][69] = "J4 plus/J6 plus"//modelo
        producto[3][69] = "450"
        producto[4][69] = "0"
        producto[5][69] = "0"//incell
        producto[6][69] = "0"//cof
        producto[7][69] = "0"
        producto[8][69] = "0"

        producto[0][70] = "70"//id
        producto[1][70] = "samsung"
        producto[2][70] = "J5"//modelo
        producto[3][70] = "0"
        producto[4][70] = "595"
        producto[5][70] = "350"
        producto[6][70] = "0"
        producto[7][70] = "0"
        producto[8][70] = "0"

        producto[0][71] = "71"//id
        producto[1][71] = "samsung"
        producto[2][71] = "J5 PRIME"//modelo
        producto[3][71] = "0"
        producto[4][71] = "0"
        producto[5][71] = "390"
        producto[6][71] = "0"
        producto[7][71] = "0"
        producto[8][71] = "0"

        producto[0][72] = "72"//id
        producto[1][72] = "samsung"
        producto[2][72] = "J510/J5-2016*"//modelo
        producto[3][72] = "0"
        producto[4][72] = "595"
        producto[5][72] = "380"
        producto[6][72] = "0"
        producto[7][72] = "0"
        producto[8][72] = "0"

        producto[0][73] = "73"//id
        producto[1][73] = "samsung"
        producto[2][73] = "J530/J5 pro*"//modelo
        producto[3][73] = "0"
        producto[4][73] = "580"
        producto[5][73] = "350"
        producto[6][73] = "0"
        producto[7][73] = "0"
        producto[8][73] = "0"

        producto[0][74] = "74"//id
        producto[1][74] = "samsung"
        producto[2][74] = "J6"//modelo
        producto[3][74] = "0"
        producto[4][74] = "900"
        producto[5][74] = "460"
        producto[6][74] = "0"
        producto[7][74] = "0"
        producto[8][74] = "0"

        producto[0][75] = "75"//id
        producto[1][75] = "samsung"
        producto[2][75] = "J7"//modelo
        producto[3][75] = "0"
        producto[4][75] = "600"
        producto[5][75] = "420"
        producto[6][75] = "0"
        producto[7][75] = "0"
        producto[8][75] = "0"

        producto[0][76] = "76"//id
        producto[1][76] = "samsung"
        producto[2][76] = "J7 PRIME"//modelo
        producto[3][76] = "0"
        producto[4][76] = "0"
        producto[5][76] = "440"
        producto[6][76] = "0"
        producto[7][76] = "0"
        producto[8][76] = "0"

        producto[0][77] = "77"//id
        producto[1][77] = "samsung"
        producto[2][77] = "J701/J7 neo*"//modelo
        producto[3][77] = "0"
        producto[4][77] = "640"
        producto[5][77] = "425"
        producto[6][77] = "0"
        producto[7][77] = "0"
        producto[8][77] = "0"

        producto[0][78] = "78"//id
        producto[1][78] = "samsung"
        producto[2][78] = "J710*"//modelo
        producto[3][78] = "0"
        producto[4][78] = "640"
        producto[5][78] = "430"
        producto[6][78] = "0"
        producto[7][78] = "0"
        producto[8][78] = "0"

        producto[0][79] = "79"//id
        producto[1][79] = "samsung"
        producto[2][79] = "J720 / J7 Duo*"//modelo
        producto[3][79] = "0"
        producto[4][79] = "650"
        producto[5][79] = "0"
        producto[6][79] = "0"
        producto[7][79] = "0"
        producto[8][79] = "0"

        producto[0][80] = "80"//id
        producto[1][80] = "samsung"
        producto[2][80] = "J727 / J7 V *"//modelo
        producto[3][80] = "0"
        producto[4][80] = "0"
        producto[5][80] = "570"
        producto[6][80] = "0"
        producto[7][80] = "0"
        producto[8][80] = "0"

        producto[0][81] = "81"//id
        producto[1][81] = "samsung"
        producto[2][81] = "J730/J7 pro*"//modelo
        producto[3][81] = "0"
        producto[4][81] = "650"
        producto[5][81] = "425"
        producto[6][81] = "0"
        producto[7][81] = "0"
        producto[8][81] = "0"

        producto[0][82] = "82"//id
        producto[1][82] = "samsung"
        producto[2][82] = "J8"//modelo
        producto[3][82] = "0"
        producto[4][82] = "820"
        producto[5][82] = "470"
        producto[6][82] = "0"
        producto[7][82] = "0"
        producto[8][82] = "0"

        producto[0][83] = "83"//id
        producto[1][83] = "samsung"
        producto[2][83] = "M01"//modelo
        producto[3][83] = "0"
        producto[4][83] = "0"
        producto[5][83] = "350"
        producto[6][83] = "0"
        producto[7][83] = "0"
        producto[8][83] = "0"

        producto[0][84] = "84"//id
        producto[1][84] = "samsung" //marca
        producto[2][84] = "M10"//modelo
        producto[3][84] = "0" //original
        producto[4][84] = "0" //oled
        producto[5][84] = "450" //incell
        producto[6][84] = "0" // cof
        producto[7][84] = "0" //cog
        producto[8][84] = "0" // tft

        producto[0][85] = "85"//id
        producto[1][85] = "samsung" //marca
        producto[2][85] = "M12 / M127"//modelo
        producto[3][85] = "0" //original
        producto[4][85] = "0" //oled
        producto[5][85] = "530" //incell
        producto[6][85] = "0" // cof
        producto[7][85] = "0" //cog
        producto[8][85] = "0" // tft

        producto[0][86] = "86"//id
        producto[1][86] = "samsung" //marca
        producto[2][86] = "M20"//modelo
        producto[3][86] = "500" //original
        producto[4][86] = "0" //oled
        producto[5][86] = "0" //incell
        producto[6][86] = "0" // cof
        producto[7][86] = "0" //cog
        producto[8][86] = "0" // tft

        producto[0][87] = "87"//id
        producto[1][87] = "samsung" //marca
        producto[2][87] = "M21"//modelo
        producto[3][87] = "0" //original
        producto[4][87] = "0" //oled
        producto[5][87] = "750" //incell
        producto[6][87] = "0" // cof
        producto[7][87] = "0" //cog
        producto[8][87] = "0" // tft

        producto[0][88] = "88"//id
        producto[1][88] = "samsung" //marca
        producto[2][88] = "M30 / M30S / M31"//modelo
        producto[3][88] = "0" //original
        producto[4][88] = "0" //oled
        producto[5][88] = "570" //incell
        producto[6][88] = "0" // cof
        producto[7][88] = "0" //cog
        producto[8][88] = "0" // tft

        producto[0][89] = "89"//id
        producto[1][89] = "samsung" //marca
        producto[2][89] = "NOTE 10 plus W/F"//modelo
        producto[3][89] = "5700" //original
        producto[4][89] = "0" //oled
        producto[5][89] = "0" //incell
        producto[6][89] = "0" // cof
        producto[7][89] = "0" //cog
        producto[8][89] = "0" // tft

        producto[0][90] = "90"//id
        producto[1][90] = "samsung" //marca
        producto[2][90] = "NOTE 10 W/F"//modelo
        producto[3][90] = "4500" //original
        producto[4][90] = "0" //oled
        producto[5][90] = "0" //incell
        producto[6][90] = "0" // cof
        producto[7][90] = "0" //cog
        producto[8][90] = "0" // tft

        producto[0][91] = "91"//id
        producto[1][91] = "samsung" //marca
        producto[2][91] = "NOTE 20 U W/F"//modelo
        producto[3][91] = "8100" //original
        producto[4][91] = "0" //oled
        producto[5][91] = "0" //incell
        producto[6][91] = "0" // cof
        producto[7][91] = "0" //cog
        producto[8][91] = "0" // tft

        producto[0][92] = "92"//id
        producto[1][92] = "samsung" //marca
        producto[2][92] = "NOTE 20 W/F"//modelo
        producto[3][92] = "4000" //original
        producto[4][92] = "0" //oled
        producto[5][92] = "0" //incell
        producto[6][92] = "0" // cof
        producto[7][92] = "0" //cog
        producto[8][92] = "0" // tft

        producto[0][93] = "93"//id
        producto[1][93] = "samsung" //marca
        producto[2][93] = "NOTE 8 W/F"//modelo
        producto[3][93] = "3500" //original
        producto[4][93] = "0" //oled
        producto[5][93] = "0" //incell
        producto[6][93] = "0" // cof
        producto[7][93] = "0" //cog
        producto[8][93] = "0" // tft

        producto[0][94] = "94"//id
        producto[1][94] = "samsung" //marca
        producto[2][94] = "NOTE 9 W/F"//modelo
        producto[3][94] = "3600" //original
        producto[4][94] = "0" //oled
        producto[5][94] = "0" //incell
        producto[6][94] = "0" // cof
        producto[7][94] = "0" //cog
        producto[8][94] = "0" // tft

        producto[0][95] = "95"//id
        producto[1][95] = "samsung" //marca
        producto[2][95] = "S10  W/F"//modelo
        producto[3][95] = "4200" //original
        producto[4][95] = "0" //oled
        producto[5][95] = "0" //incell
        producto[6][95] = "0" // cof
        producto[7][95] = "0" //cog
        producto[8][95] = "0" // tft

        producto[0][96] = "96"//id
        producto[1][96] = "samsung" //marca
        producto[2][96] = "S10 5G W/F"//modelo
        producto[3][96] = "4800" //original
        producto[4][96] = "0" //oled
        producto[5][96] = "0" //incell
        producto[6][96] = "0" // cof
        producto[7][96] = "0" //cog
        producto[8][96] = "0" // tft

        producto[0][97] = "97"//id
        producto[1][97] = "samsung" //marca
        producto[2][97] = "S10 E W/F"//modelo
        producto[3][97] = "2800" //original
        producto[4][97] = "0" //oled
        producto[5][97] = "0" //incell
        producto[6][97] = "0" // cof
        producto[7][97] = "0" //cog
        producto[8][97] = "0" // tft

        producto[0][98] = "98"//id
        producto[1][98] = "samsung" //marca
        producto[2][98] = "S10  PLUS W/F"//modelo
        producto[3][98] = "5000" //original
        producto[4][98] = "0" //oled
        producto[5][98] = "0" //incell
        producto[6][98] = "0" // cof
        producto[7][98] = "0" //cog
        producto[8][98] = "0" // tft

        producto[0][99] = "99"//id
        producto[1][99] = "samsung" //marca
        producto[2][99] = "S20  W/F"//modelo
        producto[3][99] = "4500" //original
        producto[4][99] = "0" //oled
        producto[5][99] = "0" //incell
        producto[6][99] = "0" // cof
        producto[7][99] = "0" //cog
        producto[8][99] = "0" // tft

        producto[0][100] = "100"//id
        producto[1][100] = "samsung" //marca
        producto[2][100] = "S20 FE W/F"//modelo
        producto[3][100] = "2150" //original
        producto[4][100] = "0" //oled
        producto[5][100] = "0" //incell
        producto[6][100] = "0" // cof
        producto[7][100] = "0" //cog
        producto[8][100] = "0" // tft

        producto[0][101] = "101"//id
        producto[1][101] = "samsung" //marca
        producto[2][101] = "S20 PLUS W/F"//modelo
        producto[3][101] = "5900" //original
        producto[4][101] = "0" //oled
        producto[5][101] = "0" //incell
        producto[6][101] = "0" // cof
        producto[7][101] = "0" //cog
        producto[8][101] = "0" // tft

        producto[0][102] = "102"//id
        producto[1][102] = "samsung" //marca
        producto[2][102] = "S20 U W/F"//modelo
        producto[3][102] = "5000" //original
        producto[4][102] = "0" //oled
        producto[5][102] = "0" //incell
        producto[6][102] = "0" // cof
        producto[7][102] = "0" //cog
        producto[8][102] = "0" // tft

        producto[0][103] = "103"//id
        producto[1][103] = "samsung" //marca
        producto[2][103] = "S21 PLUS W/F"//modelo
        producto[3][103] = "4300" //original
        producto[4][103] = "0" //oled
        producto[5][103] = "0" //incell
        producto[6][103] = "0" // cof
        producto[7][103] = "0" //cog
        producto[8][103] = "0" // tft

        producto[0][104] = "104"//id
        producto[1][104] = "samsung" //marca
        producto[2][104] = "S21 U W/F"//modelo
        producto[3][104] = "6900" //original
        producto[4][104] = "0" //oled
        producto[5][104] = "0" //incell
        producto[6][104] = "0" // cof
        producto[7][104] = "0" //cog
        producto[8][104] = "0" // tft

        producto[0][105] = "105"//id
        producto[1][105] = "samsung" //marca
        producto[2][105] = "S21 W/F"//modelo
        producto[3][105] = "4300" //original
        producto[4][105] = "0" //oled
        producto[5][105] = "0" //incell
        producto[6][105] = "0" // cof
        producto[7][105] = "0" //cog
        producto[8][105] = "0" // tft

        producto[0][106] = "106"//id
        producto[1][106] = "samsung" //marca
        producto[2][106] = "S7 EDGE W/F"//modelo
        producto[3][106] = "2100" //original
        producto[4][106] = "0" //oled
        producto[5][106] = "0" //incell
        producto[6][106] = "0" // cof
        producto[7][106] = "0" //cog
        producto[8][106] = "0" // tft

        producto[0][107] = "107"//id
        producto[1][107] = "samsung" //marca
        producto[2][107] = "S8 W/F"//modelo
        producto[3][107] = "3000" //original
        producto[4][107] = "0" //oled
        producto[5][107] = "0" //incell
        producto[6][107] = "0" // cof
        producto[7][107] = "0" //cog
        producto[8][107] = "0" // tft

        producto[0][108] = "108"//id
        producto[1][108] = "samsung" //marca
        producto[2][108] = "S8 PLUS  W/F"//modelo
        producto[3][108] = "3000" //original
        producto[4][108] = "0" //oled
        producto[5][108] = "0" //incell
        producto[6][108] = "0" // cof
        producto[7][108] = "0" //cog
        producto[8][108] = "0" // tft

        producto[0][109] = "109"//id
        producto[1][109] = "samsung" //marca
        producto[2][109] = "S9 W/F"//modelo
        producto[3][109] = "2400" //original
        producto[4][109] = "0" //oled
        producto[5][109] = "0" //incell
        producto[6][109] = "0" // cof
        producto[7][109] = "0" //cog
        producto[8][109] = "0" // tft


        producto[0][110] = "110"//id
        producto[1][110] = "samsung" //marca
        producto[2][110] = "S9 plus  W/F"//modelo
        producto[3][110] = "3000" //original
        producto[4][110] = "0" //oled
        producto[5][110] = "0" //incell
        producto[6][110] = "0" // cof
        producto[7][110] = "0" //cog
        producto[8][110] = "0" // tft

        producto[0][111] = "111"//id
        producto[1][111] = "samsung" //marca
        producto[2][111] = "S5"//modelo
        producto[3][111] = "0" //original
        producto[4][111] = "0" //oled
        producto[5][111] = "410" //incell
        producto[6][111] = "0" // cof
        producto[7][111] = "0" //cog
        producto[8][111] = "0" // tft



        //Apple



        producto[0][112] = "112"//id
        producto[1][112] = "apple"
        producto[2][112] = "5S"//modelo
        producto[3][112] = "0"//orginal
        producto[4][112] = "0"//oled
        producto[5][112] = "250"//incell
        producto[6][112] = "0"
        producto[7][112] = "0"
        producto[8][112] = "0"

        producto[0][113] = "113"//id
        producto[1][113] = "apple"
        producto[2][113] = "5C"//modelo
        producto[3][113] = "0"
        producto[4][113] = "0"
        producto[5][113] = "250"
        producto[6][113] = "0"
        producto[7][113] = "0"
        producto[8][113] = "0"

        producto[0][114] = "114"//id
        producto[1][114] = "apple"
        producto[2][114] = "6S"//modelo
        producto[3][114] = "440"
        producto[4][114] = "0"
        producto[5][114] = "350"
        producto[6][114] = "0"
        producto[7][114] = "0"
        producto[8][114] = "0"

        producto[0][115] = "115"//id
        producto[1][115] = "apple"
        producto[2][115] = "6G"//modelo
        producto[3][115] = "400"
        producto[4][115] = "0"
        producto[5][115] = "335"
        producto[6][115] = "0"
        producto[7][115] = "0"
        producto[8][115] = "0"

        producto[0][116] = "116"//id
        producto[1][116] = "apple"
        producto[2][116] = "6 plus"//modelo
        producto[3][116] = "550"
        producto[4][116] = "0"
        producto[5][116] = "400"
        producto[6][116] = "0"
        producto[7][116] = "0"
        producto[8][116] = "0"

        producto[0][117] = "117"//id
        producto[1][117] = "apple"
        producto[2][117] = "6S plus"//modelo
        producto[3][117] = "590"
        producto[4][117] = "0"
        producto[5][117] = "410"
        producto[6][117] = "0"
        producto[7][117] = "0"
        producto[8][117] = "0"

        producto[0][118] = "118"//id
        producto[1][118] = "apple"
        producto[2][118] = "7G"//modelo
        producto[3][118] = "500"
        producto[4][118] = "0"
        producto[5][118] = "350"
        producto[6][118] = "0"
        producto[7][118] = "0"
        producto[8][118] = "0"

        producto[0][119] = "119"//id
        producto[1][119] = "apple"
        producto[2][119] = "7 plus"//modelo
        producto[3][119] = "590"
        producto[4][119] = "0"
        producto[5][119] = "410"
        producto[6][119] = "0"
        producto[7][119] = "0"
        producto[8][119] = "0"

        producto[0][120] = "120"//id
        producto[1][120] = "apple"
        producto[2][120] = "8G"//modelo
        producto[3][120] = "530"
        producto[4][120] = "0"
        producto[5][120] = "350"
        producto[6][120] = "0"
        producto[7][120] = "0"
        producto[8][120] = "0"

        producto[0][121] = "121"//id
        producto[1][121] = "apple"
        producto[2][121] = "8 plus"//modelo
        producto[3][121] = "590"
        producto[4][121] = "0"
        producto[5][121] = "410"
        producto[6][121] = "0"
        producto[7][121] = "0"
        producto[8][121] = "0"

        producto[0][122] = "122"//id
        producto[1][122] = "apple"
        producto[2][122] = "X"//modelo
        producto[3][122] = "0"
        producto[4][122] = "980"
        producto[5][122] = "750"
        producto[6][122] = "0"
        producto[7][122] = "0"
        producto[8][122] = "0"

        producto[0][123] = "123"//id
        producto[1][123] = "apple"
        producto[2][123] = "XS"//modelo
        producto[3][123] = "0"
        producto[4][123] = "980"
        producto[5][123] = "750"
        producto[6][123] = "0"
        producto[7][123] = "0"
        producto[8][123] = "0"

        producto[0][124] = "124"//id
        producto[1][124] = "apple"
        producto[2][124] = "XS MAX"//modelo
        producto[3][124] = "0"
        producto[4][124] = "1702"
        producto[5][124] = "1100"
        producto[6][124] = "0"
        producto[7][124] = "0"
        producto[8][124] = "0"

        producto[0][125] = "125"//id
        producto[1][125] = "apple"
        producto[2][125] = "XR"//modelo
        producto[3][125] = "0"
        producto[4][125] = "0"
        producto[5][125] = "1050"
        producto[6][125] = "0"
        producto[7][125] = "0"
        producto[8][125] = "0"

        producto[0][126] = "126"//id
        producto[1][126] = "apple"
        producto[2][126] = "11"//modelo
        producto[3][126] = "0"
        producto[4][126] = "0"
        producto[5][126] = "1150"
        producto[6][126] = "0"
        producto[7][126] = "0"
        producto[8][126] = "0"

        producto[0][127] = "127"//id
        producto[1][127] = "apple"
        producto[2][127] = "11 PRO"//modelo
        producto[3][127] = "0"
        producto[4][127] = "1450"
        producto[5][127] = "950"
        producto[6][127] = "0"
        producto[7][127] = "0"
        producto[8][127] = "0"

        producto[0][128] = "128"//id
        producto[1][128] = "apple"
        producto[2][128] = "11 PRO MAX"//modelo
        producto[3][128] = "0"
        producto[4][128] = "2400"
        producto[5][128] = "0"
        producto[6][128] = "0"
        producto[7][128] = "0"
        producto[8][128] = "0"

        producto[0][129] = "129"//id
        producto[1][129] = "apple"
        producto[2][129] = "12 / 12 PRO"//modelo
        producto[3][129] = "0"
        producto[4][129] = "3100"
        producto[5][129] = "0"
        producto[6][129] = "0"
        producto[7][129] = "0"
        producto[8][129] = "0"

        producto[0][130] = "130"//id
        producto[1][130] = "apple"
        producto[2][130] = "12 PRO MAX"//modelo
        producto[3][130] = "0"
        producto[4][130] = "4500"
        producto[5][130] = "0"
        producto[6][130] = "0"
        producto[7][130] = "0"
        producto[8][130] = "0"



        //LG



        producto[0][131] = "131"//id
        producto[1][131] = "lg"
        producto[2][131] = "K11"//modelo
        producto[3][131] = "420"
        producto[4][131] = "0"
        producto[5][131] = "0"
        producto[6][131] = "0"
        producto[7][131] = "0"
        producto[8][131] = "0"

        producto[0][132] = "132"//id
        producto[1][132] = "lg"
        producto[2][132] = "Q6"//modelo
        producto[3][132] = "500"
        producto[4][132] = "0"
        producto[5][132] = "0"
        producto[6][132] = "0"
        producto[7][132] = "0"
        producto[8][132] = "0"

        producto[0][133] = "133"//id
        producto[1][133] = "lg"
        producto[2][133] = "Q60"//modelo
        producto[3][133] = "470"
        producto[4][133] = "0"
        producto[5][133] = "0"
        producto[6][133] = "0"
        producto[7][133] = "0"
        producto[8][133] = "0"

        producto[0][134] = "134"//id
        producto[1][134] = "lg"
        producto[2][134] = "K30 2018"//modelo
        producto[3][134] = "420"
        producto[4][134] = "0"
        producto[5][134] = "0"
        producto[6][134] = "0"
        producto[7][134] = "0"
        producto[8][134] = "0"

        producto[0][135] = "135"//id
        producto[1][135] = "lg"
        producto[2][135] = "K42"//modelo
        producto[3][135] = "490"
        producto[4][135] = "0"
        producto[5][135] = "500"
        producto[6][135] = "0"
        producto[7][135] = "0"
        producto[8][135] = "0"

        producto[0][136] = "136"//id
        producto[1][136] = "lg"
        producto[2][136] = "K40S"//modelo
        producto[3][136] = "415"
        producto[4][136] = "0"
        producto[5][136] = "0"
        producto[6][136] = "0"
        producto[7][136] = "0"
        producto[8][136] = "0"

        producto[0][137] = "137"//id
        producto[1][137] = "lg"
        producto[2][137] = "K51"//modelo
        producto[3][137] = "0"
        producto[4][137] = "0"
        producto[5][137] = "510"
        producto[6][137] = "0"
        producto[7][137] = "0"
        producto[8][137] = "0"

        producto[0][138] = "138"//id
        producto[1][138] = "lg"
        producto[2][138] = "K41"//modelo
        producto[3][138] = "0"
        producto[4][138] = "0"
        producto[5][138] = "490"
        producto[6][138] = "0"
        producto[7][138] = "0"
        producto[8][138] = "0"

        //id 139 disponible

        producto[0][140] = "140"//id
        producto[1][140] = "lg"
        producto[2][140] = "K52"//modelo
        producto[3][140] = "0"
        producto[4][140] = "0"
        producto[5][140] = "480"
        producto[6][140] = "0"
        producto[7][140] = "0"
        producto[8][140] = "0"



        //honor



        producto[0][141] = "141"//id
        producto[1][141] = "honor"
        producto[2][141] = "HONOR 8X"//modelo
        producto[3][141] = "0"
        producto[4][141] = "0"
        producto[5][141] = "650"
        producto[6][141] = "0"
        producto[7][141] = "0"
        producto[8][141] = "0"

        producto[0][142] = "142"//id
        producto[1][142] = "honor"
        producto[2][142] = "HONOR 10 LITE"//modelo
        producto[3][142] = "0"
        producto[4][142] = "0"
        producto[5][142] = "0"
        producto[6][142] = "0"
        producto[7][142] = "540"
        producto[8][142] = "0"

        producto[0][143] = "143"//id
        producto[1][143] = "honor"
        producto[2][143] = "HONOR 10"//modelo
        producto[3][143] = "0"
        producto[4][143] = "0"
        producto[5][143] = "395"
        producto[6][143] = "0"
        producto[7][143] = "0"
        producto[8][143] = "0"

        producto[0][144] = "144"//id
        producto[1][144] = "honor"
        producto[2][144] = "HONOR 50 LITE"//modelo
        producto[3][144] = "0"
        producto[4][144] = "0"
        producto[5][144] = "620"
        producto[6][144] = "0"
        producto[7][144] = "0"
        producto[8][144] = "0"



        // huawei



        producto[0][145] = "145"//id
        producto[1][145] = "huawei"
        producto[2][145] = "GE ELITE PLUS"//modelo
        producto[3][145] = "0"
        producto[4][145] = "0"
        producto[5][145] = "310"//incell
        producto[6][145] = "0"//cof
        producto[7][145] = "0"
        producto[8][145] = "0"

        producto[0][146] = "146"//id
        producto[1][146] = "huawei"
        producto[2][146] = "MATE 8"//modelo
        producto[3][146] = "0"
        producto[4][146] = "0"
        producto[5][146] = "470"//incell
        producto[6][146] = "0"//cof
        producto[7][146] = "0"
        producto[8][146] = "0"

        producto[0][147] = "147"//id
        producto[1][147] = "huawei"
        producto[2][147] = "MATE 10"//modelo
        producto[3][147] = "0"
        producto[4][147] = "0"
        producto[5][147] = "750"//incell
        producto[6][147] = "0"//cof
        producto[7][147] = "0"
        producto[8][147] = "0"

        producto[0][148] = "148"//id
        producto[1][148] = "huawei"
        producto[2][148] = "MATE 20 LITE / NOVA 3"//modelo
        producto[3][148] = "460"
        producto[4][148] = "0"
        producto[5][148] = "0"//incell
        producto[6][148] = "0"//cof
        producto[7][148] = "0"
        producto[8][148] = "0"

        producto[0][149] = "149"//id
        producto[1][149] = "huawei"
        producto[2][149] = "MATE 20 W/F"//modelo
        producto[3][149] = "0"
        producto[4][149] = "1050"
        producto[5][149] = "0"//incell
        producto[6][149] = "0"//cof
        producto[7][149] = "0"
        producto[8][149] = "0"

        producto[0][150] = "150"//id
        producto[1][150] = "huawei"
        producto[2][150] = "NOVA 5 T"//modelo
        producto[3][150] = "0"
        producto[4][150] = "0"
        producto[5][150] = "575"//incell
        producto[6][150] = "0"//cof
        producto[7][150] = "0"
        producto[8][150] = "0"

        producto[0][151] = "151"//id
        producto[1][151] = "huawei"
        producto[2][151] = "P SMART 2019"//modelo
        producto[3][151] = "0"
        producto[4][151] = "0"
        producto[5][151] = "525"//incell
        producto[6][151] = "0"//cof
        producto[7][151] = "0"
        producto[8][151] = "0"

        producto[0][152] = "152"//id
        producto[1][152] = "huawei"
        producto[2][152] = "P10 LITE"//modelo
        producto[3][152] = "0"
        producto[4][152] = "0"
        producto[5][152] = "360"//incell
        producto[6][152] = "0"//cof
        producto[7][152] = "0"
        producto[8][152] = "0"

        producto[0][153] = "153"//id
        producto[1][153] = "huawei"
        producto[2][153] = "P10 SELFIE"//modelo
        producto[3][153] = "0"
        producto[4][153] = "0"
        producto[5][153] = "500"//incell
        producto[6][153] = "0"//cof
        producto[7][153] = "0"
        producto[8][153] = "0"

        producto[0][154] = "154"//id
        producto[1][154] = "huawei"
        producto[2][154] = "P20 LITE"//modelo
        producto[3][154] = "0"
        producto[4][154] = "0"
        producto[5][154] = "370"//incell
        producto[6][154] = "0"//cof
        producto[7][154] = "0"
        producto[8][154] = "0"

        producto[0][155] = "155"//id
        producto[1][155] = "huawei"
        producto[2][155] = "P30"//modelo
        producto[3][155] = "0"
        producto[4][155] = "1200"
        producto[5][155] = "0"//incell
        producto[6][155] = "0"//cof
        producto[7][155] = "700"
        producto[8][155] = "0"

        producto[0][156] = "156"//id
        producto[1][156] = "huawei"
        producto[2][156] = "P30 LITE"//modelo
        producto[3][156] = "0"
        producto[4][156] = "0"
        producto[5][156] = "0"//incell
        producto[6][156] = "700"//cof
        producto[7][156] = "510"
        producto[8][156] = "0"

        producto[0][157] = "157"//id
        producto[1][157] = "huawei"
        producto[2][157] = "P30 PRO"//modelo
        producto[3][157] = "0"
        producto[4][157] = "1300"
        producto[5][157] = "0"//incell
        producto[6][157] = "0"//cof
        producto[7][157] = "0"
        producto[8][157] = "0"

        producto[0][158] = "158"//id
        producto[1][158] = "huawei"
        producto[2][158] = "P40 PRO"//modelo
        producto[3][158] = "4400"
        producto[4][158] = "0"
        producto[5][158] = "0"//incell
        producto[6][158] = "0"//cof
        producto[7][158] = "0"
        producto[8][158] = "0"

        producto[0][159] = "159"//id
        producto[1][159] = "huawei"
        producto[2][159] = "P9 LITE"//modelo
        producto[3][159] = "0"
        producto[4][159] = "0"
        producto[5][159] = "400"//incell
        producto[6][159] = "0"//cof
        producto[7][159] = "405"
        producto[8][159] = "0"

        producto[0][160] = "160"//id
        producto[1][160] = "huawei"
        producto[2][160] = "P9 LITE 2017"//modelo
        producto[3][160] = "0"
        producto[4][160] = "0"
        producto[5][160] = "0"//incell
        producto[6][160] = "0"//cof
        producto[7][160] = "380"
        producto[8][160] = "0"

        producto[0][161] = "161"//id
        producto[1][161] = "huawei"
        producto[2][161] = "Y6 2018"//modelo
        producto[3][161] = "0"
        producto[4][161] = "0"
        producto[5][161] = "0"//incell
        producto[6][161] = "0"//cof
        producto[7][161] = "350"
        producto[8][161] = "0"

        producto[0][162] = "162"//id
        producto[1][162] = "huawei"
        producto[2][162] = "Y6 2019 / Y6S 2019"//modelo
        producto[3][162] = "0"
        producto[4][162] = "0"
        producto[5][162] = "380"//incell
        producto[6][162] = "0"//cof
        producto[7][162] = "0"
        producto[8][162] = "0"

        producto[0][163] = "163"//id
        producto[1][163] = "huawei"
        producto[2][163] = "Y6 PRIME 2018"//modelo
        producto[3][163] = "0"
        producto[4][163] = "0"
        producto[5][163] = "390"//incell
        producto[6][163] = "0"//cof
        producto[7][163] = "0"
        producto[8][163] = "0"

        producto[0][164] = "164"//id
        producto[1][164] = "huawei"
        producto[2][164] = "Y7 2018"//modelo
        producto[3][164] = "0"
        producto[4][164] = "0"
        producto[5][164] = "350"//incell
        producto[6][164] = "0"//cof
        producto[7][164] = "0"
        producto[8][164] = "0"

        producto[0][165] = "165"//id
        producto[1][165] = "huawei"
        producto[2][165] = "Y7 PRIME 2019 / Y7 2019"//modelo
        producto[3][165] = "0"
        producto[4][165] = "0"
        producto[5][165] = "350"//incell
        producto[6][165] = "0"//cof
        producto[7][165] = "0"
        producto[8][165] = "0"

        producto[0][166] = "166"//id
        producto[1][166] = "huawei"
        producto[2][166] = "Y9 2018"//modelo
        producto[3][166] = "0"
        producto[4][166] = "0"
        producto[5][166] = "360"//incell
        producto[6][166] = "0"//cof
        producto[7][166] = "0"
        producto[8][166] = "0"

        producto[0][167] = "167"//id
        producto[1][167] = "huawei"
        producto[2][167] = "Y9 2019"//modelo
        producto[3][167] = "680"
        producto[4][167] = "0"
        producto[5][167] = "0"//incell
        producto[6][167] = "630"//cof
        producto[7][167] = "580"
        producto[8][167] = "0"

        producto[0][168] = "168"//id
        producto[1][168] = "huawei"
        producto[2][168] = "Y9 PRIME"//modelo
        producto[3][168] = "0"
        producto[4][168] = "0"
        producto[5][168] = "0"//incell
        producto[6][168] = "700"//cof
        producto[7][168] = "460"
        producto[8][168] = "0"

        producto[0][169] = "169"//id
        producto[1][169] = "huawei"
        producto[2][169] = "Y9S"//modelo
        producto[3][169] = "0"
        producto[4][169] = "0"
        producto[5][169] = "0"//incell
        producto[6][169] = "700"//cof
        producto[7][169] = "460"
        producto[8][169] = "0"



        //zte



        producto[0][170] = "170"//id
        producto[1][170] = "zte"
        producto[2][170] = "BLADE V20 SMART - 8010"//modelo
        producto[3][170] = "650"
        producto[4][170] = "0"
        producto[5][170] = "0"
        producto[6][170] = "0"
        producto[7][170] = "0"
        producto[8][170] = "0"

        producto[0][171] = "171"//id
        producto[1][171] = "zte"
        producto[2][171] = "A3 LITE"//modelo
        producto[3][171] = "340"
        producto[4][171] = "0"
        producto[5][171] = "0"
        producto[6][171] = "0"
        producto[7][171] = "0"
        producto[8][171] = "0"

        producto[0][172] = "172"//id
        producto[1][172] = "zte"
        producto[2][172] = "BLADE A51"//modelo
        producto[3][172] = "570"
        producto[4][172] = "0"
        producto[5][172] = "0"
        producto[6][172] = "0"
        producto[7][172] = "0"
        producto[8][172] = "0"

        producto[0][173] = "173"//id
        producto[1][173] = "zte"
        producto[2][173] = "BLADE A602 BLACK / GOLDEN"//modelo
        producto[3][173] = "380"
        producto[4][173] = "0"
        producto[5][173] = "0"
        producto[6][173] = "0"
        producto[7][173] = "0"
        producto[8][173] = "0"

        producto[0][174] = "174"//id
        producto[1][174] = "zte"
        producto[2][174] = "BLADE A7 2019"//modelo
        producto[3][174] = "530"
        producto[4][174] = "0"
        producto[5][174] = "0"
        producto[6][174] = "0"
        producto[7][174] = "0"
        producto[8][174] = "0"

        producto[0][175] = "175"//id
        producto[1][175] = "zte"
        producto[2][175] = "BLADE V10"//modelo
        producto[3][175] = "630"
        producto[4][175] = "0"
        producto[5][175] = "0"
        producto[6][175] = "0"
        producto[7][175] = "0"
        producto[8][175] = "0"

        producto[0][176] = "176"//id
        producto[1][176] = "zte"
        producto[2][176] = "BLADE V10 VITA"//modelo
        producto[3][176] = "450"
        producto[4][176] = "0"
        producto[5][176] = "0"
        producto[6][176] = "0"
        producto[7][176] = "0"
        producto[8][176] = "0"

        producto[0][177] = "177"//id
        producto[1][177] = "zte"
        producto[2][177] = "BLADE Z MAX - Z982"//modelo
        producto[3][177] = "430"
        producto[4][177] = "0"
        producto[5][177] = "0"
        producto[6][177] = "0"
        producto[7][177] = "0"
        producto[8][177] = "0"

        producto[0][178] = "178"//id
        producto[1][178] = "zte"
        producto[2][178] = "BLADE L8"//modelo
        producto[3][178] = "370"
        producto[4][178] = "0"
        producto[5][178] = "0"
        producto[6][178] = "0"
        producto[7][178] = "0"
        producto[8][178] = "0"

        producto[0][179] = "179"//id
        producto[1][179] = "zte"
        producto[2][179] = "BLADE A7S 2020"//modelo
        producto[3][179] = "600"
        producto[4][179] = "0"
        producto[5][179] = "0"
        producto[6][179] = "0"
        producto[7][179] = "0"
        producto[8][179] = "0"

        producto[0][180] = "180"//id
        producto[1][180] = "zte"
        producto[2][180] = "Z MAX PRO - Z981"//modelo
        producto[3][180] = "520"
        producto[4][180] = "0"
        producto[5][180] = "0"
        producto[6][180] = "0"
        producto[7][180] = "0"
        producto[8][180] = "0"

        producto[0][181] = "181"//id
        producto[1][181] = "zte"
        producto[2][181] = "BLADE V9 VITA - V0920"//modelo
        producto[3][181] = "380"
        producto[4][181] = "0"
        producto[5][181] = "0"
        producto[6][181] = "0"
        producto[7][181] = "0"
        producto[8][181] = "0"

        producto[0][182] = "182"//id
        producto[1][182] = "zte"
        producto[2][182] = "BLADE A5 2020"//modelo
        producto[3][182] = "550"
        producto[4][182] = "0"
        producto[5][182] = "0"
        producto[6][182] = "0"
        producto[7][182] = "0"
        producto[8][182] = "0"

        producto[0][183] = "183"//id
        producto[1][183] = "zte"
        producto[2][183] = "BLADE L210"//modelo
        producto[3][183] = "460"
        producto[4][183] = "0"
        producto[5][183] = "0"
        producto[6][183] = "0"
        producto[7][183] = "0"
        producto[8][183] = "0"



        //motorola



        producto[0][184] = "184"//id
        producto[1][184] = "motorola" //marca
        producto[2][184] = "E20"//modelo
        producto[3][184] = "500" //original
        producto[4][184] = "0" //oled
        producto[5][184] = "0" //incell
        producto[6][184] = "0" // cof
        producto[7][184] = "0" //cog
        producto[8][184] = "0" // tft

        producto[0][185] = "185"//id
        producto[1][185] = "motorola" //marca
        producto[2][185] = "E4"//modelo
        producto[3][185] = "300" //original
        producto[4][185] = "0" //oled
        producto[5][185] = "0" //incell
        producto[6][185] = "0" // cof
        producto[7][185] = "0" //cog
        producto[8][185] = "0" // tft

        producto[0][186] = "186"//id
        producto[1][186] = "motorola" //marca
        producto[2][186] = "E40"//modelo
        producto[3][186] = "600" //original
        producto[4][186] = "0" //oled
        producto[5][186] = "0" //incell
        producto[6][186] = "0" // cof
        producto[7][186] = "0" //cog
        producto[8][186] = "0" // tft

        producto[0][187] = "187"//id
        producto[1][187] = "motorola" //marca
        producto[2][187] = "E4 plus"//modelo
        producto[3][187] = "370" //original
        producto[4][187] = "0" //oled
        producto[5][187] = "0" //incell
        producto[6][187] = "0" // cof
        producto[7][187] = "0" //cog
        producto[8][187] = "0" // tft

        producto[0][188] = "188"//id
        producto[1][188] = "motorola" //marca
        producto[2][188] = "E5 / G6 play"//modelo
        producto[3][188] = "430" //original
        producto[4][188] = "0" //oled
        producto[5][188] = "0" //incell
        producto[6][188] = "0" // cof
        producto[7][188] = "0" //cog
        producto[8][188] = "0" // tft

        producto[0][189] = "189"//id
        producto[1][189] = "motorola" //marca
        producto[2][189] = "E5 plus"//modelo
        producto[3][189] = "500" //original
        producto[4][189] = "0" //oled
        producto[5][189] = "0" //incell
        producto[6][189] = "0" // cof
        producto[7][189] = "0" //cog
        producto[8][189] = "0" // tft

        producto[0][190] = "190"//id
        producto[1][190] = "motorola" //marca
        producto[2][190] = "E5 play W/F"//modelo
        producto[3][190] = "500" //original
        producto[4][190] = "0" //oled
        producto[5][190] = "0" //incell
        producto[6][190] = "0" // cof
        producto[7][190] = "0" //cog
        producto[8][190] = "0" // tft

        producto[0][191] = "191"//id
        producto[1][191] = "motorola" //marca
        producto[2][191] = "E5 play go"//modelo
        producto[3][191] = "400" //original
        producto[4][191] = "0" //oled
        producto[5][191] = "0" //incell
        producto[6][191] = "0" // cof
        producto[7][191] = "0" //cog
        producto[8][191] = "0" // tft

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
        producto[1][193] = "motorola" //marca
        producto[2][193] = "E6S / E6i"//modelo
        producto[3][193] = "500" //original
        producto[4][193] = "0" //oled
        producto[5][193] = "0" //incell
        producto[6][193] = "0" // cof
        producto[7][193] = "0" //cog
        producto[8][193] = "0" // tft

        producto[0][194] = "194"//id
        producto[1][194] = "motorola" //marca
        producto[2][194] = "E6 play"//modelo
        producto[3][194] = "370" //original
        producto[4][194] = "0" //oled
        producto[5][194] = "0" //incell
        producto[6][194] = "0" // cof
        producto[7][194] = "0" //cog
        producto[8][194] = "0" // tft

        producto[0][195] = "195"//id
        producto[1][195] = "motorola" //marca
        producto[2][195] = "E6 plus"//modelo
        producto[3][195] = "370" //original
        producto[4][195] = "0" //oled
        producto[5][195] = "0" //incell
        producto[6][195] = "0" // cof
        producto[7][195] = "0" //cog
        producto[8][195] = "0" // tft

        producto[0][196] = "196"//id
        producto[1][196] = "motorola" //marca
        producto[2][196] = "E7 / E7 power / E7i power"//modelo
        producto[3][196] = "480" //original
        producto[4][196] = "0" //oled
        producto[5][196] = "0" //incell
        producto[6][196] = "0" // cof
        producto[7][196] = "0" //cog
        producto[8][196] = "0" // tft

        producto[0][197] = "197"//id
        producto[1][197] = "motorola" //marca
        producto[2][197] = "G5"//modelo
        producto[3][197] = "275" //original
        producto[4][197] = "0" //oled
        producto[5][197] = "0" //incell
        producto[6][197] = "0" // cof
        producto[7][197] = "0" //cog
        producto[8][197] = "0" // tft

        producto[0][198] = "198"//id
        producto[1][198] = "motorola" //marca
        producto[2][198] = "G 5G"//modelo
        producto[3][198] = "550" //original
        producto[4][198] = "0" //oled
        producto[5][198] = "0" //incell
        producto[6][198] = "0" // cof
        producto[7][198] = "0" //cog
        producto[8][198] = "0" // tft

        producto[0][199] = "199"//id
        producto[1][199] = "motorola" //marca
        producto[2][199] = "G 5G plus"//modelo
        producto[3][199] = "750" //original
        producto[4][199] = "0" //oled
        producto[5][199] = "0" //incell
        producto[6][199] = "0" // cof
        producto[7][199] = "0" //cog
        producto[8][199] = "0" // tft

        producto[0][200] = "200"//id
        producto[1][200] = "motorola" //marca
        producto[2][200] = "G5S"//modelo
        producto[3][200] = "350" //original
        producto[4][200] = "0" //oled
        producto[5][200] = "0" //incell
        producto[6][200] = "0" // cof
        producto[7][200] = "0" //cog
        producto[8][200] = "0" // tft

        producto[0][201] = "201"//id
        producto[1][201] = "motorola" //marca
        producto[2][201] = "G5 plus"//modelo
        producto[3][201] = "350" //original
        producto[4][201] = "0" //oled
        producto[5][201] = "0" //incell
        producto[6][201] = "0" // cof
        producto[7][201] = "0" //cog
        producto[8][201] = "0" // tft

        producto[0][202] = "202"//id
        producto[1][202] = "motorola" //marca
        producto[2][202] = "G5s plus"//modelo
        producto[3][202] = "360" //original
        producto[4][202] = "0" //oled
        producto[5][202] = "0" //incell
        producto[6][202] = "0" // cof
        producto[7][202] = "0" //cog
        producto[8][202] = "0" // tft

        producto[0][203] = "203"//id
        producto[1][203] = "motorola" //marca
        producto[2][203] = "G6"//modelo
        producto[3][203] = "420" //original
        producto[4][203] = "0" //oled
        producto[5][203] = "0" //incell
        producto[6][203] = "0" // cof
        producto[7][203] = "0" //cog
        producto[8][203] = "0" // tft

        producto[0][204] = "204"//id
        producto[1][204] = "motorola" //marca
        producto[2][204] = "G6 plus"//modelo
        producto[3][204] = "470" //original
        producto[4][204] = "0" //oled
        producto[5][204] = "0" //incell
        producto[6][204] = "0" // cof
        producto[7][204] = "0" //cog
        producto[8][204] = "0" // tft

        producto[0][205] = "205"//id
        producto[1][205] = "motorola" //marca
        producto[2][205] = "G7 / G7 plus"//modelo
        producto[3][205] = "540" //original
        producto[4][205] = "0" //oled
        producto[5][205] = "0" //incell
        producto[6][205] = "0" // cof
        producto[7][205] = "0" //cog
        producto[8][205] = "0" // tft

        producto[0][206] = "206"//id
        producto[1][206] = "motorola" //marca
        producto[2][206] = "G7 play"//modelo
        producto[3][206] = "580" //original
        producto[4][206] = "0" //oled
        producto[5][206] = "0" //incell
        producto[6][206] = "0" // cof
        producto[7][206] = "0" //cog
        producto[8][206] = "0" // tft

        producto[0][207] = "207"//id
        producto[1][207] = "motorola" //marca
        producto[2][207] = "G7 power"//modelo
        producto[3][207] = "440" //original
        producto[4][207] = "0" //oled
        producto[5][207] = "0" //incell
        producto[6][207] = "0" // cof
        producto[7][207] = "0" //cog
        producto[8][207] = "0" // tft

        producto[0][208] = "208"//id
        producto[1][208] = "motorola" //marca
        producto[2][208] = "G8"//modelo
        producto[3][208] = "440" //original
        producto[4][208] = "0" //oled
        producto[5][208] = "0" //incell
        producto[6][208] = "0" // cof
        producto[7][208] = "0" //cog
        producto[8][208] = "0" // tft

        producto[0][209] = "209"//id
        producto[1][209] = "motorola" //marca
        producto[2][209] = "G8 play / One Macro"//modelo
        producto[3][209] = "430" //original
        producto[4][209] = "0" //oled
        producto[5][209] = "0" //incell
        producto[6][209] = "0" // cof
        producto[7][209] = "0" //cog
        producto[8][209] = "0" // tft

        producto[0][210] = "210"//id
        producto[1][210] = "motorola" //marca
        producto[2][210] = "G8 plus"//modelo
        producto[3][210] = "510" //original
        producto[4][210] = "0" //oled
        producto[5][210] = "0" //incell
        producto[6][210] = "0" // cof
        producto[7][210] = "0" //cog
        producto[8][210] = "0" // tft

        producto[0][211] = "211"//id
        producto[1][211] = "motorola" //marca
        producto[2][211] = "G8 power"//modelo
        producto[3][211] = "520" //original
        producto[4][211] = "0" //oled
        producto[5][211] = "0" //incell
        producto[6][211] = "0" // cof
        producto[7][211] = "0" //cog
        producto[8][211] = "0" // tft

        producto[0][212] = "212"//id
        producto[1][212] = "motorola" //marca
        producto[2][212] = "G8 power lite"//modelo
        producto[3][212] = "440" //original
        producto[4][212] = "0" //oled
        producto[5][212] = "0" //incell
        producto[6][212] = "0" // cof
        producto[7][212] = "0" //cog
        producto[8][212] = "0" // tft

        producto[0][213] = "213"//id
        producto[1][213] = "motorola" //marca
        producto[2][213] = "G9 / G9 play / E7 plus"//modelo
        producto[3][213] = "440" //original
        producto[4][213] = "0" //oled
        producto[5][213] = "0" //incell
        producto[6][213] = "0" // cof
        producto[7][213] = "0" //cog
        producto[8][213] = "0" // tft

        producto[0][214] = "214"//id
        producto[1][214] = "motorola" //marca
        producto[2][214] = "G9 plus"//modelo
        producto[3][214] = "515" //original
        producto[4][214] = "0" //oled
        producto[5][214] = "0" //incell
        producto[6][214] = "0" // cof
        producto[7][214] = "0" //cog
        producto[8][214] = "0" // tft

        producto[0][215] = "215"//id
        producto[1][215] = "motorola" //marca
        producto[2][215] = "G9 power"//modelo
        producto[3][215] = "540" //original
        producto[4][215] = "0" //oled
        producto[5][215] = "0" //incell
        producto[6][215] = "0" // cof
        producto[7][215] = "0" //cog
        producto[8][215] = "0" // tft

        producto[0][216] = "216"//id
        producto[1][216] = "motorola" //marca
        producto[2][216] = "G10 / G30"//modelo
        producto[3][216] = "455" //original
        producto[4][216] = "0" //oled
        producto[5][216] = "0" //incell
        producto[6][216] = "0" // cof
        producto[7][216] = "0" //cog
        producto[8][216] = "0" // tft

        producto[0][217] = "217"//id
        producto[1][217] = "motorola" //marca
        producto[2][217] = "G20"//modelo
        producto[3][217] = "490" //original
        producto[4][217] = "0" //oled
        producto[5][217] = "0" //incell
        producto[6][217] = "0" // cof
        producto[7][217] = "0" //cog
        producto[8][217] = "0" // tft

        producto[0][218] = "218"//id
        producto[1][218] = "motorola" //marca
        producto[2][218] = "G50 - 4g"//modelo
        producto[3][218] = "580" //original
        producto[4][218] = "0" //oled
        producto[5][218] = "0" //incell
        producto[6][218] = "0" // cof
        producto[7][218] = "0" //cog
        producto[8][218] = "0" // tft

        producto[0][219] = "219"//id
        producto[1][219] = "motorola" //marca
        producto[2][219] = "G50 - 5g"//modelo
        producto[3][219] = "600" //original
        producto[4][219] = "0" //oled
        producto[5][219] = "0" //incell
        producto[6][219] = "0" // cof
        producto[7][219] = "0" //cog
        producto[8][219] = "0" // tft

        producto[0][220] = "220"//id
        producto[1][220] = "motorola" //marca
        producto[2][220] = "G60"//modelo
        producto[3][220] = "700" //original
        producto[4][220] = "0" //oled
        producto[5][220] = "0" //incell
        producto[6][220] = "0" // cof
        producto[7][220] = "0" //cog
        producto[8][220] = "0" // tft

        producto[0][221] = "221"//id
        producto[1][221] = "motorola" //marca
        producto[2][221] = "G100"//modelo
        producto[3][221] = "760" //original
        producto[4][221] = "0" //oled
        producto[5][221] = "0" //incell
        producto[6][221] = "0" // cof
        producto[7][221] = "0" //cog
        producto[8][221] = "0" // tft

        producto[0][222] = "222"//id
        producto[1][222] = "motorola" //marca
        producto[2][222] = "One"//modelo
        producto[3][222] = "540" //original
        producto[4][222] = "0" //oled
        producto[5][222] = "0" //incell
        producto[6][222] = "0" // cof
        producto[7][222] = "0" //cog
        producto[8][222] = "0" // tft

        producto[0][223] = "223"//id
        producto[1][223] = "motorola" //marca
        producto[2][223] = "One W/F"//modelo
        producto[3][223] = "600" //original
        producto[4][223] = "0" //oled
        producto[5][223] = "0" //incell
        producto[6][223] = "0" // cof
        producto[7][223] = "0" //cog
        producto[8][223] = "0" // tft

        producto[0][224] = "224"//id
        producto[1][224] = "motorola" //marca
        producto[2][224] = "One hyper"//modelo
        producto[3][224] = "560" //original
        producto[4][224] = "0" //oled
        producto[5][224] = "0" //incell
        producto[6][224] = "0" // cof
        producto[7][224] = "0" //cog
        producto[8][224] = "0" // tft

        producto[0][225] = "225"//id
        producto[1][225] = "motorola" //marca
        producto[2][225] = "One fusion"//modelo
        producto[3][225] = "500" //original
        producto[4][225] = "0" //oled
        producto[5][225] = "0" //incell
        producto[6][225] = "0" // cof
        producto[7][225] = "0" //cog
        producto[8][225] = "0" // tft

        producto[0][226] = "226"//id
        producto[1][226] = "motorola" //marca
        producto[2][226] = "One fusion plus"//modelo
        producto[3][226] = "520" //original
        producto[4][226] = "0" //oled
        producto[5][226] = "0" //incell
        producto[6][226] = "0" // cof
        producto[7][226] = "0" //cog
        producto[8][226] = "0" // tft

        producto[0][227] = "227"//id
        producto[1][227] = "motorola" //marca
        producto[2][227] = "One zoom"//modelo
        producto[3][227] = "825" //original
        producto[4][227] = "0" //oled
        producto[5][227] = "0" //incell
        producto[6][227] = "0" // cof
        producto[7][227] = "0" //cog
        producto[8][227] = "0" // tft

        producto[0][228] = "228"//id
        producto[1][228] = "motorola" //marca
        producto[2][228] = "One vision / One action"//modelo
        producto[3][228] = "1020" //original
        producto[4][228] = "0" //oled
        producto[5][228] = "0" //incell
        producto[6][228] = "0" // cof
        producto[7][228] = "0" //cog
        producto[8][228] = "0" // tft

        producto[0][229] = "229"//id
        producto[1][229] = "motorola" //marca
        producto[2][229] = "Edge"//modelo
        producto[3][229] = "3500" //original
        producto[4][229] = "0" //oled
        producto[5][229] = "0" //incell
        producto[6][229] = "0" // cof
        producto[7][229] = "0" //cog
        producto[8][229] = "0" // tft

        producto[0][230] = "230"//id
        producto[1][230] = "motorola" //marca
        producto[2][230] = "G play 2021"//modelo
        producto[3][230] = "600" //original
        producto[4][230] = "0" //oled
        producto[5][230] = "0" //incell
        producto[6][230] = "0" // cof
        producto[7][230] = "0" //cog
        producto[8][230] = "0" // tft

        producto[0][231] = "231"//id
        producto[1][231] = "motorola" //marca
        producto[2][231] = "X Play W/F"//modelo
        producto[3][231] = "405" //original
        producto[4][231] = "0" //oled
        producto[5][231] = "0" //incell
        producto[6][231] = "0" // cof
        producto[7][231] = "0" //cog
        producto[8][231] = "0" // tft

        producto[0][232] = "232"//id
        producto[1][232] = "motorola" //marca
        producto[2][232] = "Z Play"//modelo
        producto[3][232] = "600" //original
        producto[4][232] = "0" //oled
        producto[5][232] = "0" //incell
        producto[6][232] = "0" // cof
        producto[7][232] = "0" //cog
        producto[8][232] = "0" // tft

        producto[0][233] = "233"//id
        producto[1][233] = "motorola" //marca
        producto[2][233] = "Z2 Play"//modelo
        producto[3][233] = "600" //original
        producto[4][233] = "0" //oled
        producto[5][233] = "0" //incell
        producto[6][233] = "0" // cof
        producto[7][233] = "0" //cog
        producto[8][233] = "0" // tft

        producto[0][234] = "234"//id
        producto[1][234] = "motorola" //marca
        producto[2][234] = "Z3 Play"//modelo
        producto[3][234] = "760" //original
        producto[4][234] = "0" //oled
        producto[5][234] = "0" //incell
        producto[6][234] = "0" // cof
        producto[7][234] = "0" //cog
        producto[8][234] = "0" // tft

        producto[0][235] = "235"//id
        producto[1][235] = "motorola" //marca
        producto[2][235] = "Z4"//modelo
        producto[3][235] = "761" //original
        producto[4][235] = "0" //oled
        producto[5][235] = "0" //incell
        producto[6][235] = "0" // cof
        producto[7][235] = "0" //cog
        producto[8][235] = "0" // tft



        //realme



        producto[0][236] = "236"//id
        producto[1][236] = "realme"
        producto[2][236] = "C 21"//modelo
        producto[3][236] = "0"
        producto[4][236] = "0"
        producto[5][236] = "450"
        producto[6][236] = "0"
        producto[7][236] = "0"
        producto[8][236] = "0"

        producto[0][237] = "237"//id
        producto[1][237] = "realme"
        producto[2][237] = "Realme 7"//modelo
        producto[3][237] = "0"
        producto[4][237] = "0"
        producto[5][237] = "575"
        producto[6][237] = "0"
        producto[7][237] = "0"
        producto[8][237] = "0"



        //oppo



        producto[0][238] = "238"//id
        producto[1][238] = "oppo"
        producto[2][238] = "A12"//modelo
        producto[3][238] = "0"
        producto[4][238] = "0"
        producto[5][238] = "450"//incell
        producto[6][238] = "0"
        producto[7][238] = "0"
        producto[8][238] = "0"

        producto[0][239] = "239"//id
        producto[1][239] = "oppo"
        producto[2][239] = "A15"//modelo
        producto[3][239] = "0"
        producto[4][239] = "0"
        producto[5][239] = "500"//incell
        producto[6][239] = "0"
        producto[7][239] = "0"
        producto[8][239] = "0"

        producto[0][240] = "240"//id
        producto[1][240] = "oppo"
        producto[2][240] = "A16"//modelo
        producto[3][240] = "0"
        producto[4][240] = "0"
        producto[5][240] = "460"//incell
        producto[6][240] = "0"
        producto[7][240] = "0"
        producto[8][240] = "0"

        producto[0][241] = "241"//id
        producto[1][241] = "oppo"
        producto[2][241] = "A53 - 4G"//modelo
        producto[3][241] = "0"
        producto[4][241] = "0"
        producto[5][241] = "550"//incell
        producto[6][241] = "0"
        producto[7][241] = "0"
        producto[8][241] = "0"

        producto[0][242] = "242"//id
        producto[1][242] = "oppo"
        producto[2][242] = "A73"//modelo
        producto[3][242] = "0"
        producto[4][242] = "0"
        producto[5][242] = "520"//incell
        producto[6][242] = "0"
        producto[7][242] = "0"
        producto[8][242] = "0"

        producto[0][243] = "243"//id
        producto[1][243] = "oppo"
        producto[2][243] = "A9 2020"//modelo
        producto[3][243] = "0"
        producto[4][243] = "0"
        producto[5][243] = "400"//incell
        producto[6][243] = "0"
        producto[7][243] = "0"
        producto[8][243] = "0"

        producto[0][244] = "244"//id
        producto[1][244] = "oppo"
        producto[2][244] = "RENO 5 LITE "//modelo
        producto[3][244] = "2100"
        producto[4][244] = "0"
        producto[5][244] = "720"//incell
        producto[6][244] = "0"
        producto[7][244] = "0"
        producto[8][244] = "0"



        // xiaomi



        producto[0][245] = "245"//id
        producto[1][245] = "xiaomi" //marca
        producto[2][245] = "MI 8"//modelo
        producto[3][245] = "0" //original
        producto[4][245] = "1260" //oled
        producto[5][245] = "0" //incell
        producto[6][245] = "0" // cof
        producto[7][245] = "0" //cog
        producto[8][245] = "0" // tft

        producto[0][246] = "246"//id
        producto[1][246] = "xiaomi" //marca
        producto[2][246] = "MI 8 LITE"//modelo
        producto[3][246] = "0" //original
        producto[4][246] = "0" //oled
        producto[5][246] = "500" //incell
        producto[6][246] = "0" // cof
        producto[7][246] = "0" //cog
        producto[8][246] = "0" // tft

        producto[0][247] = "247"//id
        producto[1][247] = "xiaomi" //marca
        producto[2][247] = "MI 9"//modelo
        producto[3][247] = "0" //original
        producto[4][247] = "880" //oled
        producto[5][247] = "680" //incell
        producto[6][247] = "0" // cof
        producto[7][247] = "0" //cog
        producto[8][247] = "0" // tft

        producto[0][248] = "248"//id
        producto[1][248] = "xiaomi" //marca
        producto[2][248] = "MI 9T / MI 9PRO"//modelo
        producto[3][248] = "0" //original
        producto[4][248] = "920" //oled
        producto[5][248] = "700" //incell
        producto[6][248] = "0" // cof
        producto[7][248] = "0" //cog
        producto[8][248] = "0" // tft

        producto[0][249] = "249"//id
        producto[1][249] = "xiaomi" //marca
        producto[2][249] = "MI 9 LITE"//modelo
        producto[3][249] = "0" //original
        producto[4][249] = "920" //oled
        producto[5][249] = "680" //incell
        producto[6][249] = "0" // cof
        producto[7][249] = "0" //cog
        producto[8][249] = "0" // tft

        producto[0][250] = "250"//id
        producto[1][250] = "xiaomi" //marca
        producto[2][250] = "MI 10 LITE"//modelo
        producto[3][250] = "0" //original
        producto[4][250] = "1450" //oled
        producto[5][250] = "0" //incell
        producto[6][250] = "0" // cof
        producto[7][250] = "0" //cog
        producto[8][250] = "0" // tft

        producto[0][251] = "251"//id
        producto[1][251] = "xiaomi" //marca
        producto[2][251] = "MI 11i"//modelo
        producto[3][251] = "0" //original
        producto[4][251] = "1300" //oled
        producto[5][251] = "0" //incell
        producto[6][251] = "0" // cof
        producto[7][251] = "0" //cog
        producto[8][251] = "0" // tft

        producto[0][252] = "252"//id
        producto[1][252] = "xiaomi" //marca
        producto[2][252] = "MI A5 / 5X"//modelo
        producto[3][252] = "0" //original
        producto[4][252] = "0" //oled
        producto[5][252] = "360" //incell
        producto[6][252] = "0" // cof
        producto[7][252] = "0" //cog
        producto[8][252] = "0" // tft

        producto[0][253] = "253"//id
        producto[1][253] = "xiaomi" //marca
        producto[2][253] = "MI A2 LITE"//modelo
        producto[3][253] = "0" //original
        producto[4][253] = "0" //oled
        producto[5][253] = "460" //incell
        producto[6][253] = "0" // cof
        producto[7][253] = "0" //cog
        producto[8][253] = "0" // tft

        producto[0][254] = "254"//id
        producto[1][254] = "xiaomi" //marca
        producto[2][254] = "MI A3"//modelo
        producto[3][254] = "0" //original
        producto[4][254] = "0" //oled
        producto[5][254] = "570" //incell
        producto[6][254] = "0" // cof
        producto[7][254] = "0" //cog
        producto[8][254] = "0" // tft

        producto[0][255] = "255"//id
        producto[1][255] = "xiaomi" //marca
        producto[2][255] = "MI NOTE 10"//modelo
        producto[3][255] = "730" //original
        producto[4][255] = "0" //oled
        producto[5][255] = "0" //incell
        producto[6][255] = "0" // cof
        producto[7][255] = "0" //cog
        producto[8][255] = "0" // tft

        producto[0][256] = "256"//id
        producto[1][256] = "xiaomi" //marca
        producto[2][256] = "MI NOTE 10 LITE CURVA"//modelo
        producto[3][256] = "750" //original
        producto[4][256] = "0" //oled
        producto[5][256] = "0" //incell
        producto[6][256] = "0" // cof
        producto[7][256] = "0" //cog
        producto[8][256] = "0" // tft

        producto[0][257] = "257"//id
        producto[1][257] = "xiaomi" //marca
        producto[2][257] = "MI NOTE 10 Pro"//modelo
        producto[3][257] = "830" //original
        producto[4][257] = "0" //oled
        producto[5][257] = "0" //incell
        producto[6][257] = "0" // cof
        producto[7][257] = "0" //cog
        producto[8][257] = "0" // tft

        producto[0][258] = "258"//id
        producto[1][258] = "xiaomi" //marca
        producto[2][258] = "REDMI C3"//modelo
        producto[3][258] = "0" //original
        producto[4][258] = "0" //oled
        producto[5][258] = "550" //incell
        producto[6][258] = "0" // cof
        producto[7][258] = "0" //cog
        producto[8][258] = "0" // tft

        producto[0][259] = "259"//id
        producto[1][259] = "xiaomi" //marca
        producto[2][259] = "REDMI 4A"//modelo
        producto[3][259] = "0" //original
        producto[4][259] = "0" //oled
        producto[5][259] = "330" //incell
        producto[6][259] = "0" // cof
        producto[7][259] = "0" //cog
        producto[8][259] = "0" // tft

        producto[0][260] = "260"//id
        producto[1][260] = "xiaomi" //marca
        producto[2][260] = "REDMI 5"//modelo
        producto[3][260] = "0" //original
        producto[4][260] = "0" //oled
        producto[5][260] = "530" //incell
        producto[6][260] = "0" // cof
        producto[7][260] = "0" //cog
        producto[8][260] = "0" // tft

        producto[0][261] = "261"//id
        producto[1][261] = "xiaomi" //marca
        producto[2][261] = "REDMI 5 PLUS"//modelo
        producto[3][261] = "0" //original
        producto[4][261] = "0" //oled
        producto[5][261] = "460" //incell
        producto[6][261] = "0" // cof
        producto[7][261] = "0" //cog
        producto[8][261] = "0" // tft

        producto[0][262] = "262"//id
        producto[1][262] = "xiaomi" //marca
        producto[2][262] = "REDMI 6 / 6A"//modelo
        producto[3][262] = "0" //original
        producto[4][262] = "0" //oled
        producto[5][262] = "395" //incell
        producto[6][262] = "0" // cof
        producto[7][262] = "0" //cog
        producto[8][262] = "0" // tft

        producto[0][263] = "263"//id
        producto[1][263] = "xiaomi" //marca
        producto[2][263] = "REDMI 6 PRO"//modelo
        producto[3][263] = "0" //original
        producto[4][263] = "0" //oled
        producto[5][263] = "440" //incell
        producto[6][263] = "0" // cof
        producto[7][263] = "0" //cog
        producto[8][263] = "0" // tft

        producto[0][264] = "264"//id
        producto[1][264] = "xiaomi" //marca
        producto[2][264] = "REDMI 7"//modelo
        producto[3][264] = "0" //original
        producto[4][264] = "0" //oled
        producto[5][264] = "435" //incell
        producto[6][264] = "0" // cof
        producto[7][264] = "0" //cog
        producto[8][264] = "0" // tft

        producto[0][265] = "265"//id
        producto[1][265] = "xiaomi" //marca
        producto[2][265] = "REDMI 7A"//modelo
        producto[3][265] = "0" //original
        producto[4][265] = "0" //oled
        producto[5][265] = "410" //incell
        producto[6][265] = "0" // cof
        producto[7][265] = "0" //cog
        producto[8][265] = "0" // tft

        producto[0][266] = "266"//id
        producto[1][266] = "xiaomi" //marca
        producto[2][266] = "REDMI 7 PRO"//modelo
        producto[3][266] = "0" //original
        producto[4][266] = "0" //oled
        producto[5][266] = "750" //incell
        producto[6][266] = "0" // cof
        producto[7][266] = "0" //cog
        producto[8][266] = "0" // tft

        producto[0][267] = "267"//id
        producto[1][267] = "xiaomi" //marca
        producto[2][267] = "REDMI 8 / 8A"//modelo
        producto[3][267] = "0" //original
        producto[4][267] = "0" //oled
        producto[5][267] = "450" //incell
        producto[6][267] = "0" // cof
        producto[7][267] = "0" //cog
        producto[8][267] = "0" // tft

        producto[0][268] = "268"//id
        producto[1][268] = "xiaomi" //marca
        producto[2][268] = "REDMI 8 PRO"//modelo
        producto[3][268] = "0" //original
        producto[4][268] = "0" //oled
        producto[5][268] = "570" //incell
        producto[6][268] = "0" // cof
        producto[7][268] = "0" //cog
        producto[8][268] = "0" // tft

        producto[0][269] = "269"//id
        producto[1][269] = "xiaomi" //marca
        producto[2][269] = "REDMI 9"//modelo
        producto[3][269] = "0" //original
        producto[4][269] = "0" //oled
        producto[5][269] = "510" //incell
        producto[6][269] = "0" // cof
        producto[7][269] = "0" //cog
        producto[8][269] = "0" // tft

        producto[0][270] = "270"//id
        producto[1][270] = "xiaomi" //marca
        producto[2][270] = "REDMI 9T"//modelo
        producto[3][270] = "0" //original
        producto[4][270] = "980" //oled
        producto[5][270] = "560" //incell
        producto[6][270] = "0" // cof
        producto[7][270] = "0" //cog
        producto[8][270] = "0" // tft

        producto[0][271] = "271"//id
        producto[1][271] = "xiaomi" //marca
        producto[2][271] = "REDMI 9A / 9C"//modelo
        producto[3][271] = "0" //original
        producto[4][271] = "0" //oled
        producto[5][271] = "420" //incell
        producto[6][271] = "0" // cof
        producto[7][271] = "0" //cog
        producto[8][271] = "0" // tft

        producto[0][272] = "272"//id
        producto[1][272] = "xiaomi" //marca
        producto[2][272] = "REDMI 10"//modelo
        producto[3][272] = "0" //original
        producto[4][272] = "0" //oled
        producto[5][272] = "500" //incell
        producto[6][272] = "0" // cof
        producto[7][272] = "0" //cog
        producto[8][272] = "0" // tft

        producto[0][273] = "273"//id
        producto[1][273] = "xiaomi" //marca
        producto[2][273] = "REDMI GO"//modelo
        producto[3][273] = "0" //original
        producto[4][273] = "0" //oled
        producto[5][273] = "330" //incell
        producto[6][273] = "0" // cof
        producto[7][273] = "0" //cog
        producto[8][273] = "0" // tft

        producto[0][274] = "274"//id
        producto[1][274] = "xiaomi" //marca
        producto[2][274] = "REDMI S2"//modelo
        producto[3][274] = "0" //original
        producto[4][274] = "0" //oled
        producto[5][274] = "400" //incell
        producto[6][274] = "0" // cof
        producto[7][274] = "0" //cog
        producto[8][274] = "0" // tft

        producto[0][275] = "275"//id
        producto[1][275] = "xiaomi" //marca
        producto[2][275] = "REDMI NOTE 5A"//modelo
        producto[3][275] = "0" //original
        producto[4][275] = "0" //oled
        producto[5][275] = "330" //incell
        producto[6][275] = "0" // cof
        producto[7][275] = "0" //cog
        producto[8][275] = "0" // tft

        producto[0][276] = "276"//id
        producto[1][276] = "xiaomi" //marca
        producto[2][276] = "REDMI NOTE 5 / NOTE 5 PRO"//modelo
        producto[3][276] = "0" //original
        producto[4][276] = "0" //oled
        producto[5][276] = "460" //incell
        producto[6][276] = "0" // cof
        producto[7][276] = "0" //cog
        producto[8][276] = "0" // tft

        producto[0][277] = "277"//id
        producto[1][277] = "xiaomi" //marca
        producto[2][277] = "REDMI NOTE 6 / NOTE 6 PRO"//modelo
        producto[3][277] = "0" //original
        producto[4][277] = "0" //oled
        producto[5][277] = "640" //incell
        producto[6][277] = "0" // cof
        producto[7][277] = "0" //cog
        producto[8][277] = "0" // tft

        producto[0][278] = "278"//id
        producto[1][278] = "xiaomi" //marca
        producto[2][278] = "REDMI NOTE 7 / NOTE 7 PRO"//modelo
        producto[3][278] = "0" //original
        producto[4][278] = "0" //oled
        producto[5][278] = "540" //incell
        producto[6][278] = "0" // cof
        producto[7][278] = "0" //cog
        producto[8][278] = "0" // tft

        producto[0][279] = "279"//id
        producto[1][279] = "xiaomi" //marca
        producto[2][279] = "REDMI NOTE 8"//modelo
        producto[3][279] = "0" //original
        producto[4][279] = "0" //oled
        producto[5][279] = "520" //incell
        producto[6][279] = "0" // cof
        producto[7][279] = "0" //cog
        producto[8][279] = "0" // tft

        producto[0][280] = "280"//id
        producto[1][280] = "xiaomi" //marca
        producto[2][280] = "REDMI NOTE 8T"//modelo
        producto[3][280] = "0" //original
        producto[4][280] = "0" //oled
        producto[5][280] = "590" //incell
        producto[6][280] = "0" // cof
        producto[7][280] = "0" //cog
        producto[8][280] = "0" // tft

        producto[0][281] = "281"//id
        producto[1][281] = "xiaomi" //marca
        producto[2][281] = "REDMI NOTE 8 PRO"//modelo
        producto[3][281] = "0" //original
        producto[4][281] = "0" //oled
        producto[5][281] = "510" //incell
        producto[6][281] = "0" // cof
        producto[7][281] = "0" //cog
        producto[8][281] = "0" // tft

        producto[0][282] = "282"//id
        producto[1][282] = "xiaomi" //marca
        producto[2][282] = "REDMI NOTE 9"//modelo
        producto[3][282] = "0" //original
        producto[4][282] = "0" //oled
        producto[5][282] = "500" //incell
        producto[6][282] = "0" // cof
        producto[7][282] = "0" //cog
        producto[8][282] = "0" // tft

        producto[0][283] = "283"//id
        producto[1][283] = "xiaomi" //marca
        producto[2][283] = "REDMI NOTE 9S / NOTE 9 PRO"//modelo
        producto[3][283] = "0" //original
        producto[4][283] = "0" //oled
        producto[5][283] = "500" //incell
        producto[6][283] = "0" // cof
        producto[7][283] = "0" //cog
        producto[8][283] = "0" // tft

        producto[0][284] = "284"//id
        producto[1][284] = "xiaomi" //marca
        producto[2][284] = "REDMI NOTE 9T"//modelo
        producto[3][284] = "0" //original
        producto[4][284] = "0" //oled
        producto[5][284] = "500" //incell
        producto[6][284] = "0" // cof
        producto[7][284] = "0" //cog
        producto[8][284] = "0" // tft

        producto[0][285] = "285"//id
        producto[1][285] = "xiaomi" //marca
        producto[2][285] = "REDMI NOTE 10"//modelo
        producto[3][285] = "0" //original
        producto[4][285] = "1250" //oled
        producto[5][285] = "750" //incell
        producto[6][285] = "0" // cof
        producto[7][285] = "0" //cog
        producto[8][285] = "0" // tft

        producto[0][286] = "286"//id
        producto[1][286] = "xiaomi" //marca
        producto[2][286] = "REDMI NOTE 10S"//modelo
        producto[3][286] = "0" //original
        producto[4][286] = "1250" //oled
        producto[5][286] = "945" //incell
        producto[6][286] = "0" // cof
        producto[7][286] = "0" //cog
        producto[8][286] = "0" // tft

        producto[0][287] = "287"//id
        producto[1][287] = "xiaomi" //marca
        producto[2][287] = "REDMI NOTE 10 PRO"//modelo
        producto[3][287] = "0" //original
        producto[4][287] = "3050" //oled
        producto[5][287] = "0" //incell
        producto[6][287] = "0" // cof
        producto[7][287] = "0" //cog
        producto[8][287] = "0" // tft

        producto[0][288] = "288"//id
        producto[1][288] = "xiaomi" //marca
        producto[2][288] = "REDMI POCO M3"//modelo
        producto[3][288] = "0" //original
        producto[4][288] = "0" //oled
        producto[5][288] = "550" //incell
        producto[6][288] = "0" // cof
        producto[7][288] = "0" //cog
        producto[8][288] = "0" // tft

        producto[0][289] = "289"//id
        producto[1][289] = "xiaomi" //marca
        producto[2][289] = "REDMI POCO X3"//modelo
        producto[3][289] = "0" //original
        producto[4][289] = "0" //oled
        producto[5][289] = "550" //incell
        producto[6][289] = "0" // cof
        producto[7][289] = "0" //cog
        producto[8][289] = "0" // tft



        for (i in 0..8) {
            if(dato == producto[i][0].toString()){
                auxDatoRequerido = i
            }

        }
        for (i in 0 until 290) {
            if(id == producto[0][i].toString()){
                datoQueSeManda = producto[auxDatoRequerido][i].toString()
            }

        }

        return datoQueSeManda
    }

}
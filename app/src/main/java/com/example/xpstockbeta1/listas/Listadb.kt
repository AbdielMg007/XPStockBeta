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

        val producto = Array(5) { arrayOfNulls<String>(394) }


        producto[0][0] = "id"//id
        producto[1][0] = "marca"
        producto[2][0] = "modelo"//modelo
        producto[3][0] = "precio"
        producto[4][0] = "disponibilidad"

        producto[0][1]="1";	producto[1][1]="Hisense";	producto[2][1]="E50 lite BLACK or";	producto[3][1]="1";	producto[4][1]="0";
        producto[0][2]="2";	producto[1][2]="Hisense";	producto[2][2]="H40 BLACK or";	producto[3][2]="1";	producto[4][2]="0";
        producto[0][3]="3";	producto[1][3]="Hisense";	producto[2][3]="H50 BLACK or";	producto[3][3]="1";	producto[4][3]="0";
        producto[0][4]="4";	producto[1][4]="Hisense";	producto[2][4]="H50 lite BLACK or";	producto[3][4]="1";	producto[4][4]="0";
        producto[0][5]="5";	producto[1][5]="Honor";	producto[2][5]="10 BLACK in-cell";	producto[3][5]="395";	producto[4][5]="85";
        producto[0][6]="6";	producto[1][6]="Honor";	producto[2][6]="10 Lite BLACK cog";	producto[3][6]="540";	producto[4][6]="-2";
        producto[0][7]="7";	producto[1][7]="Honor";	producto[2][7]="50 lite BLACK in-cell";	producto[3][7]="520";	producto[4][7]="36";
        producto[0][8]="8";	producto[1][8]="Honor";	producto[2][8]="8A BLACK in-cell";	producto[3][8]="400";	producto[4][8]="176";
        producto[0][9]="9";	producto[1][9]="Honor";	producto[2][9]="8X BLACK in-cell";	producto[3][9]="590";	producto[4][9]="7";
        producto[0][10]="10";	producto[1][10]="Huawei";	producto[2][10]="GE ELITE PLUS / P9 Lite Mini BLACK in-cell";	producto[3][10]="280";	producto[4][10]="12";
        producto[0][11]="11";	producto[1][11]="Huawei";	producto[2][11]="Mate 10 BLACK in-cell";	producto[3][11]="750";	producto[4][11]="51";
        producto[0][12]="12";	producto[1][12]="Huawei";	producto[2][12]="Mate 10 pro BLACK oled";	producto[3][12]="835";	producto[4][12]="0";
        producto[0][13]="13";	producto[1][13]="Huawei";	producto[2][13]="Mate 20 Lite/ Nova 3 BLACK or";	producto[3][13]="410";	producto[4][13]="4";
        producto[0][14]="14";	producto[1][14]="Huawei";	producto[2][14]="Mate 8 BLACK in-cell";	producto[3][14]="450";	producto[4][14]="38";
        producto[0][15]="15";	producto[1][15]="Huawei";	producto[2][15]="Nova 5T BLACK or";	producto[3][15]="535";	producto[4][15]="14";
        producto[0][16]="16";	producto[1][16]="Huawei";	producto[2][16]="Nova 9 SE BLACK Or";	producto[3][16]="0";	producto[4][16]="-1";
        producto[0][17]="17";	producto[1][17]="Huawei";	producto[2][17]="P Smart 2019 BLACK cof";	producto[3][17]="525";	producto[4][17]="8";
        producto[0][18]="18";	producto[1][18]="Huawei";	producto[2][18]="P Smart 2019 BLACK in-cell";	producto[3][18]="525";	producto[4][18]="36";
        producto[0][19]="19";	producto[1][19]="Huawei";	producto[2][19]="P smart 2018 SMALL BLACK or";	producto[3][19]="1";	producto[4][19]="0";
        producto[0][20]="20";	producto[1][20]="Huawei";	producto[2][20]="P10 BLACK or";	producto[3][20]="1";	producto[4][20]="0";
        producto[0][21]="21";	producto[1][21]="Huawei";	producto[2][21]="P10 Lite BLACK in-cell";	producto[3][21]="360";	producto[4][21]="112";
        producto[0][22]="22";	producto[1][22]="Huawei";	producto[2][22]="P10 Selfie BLACK in-cell";	producto[3][22]="420";	producto[4][22]="46";
        producto[0][23]="23";	producto[1][23]="Huawei";	producto[2][23]="P20 Lite BLACK in-cell";	producto[3][23]="370";	producto[4][23]="1";
        producto[0][24]="24";	producto[1][24]="Huawei";	producto[2][24]="P30 BLACK cog";	producto[3][24]="700";	producto[4][24]="0";
        producto[0][25]="25";	producto[1][25]="Huawei";	producto[2][25]="P30 BLACK oled";	producto[3][25]="1200";	producto[4][25]="3";
        producto[0][26]="26";	producto[1][26]="Huawei";	producto[2][26]="P30 Lite BLACK cog";	producto[3][26]="510";	producto[4][26]="-7";
        producto[0][27]="27";	producto[1][27]="Huawei";	producto[2][27]="P30 lite BLACK cof";	producto[3][27]="700";	producto[4][27]="5";
        producto[0][28]="28";	producto[1][28]="Huawei";	producto[2][28]="P30 lite BLACK in-cell";	producto[3][28]="700";	producto[4][28]="8";
        producto[0][29]="29";	producto[1][29]="Huawei";	producto[2][29]="P30 pro BLACK oled";	producto[3][29]="1300";	producto[4][29]="22";
        producto[0][30]="30";	producto[1][30]="Huawei";	producto[2][30]="P40 Lite / P20 Lite 2019 / Nova 5i BLACK in-cell";	producto[3][30]="420";	producto[4][30]="12";
        producto[0][31]="31";	producto[1][31]="Huawei";	producto[2][31]="P40 pro BLACK or";	producto[3][31]="4300";	producto[4][31]="20";
        producto[0][32]="32";	producto[1][32]="Huawei";	producto[2][32]="P9 Lite 2017 BLACK cog";	producto[3][32]="380";	producto[4][32]="10";
        producto[0][33]="33";	producto[1][33]="Huawei";	producto[2][33]="P9 lite 2017 BLACK in-cell";	producto[3][33]="380";	producto[4][33]="52";
        producto[0][34]="34";	producto[1][34]="Huawei";	producto[2][34]="P9 lite BLACK cog";	producto[3][34]="405";	producto[4][34]="18";
        producto[0][35]="35";	producto[1][35]="Huawei";	producto[2][35]="P9 lite BLACK in-cell";	producto[3][35]="400";	producto[4][35]="30";
        producto[0][36]="36";	producto[1][36]="Huawei";	producto[2][36]="Y6 2018 BLACK cog";	producto[3][36]="350";	producto[4][36]="22";
        producto[0][37]="37";	producto[1][37]="Huawei";	producto[2][37]="Y6 Prime 2018 BLACK in-cell";	producto[3][37]="390";	producto[4][37]="204";
        producto[0][38]="38";	producto[1][38]="Huawei";	producto[2][38]="Y6/ Y6S 2019 BLACK in-cell";	producto[3][38]="380";	producto[4][38]="7";
        producto[0][39]="39";	producto[1][39]="Huawei";	producto[2][39]="Y7 2018 BLACK in-cell";	producto[3][39]="350";	producto[4][39]="25";
        producto[0][40]="40";	producto[1][40]="Huawei";	producto[2][40]="Y7 Prime 2019/ Y7 2019 BLACK in-cell";	producto[3][40]="350";	producto[4][40]="21";
        producto[0][41]="41";	producto[1][41]="Huawei";	producto[2][41]="Y9 / Y9 2019/ Y8S 2019 BLACK cog";	producto[3][41]="680";	producto[4][41]="24";
        producto[0][42]="42";	producto[1][42]="Huawei";	producto[2][42]="Y9 2018 BLACK in-cell";	producto[3][42]="360";	producto[4][42]="17";
        producto[0][43]="43";	producto[1][43]="Huawei";	producto[2][43]="Y9 2019 BLACK cof";	producto[3][43]="650";	producto[4][43]="17";
        producto[0][44]="44";	producto[1][44]="Huawei";	producto[2][44]="Y9 Prime BLACK cof";	producto[3][44]="650";	producto[4][44]="44";
        producto[0][45]="45";	producto[1][45]="Huawei";	producto[2][45]="Y9 Prime Black COG";	producto[3][45]="460";	producto[4][45]="-1";
        producto[0][46]="46";	producto[1][46]="Huawei";	producto[2][46]="Y9S BLACK cof";	producto[3][46]="650";	producto[4][46]="73";
        producto[0][47]="47";	producto[1][47]="Huawei";	producto[2][47]="Y9S BLACK cog";	producto[3][47]="430";	producto[4][47]="2";
        producto[0][48]="48";	producto[1][48]="Iphone";	producto[2][48]="11 BLACK in-cell";	producto[3][48]="950";	producto[4][48]="618";
        producto[0][49]="49";	producto[1][49]="Iphone";	producto[2][49]="11 Pro BLACK oled";	producto[3][49]="950";	producto[4][49]="39";
        producto[0][50]="50";	producto[1][50]="Iphone";	producto[2][50]="11 Pro Max BLACK oled";	producto[3][50]="1700";	producto[4][50]="-1";
        producto[0][51]="51";	producto[1][51]="Iphone";	producto[2][51]="12 Pro Max BLACK oled";	producto[3][51]="3800";	producto[4][51]="23";
        producto[0][52]="52";	producto[1][52]="Iphone";	producto[2][52]="12/ 12 Pro BLACK oled";	producto[3][52]="2000";	producto[4][52]="24";
        producto[0][53]="53";	producto[1][53]="Iphone";	producto[2][53]="5C BLACK in-cell";	producto[3][53]="250";	producto[4][53]="87";
        producto[0][54]="54";	producto[1][54]="Iphone";	producto[2][54]="5S / SE BLACK in-cell";	producto[3][54]="250";	producto[4][54]="4";
        producto[0][55]="55";	producto[1][55]="Iphone";	producto[2][55]="5S / SE WHITE in-cell";	producto[3][55]="250";	producto[4][55]="31";
        producto[0][56]="56";	producto[1][56]="Iphone";	producto[2][56]="6 Plus BLACK in-cell";	producto[3][56]="400";	producto[4][56]="57";
        producto[0][57]="57";	producto[1][57]="Iphone";	producto[2][57]="6 plus BLACK or";	producto[3][57]="550";	producto[4][57]="31";
        producto[0][58]="58";	producto[1][58]="Iphone";	producto[2][58]="6 plus WHITE in-cell";	producto[3][58]="400";	producto[4][58]="208";
        producto[0][59]="59";	producto[1][59]="Iphone";	producto[2][59]="6 plus WHITE or";	producto[3][59]="550";	producto[4][59]="43";
        producto[0][60]="60";	producto[1][60]="Iphone";	producto[2][60]="6G BLACK in-cell";	producto[3][60]="335";	producto[4][60]="21";
        producto[0][61]="61";	producto[1][61]="Iphone";	producto[2][61]="6G BLACK or";	producto[3][61]="400";	producto[4][61]="0";
        producto[0][62]="62";	producto[1][62]="Iphone";	producto[2][62]="6G WHITE in-cell";	producto[3][62]="335";	producto[4][62]="119";
        producto[0][63]="63";	producto[1][63]="Iphone";	producto[2][63]="6G WHITE or";	producto[3][63]="400";	producto[4][63]="0";
        producto[0][64]="64";	producto[1][64]="Iphone";	producto[2][64]="6S BLACK in-cell";	producto[3][64]="350";	producto[4][64]="133";
        producto[0][65]="65";	producto[1][65]="Iphone";	producto[2][65]="6S BLACK or";	producto[3][65]="440";	producto[4][65]="0";
        producto[0][66]="66";	producto[1][66]="Iphone";	producto[2][66]="6S WHITE in-cell";	producto[3][66]="350";	producto[4][66]="112";
        producto[0][67]="67";	producto[1][67]="Iphone";	producto[2][67]="6S WHITE or";	producto[3][67]="440";	producto[4][67]="0";
        producto[0][68]="68";	producto[1][68]="Iphone";	producto[2][68]="6S plus BLACK in-cell";	producto[3][68]="410";	producto[4][68]="84";
        producto[0][69]="69";	producto[1][69]="Iphone";	producto[2][69]="6S plus BLACK or";	producto[3][69]="590";	producto[4][69]="9";
        producto[0][70]="70";	producto[1][70]="Iphone";	producto[2][70]="6S plus WHITE in-cell";	producto[3][70]="410";	producto[4][70]="23";
        producto[0][71]="71";	producto[1][71]="Iphone";	producto[2][71]="6S plus WHITE or";	producto[3][71]="590";	producto[4][71]="0";
        producto[0][72]="72";	producto[1][72]="Iphone";	producto[2][72]="7 Plus BLACK or";	producto[3][72]="590";	producto[4][72]="17";
        producto[0][73]="73";	producto[1][73]="Iphone";	producto[2][73]="7 Plus WHITE or";	producto[3][73]="590";	producto[4][73]="8";
        producto[0][74]="74";	producto[1][74]="Iphone";	producto[2][74]="7 plus BLACK in-cell";	producto[3][74]="410";	producto[4][74]="18";
        producto[0][75]="75";	producto[1][75]="Iphone";	producto[2][75]="7 plus WHITE in-cell";	producto[3][75]="410";	producto[4][75]="128";
        producto[0][76]="76";	producto[1][76]="Iphone";	producto[2][76]="7G BLACK in-cell";	producto[3][76]="350";	producto[4][76]="25";
        producto[0][77]="77";	producto[1][77]="Iphone";	producto[2][77]="7G BLACK or";	producto[3][77]="500";	producto[4][77]="0";
        producto[0][78]="78";	producto[1][78]="Iphone";	producto[2][78]="7G WHITE in-cell";	producto[3][78]="350";	producto[4][78]="82";
        producto[0][79]="79";	producto[1][79]="Iphone";	producto[2][79]="7G WHITE or";	producto[3][79]="500";	producto[4][79]="0";
        producto[0][80]="80";	producto[1][80]="Iphone";	producto[2][80]="8 plus BLACK in-cell";	producto[3][80]="410";	producto[4][80]="26";
        producto[0][81]="81";	producto[1][81]="Iphone";	producto[2][81]="8 plus BLACK or";	producto[3][81]="590";	producto[4][81]="0";
        producto[0][82]="82";	producto[1][82]="Iphone";	producto[2][82]="8 plus WHITE in-cell";	producto[3][82]="410";	producto[4][82]="5";
        producto[0][83]="83";	producto[1][83]="Iphone";	producto[2][83]="8 plus WHITE or";	producto[3][83]="590";	producto[4][83]="27";
        producto[0][84]="84";	producto[1][84]="Iphone";	producto[2][84]="8G/ SE 2da gen. (2020) BLACK in-cell";	producto[3][84]="350";	producto[4][84]="55";
        producto[0][85]="85";	producto[1][85]="Iphone";	producto[2][85]="8G/ SE 2da gen. (2020) BLACK or";	producto[3][85]="530";	producto[4][85]="5";
        producto[0][86]="86";	producto[1][86]="Iphone";	producto[2][86]="8G/ SE 2da gen. (2020) WHITE in-cell";	producto[3][86]="350";	producto[4][86]="61";
        producto[0][87]="87";	producto[1][87]="Iphone";	producto[2][87]="8G/ SE 2da gen. (2020) WHITE or";	producto[3][87]="530";	producto[4][87]="0";
        producto[0][88]="88";	producto[1][88]="Iphone";	producto[2][88]="X BLACK in-cell";	producto[3][88]="720";	producto[4][88]="95";
        producto[0][89]="89";	producto[1][89]="Iphone";	producto[2][89]="X BLACK oled";	producto[3][89]="950";	producto[4][89]="32";
        producto[0][90]="90";	producto[1][90]="Iphone";	producto[2][90]="XR BLACK in-cell";	producto[3][90]="1050";	producto[4][90]="427";
        producto[0][91]="91";	producto[1][91]="Iphone";	producto[2][91]="XS BLACK oled";	producto[3][91]="920";	producto[4][91]="348";
        producto[0][92]="92";	producto[1][92]="Iphone";	producto[2][92]="XS Max BLACK oled";	producto[3][92]="1570";	producto[4][92]="15";
        producto[0][93]="93";	producto[1][93]="LG";	producto[2][93]="D290 W/F BLACK";	producto[3][93]="200";	producto[4][93]="15";
        producto[0][94]="94";	producto[1][94]="LG";	producto[2][94]="E975/ Optimus G W/F BLACK";	producto[3][94]="200";	producto[4][94]="2";
        producto[0][95]="95";	producto[1][95]="LG";	producto[2][95]="G2 W/F BLACK";	producto[3][95]="170";	producto[4][95]="9";
        producto[0][96]="96";	producto[1][96]="LG";	producto[2][96]="G3 Beat W/F BLACK";	producto[3][96]="200";	producto[4][96]="30";
        producto[0][97]="97";	producto[1][97]="LG";	producto[2][97]="G3 W/F BLACK";	producto[3][97]="200";	producto[4][97]="24";
        producto[0][98]="98";	producto[1][98]="LG";	producto[2][98]="G3 WHITE";	producto[3][98]="200";	producto[4][98]="1";
        producto[0][99]="99";	producto[1][99]="LG";	producto[2][99]="G4 Beat W/F BLACK";	producto[3][99]="200";	producto[4][99]="29";
        producto[0][100]="100";	producto[1][100]="LG";	producto[2][100]="G4 W/F BLACK";	producto[3][100]="200";	producto[4][100]="21";
        producto[0][101]="101";	producto[1][101]="LG";	producto[2][101]="H340/ Leon W/F BLACK";	producto[3][101]="200";	producto[4][101]="9";
        producto[0][102]="102";	producto[1][102]="LG";	producto[2][102]="H440/ Spirit W/F BLACK";	producto[3][102]="200";	producto[4][102]="102";
        producto[0][103]="103";	producto[1][103]="LG";	producto[2][103]="H500 W/F BLACK";	producto[3][103]="200";	producto[4][103]="48";
        producto[0][104]="104";	producto[1][104]="LG";	producto[2][104]="H500/ Magna W/F BLACK";	producto[3][104]="200";	producto[4][104]="0";
        producto[0][105]="105";	producto[1][105]="LG";	producto[2][105]="K10 (2017) W/F BLACK";	producto[3][105]="330";	producto[4][105]="85";
        producto[0][106]="106";	producto[1][106]="LG";	producto[2][106]="K10 TV W/F BLACK";	producto[3][106]="320";	producto[4][106]="567";
        producto[0][107]="107";	producto[1][107]="LG";	producto[2][107]="K10 W/F BLACK";	producto[3][107]="330";	producto[4][107]="80";
        producto[0][108]="108";	producto[1][108]="LG";	producto[2][108]="K10 W/F WHITE";	producto[3][108]="330";	producto[4][108]="5";
        producto[0][109]="109";	producto[1][109]="LG";	producto[2][109]="K10 tv W/F WHITE";	producto[3][109]="320";	producto[4][109]="74";
        producto[0][110]="110";	producto[1][110]="LG";	producto[2][110]="K11 BLACK in-cell";	producto[3][110]="380";	producto[4][110]="102";
        producto[0][111]="111";	producto[1][111]="LG";	producto[2][111]="K11 BLACK or";	producto[3][111]="411";	producto[4][111]="5";
        producto[0][112]="112";	producto[1][112]="LG";	producto[2][112]="K11 W/F BLACK";	producto[3][112]="380";	producto[4][112]="2";
        producto[0][113]="113";	producto[1][113]="LG";	producto[2][113]="K200 W/F BLACK";	producto[3][113]="250";	producto[4][113]="21";
        producto[0][114]="114";	producto[1][114]="LG";	producto[2][114]="K200 W/F BLACK or";	producto[3][114]="200";	producto[4][114]="104";
        producto[0][115]="115";	producto[1][115]="LG";	producto[2][115]="K200 WHITE";	producto[3][115]="280";	producto[4][115]="5";
        producto[0][116]="116";	producto[1][116]="LG";	producto[2][116]="K220 W/F BLACK";	producto[3][116]="250";	producto[4][116]="125";
        producto[0][117]="117";	producto[1][117]="LG";	producto[2][117]="K30 2018 BLACK or";	producto[3][117]="420";	producto[4][117]="38";
        producto[0][118]="118";	producto[1][118]="LG";	producto[2][118]="K40 W/F BLACK";	producto[3][118]="480";	producto[4][118]="8";
        producto[0][119]="119";	producto[1][119]="LG";	producto[2][119]="K40S BLACK or";	producto[3][119]="380";	producto[4][119]="35";
        producto[0][120]="120";	producto[1][120]="LG";	producto[2][120]="K41 BLACK in-cell";	producto[3][120]="490";	producto[4][120]="14";
        producto[0][121]="121";	producto[1][121]="LG";	producto[2][121]="K42 BLACK in-cell";	producto[3][121]="450";	producto[4][121]="16";
        producto[0][122]="122";	producto[1][122]="LG";	producto[2][122]="K42 BLACK or";	producto[3][122]="490";	producto[4][122]="7";
        producto[0][123]="123";	producto[1][123]="LG";	producto[2][123]="K50 / Q60 BLACK or";	producto[3][123]="470";	producto[4][123]="49";
        producto[0][124]="124";	producto[1][124]="LG";	producto[2][124]="K52 BLACK in-cell";	producto[3][124]="460";	producto[4][124]="25";
        producto[0][125]="125";	producto[1][125]="LG";	producto[2][125]="K580 GOLDEN";	producto[3][125]="320";	producto[4][125]="0";
        producto[0][126]="126";	producto[1][126]="LG";	producto[2][126]="K8 W/F BLACK";	producto[3][126]="280";	producto[4][126]="123";
        producto[0][127]="127";	producto[1][127]="LG";	producto[2][127]="K8 W/F WHITE";	producto[3][127]="280";	producto[4][127]="16";
        producto[0][128]="128";	producto[1][128]="LG";	producto[2][128]="K9 W/F BLACK";	producto[3][128]="250";	producto[4][128]="121";
        producto[0][129]="129";	producto[1][129]="LG";	producto[2][129]="M320 W/F BLACK";	producto[3][129]="250";	producto[4][129]="54";
        producto[0][130]="130";	producto[1][130]="LG";	producto[2][130]="M320 W/F GOLDEN";	producto[3][130]="250";	producto[4][130]="39";
        producto[0][131]="131";	producto[1][131]="LG";	producto[2][131]="Q6 W/F BLACK or";	producto[3][131]="500";	producto[4][131]="21";
        producto[0][132]="132";	producto[1][132]="LG";	producto[2][132]="Stylus 3 W/F BLACK";	producto[3][132]="210";	producto[4][132]="5";
        producto[0][133]="133";	producto[1][133]="LG";	producto[2][133]="X210/ Q7 W/F BLACK";	producto[3][133]="300";	producto[4][133]="7";
        producto[0][134]="134";	producto[1][134]="LG";	producto[2][134]="X220/ Q6 W/F WHITE";	producto[3][134]="230";	producto[4][134]="17";
        producto[0][135]="135";	producto[1][135]="LG";	producto[2][135]="X230/ K4 W/F BLACK";	producto[3][135]="250";	producto[4][135]="78";
        producto[0][136]="136";	producto[1][136]="LG";	producto[2][136]="X240 W/F BLACK";	producto[3][136]="280";	producto[4][136]="42";
        producto[0][137]="137";	producto[1][137]="Moto";	producto[2][137]="C Plus BLACK or";	producto[3][137]="230";	producto[4][137]="0";
        producto[0][138]="138";	producto[1][138]="Moto";	producto[2][138]="E20 Black Or";	producto[3][138]="420";	producto[4][138]="27";
        producto[0][139]="139";	producto[1][139]="Moto";	producto[2][139]="E40 BLACK or";	producto[3][139]="470";	producto[4][139]="29";
        producto[0][140]="140";	producto[1][140]="Moto";	producto[2][140]="E5 BLACK in-cell";	producto[3][140]="400";	producto[4][140]="0";
        producto[0][141]="141";	producto[1][141]="Moto";	producto[2][141]="E5 GOLDEN in-cell";	producto[3][141]="400";	producto[4][141]="8";
        producto[0][142]="142";	producto[1][142]="Moto";	producto[2][142]="E5 Play Go GOLDEN";	producto[3][142]="380";	producto[4][142]="13";
        producto[0][143]="143";	producto[1][143]="Moto";	producto[2][143]="E5 Plus BLACK or";	producto[3][143]="400";	producto[4][143]="38";
        producto[0][144]="144";	producto[1][144]="Moto";	producto[2][144]="E5 Plus GOLDEN or";	producto[3][144]="400";	producto[4][144]="176";
        producto[0][145]="145";	producto[1][145]="Moto";	producto[2][145]="E6 BLACK or";	producto[3][145]="325";	producto[4][145]="6";
        producto[0][146]="146";	producto[1][146]="Moto";	producto[2][146]="E6 Play BLACK or";	producto[3][146]="320";	producto[4][146]="53";
        producto[0][147]="147";	producto[1][147]="Moto";	producto[2][147]="E6 Plus BLACK or";	producto[3][147]="320";	producto[4][147]="2";
        producto[0][148]="148";	producto[1][148]="Moto";	producto[2][148]="E6S BLACK or";	producto[3][148]="430";	producto[4][148]="0";
        producto[0][149]="149";	producto[1][149]="Moto";	producto[2][149]="E7/ E7 Power/ E7i Power BLACK or";	producto[3][149]="400";	producto[4][149]="13";
        producto[0][150]="150";	producto[1][150]="Moto";	producto[2][150]="Edge BLACK or";	producto[3][150]="3500";	producto[4][150]="1";
        producto[0][151]="151";	producto[1][151]="Moto";	producto[2][151]="G 5G BLACK or";	producto[3][151]="480";	producto[4][151]="30";
        producto[0][152]="152";	producto[1][152]="Moto";	producto[2][152]="G Play 2021 BLACK or";	producto[3][152]="400";	producto[4][152]="157";
        producto[0][153]="153";	producto[1][153]="Moto";	producto[2][153]="G10 BLACK or";	producto[3][153]="350";	producto[4][153]="121";
        producto[0][154]="154";	producto[1][154]="Moto";	producto[2][154]="G20 BLACK or";	producto[3][154]="360";	producto[4][154]="147";
        producto[0][155]="155";	producto[1][155]="Moto";	producto[2][155]="G30 BLACK or";	producto[3][155]="350";	producto[4][155]="139";
        producto[0][156]="156";	producto[1][156]="Moto";	producto[2][156]="G50 4G BLACK or";	producto[3][156]="520";	producto[4][156]="77";
        producto[0][157]="157";	producto[1][157]="Moto";	producto[2][157]="G50 5G BLACK or";	producto[3][157]="450";	producto[4][157]="70";
        producto[0][158]="158";	producto[1][158]="Moto";	producto[2][158]="G5S BLACK aaa";	producto[3][158]="300";	producto[4][158]="590";
        producto[0][159]="159";	producto[1][159]="Moto";	producto[2][159]="G5S BLACK or";	producto[3][159]="300";	producto[4][159]="0";
        producto[0][160]="160";	producto[1][160]="Moto";	producto[2][160]="G5S GOLDEN aaa";	producto[3][160]="300";	producto[4][160]="460";
        producto[0][161]="161";	producto[1][161]="Moto";	producto[2][161]="G5S GOLDEN or";	producto[3][161]="300";	producto[4][161]="9";
        producto[0][162]="162";	producto[1][162]="Moto";	producto[2][162]="G5S Plus BLACK or";	producto[3][162]="360";	producto[4][162]="0";
        producto[0][163]="163";	producto[1][163]="Moto";	producto[2][163]="G6 Play BLACK aaa";	producto[3][163]="300";	producto[4][163]="504";
        producto[0][164]="164";	producto[1][164]="Moto";	producto[2][164]="G6 Play BLACK in-cell";	producto[3][164]="400";	producto[4][164]="97";
        producto[0][165]="165";	producto[1][165]="Moto";	producto[2][165]="G6 Play GOLDEN in-cell";	producto[3][165]="430";	producto[4][165]="253";
        producto[0][166]="166";	producto[1][166]="Moto";	producto[2][166]="G6 Plus BLACK or";	producto[3][166]="430";	producto[4][166]="152";
        producto[0][167]="167";	producto[1][167]="Moto";	producto[2][167]="G60 BLACK or";	producto[3][167]="700";	producto[4][167]="8";
        producto[0][168]="168";	producto[1][168]="Moto";	producto[2][168]="G7 Play  BLACK or";	producto[3][168]="500";	producto[4][168]="798";
        producto[0][169]="169";	producto[1][169]="Moto";	producto[2][169]="G7 Plus BLACK or";	producto[3][169]="530";	producto[4][169]="-3";
        producto[0][170]="170";	producto[1][170]="Moto";	producto[2][170]="G7 Power BLACK or";	producto[3][170]="350";	producto[4][170]="41";
        producto[0][171]="171";	producto[1][171]="Moto";	producto[2][171]="G8 BLACK or";	producto[3][171]="400";	producto[4][171]="121";
        producto[0][172]="172";	producto[1][172]="Moto";	producto[2][172]="G8 Play BLACK or";	producto[3][172]="350";	producto[4][172]="137";
        producto[0][173]="173";	producto[1][173]="Moto";	producto[2][173]="G8 Plus BLACK or";	producto[3][173]="440";	producto[4][173]="14";
        producto[0][174]="174";	producto[1][174]="Moto";	producto[2][174]="G8 Power BLACK or";	producto[3][174]="500";	producto[4][174]="-8";
        producto[0][175]="175";	producto[1][175]="Moto";	producto[2][175]="G8 Power Lite BLACK or";	producto[3][175]="360";	producto[4][175]="9";
        producto[0][176]="176";	producto[1][176]="Moto";	producto[2][176]="G9 Play BLACK or";	producto[3][176]="350";	producto[4][176]="93";
        producto[0][177]="177";	producto[1][177]="Moto";	producto[2][177]="G9 Power BLACK or";	producto[3][177]="450";	producto[4][177]="26";
        producto[0][178]="178";	producto[1][178]="Moto";	producto[2][178]="G9 plus BLACK or";	producto[3][178]="500";	producto[4][178]="24";
        producto[0][179]="179";	producto[1][179]="Moto";	producto[2][179]="One BLACK aaa";	producto[3][179]="500";	producto[4][179]="1";
        producto[0][180]="180";	producto[1][180]="Moto";	producto[2][180]="One BLACK or";	producto[3][180]="420";	producto[4][180]="-4";
        producto[0][181]="181";	producto[1][181]="Moto";	producto[2][181]="One Fusion BLACK or";	producto[3][181]="350";	producto[4][181]="98";
        producto[0][182]="182";	producto[1][182]="Moto";	producto[2][182]="One Fusion Plus BLACK or";	producto[3][182]="520";	producto[4][182]="0";
        producto[0][183]="183";	producto[1][183]="Moto";	producto[2][183]="One Fusion Plus WHITE or";	producto[3][183]="520";	producto[4][183]="1";
        producto[0][184]="184";	producto[1][184]="Moto";	producto[2][184]="One Hyper BLACK or";	producto[3][184]="560";	producto[4][184]="16";
        producto[0][185]="185";	producto[1][185]="Moto";	producto[2][185]="One Vision BLACK or";	producto[3][185]="1020";	producto[4][185]="4";
        producto[0][186]="186";	producto[1][186]="Moto";	producto[2][186]="One W/F BLACK or";	producto[3][186]="600";	producto[4][186]="17";
        producto[0][187]="187";	producto[1][187]="Moto";	producto[2][187]="One Zoom BLACK oled";	producto[3][187]="825";	producto[4][187]="23";
        producto[0][188]="188";	producto[1][188]="Moto";	producto[2][188]="X Play W/F or";	producto[3][188]="405";	producto[4][188]="81";
        producto[0][189]="189";	producto[1][189]="Moto";	producto[2][189]="X Style W/F BLACK";	producto[3][189]="250";	producto[4][189]="20";
        producto[0][190]="190";	producto[1][190]="Moto";	producto[2][190]="X Style W/F WHITE";	producto[3][190]="250";	producto[4][190]="35";
        producto[0][191]="191";	producto[1][191]="Moto";	producto[2][191]="Z Play BLACK oled";	producto[3][191]="600";	producto[4][191]="7";
        producto[0][192]="192";	producto[1][192]="Moto";	producto[2][192]="Z2 Play BLACK oled";	producto[3][192]="580";	producto[4][192]="21";
        producto[0][193]="193";	producto[1][193]="Moto";	producto[2][193]="Z2 Play WHITE oled";	producto[3][193]="580";	producto[4][193]="48";
        producto[0][194]="194";	producto[1][194]="Moto";	producto[2][194]="Z3 Play BLACK oled";	producto[3][194]="750";	producto[4][194]="122";
        producto[0][195]="195";	producto[1][195]="Oppo";	producto[2][195]="A12 BLACK in-cell";	producto[3][195]="400";	producto[4][195]="31";
        producto[0][196]="196";	producto[1][196]="Oppo";	producto[2][196]="A15 BLACK in-cell";	producto[3][196]="450";	producto[4][196]="36";
        producto[0][197]="197";	producto[1][197]="Oppo";	producto[2][197]="A16 BLACK in-cell";	producto[3][197]="420";	producto[4][197]="8";
        producto[0][198]="198";	producto[1][198]="Oppo";	producto[2][198]="A53 4g BLACK in-cell";	producto[3][198]="530";	producto[4][198]="9";
        producto[0][199]="199";	producto[1][199]="Oppo";	producto[2][199]="A54 4G BLACK in-cell";	producto[3][199]="540";	producto[4][199]="59";
        producto[0][200]="200";	producto[1][200]="Oppo";	producto[2][200]="A73 BLACK in-cell";	producto[3][200]="500";	producto[4][200]="138";
        producto[0][201]="201";	producto[1][201]="Oppo";	producto[2][201]="A9 2020 BLACK in-cell";	producto[3][201]="400";	producto[4][201]="70";
        producto[0][202]="202";	producto[1][202]="Oppo";	producto[2][202]="Reno 5 Lite BLACK in-cell";	producto[3][202]="720";	producto[4][202]="20";
        producto[0][203]="203";	producto[1][203]="Oppo";	producto[2][203]="Reno 5 Lite BLACK tft";	producto[3][203]="635";	producto[4][203]="0";
        producto[0][204]="204";	producto[1][204]="Oppo";	producto[2][204]="Reno 5 lite BLACK or";	producto[3][204]="2100";	producto[4][204]="17";
        producto[0][205]="205";	producto[1][205]="Realme";	producto[2][205]="7 BLACK in-cell";	producto[3][205]="575";	producto[4][205]="32";
        producto[0][206]="206";	producto[1][206]="Realme";	producto[2][206]="7 Pro BLACK in-cell";	producto[3][206]="575";	producto[4][206]="54";
        producto[0][207]="207";	producto[1][207]="Realme";	producto[2][207]="C21 BLACK in-cell";	producto[3][207]="450";	producto[4][207]="79";
        producto[0][208]="208";	producto[1][208]="Samsung";	producto[2][208]="A01 Core BLACK or";	producto[3][208]="440";	producto[4][208]="38";
        producto[0][209]="209";	producto[1][209]="Samsung";	producto[2][209]="A01 F (SMALL) BLACK or";	producto[3][209]="300";	producto[4][209]="37";
        producto[0][210]="210";	producto[1][210]="Samsung";	producto[2][210]="A01 M (BIG) BLACK or";	producto[3][210]="300";	producto[4][210]="410";
        producto[0][211]="211";	producto[1][211]="Samsung";	producto[2][211]="A02S/ A02 Core BLACK or";	producto[3][211]="450";	producto[4][211]="14";
        producto[0][212]="212";	producto[1][212]="Samsung";	producto[2][212]="A03 BLACK or";	producto[3][212]="350";	producto[4][212]="10";
        producto[0][213]="213";	producto[1][213]="Samsung";	producto[2][213]="A03 Core BLACK or";	producto[3][213]="350";	producto[4][213]="13";
        producto[0][214]="214";	producto[1][214]="Samsung";	producto[2][214]="A03S BLACK or";	producto[3][214]="390";	producto[4][214]="119";
        producto[0][215]="215";	producto[1][215]="Samsung";	producto[2][215]="A10 BLACK or";	producto[3][215]="320";	producto[4][215]="224";
        producto[0][216]="216";	producto[1][216]="Samsung";	producto[2][216]="A10 W/F BLACK or";	producto[3][216]="380";	producto[4][216]="157";
        producto[0][217]="217";	producto[1][217]="Samsung";	producto[2][217]="A10S BLACK or";	producto[3][217]="320";	producto[4][217]="43";
        producto[0][218]="218";	producto[1][218]="Samsung";	producto[2][218]="A10e BLACK or";	producto[3][218]="380";	producto[4][218]="-1";
        producto[0][219]="219";	producto[1][219]="Samsung";	producto[2][219]="A11 BLACK or";	producto[3][219]="400";	producto[4][219]="14";
        producto[0][220]="220";	producto[1][220]="Samsung";	producto[2][220]="A12 (A125F) BLACK or";	producto[3][220]="400";	producto[4][220]="34";
        producto[0][221]="221";	producto[1][221]="Samsung";	producto[2][221]="A20 BLACK in-cell";	producto[3][221]="380";	producto[4][221]="676";
        producto[0][222]="222";	producto[1][222]="Samsung";	producto[2][222]="A20S BLACK in-cell";	producto[3][222]="400";	producto[4][222]="1";
        producto[0][223]="223";	producto[1][223]="Samsung";	producto[2][223]="A20S BLACK oled";	producto[3][223]="780";	producto[4][223]="8";
        producto[0][224]="224";	producto[1][224]="Samsung";	producto[2][224]="A21 BLACK or";	producto[3][224]="510";	producto[4][224]="176";
        producto[0][225]="225";	producto[1][225]="Samsung";	producto[2][225]="A21S BLACK or";	producto[3][225]="420";	producto[4][225]="1";
        producto[0][226]="226";	producto[1][226]="Samsung";	producto[2][226]="A22 4G W/F BLACK oled";	producto[3][226]="1520";	producto[4][226]="203";
        producto[0][227]="227";	producto[1][227]="Samsung";	producto[2][227]="A30 BLACK in-cell";	producto[3][227]="380";	producto[4][227]="449";
        producto[0][228]="228";	producto[1][228]="Samsung";	producto[2][228]="A30S BLACK in-cell";	producto[3][228]="410";	producto[4][228]="10";
        producto[0][229]="229";	producto[1][229]="Samsung";	producto[2][229]="A30S BLACK oled";	producto[3][229]="730";	producto[4][229]="4";
        producto[0][230]="230";	producto[1][230]="Samsung";	producto[2][230]="A31 W/F BLACK oled";	producto[3][230]="830";	producto[4][230]="0";
        producto[0][231]="231";	producto[1][231]="Samsung";	producto[2][231]="A32 Big W/F BLACK oled";	producto[3][231]="1370";	producto[4][231]="-1";
        producto[0][232]="232";	producto[1][232]="Samsung";	producto[2][232]="A5 (2015) WHITE aaa";	producto[3][232]="300";	producto[4][232]="33";
        producto[0][233]="233";	producto[1][233]="Samsung";	producto[2][233]="A50/ A50S BLACK in-cell";	producto[3][233]="380";	producto[4][233]="458";
        producto[0][234]="234";	producto[1][234]="Samsung";	producto[2][234]="A50/ A50S BLACK oled";	producto[3][234]="730";	producto[4][234]="2";
        producto[0][235]="235";	producto[1][235]="Samsung";	producto[2][235]="A51 Big BLACK in-cell";	producto[3][235]="500";	producto[4][235]="20";
        producto[0][236]="236";	producto[1][236]="Samsung";	producto[2][236]="A51 Small BLACK oled";	producto[3][236]="825";	producto[4][236]="23";
        producto[0][237]="237";	producto[1][237]="Samsung";	producto[2][237]="A51 Small W/F BLACK in-cell";	producto[3][237]="580";	producto[4][237]="14";
        producto[0][238]="238";	producto[1][238]="Samsung";	producto[2][238]="A51 Small W/F BLACK oled";	producto[3][238]="870";	producto[4][238]="4";
        producto[0][239]="239";	producto[1][239]="Samsung";	producto[2][239]="A510/ A5 2016 BLACK oled";	producto[3][239]="700";	producto[4][239]="1";
        producto[0][240]="240";	producto[1][240]="Samsung";	producto[2][240]="A52 4G BLACK oled";	producto[3][240]="1150";	producto[4][240]="4";
        producto[0][241]="241";	producto[1][241]="Samsung";	producto[2][241]="A52 4G W/F BLACK oled";	producto[3][241]="1750";	producto[4][241]="1";
        producto[0][242]="242";	producto[1][242]="Samsung";	producto[2][242]="A52 5G W/F BLACK oled";	producto[3][242]="1750";	producto[4][242]="0";
        producto[0][243]="243";	producto[1][243]="Samsung";	producto[2][243]="A52 Small W/F BLACK oled";	producto[3][243]="1150";	producto[4][243]="91";
        producto[0][244]="244";	producto[1][244]="Samsung";	producto[2][244]="A6 Plus BLACK oled";	producto[3][244]="770";	producto[4][244]="100";
        producto[0][245]="245";	producto[1][245]="Samsung";	producto[2][245]="A70 Big BLACK oled";	producto[3][245]="1450";	producto[4][245]="8";
        producto[0][246]="246";	producto[1][246]="Samsung";	producto[2][246]="A70 Big W/F oled";	producto[3][246]="1535";	producto[4][246]="-8";
        producto[0][247]="247";	producto[1][247]="Samsung";	producto[2][247]="A70 Small BLACK oled";	producto[3][247]="750";	producto[4][247]="18";
        producto[0][248]="248";	producto[1][248]="Samsung";	producto[2][248]="A71 Big BLACK in-cell";	producto[3][248]="650";	producto[4][248]="25";
        producto[0][249]="249";	producto[1][249]="Samsung";	producto[2][249]="A71 Big BLACK oled";	producto[3][249]="1860";	producto[4][249]="58";
        producto[0][250]="250";	producto[1][250]="Samsung";	producto[2][250]="A710/ A7 (2016) BLACK in-cell";	producto[3][250]="520";	producto[4][250]="7";
        producto[0][251]="251";	producto[1][251]="Samsung";	producto[2][251]="A720/ A7 (2017) BLACK in-cell";	producto[3][251]="520";	producto[4][251]="11";
        producto[0][252]="252";	producto[1][252]="Samsung";	producto[2][252]="A720/ A7 (2017) GOLDEN in-cell";	producto[3][252]="520";	producto[4][252]="9";
        producto[0][253]="253";	producto[1][253]="Samsung";	producto[2][253]="A750/ A7 (2018) BLACK in-cell";	producto[3][253]="620";	producto[4][253]="0";
        producto[0][254]="254";	producto[1][254]="Samsung";	producto[2][254]="A750/ A7 (2018) BLACK oled";	producto[3][254]="780";	producto[4][254]="15";
        producto[0][255]="255";	producto[1][255]="Samsung";	producto[2][255]="A920/ A9 (2018) BLACK oled";	producto[3][255]="800";	producto[4][255]="60";
        producto[0][256]="256";	producto[1][256]="Samsung";	producto[2][256]="J120/ J1 (2016) BLACK in-cell";	producto[3][256]="200";	producto[4][256]="7";
        producto[0][257]="257";	producto[1][257]="Samsung";	producto[2][257]="J120/ J1 (2016) GOLDEN in-cel";	producto[3][257]="200";	producto[4][257]="0";
        producto[0][258]="258";	producto[1][258]="Samsung";	producto[2][258]="J120/ J1 (2016) GOLDEN in-cell";	producto[3][258]="200";	producto[4][258]="2";
        producto[0][259]="259";	producto[1][259]="Samsung";	producto[2][259]="J250/ J2 Pro BLACK in-cell";	producto[3][259]="250";	producto[4][259]="8";
        producto[0][260]="260";	producto[1][260]="Samsung";	producto[2][260]="J260 BLACK in-cell";	producto[3][260]="300";	producto[4][260]="29";
        producto[0][261]="261";	producto[1][261]="Samsung";	producto[2][261]="J260/ J2 Core BLACK in-cell";	producto[3][261]="300";	producto[4][261]="0";
        producto[0][262]="262";	producto[1][262]="Samsung";	producto[2][262]="J3 BLACK in-cell";	producto[3][262]="280";	producto[4][262]="11";
        producto[0][263]="263";	producto[1][263]="Samsung";	producto[2][263]="J3 GOLDEN aaa";	producto[3][263]="230";	producto[4][263]="1";
        producto[0][264]="264";	producto[1][264]="Samsung";	producto[2][264]="J3 GOLDEN in-cell";	producto[3][264]="280";	producto[4][264]="9";
        producto[0][265]="265";	producto[1][265]="Samsung";	producto[2][265]="J3 WHITE in-cell";	producto[3][265]="280";	producto[4][265]="49";
        producto[0][266]="266";	producto[1][266]="Samsung";	producto[2][266]="J320/ J3/ J3 (2016) BLACK in-cell";	producto[3][266]="280";	producto[4][266]="0";
        producto[0][267]="267";	producto[1][267]="Samsung";	producto[2][267]="J320/ J3/ J3 (2016) GOLDEN in-cell";	producto[3][267]="280";	producto[4][267]="0";
        producto[0][268]="268";	producto[1][268]="Samsung";	producto[2][268]="J320/ J3/ J3 (2016) WHITE in-cell";	producto[3][268]="280";	producto[4][268]="0";
        producto[0][269]="269";	producto[1][269]="Samsung";	producto[2][269]="J327/ J3 Prime BLACK in-cell";	producto[3][269]="400";	producto[4][269]="1";
        producto[0][270]="270";	producto[1][270]="Samsung";	producto[2][270]="J330/ J3 (2017) BLACK";	producto[3][270]="400";	producto[4][270]="10";
        producto[0][271]="271";	producto[1][271]="Samsung";	producto[2][271]="J330/ J3 (2017) GOLDEN";	producto[3][271]="400";	producto[4][271]="11";
        producto[0][272]="272";	producto[1][272]="Samsung";	producto[2][272]="J4 BLACK in-cell";	producto[3][272]="300";	producto[4][272]="0";
        producto[0][273]="273";	producto[1][273]="Samsung";	producto[2][273]="J4 BLUE aaa";	producto[3][273]="230";	producto[4][273]="593";
        producto[0][274]="274";	producto[1][274]="Samsung";	producto[2][274]="J4 plus / J6 plus / J4 Core BLACK or";	producto[3][274]="365";	producto[4][274]="199";
        producto[0][275]="275";	producto[1][275]="Samsung";	producto[2][275]="J5 BLACK aaa";	producto[3][275]="200";	producto[4][275]="0";
        producto[0][276]="276";	producto[1][276]="Samsung";	producto[2][276]="J5 GOLDEN aaa";	producto[3][276]="200";	producto[4][276]="125";
        producto[0][277]="277";	producto[1][277]="Samsung";	producto[2][277]="J5 Prime BLACK in-cell";	producto[3][277]="330";	producto[4][277]="18";
        producto[0][278]="278";	producto[1][278]="Samsung";	producto[2][278]="J5 Prime GOLDEN in-cell";	producto[3][278]="330";	producto[4][278]="8";
        producto[0][279]="279";	producto[1][279]="Samsung";	producto[2][279]="J500/ J5 BLACK in-cell";	producto[3][279]="200";	producto[4][279]="4";
        producto[0][280]="280";	producto[1][280]="Samsung";	producto[2][280]="J510/ J5 (2016) BLACK in-cell";	producto[3][280]="380";	producto[4][280]="1";
        producto[0][281]="281";	producto[1][281]="Samsung";	producto[2][281]="J530 BLACK aaa";	producto[3][281]="230";	producto[4][281]="7";
        producto[0][282]="282";	producto[1][282]="Samsung";	producto[2][282]="J530/ J5 Pro BLACK in-cell";	producto[3][282]="350";	producto[4][282]="1";
        producto[0][283]="283";	producto[1][283]="Samsung";	producto[2][283]="J6 BLACK in-cell";	producto[3][283]="460";	producto[4][283]="0";
        producto[0][284]="284";	producto[1][284]="Samsung";	producto[2][284]="J6 BLACK oled";	producto[3][284]="900";	producto[4][284]="68";
        producto[0][285]="285";	producto[1][285]="Samsung";	producto[2][285]="J7 (2015) GOLDEN in-cell";	producto[3][285]="280";	producto[4][285]="17";
        producto[0][286]="286";	producto[1][286]="Samsung";	producto[2][286]="J7 (2015) WHITE in-cell";	producto[3][286]="280";	producto[4][286]="8";
        producto[0][287]="287";	producto[1][287]="Samsung";	producto[2][287]="J7 BLACK in-cell";	producto[3][287]="420";	producto[4][287]="8";
        producto[0][288]="288";	producto[1][288]="Samsung";	producto[2][288]="J7 GOLDEN in-cell";	producto[3][288]="420";	producto[4][288]="0";
        producto[0][289]="289";	producto[1][289]="Samsung";	producto[2][289]="J7 GOLDEN oled";	producto[3][289]="600";	producto[4][289]="3";
        producto[0][290]="290";	producto[1][290]="Samsung";	producto[2][290]="J7 Prime BLACK in-cell";	producto[3][290]="440";	producto[4][290]="0";
        producto[0][291]="291";	producto[1][291]="Samsung";	producto[2][291]="J7 Prime GREY in-cell";	producto[3][291]="440";	producto[4][291]="1";
        producto[0][292]="292";	producto[1][292]="Samsung";	producto[2][292]="J7 WHITE in-cell";	producto[3][292]="420";	producto[4][292]="135";
        producto[0][293]="293";	producto[1][293]="Samsung";	producto[2][293]="J701 GOLDEN aaa";	producto[3][293]="280";	producto[4][293]="107";
        producto[0][294]="294";	producto[1][294]="Samsung";	producto[2][294]="J701 WHITE aaa";	producto[3][294]="280";	producto[4][294]="281";
        producto[0][295]="295";	producto[1][295]="Samsung";	producto[2][295]="J701/ J7 Neo BLACK in-cell";	producto[3][295]="300";	producto[4][295]="12";
        producto[0][296]="296";	producto[1][296]="Samsung";	producto[2][296]="J701/ J7 Neo GOLDEN aaa";	producto[3][296]="300";	producto[4][296]="9";
        producto[0][297]="297";	producto[1][297]="Samsung";	producto[2][297]="J701/ J7 Neo GOLDEN in-cell";	producto[3][297]="300";	producto[4][297]="15";
        producto[0][298]="298";	producto[1][298]="Samsung";	producto[2][298]="J701/ J7 Neo WHITE aaa";	producto[3][298]="280";	producto[4][298]="24";
        producto[0][299]="299";	producto[1][299]="Samsung";	producto[2][299]="J710/ J7 (2016) BLACK in-cell";	producto[3][299]="430";	producto[4][299]="2";
        producto[0][300]="300";	producto[1][300]="Samsung";	producto[2][300]="J730/ J7 Pro BLACK aaa";	producto[3][300]="290";	producto[4][300]="7";
        producto[0][301]="301";	producto[1][301]="Samsung";	producto[2][301]="J730/ J7 Pro BLACK in-cell";	producto[3][301]="425";	producto[4][301]="226";
        producto[0][302]="302";	producto[1][302]="Samsung";	producto[2][302]="J730/ J7 Pro BLACK oled";	producto[3][302]="650";	producto[4][302]="223";
        producto[0][303]="303";	producto[1][303]="Samsung";	producto[2][303]="J730/ J7 Pro BLUE aaa";	producto[3][303]="290";	producto[4][303]="10";
        producto[0][304]="304";	producto[1][304]="Samsung";	producto[2][304]="J730/ J7 Pro GOLDEN aaa";	producto[3][304]="290";	producto[4][304]="178";
        producto[0][305]="305";	producto[1][305]="Samsung";	producto[2][305]="J730/ J7 Pro GOLDEN oled";	producto[3][305]="650";	producto[4][305]="7";
        producto[0][306]="306";	producto[1][306]="Samsung";	producto[2][306]="J730/ J7 Pro PINK aaa";	producto[3][306]="290";	producto[4][306]="1";
        producto[0][307]="307";	producto[1][307]="Samsung";	producto[2][307]="J737/ J7 (2018) GOLDEN or";	producto[3][307]="220";	producto[4][307]="19";
        producto[0][308]="308";	producto[1][308]="Samsung";	producto[2][308]="J8 BLACK on-cell";	producto[3][308]="400";	producto[4][308]="24";
        producto[0][309]="309";	producto[1][309]="Samsung";	producto[2][309]="M20 BLACK or";	producto[3][309]="500";	producto[4][309]="9";
        producto[0][310]="310";	producto[1][310]="Samsung";	producto[2][310]="M30/ M30S/ M31 BLACK in-cell";	producto[3][310]="450";	producto[4][310]="52";
        producto[0][311]="311";	producto[1][311]="Samsung";	producto[2][311]="Note 10 Plus W/F or";	producto[3][311]="5500";	producto[4][311]="3";
        producto[0][312]="312";	producto[1][312]="Samsung";	producto[2][312]="Note 10 W/F BLACK or";	producto[3][312]="4400";	producto[4][312]="4";
        producto[0][313]="313";	producto[1][313]="Samsung";	producto[2][313]="Note 10 plus W/F BLACK or";	producto[3][313]="5500";	producto[4][313]="14";
        producto[0][314]="314";	producto[1][314]="Samsung";	producto[2][314]="Note 8 W/F BLACK or";	producto[3][314]="3500";	producto[4][314]="22";
        producto[0][315]="315";	producto[1][315]="Samsung";	producto[2][315]="Note 9 W/F BLACK or";	producto[3][315]="3600";	producto[4][315]="28";
        producto[0][316]="316";	producto[1][316]="Samsung";	producto[2][316]="S10 W/F BLACK or";	producto[3][316]="4200";	producto[4][316]="26";
        producto[0][317]="317";	producto[1][317]="Samsung";	producto[2][317]="S10 plus W/F BLACK or";	producto[3][317]="5000";	producto[4][317]="11";
        producto[0][318]="318";	producto[1][318]="Samsung";	producto[2][318]="S10E W/F BLACK or";	producto[3][318]="2800";	producto[4][318]="21";
        producto[0][319]="319";	producto[1][319]="Samsung";	producto[2][319]="S20 PLUS W/F BLACK or";	producto[3][319]="5900";	producto[4][319]="21";
        producto[0][320]="320";	producto[1][320]="Samsung";	producto[2][320]="S20 Ultra W/F BLACK or";	producto[3][320]="5000";	producto[4][320]="8";
        producto[0][321]="321";	producto[1][321]="Samsung";	producto[2][321]="S20 W/F BLACK or";	producto[3][321]="4500";	producto[4][321]="18";
        producto[0][322]="322";	producto[1][322]="Samsung";	producto[2][322]="S20FE W/F BLACK or";	producto[3][322]="2200";	producto[4][322]="7";
        producto[0][323]="323";	producto[1][323]="Samsung";	producto[2][323]="S21 Plus W/F BLACK or";	producto[3][323]="4300";	producto[4][323]="18";
        producto[0][324]="324";	producto[1][324]="Samsung";	producto[2][324]="S21 Ultra W/F BLACK or";	producto[3][324]="6900";	producto[4][324]="10";
        producto[0][325]="325";	producto[1][325]="Samsung";	producto[2][325]="S5 BLACK in-cell";	producto[3][325]="410";	producto[4][325]="8";
        producto[0][326]="326";	producto[1][326]="Samsung";	producto[2][326]="S8 W/F BLACK or";	producto[3][326]="3000";	producto[4][326]="27";
        producto[0][327]="327";	producto[1][327]="Samsung";	producto[2][327]="S8 plus W/F BLACK or";	producto[3][327]="3000";	producto[4][327]="13";
        producto[0][328]="328";	producto[1][328]="Samsung";	producto[2][328]="S9 W/F BLACK or";	producto[3][328]="2400";	producto[4][328]="24";
        producto[0][329]="329";	producto[1][329]="Samsung";	producto[2][329]="S9 plus W/F BLACK or";	producto[3][329]="3000";	producto[4][329]="13";
        producto[0][330]="330";	producto[1][330]="Sony";	producto[2][330]="Z3 BLACK";	producto[3][330]="200";	producto[4][330]="44";
        producto[0][331]="331";	producto[1][331]="Vivo";	producto[2][331]="Y71 BLACK in-cell";	producto[3][331]="1";	producto[4][331]="1";
        producto[0][332]="332";	producto[1][332]="Vivo";	producto[2][332]="Y79 BLACK in-cell";	producto[3][332]="1";	producto[4][332]="1";
        producto[0][333]="333";	producto[1][333]="Vivo";	producto[2][333]="Y93 BLACK in-cell";	producto[3][333]="1";	producto[4][333]="1";
        producto[0][334]="334";	producto[1][334]="Xiaomi";	producto[2][334]="Mi 9 BLACK oled";	producto[3][334]="880";	producto[4][334]="2";
        producto[0][335]="335";	producto[1][335]="Xiaomi";	producto[2][335]="Mi A1 BLACK in-cell";	producto[3][335]="360";	producto[4][335]="13";
        producto[0][336]="336";	producto[1][336]="Xiaomi";	producto[2][336]="Mi A3 BLACK in-cell";	producto[3][336]="570";	producto[4][336]="84";
        producto[0][337]="337";	producto[1][337]="Xiaomi";	producto[2][337]="Mi Note 10 BLACK or";	producto[3][337]="680";	producto[4][337]="15";
        producto[0][338]="338";	producto[1][338]="Xiaomi";	producto[2][338]="Mi Note 10 Pro BLACK or";	producto[3][338]="830";	producto[4][338]="4";
        producto[0][339]="339";	producto[1][339]="Xiaomi";	producto[2][339]="Mi Note 10 lite BLACK or";	producto[3][339]="700";	producto[4][339]="37";
        producto[0][340]="340";	producto[1][340]="Xiaomi";	producto[2][340]="REDMI POCO X3/ POCO X3 PRO BLACK in-cell";	producto[3][340]="550";	producto[4][340]="9";
        producto[0][341]="341";	producto[1][341]="Xiaomi";	producto[2][341]="Redmi 10 BLACK in-cell";	producto[3][341]="500";	producto[4][341]="6";
        producto[0][342]="342";	producto[1][342]="Xiaomi";	producto[2][342]="Redmi 5 plus BLACK in-cell";	producto[3][342]="460";	producto[4][342]="37";
        producto[0][343]="343";	producto[1][343]="Xiaomi";	producto[2][343]="Redmi 7 BLACK in-cell";	producto[3][343]="410";	producto[4][343]="9";
        producto[0][344]="344";	producto[1][344]="Xiaomi";	producto[2][344]="Redmi 8A BLACK in-cell";	producto[3][344]="450";	producto[4][344]="23";
        producto[0][345]="345";	producto[1][345]="Xiaomi";	producto[2][345]="Redmi 9 BLACK in-cell";	producto[3][345]="510";	producto[4][345]="6";
        producto[0][346]="346";	producto[1][346]="Xiaomi";	producto[2][346]="Redmi 9A/ 9C BLACK in-cell";	producto[3][346]="380";	producto[4][346]="-5";
        producto[0][347]="347";	producto[1][347]="Xiaomi";	producto[2][347]="Redmi 9T / Poco M3 BLACK incell";	producto[3][347]="560";	producto[4][347]="63";
        producto[0][348]="348";	producto[1][348]="Xiaomi";	producto[2][348]="Redmi Note 10 / 10s 4g BLACK oled";	producto[3][348]="1100";	producto[4][348]="57";
        producto[0][349]="349";	producto[1][349]="Xiaomi";	producto[2][349]="Redmi Note 10 4g BLACK in-cell";	producto[3][349]="720";	producto[4][349]="0";
        producto[0][350]="350";	producto[1][350]="Xiaomi";	producto[2][350]="Redmi Note 5 BLACK in-cell";	producto[3][350]="460";	producto[4][350]="0";
        producto[0][351]="351";	producto[1][351]="Xiaomi";	producto[2][351]="Redmi Note 5A BLACK in-cell";	producto[3][351]="330";	producto[4][351]="85";
        producto[0][352]="352";	producto[1][352]="Xiaomi";	producto[2][352]="Redmi Note 7 BLACK in-cell";	producto[3][352]="540";	producto[4][352]="14";
        producto[0][353]="353";	producto[1][353]="Xiaomi";	producto[2][353]="Redmi Note 8 BLACK in-cell";	producto[3][353]="520";	producto[4][353]="3";
        producto[0][354]="354";	producto[1][354]="Xiaomi";	producto[2][354]="Redmi Note 8 Pro BLACK in-cell";	producto[3][354]="510";	producto[4][354]="0";
        producto[0][355]="355";	producto[1][355]="Xiaomi";	producto[2][355]="Redmi Note 9 BLACK in-cell";	producto[3][355]="500";	producto[4][355]="48";
        producto[0][356]="356";	producto[1][356]="Xiaomi";	producto[2][356]="Redmi Note 9S / Note 9 Pro BLACK in-cell";	producto[3][356]="500";	producto[4][356]="-2";
        producto[0][357]="357";	producto[1][357]="Xiaomi";	producto[2][357]="Redmi Note 9T BLACK in-cell";	producto[3][357]="500";	producto[4][357]="131";
        producto[0][358]="358";	producto[1][358]="Xiaomi";	producto[2][358]="Redmi S2 BLACK in-cell";	producto[3][358]="400";	producto[4][358]="61";
        producto[0][359]="359";	producto[1][359]="ZTE";	producto[2][359]="A3 lite BLACK or";	producto[3][359]="300";	producto[4][359]="65";
        producto[0][360]="360";	producto[1][360]="ZTE";	producto[2][360]="A5 2020  BLACK or";	producto[3][360]="510";	producto[4][360]="13";
        producto[0][361]="361";	producto[1][361]="ZTE";	producto[2][361]="A51 BLACK or";	producto[3][361]="520";	producto[4][361]="21";
        producto[0][362]="362";	producto[1][362]="ZTE";	producto[2][362]="A602 BLACK or";	producto[3][362]="370";	producto[4][362]="3";
        producto[0][363]="363";	producto[1][363]="ZTE";	producto[2][363]="A602 GOLDEN or";	producto[3][363]="370";	producto[4][363]="2";
        producto[0][364]="364";	producto[1][364]="ZTE";	producto[2][364]="A7 2019 BLACK or";	producto[3][364]="510";	producto[4][364]="57";
        producto[0][365]="365";	producto[1][365]="ZTE";	producto[2][365]="A7S 2020 BLACK or";	producto[3][365]="600";	producto[4][365]="0";
        producto[0][366]="366";	producto[1][366]="ZTE";	producto[2][366]="L210 BLACK or";	producto[3][366]="400";	producto[4][366]="40";
        producto[0][367]="367";	producto[1][367]="ZTE";	producto[2][367]="L8 BLACK or";	producto[3][367]="300";	producto[4][367]="4";
        producto[0][368]="368";	producto[1][368]="ZTE";	producto[2][368]="V Smart/ V2050 BLACK or";	producto[3][368]="620";	producto[4][368]="-632";
        producto[0][369]="369";	producto[1][369]="ZTE";	producto[2][369]="V10 BLACK or";	producto[3][369]="630";	producto[4][369]="16";
        producto[0][370]="370";	producto[1][370]="ZTE";	producto[2][370]="V10 Vita BLACK or";	producto[3][370]="610";	producto[4][370]="22";
        producto[0][371]="371";	producto[1][371]="ZTE";	producto[2][371]="V20 Smart/ 8010 BLACK or";	producto[3][371]="620";	producto[4][371]="35";
        producto[0][372]="372";	producto[1][372]="ZTE";	producto[2][372]="V9 Vita BLACK or";	producto[3][372]="360";	producto[4][372]="77";
        producto[0][373]="373";	producto[1][373]="ZTE";	producto[2][373]="Z MAX PRO / Z981 BLACK or";	producto[3][373]="520";	producto[4][373]="60";
        producto[0][374]="374";	producto[1][374]="ZTE";	producto[2][374]="Z Max / Z982 BLACK or";	producto[3][374]="430";	producto[4][374]="55";
        producto[0][375]="375";	producto[1][375]="LG";	producto[2][375]="Q6 BLACK in-cell";	producto[3][375]="0";	producto[4][375]="0";
        producto[0][376]="376";	producto[1][376]="Xiaomi";	producto[2][376]="Redmi Note 9S / Note 9 Pro BLACK cof";	producto[3][376]="0";	producto[4][376]="7";
        producto[0][377]="377";	producto[1][377]="Xiaomi";	producto[2][377]="Redmi Note 9T BLACK or";	producto[3][377]="0";	producto[4][377]="19";
        producto[0][378]="378";	producto[1][378]="Honor";	producto[2][378]="10 Lite BLACK in-cell";	producto[3][378]="0";	producto[4][378]="20";
        producto[0][379]="379";	producto[1][379]="Moto";	producto[2][379]="G5S W/F GOLDEN";	producto[3][379]="0";	producto[4][379]="0";
        producto[0][380]="380";	producto[1][380]="Samsung";	producto[2][380]="J4 Plus / J6 Plus BLACK in-cell";	producto[3][380]="0";	producto[4][380]="-1";
        producto[0][381]="381";	producto[1][381]="Samsung";	producto[2][381]="J4 plus / J6 plus BLACK in-cell";	producto[3][381]="0";	producto[4][381]="16";
        producto[0][382]="382";	producto[1][382]="Samsung";	producto[2][382]="J7 BLACK aaa";	producto[3][382]="0";	producto[4][382]="3";
        producto[0][383]="383";	producto[1][383]="Xiaomi";	producto[2][383]="Redmi Note 8 BLACK or";	producto[3][383]="0";	producto[4][383]="0";
        producto[0][384]="384";	producto[1][384]="Xiaomi";	producto[2][384]="Redmi Note 9 BLACK or";	producto[3][384]="0";	producto[4][384]="9";
        producto[0][385]="385";	producto[1][385]="Huawei";	producto[2][385]="Y6 2018 BLACK in-cell";	producto[3][385]="0";	producto[4][385]="24";
        producto[0][386]="386";	producto[1][386]="Xiaomi";	producto[2][386]="Mi Note 10 BLACK in-cell";	producto[3][386]="0";	producto[4][386]="160";
        producto[0][387]="387";	producto[1][387]="KG";	producto[2][387]="K4 W/F BLACK";	producto[3][387]="0";	producto[4][387]="17";
        producto[0][388]="388";	producto[1][388]="LG";	producto[2][388]="K4 W/F BLACK";	producto[3][388]="0";	producto[4][388]="0";
        producto[0][389]="389";	producto[1][389]="Moto";	producto[2][389]="One Fusion Black Or";	producto[3][389]="0";	producto[4][389]="0";
        producto[0][390]="390";	producto[1][390]="Samsung";	producto[2][390]="S10 E W/F BLACK or";	producto[3][390]="0";	producto[4][390]="0";
        producto[0][391]="391";	producto[1][391]="Xiaomi";	producto[2][391]="Redmi 9T / Poco M3 BLACK incell";	producto[3][391]="0";	producto[4][391]="66";
        producto[0][392]="392";	producto[1][392]="Xiaomi";	producto[2][392]="Redmi Note 8 BLACK in-cell";	producto[3][392]="0";	producto[4][392]="1";
        producto[0][393]="393";	producto[1][393]="Xiaomi";	producto[2][393]="Redmi Note 10s BLACK oled";	producto[3][393]="0";	producto[4][393]="1";


        for (i in 0 until 5) {
            if(dato == producto[i][0].toString()){
                auxDatoRequerido = i
            }

        }
        for (i in 0 until 394) {
            if(id == producto[0][i].toString()){
                datoQueSeManda = producto[auxDatoRequerido][i].toString()
            }

        }

        return datoQueSeManda
    }

}
const CODICI_CATASTALI = {
    EE: [
        ['ALBANIA', 'Z100'],
        ['ANDORRA', 'Z101'],
        ['AUSTRIA', 'Z102'],
        ['BELGIO', 'Z103'],
        ['BULGARIA', 'Z104'],
        ["CITTA' DEL VATICANO", 'Z106'],
        ['DANIMARCA', 'Z107'],
        ['FAER OER (ISOLE)', 'Z108'],
        ['FINLANDIA', 'Z109'],
        ['FRANCIA', 'Z110'],
        ['GERMANIA', 'Z112'],
        ['GIBILTERRA', 'Z113'],
        ['REGNO UNITO', 'Z114'],
        ['GRECIA', 'Z115'],
        ['IRLANDA', 'Z116'],
        ['ISLANDA', 'Z117'],
        ['LIECHTENSTEIN', 'Z119'],
        ['LUSSEMBURGO', 'Z120'],
        ['MALTA', 'Z121'],
        ['MAN (ISOLA)', 'Z122'],
        ['MONACO', 'Z123'],
        ['ISOLE DEL CANALE', 'Z124'],
        ['NORVEGIA', 'Z125'],
        ['PAESI BASSI', 'Z126'],
        ['POLONIA', 'Z127'],
        ['PORTOGALLO', 'Z128'],
        ['ROMANIA', 'Z129'],
        ['SAN MARINO', 'Z130'],
        ['SPAGNA', 'Z131'],
        ['SVEZIA', 'Z132'],
        ['SVIZZERA', 'Z133'],
        ['UNGHERIA', 'Z134'],
        ['UCRAINA', 'Z138'],
        ['BIELORUSSIA', 'Z139'],
        ['MOLDAVIA', 'Z140'],
        ['ESTONIA', 'Z144'],
        ['LETTONIA', 'Z145'],
        ['LITUANIA', 'Z146'],
        ['MACEDONIA', 'Z148'],
        ['CROAZIA', 'Z149'],
        ['SLOVENIA', 'Z150'],
        ['BOSNIA ED ERZEGOVINA', 'Z153'],
        ['FEDERAZIONE RUSSA', 'Z154'],
        ['SLOVACCHIA', 'Z155'],
        ['REPUBBLICA CECA', 'Z156'],
        ['KOSOVO', 'Z160'],
        ['TERRITORI PALESTINESI', 'Z161'],
        ['AFGHANISTAN', 'Z200'],
        ['ARABIA SAUDITA', 'Z203'],
        ['BAHREIN', 'Z204'],
        ['BHUTAN', 'Z205'],
        ['MYANMAR', 'Z206'],
        ['BRUNEI', 'Z207'],
        ['CAMBOGIA', 'Z208'],
        ['SRI LANKA', 'Z209'],
        ['CINA REPUBBLICA POPOLARE', 'Z210'],
        ['CIPRO', 'Z211'],
        ['COCOS (ISOLE)', 'Z212'],
        ['REPUBBLICA DI COREA', 'Z213'],
        ['COREA DEL NORD', 'Z214'],
        ['EMIRATI ARABI UNITI', 'Z215'],
        ['FILIPPINE', 'Z216'],
        ['TAIWAN', 'Z217'],
        ['GAZA (TERRITORIO DI)', 'Z218'],
        ['GIAPPONE', 'Z219'],
        ['GIORDANIA', 'Z220'],
        ['INDIA', 'Z222'],
        ['INDONESIA', 'Z223'],
        ['IRAN', 'Z224'],
        ['IRAQ', 'Z225'],
        ['ISRAELE', 'Z226'],
        ['KUWAIT', 'Z227'],
        ['LAOS', 'Z228'],
        ['LIBANO', 'Z229'],
        ['MACAO', 'Z231'],
        ['MALDIVE', 'Z232'],
        ['MONGOLIA', 'Z233'],
        ['NEPAL', 'Z234'],
        ['OMAN', 'Z235'],
        ['PAKISTAN', 'Z236'],
        ['QATAR', 'Z237'],
        ['SIRIA', 'Z240'],
        ['THAILANDIA', 'Z241'],
        ['TURCHIA', 'Z243'],
        ['YEMEN', 'Z246'],
        ['MALAYSIA', 'Z247'],
        ['SINGAPORE', 'Z248'],
        ['BANGLADESH', 'Z249'],
        ['VIETNAM', 'Z251'],
        ['ARMENIA', 'Z252'],
        ['AZERBAIGIAN', 'Z253'],
        ['GEORGIA', 'Z254'],
        ['KAZAKHSTAN', 'Z255'],
        ['KIRGHIZISTAN', 'Z256'],
        ['TAGIKISTAN', 'Z257'],
        ['TURKMENISTAN', 'Z258'],
        ['UZBEKISTAN', 'Z259'],
        ['NAMIBIA', 'Z300'],
        ['ALGERIA', 'Z301'],
        ['ANGOLA', 'Z302'],
        ['BURUNDI', 'Z305'],
        ['CAMERUN', 'Z306'],
        ['CAPO VERDE', 'Z307'],
        ['CENTRAFRICANA REPUBBLICA', 'Z308'],
        ['CIAD', 'Z309'],
        ['COMORE', 'Z310'],
        ['CONGO REPUBBLICA POPOLARE', 'Z311'],
        ['CONGO REPUBBLICA DEMOCRATICA', 'Z312'],
        ["COSTA D'AVORIO", 'Z313'],
        ['BENIN', 'Z314'],
        ['ETIOPIA', 'Z315'],
        ['GABON', 'Z316'],
        ['GAMBIA', 'Z317'],
        ['GHANA', 'Z318'],
        ['GUINEA', 'Z319'],
        ['GUINEA BISSAU', 'Z320'],
        ['GUINEA EQUATORIALE', 'Z321'],
        ['KENYA', 'Z322'],
        ['LA REUNION (ISOLA)', 'Z324'],
        ['LIBERIA', 'Z325'],
        ['LIBIA', 'Z326'],
        ['MADAGASCAR', 'Z327'],
        ['MALAWI', 'Z328'],
        ['MALI', 'Z329'],
        ['MAROCCO', 'Z330'],
        ['MAURITANIA', 'Z331'],
        ['MAURIZIO', 'Z332'],
        ['MOZAMBICO', 'Z333'],
        ['NIGER', 'Z334'],
        ['NIGERIA', 'Z335'],
        ['EGITTO', 'Z336'],
        ['ZIMBABWE', 'Z337'],
        ['RUANDA', 'Z338'],
        ["SANT'ELENA (ISOLA)", 'Z340'],
        ["SAO TOME' E PRINCIPE", 'Z341'],
        ['SEICELLE', 'Z342'],
        ['SENEGAL', 'Z343'],
        ['SIERRA LEONE', 'Z344'],
        ['SOMALIA', 'Z345'],
        ['SUDAFRICANA REPUBBLICA', 'Z347'],
        ['SUDAN', 'Z348'],
        ['SWAZILAND', 'Z349'],
        ['TOGO', 'Z351'],
        ['TUNISIA', 'Z352'],
        ['UGANDA', 'Z353'],
        ['BURKINA FASO', 'Z354'],
        ['ZAMBIA', 'Z355'],
        ['TANZANIA', 'Z357'],
        ['BOTSWANA', 'Z358'],
        ['LESOTHO', 'Z359'],
        ['MAYOTTE (ISOLA)', 'Z360'],
        ['GIBUTI', 'Z361'],
        ['ERITREA', 'Z368'],
        ['BERMUDA (ISOLE)', 'Z400'],
        ['CANADA', 'Z401'],
        ['GROENLANDIA', 'Z402'],
        ['SAINT PIERRE ET MIQUELON (ISOLE)', 'Z403'],
        ["STATI UNITI D'AMERICA", 'Z404'],
        ['ANTILLE OLANDESI', 'Z501'],
        ['BAHAMAS', 'Z502'],
        ['COSTA RICA', 'Z503'],
        ['CUBA', 'Z504'],
        ['REPUBBLICA DOMINICANA', 'Z505'],
        ['EL SALVADOR', 'Z506'],
        ['GIAMAICA', 'Z507'],
        ['GUADALUPA', 'Z508'],
        ['GUATEMALA', 'Z509'],
        ['HAITI', 'Z510'],
        ['HONDURAS', 'Z511'],
        ['BELIZE', 'Z512'],
        ['MARTINICA', 'Z513'],
        ['MESSICO', 'Z514'],
        ['NICARAGUA', 'Z515'],
        ['PANAMA', 'Z516'],
        ['PANAMA ZONA DEL CANALE', 'Z517'],
        ['PUERTO RICO', 'Z518'],
        ['TURKS E CAICOS (ISOLE)', 'Z519'],
        ['VERGINI AMERICANE (ISOLE)', 'Z520'],
        ['BARBADOS', 'Z522'],
        ['GRENADA', 'Z524'],
        ['VERGINI BRITANNICHE (ISOLE)', 'Z525'],
        ['DOMINICA', 'Z526'],
        ['SAINT LUCIA', 'Z527'],
        ['SAINT VINCENT E GRENADINE', 'Z528'],
        ['ANGUILLA (ISOLA)', 'Z529'],
        ['CAYMAN (ISOLE)', 'Z530'],
        ['MONTSERRAT', 'Z531'],
        ['ANTIGUA E BARBUDA', 'Z532'],
        ['SAINT KITTS E NEVIS', 'Z533'],
        ['ARGENTINA', 'Z600'],
        ['BOLIVIA', 'Z601'],
        ['BRASILE', 'Z602'],
        ['CILE', 'Z603'],
        ['COLOMBIA', 'Z604'],
        ['ECUADOR', 'Z605'],
        ['GUYANA', 'Z606'],
        ['GUIANA FRANCESE', 'Z607'],
        ['SURINAME', 'Z608'],
        ['FALKLAND (ISOLE)', 'Z609'],
        ['PARAGUAY', 'Z610'],
        ["PERU'", 'Z611'],
        ['TRINIDAD E TOBAGO', 'Z612'],
        ['URUGUAY', 'Z613'],
        ['VENEZUELA', 'Z614'],
        ['AUSTRALIA', 'Z700'],
        ['CHRISTMAS (ISOLA)', 'Z702'],
        ['COOK (ISOLE)', 'Z703'],
        ['VITI', 'Z704'],
        ['GUAM (ISOLA)', 'Z706'],
        ['IRIAN OCCIDENTALE', 'Z707'],
        ['MACQUARIE (ISOLE)', 'Z708'],
        ['MARIANNE (ISOLE)', 'Z710'],
        ['MARSHALL', 'Z711'],
        ['MIDWAY (ISOLE)', 'Z712'],
        ['NAURU', 'Z713'],
        ['SAVAGE (ISOLE)', 'Z714'],
        ['NORFOLK (ISOLE E ISOLE DEL MAR DEI CORALLI)', 'Z715'],
        ['NUOVA CALEDONIA (ISOLE E DIPENDENZE)', 'Z716'],
        ['NUOVA ZELANDA', 'Z719'],
        ['ISOLE CILENE (PASQUA E SALA Y GOMEZ)', 'Z721'],
        ['PITCAIRN (E DIPENDENZE)', 'Z722'],
        ['POLINESIA FRANCESE (ISOLE)', 'Z723'],
        ['SALOMONE', 'Z724'],
        ['SAMOA AMERICANE (ISOLE)', 'Z725'],
        ['SAMOA', 'Z726'],
        ["ISOLE DELL'UNIONE", 'Z727'],
        ['TONGA', 'Z728'],
        ['WALLIS E FUTUNA (ISOLE)', 'Z729'],
        ['PAPUA NUOVA GUINEA', 'Z730'],
        ['KIRIBATI', 'Z731'],
        ['TUVALU', 'Z732'],
        ['VANUATU', 'Z733'],
        ['PALAU', 'Z734'],
        ['MICRONESIA STATI FEDERATI', 'Z735'],
        ['DIPENDENZE CANADESI', 'Z800'],
        ['DIPENDENZE NORVEGESI ARTICHE', 'Z801'],
        ['DIPENDENZE RUSSE', 'Z802'],
        ['DIPENDENZE AUSTRALIANE', 'Z900'],
        ['DIPENDENZE BRITANNICHE', 'Z901'],
        ['DIPENDENZE FRANCESI', 'Z902'],
        ['DIPENDENZE NEOZELANDESI', 'Z903'],
        ['DIPENDENZE NORVEGESI ANTARTICHE', 'Z904'],
        ['DIPENDENZE STATUNITENSI', 'Z905'],
        ['DIPENDENZE SUDAFRICANE', 'Z906'],
        ['SUD SUDAN', 'Z907']
    ],
    VE: [
        ['TORRE DI MOSTO', 'L267'],
        ['SAN MICHELE AL TAGLIAMENTO', 'I040'],
        ['CEGGIA', 'C422'],
        ['CHIOGGIA', 'C638'],
        ['GRUARO', 'E215'],
        ['MIRA', 'F229'],
        ['MIRANO', 'F241'],
        ['SANTO STINO DI LIVENZA', 'I373'],
        ["SCORZE'", 'I551'],
        ['CAMPOLONGO MAGGIORE', 'B546'],
        ['PORTOGRUARO', 'G914'],
        ['DOLO', 'D325'],
        ['MEOLO', 'F130'],
        ["FOSSO'", 'D748'],
        ['FOSSALTA DI PORTOGRUARO', 'D741'],
        ['FOSSALTA DI PIAVE', 'D740'],
        ['VENEZIA', 'L736'],
        ['CAORLE', 'B642'],
        ["QUARTO D'ALTINO", 'H117'],
        ["SAN DONA' DI PIAVE", 'H823'],
        ['MARTELLAGO', 'E980'],
        ['CAMPAGNA LUPIA', 'B493'],
        ['STRA', 'I965'],
        ['SALZANO', 'H735'],
        ['CAMPONOGARA', 'B554'],
        ['ERACLEA', 'D415'],
        ['ANNONE VENETO', 'A302'],
        ['CONA', 'C938'],
        ['SPINEA', 'I908'],
        ['VIGONOVO', 'L899'],
        ['NOALE', 'F904'],
        ['CONCORDIA SAGITTARIA', 'C950'],
        ['CAVARZERE', 'C383'],
        ['JESOLO', 'C388'],
        ['CINTO CAOMAGGIORE', 'C714'],
        ['MUSILE DI PIAVE', 'F826'],
        ['CAVALLINO-TREPORTI', 'M308'],
        ['SANTA MARIA DI SALA', 'I242'],
        ['PRAMAGGIORE', 'G981'],
        ['NOVENTA DI PIAVE', 'F963'],
        ['PIANIGA', 'G565'],
        ['MARCON', 'E936'],
        ["FIESSO D'ARTICO", 'D578'],
        ['TEGLIO VENETO', 'L085']
    ]
};

const province = ["EE", "AG", "AL", "AN", "AO", "AR", "AP", "AT", "AV", "BA", "BL", "BN", "BG", "BI", "BO", "BZ", "BS", "BR", "CA", "CL", "CB", "CE", "CT", "CZ", "CH", "CO", "CS", "CR", "KR", "CN", "EN", "FE", "FI",
    "FG", "FO", "FR", "GE", "GO", "GR", "IM", "IS", "SP", "AQ", "LT", "LE", "LC", "LI", "LO", "LU", "MC", "MN", "MS", "MT", "ME", "MI", "MO", "NA", "NO", "NU", "OR", "PD", "PA", "PR", "PV", "PG", "PS", "PE", "PC",
    "PI", "PT", "PN", "PZ", "PO", "RG", "RA", "RC", "RE", "RI", "RN", "RM", "RO", "SA", "SS", "SV", "SI", "SR", "SO", "TA", "TE", "TR", "TO", "TP", "TN", "TV", "TS", "UD", "VA", "VE", "VB", "VC", "VR", "VV", "VI", "VT"
];

const vocali = "AEIOU";

function caricaProvince() {
    var x = document.getElementById("province");
    var option;
    for (var i = 0; i < province.length; i++) {
        option = document.createElement("option");
        option.text = province[i];
        x.add(option);
    }
}

function caricaAnni() {
    var x = document.getElementById("anno");
    var option;
    for (var i = 1900; i < 2019; i++) {
        option = document.createElement("option");
        option.text = i;
        x.add(option);
    }
}

function main() {
    var cognome = document.getElementById('cognome').value;
    var nome = document.getElementById('nome').value;
    var comuneStato = generaComuneOStatoEstero();
    calcoloCF(generaCognome(cognome), generaNome(nome), generaData(), comuneStato);
}

function generaCognome(surname) {
    surname.toUpperCase();
    var cognome = surname.replace(/[^BCDFGHJKLMNPQRSTVWXYZ]/gi, '');
    if (cognome.length < 3) {
        var vocali = surname.replace(/[^AEIOU]/gi, '');
        for (var i = 0; i < vocali.length; i++) {
            cognome = cognome + vocali.charAt(i);
            if (cognome.length == 3)
                break;
        }
        for (var i = cognome.length; i < 4; i++) {
            cognome = cognome + "X";
        }
    }
    if (cognome.length > 3) {
        cognome = cognome.substring(0, 3);
    }
    return cognome;
}

function generaNome(name) {
    name = name.toUpperCase();
    var nome = name.replace(/[^BCDFGHJKLMNPQRSTVWXYZ]/gi, '');
    if (nome.length < 3) {
        var vocali = name.replace(/[^AEIOU]/gi, '');
        for (var i = 0; i < vocali.length; i++) {
            nome = nome + vocali.charAt(i);
            if (nome.length == 3)
                break;
        }
        for (var i = nome.length; i < 4; i++) {
            nome = nome + "X";
        }
    }
    if (nome.length > 3) {
        nome = nome.charAt(0) + nome.charAt(2) + nome.charAt(3);
    }
    return nome;
}

function generaData() {
    var sessoPersona = (document.forms.registrazione.sceltaSesso.value).toUpperCase();
    var giorno = parseInt(document.forms.registrazione.giorno.value);
    var mese = document.forms.registrazione.mese.value;
    var anno = document.forms.registrazione.anno.value;
    
    var inizialeMese = "";
    var checkedMonth = true;
    switch (mese) {
        case "01":
            inizialeMese = "A";
            break;
        case "02":
            inizialeMese = "B";
            if (giorno == 30 || giorno == 31)
                checkedMonth = false;
            if (giorno == 29) { //verifica anno bisestile
                var i;
                for (i = 1900; i < 2019; i = i + 4) {
                    if (anno == i) {
                        checkedMonth = true;
                        break;
                    } else
                        checkedMonth = false;
                }
            }
            break;
        case "03":
            inizialeMese = "C";
            break;
        case "04":
            inizialeMese = "D";
            if (giorno == 31)
                checkedMonth = false;
            break;
        case "05":
            inizialeMese = "E";
            break;
        case "06":
            inizialeMese = "H";
            if (giorno == 31)
                checkedMonth = false;
            break;
        case "07":
            inizialeMese = "L";
            break;
        case "08":
            inizialeMese = "M";
            break;
        case "09":
            inizialeMese = "P";
            if (giorno == 31)
                checkedMonth = false;
            break;
        case "10":
            inizialeMese = "R";
            break;
        case "11":
            inizialeMese = "S";
            if (giorno == 31)
                checkedMonth = false;
            break;
        case "12":
            inizialeMese = "T";
            break;
    }
    
    if (sessoPersona == "F") {
        giorno = giorno + 40;
    }
    if (giorno < 10)
        giorno = "0" + giorno;
    
    var year = anno.substring(2, 4);
    var arr = [giorno, inizialeMese, year, checkedMonth];
    return arr;
}

function generaComuneOStatoEstero() {
    var provincia = document.forms.registrazione.province.value;
    var comuneItalianoOstatoEstero = (document.getElementById("comuneStatoEstero").value).toUpperCase();
    var elem = "";
    var codiceCatastale = "";

    switch (provincia) {
        case "EE":
            for (var i = 0; i < CODICI_CATASTALI.EE.length; i++) {
                elem = CODICI_CATASTALI.EE[i];
                if (elem[0] == (comuneItalianoOstatoEstero)) {
                    codiceCatastale = elem[1];
                    break;
                }
            }
            break;
        case "VE":
            for (var i = 0; i < CODICI_CATASTALI.VE.length; i++) {
                elem = CODICI_CATASTALI.VE[i];
                if (elem[0] == (comuneItalianoOstatoEstero)) {
                    codiceCatastale = elem[1];
                    break;
                }
            }
            break;
        case "TV":
            for (var i = 0; i < CODICI_CATASTALI.TV.length; i++) {
                elem = CODICI_CATASTALI.TV[i];
                if (elem[0] == (comuneItalianoOstatoEstero)) {
                    codiceCatastale = elem[1];
                    break;
                }
            }
            break;
    }
    return codiceCatastale;
}

function calcoloCF(cognome, nome, data, comuneOStatoEstero) {
    cognome = cognome.toUpperCase();
    nome = nome.toUpperCase();
    var date = data[2] + data[1] + data[0];
    var cf = cognome + nome + data + comuneOStatoEstero;
    var num;
    var somma = 0, somma1 = 0, somma2 = 0;
    for (var i = 1; i < 15; i = i + 2) {
        switch (cf.charAt(i)) {
            case '0':
                num = 0;
                break;
            case '1':
                num = 1;
                break;
            case '2':
                num = 2;
                break;
            case '3':
                num = 3;
                break;
            case '4':
                num = 4;
                break;
            case '5':
                num = 5;
                break;
            case '6':
                num = 6;
                break;
            case '7':
                num = 7;
                break;
            case '8':
                num = 8;
                break;
            case '9':
                num = 9;
                break;
            case 'A':
                num = 0;
                break;
            case 'B':
                num = 1;
                break;
            case 'C':
                num = 2;
                break;
            case 'D':
                num = 3;
                break;
            case 'E':
                num = 4;
                break;
            case 'F':
                num = 5;
                break;
            case 'G':
                num = 6;
                break;
            case 'H':
                num = 7;
                break;
            case 'I':
                num = 8;
                break;
            case 'J':
                num = 9;
                break;
            case 'K':
                num = 10;
                break;
            case 'L':
                num = 11;
                break;
            case 'M':
                num = 12;
                break;
            case 'N':
                num = 13;
                break;
            case 'O':
                num = 14;
                break;
            case 'P':
                num = 15;
                break;
            case 'Q':
                num = 16;
                break;
            case 'R':
                num = 17;
                break;
            case 'S':
                num = 18;
                break;
            case 'T':
                num = 19;
                break;
            case 'U':
                num = 20;
                break;
            case 'V':
                num = 21;
                break;
            case 'W':
                num = 22;
                break;
            case 'X':
                num = 23;
                break;
            case 'Y':
                num = 24;
                break;
            case 'Z':
                num = 25;
                break;
        }
        somma1 = somma1 + num;
    }
    for (var i = 0; i < 15; i = i + 2) {
        switch (cf.charAt(i)) {
            case '0':
                num = 1;
                break;
            case '1':
                num = 0;
                break;
            case '2':
                num = 5;
                break;
            case '3':
                num = 7;
                break;
            case '4':
                num = 9;
                break;
            case '5':
                num = 13;
                break;
            case '6':
                num = 15;
                break;
            case '7':
                num = 17;
                break;
            case '8':
                num = 19;
                break;
            case '9':
                num = 21;
                break;
            case 'A':
                num = 1;
                break;
            case 'B':
                num = 0;
                break;
            case 'C':
                num = 5;
                break;
            case 'D':
                num = 7;
                break;
            case 'E':
                num = 9;
                break;
            case 'F':
                num = 13;
                break;
            case 'G':
                num = 15;
                break;
            case 'H':
                num = 17;
                break;
            case 'I':
                num = 19;
                break;
            case 'J':
                num = 21;
                break;
            case 'K':
                num = 2;
                break;
            case 'L':
                num = 4;
                break;
            case 'M':
                num = 18;
                break;
            case 'N':
                num = 20;
                break;
            case 'O':
                num = 11;
                break;
            case 'P':
                num = 3;
                break;
            case 'Q':
                num = 6;
                break;
            case 'R':
                num = 8;
                break;
            case 'S':
                num = 12;
                break;
            case 'T':
                num = 14;
                break;
            case 'U':
                num = 16;
                break;
            case 'V':
                num = 10;
                break;
            case 'W':
                num = 22;
                break;
            case 'X':
                num = 25;
                break;
            case 'Y':
                num = 24;
                break;
            case 'Z':
                num = 23;
                break;
        }
        somma2 = somma2 + num;
    }
    somma = somma1 + somma2;
    var codiceControllo = somma % 26;
    var lettera;
    switch (codiceControllo) {
        case 0:
            lettera = "A";
            break;
        case 1:
            lettera = "B";
            break;
        case 2:
            lettera = "C";
            break;
        case 3:
            lettera = "D";
            break;
        case 4:
            lettera = "E";
            break;
        case 5:
            lettera = "F";
            break;
        case 6:
            lettera = "G";
            break;
        case 7:
            lettera = "H";
            break;
        case 8:
            lettera = "I";
            break;
        case 9:
            lettera = "J";
            break;
        case 10:
            lettera = "K";
            break;
        case 11:
            lettera = "L";
            break;
        case 12:
            lettera = "M";
            break;
        case 13:
            lettera = "N";
            break;
        case 14:
            lettera = "O";
            break;
        case 15:
            lettera = "P";
            break;
        case 16:
            lettera = "Q";
            break;
        case 17:
            lettera = "R";
            break;
        case 18:
            lettera = "S";
            break;
        case 19:
            lettera = "T";
            break;
        case 20:
            lettera = "U";
            break;
        case 21:
            lettera = "V";
            break;
        case 22:
            lettera = "W";
            break;
        case 23:
            lettera = "X";
            break;
        case 24:
            lettera = "Y";
            break;
        case 25:
            lettera = "Z";
            break;
    }
    var persona = cognome + nome + date + comuneOStatoEstero + lettera;
    if (data[3] == false)
        alert("Data impossibile!\n\Ricompilare form con giorno, mese e anno di nascita corretti.");
    else{
        if (comuneOStatoEstero == "")
            alert("Provincia o comune errati!\n\Ricompilare form con provincia e comune corretti.");
        else{
            alert("Il codice fiscale calcolato è il seguente: " + persona);
            document.getElementById("codiceFiscale").innerHTML = "Codice fiscale: " + persona;
        }
    }
}
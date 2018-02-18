/** @license
 * Copyright (c) 2013-2017 Ephox Corp. All rights reserved.
 * This software is provided "AS IS," without a warranty of any kind.
 */
!function(){var a=function(){return{a11y:{widget:{title:"Kontrola zjednodu\u0161enia ovl\xe1dania",running:"Kontroluje sa...",issue:{counter:"Probl\xe9m {0} z {1}",help:"Referencia WCAG 2.0 \u2013 otvor\xed sa v novom okne",none:"Nezistili sa \u017eiadne probl\xe9my so zjednodu\u0161en\xedm ovl\xe1dania"},previous:"Predch\xe1dzaj\xfaci probl\xe9m",next:"Nasleduj\xfaci probl\xe9m",repair:"Opravi\u0165 probl\xe9m",available:"Oprava k dispoz\xedcii",ignore:"Ignorova\u0165"},image:{alttext:{empty:"Obr\xe1zky musia ma\u0165 alternat\xedvny textov\xfd popis",filenameduplicate:"Alternat\xedvny text nesmie by\u0165 rovnak\xfd ako n\xe1zov s\xfaboru obr\xe1zka",set:"Uve\u010fte alternat\xedvny text:",validation:{empty:"Alternat\xedvny text nem\xf4\u017ee by\u0165 pr\xe1zdny",filenameduplicate:"Alternat\xedvny text nem\xf4\u017ee by\u0165 rovnak\xfd ako n\xe1zov s\xfaboru"}}},table:{caption:{empty:"Tabu\u013eky nesm\xfa ma\u0165 titulky",summaryduplicate:"Titulok tabu\u013eky a\xa0zhrnutie nem\xf4\u017eu ma\u0165 rovnak\xfa hodnotu",set:"Uve\u010fte titulok:",validation:{empty:"Titulok nem\xf4\u017ee by\u0165 pr\xe1zdny",summaryduplicate:"Titulok tabu\u013eky nem\xf4\u017ee by\u0165 rovnak\xfd ako zhrnutie tabu\u013eky"}},summary:{empty:"Zlo\u017eit\xe9 tabu\u013eky maj\xfa obsahova\u0165 zhrnutia",set:"Uve\u010fte zhrnutie tabu\u013eky:",validation:{empty:"Zhrnutie nem\xf4\u017ee by\u0165 pr\xe1zdne",captionduplicate:"Zhrnutie tabu\u013eky nem\xf4\u017ee by\u0165 rovnak\xe9 ako titulok tabu\u013eky"}},rowscells:{none:"Prvky tabu\u013eky musia obsahova\u0165 zna\u010dky TR a TD"},headers:{none:"Tabu\u013eky musia ma\u0165 aspo\u0148 jednu hlavi\u010dkov\xfa bunku",set:"Vyberte hlavi\u010dku tabu\u013eky:",validation:{none:"Zvo\u013ete bu\u010f hlavi\u010dku riadka, alebo st\u013apca"}},headerscope:{none:"Hlavi\u010dky tabu\u013eky treba aplikova\u0165 na riadok alebo st\u013apec",set:"Vyberte rozsah hlavi\u010dky:",scope:{row:"Riadok",col:"St\u013apec",rowgroup:"Skupina riadkov",colgroup:"Skupina st\u013apcov"}}},heading:{nonsequential:"Nadpisy musia by\u0165 pou\u017eit\xe9 v\xa0postupnom porad\xed. Napr\xedklad: po nadpise 1 m\xe1 nasledova\u0165 nadpis 2, nie nadpis 3.",paragraphmisuse:"Tento odsek vyzer\xe1 ako nadpis. Ak je to nadpis, zvo\u013ete \xfarove\u0148 nadpisu.",set:"Zvo\u013ete \xfarove\u0148 nadpisu:"},link:{adjacent:"Susedn\xe9 prepojenia s\xa0rovnakou adresou URL treba zl\xfa\u010di\u0165 do jedn\xe9ho prepojenia"},list:{paragraphmisuse:"Zvolen\xfd text sa zd\xe1 by\u0165 zoznamom. Zoznamy treba form\xe1tova\u0165 pomocou zna\u010dky zoznamu."},contrast:{smalltext:"Text mus\xed ma\u0165 kontrastn\xfd pomer aspo\u0148 4,5 : 1",largetext:"Ve\u013ek\xfd text mus\xed ma\u0165 kontrastn\xfd pomer aspo\u0148 3 : 1"},severity:{error:"Chyba",warning:"Upozornenie",info:"Informat\xedvne"}},aria:{autocorrect:{announce:"Automatick\xe9 opravy {0}"},label:{toolbar:"Panel s n\xe1strojmi editora textu typu rich-text",editor:"Editor textu typu rich-text Textbox.io \u2013 {0}",fullscreen:"Editor textu typu rich-text Textbox.io na cel\xfa obrazovku \u2013 {0}",content:"Upravite\u013en\xfd obsah",more:"Kliknut\xedm zbali\u0165 alebo rozbali\u0165"},help:{mac:"Ak potrebujete pomoc, stla\u010dte \u2303\u2325H",ctrl:"Ak potrebujete pomoc, stla\u010dte CTRL SHIFT H"},color:{picker:"V\xfdber farieb",menu:"Ponuka v\xfdberu farieb"},font:{color:"Farby textu",highlight:"Farby zv\xfdraznenia",palette:"Farebn\xe1 paleta"},context:{menu:{generic:"Kontextov\xe1 ponuka"}},stepper:{input:{invalid:"Hodnota ve\u013ekosti je neplatn\xe1"}},table:{headerdescription:"Na aktiv\xe1ciu nastavenia stla\u010dte medzern\xedk. Na n\xe1vrat k\xa0v\xfdberu tabuliek stla\u010dte tabul\xe1tor.",cell:{border:{size:"Ve\u013ekos\u0165 or\xe1movania"}}},input:{invalid:"Neplatn\xfd vstup"},widget:{navigation:"Na navig\xe1ciu pou\u017eite kl\xe1vesy so \u0161\xedpkami."},image:{crop:{size:"Ve\u013ekos\u0165 orezania je {0} pixelov na {1} pixelov"}}},color:{white:"Biela",black:"\u010cierna",gray:"Siv\xe1",metal:"Kovov\xe1",smoke:"Dymov\xe1",red:"\u010cerven\xe1",darkred:"Tmavo\u010derven\xe1",darkorange:"Tmavooran\u017eov\xe1",orange:"Oran\u017eov\xe1",yellow:"\u017dlt\xe1",green:"Zelen\xe1",darkgreen:"Tmavozelen\xe1",mediumseagreen:"Morsk\xe1 zelen\xe1",lightgreen:"Svetlozelen\xe1",lime:"Limetkov\xe1",mediumblue:"Stredne modr\xe1",navy:"N\xe1morn\xedcka modr\xe1",blue:"Modr\xe1",lightblue:"Svetlomodr\xe1",violet:"Fialov\xe1"},directionality:{rtldir:"Smer sprava do\u013eava",ltrdir:"Smer z\u013eava doprava"},parlance:{menu:"Ponuka jazykov",set:"Nastavi\u0165 jazyk",ar:"arab\u010dina",ca:"katal\xe1n\u010dina",zh_cn:"\u010d\xedn\u0161tina (zjednodu\u0161en\xe1)",zh_tw:"\u010d\xedn\u0161tina (tradi\u010dn\xe1)",hr:"chorv\xe1t\u010dina",cs:"\u010de\u0161tina",da:"d\xe1n\u010dina",nl:"holand\u010dina",en:"angli\u010dtina",en_au:"angli\u010dtina (Austr\xe1lia)",en_ca:"angli\u010dtina (Kanada)",en_gb:"angli\u010dtina (Spojen\xe9 kr\xe1\u013eovstvo)",en_us:"angli\u010dtina (Spojen\xe9 \u0161t\xe1ty)",fa:"perz\u0161tina",fi:"f\xedn\u010dina",fr:"franc\xfaz\u0161tina",fr_ca:"franc\xfaz\u0161tina (Kanada)",de:"nem\u010dina",el:"gr\xe9\u010dtina",he:"hebrej\u010dina",hu:"ma\u010far\u010dina",it:"talian\u010dina",ja:"japon\u010dina",kk:"kaza\u0161tina",ko:"k\xf3rej\u010dina",no:"n\xf3r\u010dina",pl:"po\u013e\u0161tina",pt_br:"portugal\u010dina (Braz\xedlia)",pt_pt:"portugal\u010dina (Portugalsko)",ro:"rumun\u010dina",ru:"ru\u0161tina",sk:"sloven\u010dina",sl:"slovin\u010dina",es:"\u0161paniel\u010dina",es_419:"\u0161paniel\u010dina (Latinsk\xe1 Amerika)",es_es:"\u0161paniel\u010dina (\u0160panielsko)",sv:"\u0161v\xe9d\u010dina",tt:"tat\xe1r\u010dina",th:"thaj\u010dina",tr:"ture\u010dtina",uk:"ukrajin\u010dina"},taptoedit:"Klepnut\xedm upravi\u0165",plaincode:{dialog:{title:"Zobrazenie k\xf3du",editor:"Editor zdroja HTML"}},help:{dialog:{accessibility:"Navig\xe1cia pomocou kl\xe1vesnice",a11ycheck:"Kontrola zjednodu\u0161enia ovl\xe1dania",about:"O textovom poli.io",markdown:"Form\xe1tovanie Markdown",shortcuts:"Kl\xe1vesov\xe9 skratky"}},spelling:{context:{more:"Viac",morelabel:"Ved\u013eaj\u0161ia ponuka s \u010fal\u0161\xedmi mo\u017enos\u0165ami pravopisu"},none:"\u017diadne",menu:"Pravopis pod\u013ea jazyka"},specialchar:{open:"\u0160peci\xe1lny znak",dialog:"Vlo\u017ei\u0165 \u0161peci\xe1lny znak",latin:"Latinka",insert:"Vlo\u017ei\u0165",punctuation:"Interpunkcia",currency:"Meny","extended-latin-a":"Roz\u0161\xedren\xe1 latinka A","extended-latin-b":"Roz\u0161\xedren\xe1 latinka B",arrows:"\u0160\xedpky",mathematical:"Matematick\xe9",miscellaneous:"R\xf4zne",selects:"Vybrat\xe9 znaky",grid:"\u0160peci\xe1lne znaky"},insert:{"menu-button":"Ponuka vkladania",menu:"Vlo\u017ei\u0165",link:"Prepojenie",image:"Obr\xe1zok",table:"Tabu\u013eka",horizontalrule:"Vodorovn\xe1 \u010diara",media:"M\xe9dium"},media:{embed:"Vkladac\xed k\xf3d m\xe9dia",insert:"Vlo\u017ei\u0165",placeholder:"Prilepi\u0165 vkladac\xed k\xf3d sem."},wordcount:{open:"Po\u010det slov",dialog:"Po\u010det slov",counts:"Po\u010det",selection:"V\xfdber",document:"Dokument",characters:"Znaky",charactersnospaces:"Znaky (bez medzier)",words:"Slov\xe1"},list:{unordered:{menu:"Mo\u017enosti nezoraden\xe9ho zoznamu",default:"Predvo\u013eba \u2013 nezoraden\xe9",circle:"Kruh \u2013 nezoraden\xe9",square:"\u0160tvorec \u2013 nezoraden\xe9",disc:"Disk \u2013 nezoraden\xe9"},ordered:{menu:"Mo\u017enosti zoraden\xe9ho zoznamu",default:"Predvo\u013eba \u2013 zoraden\xe9",decimal:"Desatinn\xe1 \u010diarka \u2013 zoraden\xe9","upper-alpha":"Ve\u013ek\xe9 p\xedsmen\xe1 abecedy \u2013 zoraden\xe9","lower-alpha":"Mal\xe9 p\xedsmen\xe1 abecedy \u2013 zoraden\xe9","upper-roman":"Ve\u013ek\xe9 r\xedmske znaky \u2013 zoraden\xe9","lower-roman":"Mal\xe9 r\xedmske znaky \u2013 zoraden\xe9","lower-greek":"Ve\u013ek\xe9 gr\xe9cke znaky \u2013 zoraden\xe9"}},tag:{inline:{class:"span ({0})"},img:"obr\xe1zok"},block:{normal:"Norm\xe1lne",p:"Odstavec",h1:"Nadpis 1",h2:"Nadpis 2",h3:"Nadpis 3",h4:"Nadpis 4",h5:"Nadpis 5",h6:"Nadpis 6",div:"Div",pre:"Pre",li:"Polo\u017eka zo zoznamu",td:"Bunka",th:"Bunka hlavi\u010dky",styles:"Ponuka \u0161t\xfdlov",dropdown:"Bloky",describe:"Aktu\xe1lny \u0161t\xfdl {0}",menu:"\u0160t\xfdly",label:{inline:"Vlo\u017een\xe9 \u0161t\xfdly",table:"\u0160t\xfdly tabuliek",line:"\u0160t\xfdly \u010diar",media:"\u0160t\xfdly m\xe9di\xed",list:"\u0160t\xfdly zoznamov",link:"\u0160t\xfdly prepojen\xed"}},font:{"menu-button":"Menu p\xedsma",menu:"Typ p\xedsma",face:"Rez p\xedsma",size:"Ve\u013ekos\u0165 p\xedsma",coloroption:"Farba",describe:"Aktu\xe1lne p\xedsmo {0}",color:"Text",highlight:"Zv\xfdraznenie",stepper:{input:"Nastavenie ve\u013ekosti p\xedsma",increase:"Zv\xe4\u010d\u0161enie ve\u013ekosti p\xedsma",decrease:"Zmen\u0161enie ve\u013ekosti p\xedsma"}},cog:{"menu-button":"Ponuka nastaven\xed",menu:"Nastavenia",spellcheck:"Kontrola pravopisu",capitalisation:"Ve\u013ek\xe9 p\xedsmen\xe1",autocorrect:"Automatick\xe9 opravy",linkpreviews:"Uk\xe1\u017eky prepojen\xed",help:"Pomocn\xedk"},alignment:{toolbar:"Ponuka zarovnania",menu:"Zarovnanie",left:"Zarovna\u0165 do\u013eava",center:"Zarovna\u0165 na stred",right:"Zarovna\u0165 doprava",justify:"Zarovna\u0165 pod\u013ea okrajov",describe:"Aktu\xe1lne zarovnanie {0}"},category:{language:"Skupina jazykov",undo:"Skupina \xfakonov Sp\xe4\u0165 a Znova",insert:"Skupina pre vkladanie",style:"Skupina \u0161t\xfdlov",emphasis:"Skupina form\xe1tovania",align:"Skupina zarovnania",listindent:"Skupina zoznamu a zar\xe1\u017eky",format:"Skupina p\xedsma",tools:"Skupina n\xe1strojov",table:"Skupina tabuliek",image:"Skupina \xfaprav obr\xe1zku"},action:{undo:"Sp\xe4\u0165",redo:"Znova",bold:"Tu\u010dn\xe9",italic:"Kurz\xedva",underline:"Pod\u010diarknut\xe9",strikethrough:"Pre\u010diarknut\xe9",subscript:"Doln\xfd index",superscript:"Horn\xfd index",removeformat:"Odstr\xe1ni\u0165 form\xe1tovanie",bullist:"Nezoraden\xfd zoznam",numlist:"Zoraden\xfd zoznam",indent:"Zv\xe4\u010d\u0161i\u0165 zar\xe1\u017eku",outdent:"Zmen\u0161i\u0165 zar\xe1\u017eku",blockquote:"Blockquote",fullscreen:"Cel\xe1 obrazovka",search:"Dial\xf3gov\xe9 okno N\xe1js\u0165 a nahradi\u0165",a11ycheck:"Skontrolova\u0165 zjednodu\u0161enie ovl\xe1dania",toggle:{fullscreen:"Skon\u010di\u0165 re\u017eim celej obrazovky"}},table:{menu:"Vlo\u017ei\u0165 tabu\u013eku","column-header":"St\u013apec hlavi\u010dky","row-header":"Riadok hlavi\u010dky",float:"Pl\xe1vaj\xface zarovnanie",cell:{color:{border:"Farba or\xe1movania",background:"Farba pozadia"},border:{width:"\u0160\xedrka or\xe1movania",stepper:{input:"Nastavi\u0165 \u0161\xedrku or\xe1movania",increase:"Zv\xe4\u010d\u0161i\u0165 \u0161\xedrku or\xe1movania",decrease:"Zmen\u0161i\u0165 \u0161\xedrku or\xe1movania"}}},context:{row:{title:"Ved\u013eaj\u0161ia ponuka riadka",menu:"Riadok",insertabove:"Vlo\u017ei\u0165 nad",insertbelow:"Vlo\u017ei\u0165 pod"},column:{title:"Ved\u013eaj\u0161ia ponuka st\u013apca",menu:"St\u013apec",insertleft:"Vlo\u017ei\u0165 na\u013eavo",insertright:"Vlo\u017ei\u0165 napravo"},cell:{merge:"Zl\xfa\u010di\u0165 bunky",unmerge:"Rozdeli\u0165 bunku","split-cols":"Rozdeli\u0165 na st\u013apce","split-rows":"Rozdeli\u0165 na riadky"},table:{title:"Ved\u013eaj\u0161ia ponuka tabu\u013eky",menu:"Tabu\u013eka",properties:"Vlastnosti",delete:"Odstr\xe1ni\u0165"},common:{delete:"Odstr\xe1ni\u0165",normal:"Nastavi\u0165 ako norm\xe1lne",header:"Nastavi\u0165 ako hlavi\u010dku"},palette:{show:"Mo\u017enosti \xfaprav tabu\u013eky s\xfa dostupn\xe9 na paneli s n\xe1strojmi",hide:"Mo\u017enosti \xfaprav tabu\u013eky u\u017e nie s\xfa dostupn\xe9"}},picker:{header:"Nastavi\u0165 hlavi\u010dku",label:"V\xfdber tabuliek",describepicker:"Na nastavenie ve\u013ekosti tabu\u013eky pou\u017eite \u0161\xedpky.  Na prechod k nastaveniam hlavi\u010dky tabu\u013eky stla\u010dte tabul\xe1tor. Na vlo\u017eenie tabu\u013eky stla\u010dte medzern\xedk alebo kl\xe1ves Enter.",rows:"{0} na v\xfd\u0161ku",cols:"{0} na \u0161\xedrku"},border:"Or\xe1movanie",summary:"Zhrnutie",dialog:"Vlastnosti tabu\u013eky",caption:"Popis tabu\u013eky",width:"\u0160\xedrka",height:"V\xfd\u0161ka"},align:{none:"Bez zarovnania",center:"Zarovna\u0165 na stred",left:"Zarovna\u0165 do\u013eava",right:"Zarovna\u0165 doprava"},button:{ok:"OK",cancel:"Zru\u0161i\u0165",close:"Zru\u0161i\u0165 dial\xf3gov\xe9 okno"},banner:{close:"Zatvori\u0165 banner"},border:{on:"Zapn\xfa\u0165",off:"Vypn\xfa\u0165",labels:{on:"Or\xe1movanie zapnut\xe9",off:"Or\xe1movanie vypnut\xe9"}},loading:{wait:"\u010cakajte, pros\xedm"},toolbar:{more:"Viac",backbutton:"Nasp\xe4\u0165","switch-code":"Prepn\xfa\u0165 na zobrazenie k\xf3du","switch-pencil":"Prepn\xfa\u0165 na zobrazenie dizajnu"},link:{context:{edit:"Upravi\u0165 prepojenie",follow:"Otvori\u0165 prepojenie",ignore:"Ignorova\u0165 nefunk\u010dn\xe9 prepojenie",remove:"Odstr\xe1ni\u0165 prepojenie"},dialog:{aria:{update:"Aktualizova\u0165 prepojenie",insert:"Vlo\u017ei\u0165 prepojenie",properties:"Vlastnosti prepojenia",quick:"R\xfdchle mo\u017enosti"},autocomplete:{open:"Zoznam automatick\xe9ho dokon\u010dovania prepojen\xed je dostupn\xfd. Pokra\u010dujte v\xa0p\xedsan\xed alebo pou\u017eite kl\xe1vesy nahor a\xa0nadol na v\xfdber n\xe1vrhov.",close:"Zoznam automatick\xe9ho dokon\u010dovania prepojen\xed je zatvoren\xfd",accept:"Zvolen\xfd n\xe1vrh prepojenia {0}"},edit:"Upravi\u0165",remove:"Odstr\xe1ni\u0165",preview:"Uk\xe1\u017eka",update:"Aktualizova\u0165",insert:"Vlo\u017ei\u0165",tooltip:"Prepojenie"},properties:{dialog:{title:"Vlastnosti prepojenia"},text:{label:"Text na zobrazenie",placeholder:"Nap\xed\u0161te alebo prilepte zobrazen\xfd text"},url:{label:"Adresa URL alebo z\xe1lo\u017eka",placeholder:"Vlo\u017ei\u0165 adresu URL alebo z\xe1lo\u017eku",invalid:"Va\u0161a adresa URL m\xf4\u017ee by\u0165 nespr\xe1vna"},title:{label:"Nadpis",placeholder:"Nap\xed\u0161te alebo prilepte n\xe1zov prepojenia"},button:{remove:"Odstr\xe1ni\u0165"},target:{label:"Cie\u013e",none:"\u017diadne",blank:"Nov\xe9 okno",top:"Cel\xe1 strana",self:"Rovnak\xfd r\xe1m",parent:"Nadraden\xfd r\xe1m"}},anchor:{top:"Hlavi\u010dka dokumentu",bottom:"P\xe4ta dokumentu"}},fileupload:{title:"Vlo\u017ei\u0165 obr\xe1zky",tablocal:"Lok\xe1lne s\xfabory",tabweburl:"Webov\xe1 adresa URL",dropimages:"Pusti\u0165 obr\xe1zky sem",chooseimage:"Vybra\u0165 obr\xe1zok na odovzdanie",web:{url:"Adresa URL webov\xe9ho obr\xe1zka:"},weburlhelp:"Vp\xed\u0161te adresu URL na zobrazenie obr\xe1zku. Zobrazenie ve\u013ek\xfdch obr\xe1zkov m\xf4\u017ee trva\u0165 dlh\u0161ie.",invalid1:"Na pou\u017eitej adrese URL sa nena\u0161iel \u017eiadny obr\xe1zok.",invalid2:"Skontrolujte, \u010di v adrese URL nie s\xfa preklepy.",invalid3:"Uistite sa, \u010di je obr\xe1zok, ku ktor\xe9mu chcete z\xedska\u0165 pr\xedstup, verejn\xfd a\xa0\u010di nie je chr\xe1nen\xfd heslom alebo \u010di sa nenach\xe1dza na s\xfakromnej sieti."},image:{context:{properties:"Vlastnosti obr\xe1zka",palette:{show:"Mo\u017enosti \xfaprav obr\xe1zka s\xfa dostupn\xe9 na paneli s n\xe1strojmi",hide:"Mo\u017enosti \xfaprav obr\xe1zka u\u017e nie s\xfa dostupn\xe9"}},dialog:{title:"Vlastnosti obr\xe1zka",fields:{align:"Pl\xe1vaj\xface zarovnanie",url:"Adresa URL",urllocal:"Obr\xe1zok e\u0161te nie je ulo\u017een\xfd",alt:"Alternat\xedvny text",width:"\u0160\xedrka",height:"V\xfd\u0161ka",constrain:{label:"Obmedzi\u0165 pomery str\xe1n",on:"Zamknut\xe9 pomery str\xe1n",off:"Odomknut\xe9 pomery str\xe1n"}}},menu:"Vlo\u017ei\u0165 obr\xe1zok","menu-button":"Ponuka vkladania obr\xe1zkov","from-url":"Webov\xe1 adresa URL","from-camera":"Z fotoapar\xe1tu",toolbar:{rotateleft:"Oto\u010di\u0165 do\u013eava",rotateright:"Oto\u010di\u0165 doprava",fliphorizontal:"Prevr\xe1ti\u0165 vodorovne",flipvertical:"Prevr\xe1ti\u0165 zvisle",properties:"Vlastnosti obr\xe1zka"},crop:{announce:"Otvorenie rozhrania orezania. Pre pou\u017eitie stla\u010dte kl\xe1ves Enter, pre zru\u0161enie kl\xe1ves Esc.",cancel:"Zru\u0161enie oper\xe1cie orezania.",begin:"Oreza\u0165 obr\xe1zok",apply:"Pou\u017ei\u0165 orezanie",handle:{nw:"\u013dav\xfd horn\xfd popisova\u010d orezania",ne:"Prav\xfd horn\xfd popisova\u010d orezania",se:"Prav\xfd doln\xfd popisova\u010d orezania",sw:"\u013dav\xfd doln\xfd popisova\u010d orezania",shade:"Maska orezania"}}},units:{"amount-of-total":"{0} z {1}"},search:{menu:"N\xe1js\u0165 a nahradi\u0165",field:{replace:"Pole nahradenia",search:"Pole vyh\u013eadania"},search:"Vyh\u013eada\u0165",previous:"Predch\xe1dzaj\xface",next:"Nasleduj\xface",replace:"Nahradi\u0165","replace-all":"Nahradi\u0165 v\u0161etko",matchcase:"Rozli\u0161ova\u0165 mal\xe9 a VE\u013dK\xc9 p\xedsmen\xe1"},mentions:{initiated:"Vytvoren\xe1 zmienka, pokra\u010dujte v p\xedsan\xed pre \u010fal\u0161\xed typ",lookahead:{open:"Pole so zoznamom s automatick\xfdm dokon\u010dovan\xedm",cancelled:"Zru\u0161en\xe1 zmienka",searching:"Vyh\u013ead\xe1vanie v\xfdsledkov",selected:"Vlo\u017een\xe1 zmienka {0}",noresults:"\u017diadne v\xfdsledky"}},cement:{dialog:{paste:{title:"Mo\u017enosti form\xe1tovania prilepenia",instructions:"Vyberte, \u010di chcete ponecha\u0165 alebo odstr\xe1ni\u0165 form\xe1tovanie v\xa0prilepovanom obsahu.",merge:"Ponecha\u0165 form\xe1tovanie",clean:"Odstr\xe1ni\u0165 form\xe1tovanie"},flash:{title:"Import lok\xe1lneho obr\xe1zka","trigger-paste":"Spustite funkciu prilepenia z kl\xe1vesnice e\u0161te raz a prilepte obsah s obr\xe1zkami.",missing:'Na import obr\xe1zkov z programu Microsoft Office je potrebn\xfd doplnok Adobe Flash. Nain\u0161talujte prehr\xe1va\u010d <a href="http://get.adobe.com/flashplayer/" target="_blank">Adobe Flash Player</a>.',"press-escape":'Stla\u010den\xedm <span class="ephox-polish-help-kbd">ESC</span> ignorujte lok\xe1lne obr\xe1zky a\xa0pokra\u010dujte v\xa0\xfaprav\xe1ch.'}}},cloud:{error:{apikey:"V\xe1\u0161 k\u013e\xfa\u010d API je neplatn\xfd.",domain:"V\xe1\u0161 k\u013e\xfa\u010d API nepodporuje va\u0161u dom\xe9nu ({0}).",plan:"Prekro\u010dili ste po\u010det prevzat\xed editora dostupn\xfd na va\u0161om pl\xe1ne. Pre inov\xe1ciu nav\u0161t\xedvte webov\xfa str\xe1nku."},dashboard:"Prejdite na tabu\u013eu spr\xe1vcu"},errors:{paste:{notready:"Funkcia importu z programu Word sa nena\u010d\xedtala. Po\u010dkajte a sk\xfaste to znova.",generic:"Pri prilepovan\xed obsahu sa vyskytla chyba."},toolbar:{missing:{custom:{string:"Vlastn\xe9 pr\xedkazy musia ma\u0165 vlastnos\u0165 \u201e{0}\u201c a mus\xed to by\u0165 re\u0165azec"}},invalid:"Konfigur\xe1cia pre panel s n\xe1strojmi je neplatn\xe1 ({0}). Podrobnosti n\xe1jdete v konzole."},spelling:{missing:{service:"Funkcia kontroly pravopisu sa nena\u0161la: ({0})."}},images:{edit:{needsproxy:"Na \xfapravu obr\xe1zkov z tejto dom\xe9ny je potrebn\xfd proxy: ({0})",proxyerror:"Nie je mo\u017en\xe9 komunikova\u0165 s proxy pre \xfapravu tohto obr\xe1zka. Podrobnosti n\xe1jdete v konzole.",generic:"Pri vykon\xe1van\xed oper\xe1cie \xfapravy obr\xe1zka sa vyskytla chyba. Podrobnosti n\xe1jdete v konzole."},disallowed:{local:"Funkcia vlo\u017eenia lok\xe1lneho obr\xe1zka je vypnut\xe1. Lok\xe1lne obr\xe1zky boli odstr\xe1nen\xe9 z vlo\u017een\xe9ho obsahu.",dragdrop:"Funkcia presunu my\u0161ou je vypnut\xe1."},upload:{unknown:"Obr\xe1zok sa nepodarilo nahra\u0165",invalid:"Nie v\u0161etky s\xfabory boli spracovan\xe9 \u2013 niektor\xe9 neboli platn\xe9 obr\xe1zky",failed:"Obr\xe1zok sa nepodarilo nahra\u0165: ({0}).",cors:"Nebolo mo\u017en\xe9 spoji\u0165 sa so slu\u017ebou odovzdania obr\xe1zka. Mo\u017en\xe1 chyba CORS: ({0})"},missing:{service:"Funkcia obr\xe1zkov sa nena\u0161la: ({0}).",flash:"Nastavenia zabezpe\u010denia preh\u013ead\xe1va\u010da m\xf4\u017eu br\xe1ni\u0165 v\xa0importovan\xed obr\xe1zkov."},import:{failed:"Niektor\xe9 obr\xe1zky sa nepodarilo importova\u0165.",unsupported:"Nepodporovan\xfd typ obr\xe1zka.",invalid:"Obr\xe1zok je neplatn\xfd."}},webview:{image:"Priamo kop\xedrovan\xe9 obr\xe1zky nie je mo\u017en\xe9 prilepi\u0165."},safari:{image:"Preh\u013ead\xe1va\u010d Safari nepodporuje priame priliepanie obr\xe1zkov.",url:"Navrhovan\xe9 rie\u0161enia",rtf:"Zisti\u0165 ako","browser-settings":"Na prilepenie obr\xe1zkov zme\u0148te nastavenia svojho prehliada\u010da."},flash:{crashed:"Obr\xe1zky sa neimportovali, preto\u017ee Adobe Flash pravdepodobne zlyhal. M\xf4\u017ee to by\u0165 sp\xf4soben\xe9 vlo\u017een\xedm ve\u013ek\xfdch dokumentov."},http:{400:"Nespr\xe1vna po\u017eiadavka: {0}",401:"Neopr\xe1vnen\xe9: {0}",403:"Zak\xe1zan\xe9: {0}",404:"Nen\xe1jden\xe9: {0}",407:"Po\u017eaduje sa overenie servera proxy: {0}",409:"Konflikt s\xfaborov: {0}",413:"D\xe1tov\xfd obsah je pr\xedli\u0161 ve\u013ek\xfd: {0}",415:"Nepodporovan\xfd typ m\xe9dia: {0}",500:"Vn\xfatorn\xe1 chyba servera: {0}",501:"Neimplementovan\xe9: {0}"}}}},b=function(a,b){var c=a.src.indexOf("?");return a.src.indexOf(b)+b.length===c},c=function(a){for(var b=a.split("."),c=window,d=0;d<b.length&&void 0!==c&&null!==c;++d)c=c[b[d]];return c},d=function(a,b){if(a){var d=a.getAttribute("data-main");if(d){a.removeAttribute("data-main");var e=c(d);if("function"==typeof e)return e;console.warn("attribute on "+b+" does not reference a global method")}else console.warn("no data-main attribute found on "+b+" script tag")}};!function(a,c){var e=d(document.currentScript,c);if(e)return e;for(var f=document.getElementsByTagName("script"),g=0;g<f.length;g++)if(b(f[g],a)){var h=d(f[g],c);if(h)return h}throw"cannot locate "+c+" script tag"}("tbio_sk.js","strings for language sk")({version:"2.3.0",strings:a})}();
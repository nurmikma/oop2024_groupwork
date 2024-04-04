Markus Nurmik ja Mihkel Maspanov

Projekti eesmärk on luua autorendisüsteem. Meie programm võimaldab kasutajal sisestada vajalikud andmed rendipäringu tegemiseks. Sõltuvalt sisestatud andmetest kuvatakse saadaval olevad autod, mille hulgast kasutaja saab valida sobiva. Samuti näeb kasutaja oma rendi maksumust ning pärast autot välja laenutamist pole seda enam laenutamiseks saadaval.

Klassid (eesmärk ja olulised meetodid):

Andmetöötleja: Meetod loeAutod võimaldab lugeda autorendifailist sisse vajalikud andmed ja koostab mugavaks kasutamiseks vastavad listid, mis seejärel lisatakse sõnastikku.

Broneering: Määratakse vastavad muutujad.

Kaubik: Masina alamklass, meetod rendiMaksumus arvutab rendi maksumuse vastavalt renditud päevade arvule ja rentija määratud rendihinnale.

Lisavarustus: Tulevaseks arenduseks.

Main: Küsime kasutajalt vajalikud andmed, väljastame vastavalt autotüübile saadaval olevad autod ja lõpuks saab kasutaja auto laenutada. Meetod soodus rakendab igale autole juhuslikku soodustust.

Masin: Põhiklass, kus määratakse muutujad. Abstraktne meetod rendiMaksumus kohandatakse vastavalt autole.

PremiumSõiduauto: Masina alamklass, meetod rendimaksumus arvutab rendimaksumuse.

RendiSüsteem: Meetod broneeriAuto võimaldab autot broneerida, võttes auto, kliendi nime ja rendiaja ning lisades selle broneeringute listi.

Rentija: Määratakse vastavad muutujad.

TavalineSõiduauto: Masina alamklass, meetod rendiMaksumus arvutab rendimaksumuse.

Meie protsess sai alguse idee väljatöötamisega. Iseseisvalt mõtlesime välja mitu ideed ja kirjutasime need lühidalt lahti. Kokku saades valisime parima idee. Teise etapina koostasime esialgse plaani (erinevad klassid ja sobivad meetodid). Kolmandas etapis kirjutasime funktsioone ja katsetasime programmi. Arendustegevust koordineerisime GitHubis. Mõlemad osalesime aktiivselt.

Tööjaotus:

Markus Nurmik: Mõtles idee välja, kirjutas andmetöötluse baasi ja main meetodi loopi. Orientatsiooniline ajakulu oli 10 tundi.

Mihkel Maspanov: Kirjutas meetodite funktsioonid ja viimistles andmetöötluse meetodit. Orientatsiooniline ajakulu oli 10 tundi.

Muresid ei tekkinud. Kui oleksime varem alustanud, oleksime saanud rohkem aega viimistleda ja projektiga keerukamalt tegeleda. Mõte on sama projekti edasi arendada järgmistes rühmatöödes. Arvame, et saime hästi hakkama. Jätkates arendust, võiksime näiteks luua renditeenuse pakkujatele liidese, et nad saaksid päringuid teha või siis parandada kliendi osa kasutajaliidest. Hetkel pole veel täpsemalt edasi mõelnud. Testisime, et programm kompileeruks, lõime eraldi objektid ja kontrollisime, kas väljundid on korrektsed ning saadavus muutub false-ks, kui auto on renditud, ja true-ks, kui see tagastatakse. Märkus: Meil on mõned kasutamata meetodid, mida kavatseme rakendada järgnevates arendusetappides. Tulevikus salvestame rentija ja renditava auto objekti, et kui auto tagastatakse, saaksime saadavust uuesti true-ks muuta.

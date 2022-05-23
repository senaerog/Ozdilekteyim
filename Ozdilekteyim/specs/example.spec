Getting Started with Gauge
==========================

This is an executable specification file. This file follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.
To execute this specification, use `mvn test`

Search
--------
* "5" kadar bekle
* "com.ozdilek.ozdilekteyim:id/tv_startShoppingStore" id' li elemente tıkla
* Kategoriler sayfasi "//*[@resource-id='com.ozdilek.ozdilekteyim:id/nav_categories']" xpath'li elemente tıkla
* "3" kadar bekle
* Menuden Kadin secenegine tikla "//*[@resource-id='com.ozdilek.ozdilekteyim:id/relLayCategoriesItem'][2]" xpath'li elemente tıkla
* "3" kadar bekle
* Pantolon Kategorisi Acilir  "//*[@resource-id='com.ozdilek.ozdilekteyim:id/relLayCategoriesItem'][10]" xpath'li elemente tıkla
* "3" kadar bekle
*Sayfayı yukarı kaydır
*"3" kadar bekle
*Sayfayı yukarı kaydır
* "3" kadar bekle
* Urunlerden rasgele Urun Secilir
* "3" kadar bekle
*Favoriler butonuna tıklanir  "//*[@resource-id='com.ozdilek.ozdilekteyim:id/imgFav']" xpath'li elemente tıkla
* "3" kadar bekle
* "com.ozdilek.ozdilekteyim:id/etEposta" id ile  "seleniumprojemail@gmail.com" degerini yaz
* "com.ozdilek.ozdilekteyim:id/etPassword" id ile  "p@$$w0rd..!" degerini yaz
* "com.ozdilek.ozdilekteyim:id/btnLogin" id' li elemente tıkla
* "5" kadar bekle
*Geri Tıklama
* "3" kadar bekle
*Geri Tıklama
* "3" kadar bekle
* Urunlerden rasgele Urun Secilir
* "3" kadar bekle
* "com.ozdilek.ozdilekteyim:id/tvInSizeItem" id' li elemente tıkla
* "3" kadar bekle
*"com.ozdilek.ozdilekteyim:id/relLayAddCartBtn" id' li elemente tıkla

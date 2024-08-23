
# Contacts APP

Bu proje, telefon rehberi uygulamasıdır ve kullanıcıların istedikleri kişilerin iletişim bilgilerini kolayca kaydetmelerini, güncellemelerini ve silmelerini sağlar. Kullanıcılar, isim, telefon numarası gibi bilgileri uygulama aracılığıyla düzenli bir şekilde yönetebilir. Uygulama, kullanıcıların kişisel rehberlerini dijital ortamda düzenlemelerine ve yönetmelerine yardımcı olur; böylece iletişim bilgileri her zaman erişilebilir ve güncel kalır.


## Özellikler

- Kullanıcılar, telefon rehberlerine yeni kişiler ekleyebilirler. Her kişi için isim, telefon numarası gibi temel bilgileri girerek rehberlerine kolayca bilgi ekleyebilirler.
- Kullanıcılar, rehberdeki kişilerin bilgilerini güncelleyebilirler. İsim, telefon numarası veya diğer detaylarda değişiklik yaparak her zaman güncel bilgilerle rehberlerini koruyabilirler.
- Kullanıcılar, rehberlerinden istemedikleri kişileri kolayca silebilirler. Bu sayede gereksiz veya eski iletişim bilgilerini kaldırarak rehberlerini temiz tutabilirler.
- Tüm iletişim bilgileri internet üzerinde güvenli bir veri tabanında saklanır. Bu, verilerinizi her zaman erişilebilir ve güvende tutar.

## Kullanılan Teknolojiler

**Android Jetpack**

**Retrofit:**

Açıklama: HTTP isteklerini basit bir şekilde yönetmek için kullanılan bir kütüphane.
Projede Kullanım Amacı: API çağrılarını gerçekleştirmek ve JSON verilerini Kotlin veri sınıflarına dönüştürmek. Hem GET (veri çekme) hem de POST (veri gönderme) işlemleri yapılır.

**RecyclerView:**

Açıklama: Liste ve grid düzenlerinde veri göstermek için kullanılan bir bileşen.
Projede Kullanım Amacı: Dinamik veri listelerini verimli bir şekilde göstermek.

**Navigation Component:**

Açıklama: Uygulama içindeki navigasyonu yönetmek için kullanılan bir kütüphanedir.
Projede Kullanım Amacı: Fragmentler arasında geçişleri kolaylaştırır ve yönlendirme işlemlerini yönetir.

**Snackbar:**

Açıklama: Kısa süreli bildirimler göstermek için kullanılan bir bileşendir.
Projede Kullanım Amacı: Kullanıcılara geçici bilgi veya işlem sonuçları hakkında geri bildirim sağlamak.

**Data Binding:**

Açıklama: XML'deki UI bileşenlerini veri modelleri ile bağlamak için kullanılan bir kütüphanedir.
Projede Kullanım Amacı: UI güncellemelerini otomatikleştirmek ve boilerplate kodunu azaltmak.

**Serializable:**

Açıklama: Kotlin sınıflarını veri iletimi için serileştirmek için kullanılan bir arayüzdür.
Projede Kullanım Amacı: Nesneleri Parcelable veya Serializable olarak geçirebilmek.

**Dagger-Hilt:**

Açıklama: Dependency Injection için Hilt kütüphanesi.
Projede Kullanım Amacı: Daha basit ve etkili bir DI çözümü sağlar, uygulamanın bağımlılıklarını yönetir.

**CardView:**

Açıklama: Kart şeklinde bir görünüm sağlayan UI bileşenidir.
Projede Kullanım Amacı: Bilgiyi kart şeklinde düzenli ve estetik bir şekilde göstermek.

**FormUrlEncoded:**

Açıklama: POST isteği ile form verilerini göndermek için kullanılan bir format.
Projede Kullanım Amacı: API'ye form verilerini göndermek için kullanılır.

**MVVM (Model-View-ViewModel):**

**Data Layer:**

Projede Kullanım Amacı: Uygulama verilerini ve iş mantığını yönetir. Repository ve DataSource gibi bileşenlerle veri işlemleri yapılır.

**UI Layer:**

Projede Kullanım Amacı: Kullanıcı arayüzünü ve etkileşimlerini yönetir. Fragment ve ViewModel'lar bu katmanda bulunur.

**LiveData:**

Projede Kullanım Amacı: UI bileşenlerini veri değişikliklerine tepki verecek şekilde günceller.

**ViewModel:**

Projede Kullanım Amacı: UI verilerini yönetir ve UI ile veri arasındaki yaşam döngüsü yönetimini sağlar.

**Kotlin Coroutines:**

Projede Kullanım Amacı: Asenkron işlemleri yönetmek ve arka planda işlemleri yürütmek için kullanılır.



## Ekran Görüntüleri


|------------------|------------------|------------------|------------------|
| ![Ekran 1](https://github.com/murat-guzel33/myScreenShotFiles/blob/master/ContactsAppKotlin/Ss1.png?raw=true) | ![Ekran 2](https://github.com/murat-guzel33/myScreenShotFiles/blob/master/ContactsAppKotlin/Ss2.png?raw=true) | ![Ekran 3](https://github.com/murat-guzel33/myScreenShotFiles/blob/master/ContactsAppKotlin/Ss3.png?raw=true) | ![Ekran 4](https://github.com/murat-guzel33/myScreenShotFiles/blob/master/ContactsAppKotlin/Ss4.png?raw=true) |
  

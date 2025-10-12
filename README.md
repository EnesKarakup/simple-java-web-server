# Simple Java Web Server

Yalnızca Java ve Socket programlama kullanılarak geliştirilmiş, herhangi bir 3. parti bileşen içermeyen basit bir web sunucusu.

##  Proje Hakkında

Bu proje, Java'nın temel `Socket` ve `ServerSocket` sınıflarını kullanarak sıfırdan yazılmış minimal bir HTTP web sunucusudur. Herhangi bir framework veya kütüphane kullanılmadan, sadece Java Standard Library ile geliştirilmiştir.

##  Mimari ve Çalışma Yapısı

![Mimari Diyagram](<img width="1078" height="806" alt="diagram" src="https://github.com/user-attachments/assets/11d8d2c9-7ff5-442b-9f31-4ff9d7bca607" />)

### Akış Açıklaması

1. **Web Tarayıcı** → HTTP GET isteği gönderir (`localhost:1989`)
2. **ServerSocket** → Port 1989'dan gelen bağlantıyı kabul eder (`accept()`)
3. **İstek İşleme**:
   - BufferedReader ile istek satırı okunur
   - HTML içeriği hazırlanır
   - HTTP 200 OK yanıtı oluşturulur
   - PrintWriter ile içerik gönderilir
   - Socket bağlantısı kapatılır
4. **Döngü** → `while(true)` ile bir sonraki istekleri bekler
5. **Çıktı** → Tarayıcı HTML'i render eder ve kullanıcıya gösterir

##  Özellikler

- ✅ Saf Java implementasyonu (zero dependency)
- ✅ Socket programlama ile HTTP protokolü desteği
- ✅ 1989 portunda çalışan web sunucusu
- ✅ HTML/CSS ile biçimlendirilmiş kişisel bilgi sayfası
- ✅ Responsive ve modern tasarım

##  Kurulum ve Çalıştırma

### Gereksinimler
- Java 15 veya üzeri (Text Blocks özelliği için)
- JDK kurulu olmalıdır

### Adımlar

1. Projeyi klonlayın:
```bash
git clone <repo-url>
cd <proje-dizini>
```

2. Java dosyasını derleyin:
```bash
javac SimpleWebServer.java
```

3. Sunucuyu başlatın:
```bash
java SimpleWebServer
```

4. Tarayıcınızda açın:
```
http://localhost:1989
```

##  Kullanım

Sunucu başlatıldıktan sonra, herhangi bir web tarayıcısından `http://localhost:1989` adresine giderek kişisel bilgi sayfasını görüntüleyebilirsiniz.

### Kişiselleştirme

Kod içindeki HTML bloğunda aşağıdaki bilgileri güncelleyin:
- `<h1>` etiketi: Adınız ve Soyadınız
- `<h2>` etiketi: Öğrenci numaranız
- `<p>` etiketi: Kısa biyografiniz

```java
<h1>Adınız Soyadınız</h1>
<h2>12345678</h2>
<p>Biyografi metniniz buraya...</p>
```

##  Teknik Detaylar

### Nasıl Çalışır?

1. **ServerSocket** 1989 portunda dinlemeye başlar
2. Her yeni bağlantı için `accept()` metoduyla client kabul edilir
3. HTTP isteği okunur ve konsola yazdırılır
4. HTML içeriği hazırlanır
5. HTTP 200 OK yanıtı ile birlikte HTML gönderilir
6. Bağlantı kapatılır ve döngü devam eder

### HTTP Yanıt Yapısı

```
HTTP/1.1 200 OK
Content-Type: text/html; charset=UTF-8
Content-Length: [byte-sayısı]

[HTML içeriği]
```

### Kullanılan Java Sınıfları

- `ServerSocket` - Port dinleme ve bağlantı kabul etme
- `Socket` - Client ile iletişim
- `BufferedReader` - HTTP isteklerini okuma
- `InputStreamReader` - Byte stream'i karakter stream'e dönüştürme
- `PrintWriter` - HTTP yanıtı gönderme

##  Sayfa Tasarımı

Sayfa aşağıdaki stil özelliklerini içerir:
- **Arka plan rengi**: Açık gri (#f2f2f2)
- **Font**: Arial, Helvetica, sans-serif
- **Başlık renkleri**: Lacivert tonları (#003366, #006699)
- **Merkezi hizalama** ve responsive tasarım

## 📝 Notlar

- Bu sunucu eğitim amaçlıdır ve production ortamında kullanılmamalıdır
- Aynı anda sadece tek bir istek işler (multi-threading yok)
- Sadece GET isteklerini destekler
- Güvenlik önlemleri içermez
- Statik dosya servisi yoktur

## 📄 Lisans

Bu proje eğitim amaçlı geliştirilmiştir ve serbestçe kullanılabilir.

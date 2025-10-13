# Simple Java Web Server

![Java](https://img.shields.io/badge/Java-15+-ED8B00?logo=openjdk&logoColor=white)
![Socket Programming](https://img.shields.io/badge/Socket-Programming-blue.svg)
![Dependencies](https://img.shields.io/badge/dependencies-zero-success.svg)
![Port](https://img.shields.io/badge/port-1989-lightblue.svg)

Yalnızca Java ve Socket programlama kullanılarak geliştirilmiş, hiçbir 3. parti bileşen içermeyen minimal bir HTTP web sunucusu.

## Özellikler

- Saf Java implementasyonu - zero dependency
- Socket programlama ile HTTP desteği
- 1989 portunda çalışır
- HTML/CSS ile biçimlendirilmiş kişisel sayfa

## Kurulum ve Çalıştırma

```bash
# Projeyi klonlayın
git clone <repo-url>
cd <proje-dizini>

# Derleyin ve çalıştırın
javac SimpleWebServer.java
java SimpleWebServer
```

Tarayıcınızda `http://localhost:1989` adresini açın.

## Mimari

<img width="1078" height="806" alt="diagram" src="https://github.com/user-attachments/assets/83ca1e9e-cdf4-40cf-ab0b-118137ace8d7" />

**Çalışma prensibi:** ServerSocket ile 1989 portunu dinler → Client bağlantısını kabul eder → HTTP isteğini okur → HTML yanıtı gönderir → Döngü devam eder.

## Teknik Detaylar

- **Java 15+** gerektirir (Text Blocks için)
- `ServerSocket`, `Socket`, `BufferedReader`, `PrintWriter` kullanır
- Tek dosya, tek thread - eğitim amaçlıdır

## Özelleştirme

Kod içindeki HTML bloğunda kişisel bilgilerinizi güncelleyin:

```java
<h1>Adınız Soyadınız</h1>
<h2>Öğrenci No</h2>
<p>Biyografiniz...</p>
```

Stil özellikleri `<style>` etiketi içinden değiştirilebilir.

---

**Not:** Bu proje eğitim amaçlıdır ve production ortamı için uygun değildir.

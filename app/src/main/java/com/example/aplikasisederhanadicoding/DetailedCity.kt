package com.example.aplikasisederhanadicoding

import android.content.Intent
import android.os.Bundle
import android.os.Build
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class DetailedCity : AppCompatActivity(), View.OnClickListener {
    private lateinit var backNav: ImageView
    private lateinit var detailImage: ImageView
    private lateinit var cityName: TextView
    private lateinit var description: TextView
    private lateinit var geographicsCondition: TextView
    private lateinit var cityLocation: TextView
    private lateinit var shareLocation: Button
    private lateinit var imageProfile: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        actionBar?.hide()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.green_android)
            window.navigationBarColor = ContextCompat.getColor(this, R.color.white)
            window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR)
        }

        setContentView(R.layout.activity_detail_city)
        backNav = findViewById(R.id.backNav)
        detailImage = findViewById(R.id.detailImage)
        cityName = findViewById(R.id.cityName)
        description = findViewById(R.id.description)
        geographicsCondition = findViewById(R.id.geographicsCondition)
        cityLocation = findViewById(R.id.cityLocation)
        shareLocation = findViewById(R.id.action_share)
        imageProfile = findViewById(R.id.img_profile)
        imageProfile.setOnClickListener{
           goToAboutPage()
        }

        val index = intent.extras?.getInt("index", -1)



        when (index) {
            0 -> setCityDetail(
                R.drawable.ic_city_0,
                "Ubud",
                "\t\t Ubud adalah sebuah desa adat sekaligus menjadi kawasan destinasi pariwisata yang berada di wilayah tengah pulau Bali, Indonesia.\n" +
                        "\n" +
                        "Ubud terutama terkenal diantara para wisatawan mancanegara karena terletak di antara sawah dan hutan yang berjurang-jurang yang membuat pemandangan alam sangat indah. Selain itu, Ubud dikenal karena seni dan budaya yang berkembang sangat pesat dan maju. Denyut nadi kehidupan masyarakat Ubud tidak bisa dilepaskan dari kesenian. Di sini banyak pula terdapat galeri-galeri seni, serta arena pertunjukan musik dan tari yang digelar setiap malam secara bergantian di segala penjuru desa.\n" +
                        "\n" +
                        "Sudah sejak tahun 1920-an, Ubud terkenal di antara wisatawan barat. Kala itu pelukis Jerman; Walter Spies dan pelukis Belanda; Rudolf Bonnet menetap di sana. Mereka dibantu oleh Tjokorda Gde Agung Sukawati, dari Puri Agung Ubud. Sekarang karya mereka bisa dilihat di Museum Puri Lukisan, Ubud.",
                "\t\tUbud terletak di dataran tinggi yang dikelilingi oleh perbukitan dan lembah. Ketinggian rata-rata Ubud adalah sekitar 300 meter di atas permukaan laut. Ubud terletak di Kecamatan Ubud, Kabupaten Gianyar, Bali, Indonesia.\n• Luas wilayah\t: 8,26 km²\n Iklim\t\t:\n- Tropis\n- Curah hujan tinggi\n- 25°C - 30°C \n• Tanah\t\t\t\t\t\t: Subur, Vulkanik\n• Vegetasi\t\t\t\t: Hutan tropis, sawah, perkebunan \n Topografi\t: \n- Perbukitan \n- Sawah \n- Perkebunan",
                "https://maps.app.goo.gl/b92a3TbaajqghVkw9"
            )
            1 -> setCityDetail(
                R.drawable.ic_city_1,
                "Yogyakarta",
                "\t\t Yogyakarta adalah asal mula peradaban di Tanah Jawa. Kota ini pernah menjadi singgasana yang menghasilkan Candi Borobudur and Prambanan yang begitu megah pada abad ke-8 dan ke-9 serta tempat berkuasanya kerajaan Mataram pada abad ke-16 dan ke-17.\n" +
                        "\n" +
                        "\t\t Yogyakarta pernah dikenal dengan slogannya yang berbunyi “Jogja The Neverending Asia“ berkat daya tariknya yang luar biasa. Sekarang, kota ini juga dikenal sebagai “Jogja Istimewa“ karena nilai-nilainya yang dianut begitu eloknya.\n" +
                        "\n" +
                        "\t\t Kota ini adalah salah satu dari beberapa pusat kebudayaan di Indonesia. Setiap pengunjung bisa menjelajahinya dengan berjalan-jalan di Museum Keraton (Istana Sultan), bercengkrama di Alun Alun Kota, melihat proses pembuatan perhiasan di Kotagede, sampai berbelanja di Malioboro.",
                "\t\tYogyakarta terletak di dataran rendah hinga menengah yang cukup datar dengan ketinggian rata-rata sekitar 113 meter di atas permukaan laut. Kota Yogyakarta dikelilingi 4 Kabupaten, yaitu Kabupaten Wonogiri, Kabupaten Klaten, Kabupaten Magelang, Kabupaten Purworejo.\n• Luas wilayah\t: 32,5 km²\n Iklim\t\t:\n- Muson tropis (Am)\n- Curah hujan relatif rendah\n- Kering\n- 28°C - 34°C \n• Tanah\t\t\t\t\t\t: Subur, Vulkanik, Tanah regosol\n• Vegetasi\t\t\t\t: Hutan pinus, Pantai, Alun-alun, Gunung Berapi \n Topografi\t: \n- Perbukitan \n- Sawah \n- Dataran Rendah",
                "https://maps.app.goo.gl/G49RHB7ksZzhk5tu7"
            )
            2 -> setCityDetail(
                R.drawable.ic_city_2,
                "Solo",
                "\t\t Kota Surakarta atau yang lebih dikenal dengan sebutan Kota Solo terkenal dengan slogan ‘The Spirit of Java’ yang berarti jiwanya Jawa. Kota yang dilintasi Sungai Bengawan Solo ini lekat citranya sebagai pusat budaya Jawa yang hingga kini masih bertahan, yakni Kraton Kasunanan Surakarta dan Pura Mangkunegaran. Bagi wisatawan, Kota Solo terkenal pula dengan batiknya.\n" + "\n" + "\t\t Julukan kota Solo yang paling populer di masyarakat adalah kota Budaya. Dikutip dari buku Selling With Character karya Hermawan Kartajaya dan Ardhi Ridwansyah, kota Solo identik dengan kebudayaan Jawa. Surakarta memiliki semboyan, Mulat sarira angsara wani, yang berarti merasa berani dan introspeksi diri, serta Berseri yang berarti bersih, sehat, rapi, dan indah.",
                "\t\tKota Solo terletak di dataran rendah dengan ketinggian rata-rata sekitar 92 meter di atas permukaan laut. Solo terbagi ke dalam 5 kecamatan yaitu: Laweyan, Pasar Kliwon, Serengan, Jebres, dan Banjarsari.\n• Luas wilayah\t: 44,04 km²\n Iklim\t\t:\n- Tropis (Am)\n- Curah hujan sedang\n- 26.55˚C - 29.10˚C \n• Tanah\t\t\t\t\t\t: Subur, Tanah liat berpasir\n• Vegetasi\t\t\t\t: Hutan kota, Taman,  Sungai \n Topografi\t: \n- Pegunungan \n- Sawah \n- Dataran Rendah",
                "https://maps.app.goo.gl/rPztqbgLhaaSWWDB9"
            )
            3 -> setCityDetail(
                R.drawable.ic_city_3,
                "Bandung",
                "\t\t Kota Bandung adalah kota metropolitan terbesar di provinsi Jawa Barat, dan terbesar ke tiga di indonesia. sekaligus menjadi ibu kota provinsi Jawa Barat. Bandung merupakan bagian dari Cekungan Bandung (Bandung Raya), kawasan metropolitan terbesar ketiga di Indonesia setelah Jabodetabek dan Gerbangkertosusila. \n" + "\n" + "\t\t Kota kembang merupakan sebutan lain untuk kota ini, karena pada zaman dahulu kota ini dinilai sangat cantik dengan banyaknya pohon dan bunga-bunga yang tumbuh di sana. Selain itu Bandung dahulunya disebut juga dengan Paris van Java karena keindahannya. Banyaknya mall dan factory outlet menjadikan Bandung juga dikenal sebagai kota belanja, dan saat ini berangsur-angsur kota Bandung juga menjadi kota wisata kuliner.\n" + "\n" + "\t\t Budaya Sunda yang kental tercermin dalam berbagai aspek kehidupan masyarakat, seperti bahasa, seni, dan kuliner. Berdasarkan filosofi Sunda, kata Bandung juga berasal dari kalimat Nga-Bandung-an Banda Indung, yang merupakan kalimat sakral dan luhur karena mengandung nilai ajaran Sunda. Nga-Bandung-an artinya menyaksikan atau bersaksi. Banda adalah segala sesuatu yang berada di alam hidup yaitu di bumi dan atmosfer, baik makhluk hidup maupun benda mati. Sinonim dari banda adalah harta. Indung berarti Ibu atau Bumi, disebut juga sebagai Ibu Pertiwi tempat Banda berada.",
                "\t\tKota Bandung terletak di dataran tinggi dengan ketinggian rata-rata sekitar 768 meter di atas permukaan laut. Solo terbagi ke dalam 2 kabupatan dan 1 kota yaitu Kabupaten Bandung, Kabupaten Bandung Barat, dan Kota Bandung itu sendiri \n• Luas wilayah\t: 167,3 km²\n Iklim\t\t:\n- Tropis \n- Curah hujan tinggi\n- Sejuk, lembab\n- 19˚C - 32˚C \n• Tanah\t\t\t\t\t\t: Subur, Berbatu, Berpasir\n• Vegetasi\t\t\t\t: Hutan kota, Taman, Bukit \n Topografi\t: \n- Pegunungan \n- Kebun \n- Dataran Tinggi",
                "https://maps.app.goo.gl/kWoTg7zVDJzpzxFt9"
            )
            4 -> setCityDetail(
                R.drawable.ic_city_4,
                "Malang",
                "\t\t Kota Malang adalah sebuah kota di provinsi Jawa Timur, Indonesia. Kota ini berada di dataran tinggi yang cukup sejuk, terletak 90 km sebelah selatan Kota Surabaya dan wilayahnya dikelilingi oleh kabupaten Malang. Malang merupakan kota terbesar kedua di Jawa Timur setelah Surabaya, dan dikenal dengan julukan kota pelajar.\n" + "\n" + "\t\t Malang juga memiliki julukan sebagai Kota Bunga. Julukan ini didasarkan pada banyaknya bunga yang mekar serta tumbuh di sudut-sudut Kota Malang. Selain itu, beberapa taman kota Malang juga dipenuhi dengan aneka bunga warna-warni.\n" + "\n" + "\t\t Selain itu, di Kota malang juga terdapat banyak perguruan tinggi yang terkenal hingga dunia internasional. seperti Universitas Brawijaya, Universitas Negeri Malang, Universitas Muhammadiyah Malang, dll.",
                "\t\tKota Malang terletak di dataran sedang dengan ketinggian rata-rata sekitar 406-667 meter di atas permukaan laut. Letaknya yang berada ditengah-tengah wilayah Kabupaten Malang secara astronomis terletak 112,06° – 112,07° Bujur Timur dan 7,06° – 8,02° Lintang Selatan, dengan batas wilayah adalah: \n- Sebelah Utara : Kecamatan Singosari dan Kec. Karangploso\n- Sebelah Timur : Kecamatan Pakis dan Kecamatan Tumpang\n- Sebelah Selatan : Kecamatan Tajinan dan Kecamatan Pakisaji\n- Sebelah Barat : Kecamatan Wagir dan Kecamatan Dau\n• Luas wilayah\t: 111,1 km²\n Iklim\t\t:\n- Tropis \n- Curah hujan tinggi\n- Sejuk, lembab\n- 22.4˚C - 32.7˚C \n• Tanah\t\t\t\t\t\t: Inceptisols, Mollisols, Latosol\n• Vegetasi\t\t\t\t: Hutan Lindung, Taman Bunga,  Tanaman obat \n Topografi\t: \n- Perkebunan \n- Industri \n- Dataran Tinggi",
                "https://meet.google.com/ocj-spja-kpe"
            )
             5 -> setCityDetail(
                R.drawable.ic_city_5,
                "Padang",
                "\t\t Kota Padang adalah kota terbesar di pantai barat Pulau Sumatra sekaligus ibu kota provinsi Sumatera Barat, Indonesia. Kota ini adalah pintu gerbang barat Indonesia dari Samudra Hindia. Menurut sumber sejarah pada awalnya (sebelum abad ke-17) Kota Padang dihuni oleh para nelayan, petani garam dan pedagang. Ketika itu Padang belum begitu penting karena arus perdagangan orang Minang mengarah ke pantai timur melalui sungai-sungai besar. Namun sejak Selat Malaka tidak lagi aman dari persaingan dagang yang keras oleh bangsa asing serta banyaknya peperangan dan pembajakan, maka arus perdagangan berpindah ke pantai barat Pulau Sumatera. Dijuluki Kota Rendangdan Pantai Terindah di Dunia, Padang menawarkan perpaduan sempurna antara keindahan alam, kekayaan budaya, dan kelezatan kuliner.\n" + "\n" + "\t\t Bagi pencinta budaya, Padang adalah surga. Rumah Gadang, arsitektur rumah tradisional Minangkabau yang unik, menjadi simbol budaya yang kental. Festival Siti Nurbaya dan Festival Minangkabau menghadirkan pertunjukan seni dan budaya yang memukau, membawa pengunjung menyelami tradisi dan kearifan lokal yang masih terjaga. Umumnya penduduk di Kota Padang memiliki mata pencaharian yang sangat variatif, namun 3 lapangan usaha utamanya adalah perdagangan besar dan eceran; transportasi dan pergudangan; dan industri pengolahan. Dari segi budaya, Kota Padang sangat kental dengan budaya Minangkabau juga dengan kisah Malin Kundang dan Sitti Nurbaya yang menjadi daya tarik tersendiri bagi wisatawan dalam dan luar negeri.\n" + "\n" + "\t\t Jalan-jalan di sekitar Kota Padang juga menawarkan pengalaman yang berbeda. Dari pasar tradisional yang ramai seperti Pasar Raya Padang, hingga taman-taman indah seperti Taman Melati, kota ini memiliki beragam tempat yang menarik untuk dikunjungi. Meskipun demikian, Padang tetaplah kota yang memesona dan patut dikunjungi. Keindahan alam, kekayaan budaya, dan kelezatan kulinernya akan selalu menjadi magnet bagi para wisatawan.",
                "\t\tKota Padang terletak di dataran rendah dengan ketinggian rata-rata sekitar 0-25 meter di atas permukaan laut. Secara astronomis Padang terletak di antara 0° 44' 00” dan 1° 08' 35” Lintang Selatan serta antara 100° 05' 05” dan 100° 34' 09” Bujur Timur. Kota Padang terdiri dari 11 kecamatan dengan kecamatan terluas adalah Kota Tangah yang mencapai 232,25 Dari keseluruhan luas Kota Padang sebagian besar atau 52,52 persen berupa hutan yang dillindungi oleh pemerintah.\n• Luas wilayah\t: 695 km²\n Iklim\t\t:\n- Tropis \n- Curah hujan sedang\n- Terik, Pesisir\n- 26˚C - 34˚C \n• Tanah\t\t\t\t\t\t: Ultisols, Andosol, Regosol\n• Vegetasi\t\t\t\t: Pantai, Kelapa sawit, Kebun teh, Hutan mangrove \n Topografi\t: \n- Perbukitan \n- Sungai \n- Dataran Rendah",
                "https://maps.app.goo.gl/H5gEAwpifhTUvBwP7"
            )
            6 -> setCityDetail(
                R.drawable.ic_city_6,
                "Manado",
                "\t\t Kota Manado adalah ibu kota dari provinsi Sulawesi Utara, yang seringkali disebut sebagai Menado. Manado terletak di Teluk Manado, dan dikelilingi oleh daerah pegunungan. Menado adalah ibu kota dari provinsi Sulawesi Utara, Indonesia. Kota Manado memiliki 11 kecamatan serta 87 kelurahan dan desa. ota Manado merupakan beranda Sulawesi Utara dan Indonesia ke Asia Pasifik. Kota ini dikenal pula sebagai pusat pemerintahan, perdagangan, dan pendidikan. Kota ini berbatasan dengan Filipina dan Malaysia Timur. Kota Manado dikelilingi daerah pegunungan yang indah dan asri. Selain berjuluk Kota Tinutuan, Manado juga terkenal karena adanya Taman Laut Nasional Bunaken, surga bawah laut yang “menyihir” banyak wisatawan. Nama manadu sebagai informasi awal Kota Manado sebagai suatu lokasi, ditemukan dalam tulisan Valentijn (1724) yang tertera dalam peta laut yang dibuat Nicolaus Desliens tahun 1541 dan peta laut yang dibuat oleh Laco tahun 1590. Tulisan Valentijn menjelaskan kata “manadu” sebagai suatu lokasi dengan pulau karang di lepas pantai yang berada di depan kota Manado. Sejak tahu 1862, pulau karang yang dimaksud disebut dengan nama Pulau Manado Tua. Istilah “manadu” ini diperoleh dalam lafal dan sebutan orang Eropa terhadap pulau karang berkaitan dengan bahasa Tombulu, yakni dengan kata “mana-undou”. Kata ini berarti orang yang datang dari jauh atau orang dari kejauhan atau di kejauhan.\n" + "\n" + "\t\t Manado merupakan kota yang berada pada muara-muara sungai besar. Ada tujuh sungai di Sulawesi Utara yang bermuara di Manado, yaitu Sungai Tondano, Sungai Sario, Sungai Bailang, Sungai Kolongan, Sungai Malalayang, Sungai Maasing, dan Sungai Kima. Kota ini pun berada pada elevasi yang jauh lebih rendah dibandingkan dengan kota atau kabupaten lain di sekitarnya.\n" + "\n" + "\t\t Masyarakat Manado juga disebut dengan istilah “warga Kawanua”. Walaupun secara khusus Kawanua diartikan kepada suku Minahasa, tetapi secara umum penduduk Manado dapat disebut juga sebagai warga Kawanua. Dalam bahasa daerah Minahasa, “Kawanua” sering diartikan sebagai penduduk negeri atau “wanua-wanua” yang bersatu atau “Mina-Esa” (Orang Minahasa). Musik tradisional dari Kota Manado dan sekitarnya dikenal dengan nama musik Kolintang. Alat musik Kolintang dibuat dari sejumlah kayu yang berbeda-beda panjangnya sehingga menghasilkan nada-nada yang berbeda.",
                "\t\tKota Manado terletak di dataran rendah dengan ketinggian rata-rata sekitar 0-25 meter di atas permukaan laut. Secara astronomis Manado terletak di antara 10 25′ 88″ – 10 39′ 50″ LU dan 1240 47′ 00″ – 1240 56′ 00″ BT. Wilayah perairan Kota Manado meliputi Pulau Bunaken, Pulau Siladen dan Pulau Manado Tua. Pulau Bunaken dan Siladen memiliki topografi yang bergelombang dengan puncak setinggi 200 meter. Sedangkan pulau Manado Tua adalah pulau gunung dengan ketinggian sekitar 750 meter. Kota Manado adalah kota yang berada pada muara-muara sungai besar. Ada tujuh sungai di Sulawesi Utara yang bermuara di Manado, yaitu Sungai Tondano, Sungai Sario, Sungai Bailang, Sungai Kolongan, Sungai Malalayang, Sungai Maasing, dan Sungai Kima. Kota ini pun berada pada elevasi yang jauh lebih rendah dibandingkan dengan kota atau kabupaten lain di sekitarnya..\n• Luas wilayah\t: 162,53 km²\n Iklim\t\t:\n- Tropis \n- Curah hujan rendah\n- Terik, Pesisir\n- 26˚C - 34˚C \n• Tanah\t\t\t\t\t\t: Inceptisols, Regosol, Latosol\n• Vegetasi\t\t\t\t: Hutan hujan tropis, Cengkeh, Kebun kakao, \n Topografi\t: \n- Pantai \n- Sungai \n- Dataran Rendah",
                "https://maps.app.goo.gl/FaMjzETjHnpmvjLn9"
            )
            7 -> setCityDetail(
                R.drawable.ic_city_7,
                "Bogor",
                "\t\t Bogor adalah sebuah kota yang terletak di kaki Gunung Salak. Kota ini sering disebut sebagai Kota Hujan dan dulunya dikenal dengan nama Buitenzorg. Di Bogor, ada banyak wisata alam dan wisata ramah keluarga yang selalu menarik untuk dikunjungi. Ketika sampai di Bogor, pengunjung akan takjub dengan suasana kota yang cukup asri dan sejuk. Kota Bogor terkenal dengan julukan Kota Hujan karena memiliki curah hujan yang tinggi. Jejak historis sejak Kerajaan Pakuan Pajajaran hingga Hindia Belanda dibuktikan dengan beragam artefak peninggalan sejarah yang dilestarikan hingga kini. Sebagai wilayah penyangga ibu kota Jakarta, Kota Bogor menjadi penunjang layanan, pusat aktivitas nasional untuk industri, perdagangan, transportasi, komunikasi, dan pariwisata.\n" + "\n" + "\t\t Kota Bogor termasuk ke dalam Kawasan Strategis Nasional Perkotaan Jabodetabekpunjur. Selain itu, kekhasan iklim lokal yang dimilikinya menjadikan Bogor sebagai pusat riset botani serta pertanian nasional. Nama Bogor berasal dari “bahgar” atau “baqar” yang berarti sapi karena di dalam kebun raya ada patung sapi. Pendapat lainnya mengatakan kata Bogor berasal dari kata bokor, sejenis bakul logam, tanpa alasan jelas. Pendapat lain lagi mengatakan nama Bogor itu asli kata bogor berarti tunggul kawung (enau, aren), yang ditemukan dalam pantun Bogor berjudul Ngadegna Dayeuh Pajajaran. Banyak benda cagar budaya yang ditemukan di wilayah Kota Bogor, di antaranya keramik, artefak asahan, kerang bertuliskan huruf Arab yang ditemukan di Kelurahan Lawanggintung. Kemudian peninggalan masa prasejarah (megalitik) Batu Dakon ditemukan di Kelurahan Empang, Kecamatan Kecamatan Bogor Selatan.\n " + "\n" + "\t\t Jika ingin jalan-jalan ke tempat instagrammable di Bogor, coba mampir ke Kebun Raya Cibodas yang berlokasi di Kompleks Hutan Gunung Gede dan Gunung Pangrango deh, Sobat Pesona. Tempat ini juga tak kalah menarik untuk disambangi, lho. Selain jadi tempat wisata, Kebun Raya Cibodas merupakan Pusat Penelitian Konservasi Tumbuhan Kebun Raya di bawah naungan LIPI (Lembaga Ilmu Pengetahuan Indonesia). Ada juga Taman Bunga Nusantara yang menyajikan aneka bunga cantik dan spot foto menarik yang harus banget diabadikan. Tak hanya koleksi bunga yang cantik, Taman Bunga Nusantara juga memiliki rumah kaca, menara pandang, hingga danau angsa yang bisa jadi tempat ideal untuk menyegarkan pikiran.",
                "\t\tKota Bogor terletak di dataran tinggi dengan ketinggian rata-rata sekitar 330 meter di atas permukaan laut. Secara astronomis Bogor terletak di antara 106’ 48’ BT dan 6’ 26’ LS, dengan batas wilayah di sebelah utara Kecamatan Kemang (Kabupaten Bogor) dan Kecamatan Bojong Gede (Kabupaten Bogor), sebelah timur Kecamatan Sukaraja (Kabupaten Bogor) dan Kecamatan Ciawi (Kabupaten Bogor), sebelah selatanKecamatan Cijeruk (Kabupaten Bogor), Kecamatan Caringin (Kabupaten Bogor) dan Kecamatan Tamansari (Kabupaten Bogor), dan di sebelah barat Kecamatan Dramaga (Kabupaten Bogor) dan Kecamatan Ciomas (Kabupaten Bogor). Kelembaban udara ≥70%, curah hujan rata-rata setiap tahun di Kota Bogor sangatlah tinggi, yaitu sekitar 3.500–4000 mm dengan curah hujan terbesar pada bulan Januari, karenanya Kota Bogor dijuluki sebagai Kota Hujan.\n• Luas wilayah\t: 111,4 km²\n Iklim\t\t:\n- Tropis \n- Curah hujan tinggi\n- Lembab\n- 21.8˚C - 30.4˚C \n• Tanah\t\t\t\t\t\t: Inceptisols, Mollisols, Andosol\n• Vegetasi\t\t\t\t: Hutan hujan tropis, Kebun teh, kebun karet, \n Topografi\t: \n- Sawah \n- Sungai \n- Pegunungan",
                "https://maps.app.goo.gl/3kb48cLEwFJdDX8d6"
            )
            8 -> setCityDetail(
                R.drawable.ic_city_8,
                "Semarang",
                "\t\t Kota Semarang (Jawa: Hanacaraka: ꦯꦼꦩꦫꦁ) adalah ibu kota provinsi Jawa Tengah, Indonesia. Kota ini adalah kota metropolitan terbesar kelima di Indonesia setelah Jakarta, Surabaya, Medan, dan Bandung. Kawasan mega-urban Semarang yang tergabung dalam wilayah metropolitan Kedungsepur (Kendal, Demak, Ungaran, Kabupaten Semarang, Kota Salatiga, Kota Semarang dan Purwodadi, Kabupaten Grobogan). Penduduk Semarang umumnya adalah suku Jawa dan menggunakan Bahasa Jawa sebagai bahasa sehari-hari. Agama mayoritas yang dianut adalah Islam. Semarang memiliki komunitas Tionghoa yang besar. Seperti di daerah lainnya di Jawa, terutama di Jawa Tengah, mereka sudah berbaur erat dengan penduduk setempat dan menggunakan Bahasa Jawa dalam berkomunikasi sejak ratusan tahun silam.\n" + "\n" + "\t\t Secara etimologis, nama 'Semarang' berasal dari kata 'sem', yang berarti asam/pohon asam', dan kata 'arang', yang berarti 'jarang', yang digabungkan menjadi 'asam yang jarang - jarang'. Penamaan 'Semarang' ini bermula ketika Ki Ageng Pandanaran I datang ke sebuah pulau bernama Pulau Tirang (dekat pelabuhan Bergota) dan melihat pohon asam yang jarang - jarang tumbuh berdekatan. Penamaan Kota Semarang ini sempat berubah saat jaman kolonialisme Hindia - Belanda menjadi 'Samarang'. Kota Semarang merupakan satu dari tiga pusat pelabuhan (Jakarta dan Surabaya) penting bagi Hindia -Belanda sebagai pemasok hasil bumi dari wilayah pedalaman Jawa.\n" + "\n" + "Seperti kota besar lainya, Kota Semarang mengenal sistem pembagian wilayah kota yang terdiri atas: Semarang Tengah atau Semarang Pusat, Semarang Timur, Semarang Selatan, Semarang Barat, dan Semarang Utara. Pembagian wilayah kota ini bermula dari pembagian wilayah sub-residen oleh Pemerintah Hindia Belanda yang setingkat dengan kecamatan. Namun saat ini, pembagian wilayah kota ini berbeda dengan pembagian administratif wilayah kecamatan. Meskipun pembagian kota ini jarang dipergunakan dalam lingkungan Pemerintahan Kota Semarang. Namun pembagian kota ini digunakan untuk mempermudah dalam menerangkan suatu lokasi menurut letaknya terhadap pusat kota Semarang.",
                "\t\t Kota Semarang terletak di pesisir utara laut dengan ketinggian rata-rata sekitar 0-25 meter di atas permukaan laut. Secara astronomis Semarang terletak di antara antara 6 50' – 7 10' Lintang Selatan dan garis 109 35' – 110 50' Bujur Timur, dengan batas-batas sebelah Utara dengan Laut Jawa, sebelah Timur dengan Kabupaten Demak, sebelah Barat dengan Kabupaten Kendal, dan sebelah Selatan dengan Kabupaten Semarang.\n• Luas wilayah\t: 373,70 km²\n Iklim\t\t:\n- Tropis \n- Curah hujan sedang\n- Angim Muson (Am)\n- 25˚C - 37˚C \n• Tanah\t\t\t\t\t\t: Alluvial, Tanah berpasir, Gambut\n• Vegetasi\t\t\t\t: Taman kota, Kebun tebu, Hutan Mangrove, \n Topografi\t: \n- Pantai \n- Perbukitan \n- Sungai",
                "https://maps.app.goo.gl/mfRNEuU6c9dYg6m2A"
            )
            9 -> setCityDetail(
                R.drawable.ic_city_9,
                "Palembang",
                "\t\t Kota Palembang (Jawi: ڤاليمبڠ) adalah salah satu kota tertua di Indonesia, hal ini berdasarkan prasasti Kedukan Bukit yang ditemukan di Bukit Siguntang sebelah barat Kota Palembang. Bukit Siguntang yang berada di bagian barat Kota Palembang, hingga sekarang tempat tersebut masih dikeramatkan banyak orang dan dianggap sebagai bekas tempat suci di masa lalu, sekaligus menjadi ibu kota provinsi Sumatera Selatan. Letak Kota Palembang juga cukup strategis karena dilalui oleh jalan lintas Sumatera yang menghubungkan berbagai daerah di Pulau Sumatera.\n" + "\n" + "\t\t Kota Palembang terkenal sebagai kota industri dan kota perdagangan. Posisi geografis Palembang yang terletak di tepian Sungai Musi dan tidak jauh dari Selat Bangka. Hal ini menjadi anugerah alam yang sangat menguntungkan. Walaupun tidak berada di tepi laut, Kota Palembang mampu dijangkau oleh kapal-kapal dari luar negeri. Terutama dengan adanya Dermaga Tangga Buntung dan Dermaga Sei Lais.\n" + "\n" + "\t\t Kota Palembang juga dijuluki Venice of the East ('Venesia dari Timur'). Pada tanggal 27 September 2005, Kota Palembang telah dicanangkan oleh Presiden RI Susilo Bambang Yudhoyono sebagai 'Kota Wisata Air'. Tahun 2008 Kota Palembang menyambut kunjungan wisata dengan nama 'Visit Musi 2008'. Palembang menjadi salah satu kota pelaksana pesta olahraga olahraga dua tahunan se-Asia Tenggara yaitu SEA Games XXVII Tahun 2011. Pada tahun 2018, Palembang dan Jakarta menjadi tuan rumah olimpiade se-Asia yaitu Asian Games 2018.",
                "\t\t Palembang terletak di aliran sungai Musi dengan ketinggian rata-rata sekitar 3 meter di atas permukaan laut. Secara astronomis Palrmbang terletak di antara 2°52’ - 3°5’ Lintang Selatan dan 104°37’ - 104°52’ Bujur Timur, dengan batas-batas sebelah utara dan timur dengan Kabupaten Banyuasin, sebelah selatan dengan Kabupaten Muara Enim dan Ogan Ilir.\n• Luas wilayah\t: 400,6 km²\n Iklim\t\t:\n- Tropis \n- Polusi kabut asap \n- Curah hujan tinggi\n- 25˚C - 37˚C \n• Tanah\t\t\t\t\t\t: Alluvial, Tanah berpasir, Gambut, Tanah berpasir\n• Vegetasi\t\t\t\t: Hutan bakau, Kelapa sawit, Sagu, \n Topografi\t: \n- Sungai Musi \n- Dataran rendah \n- Perkebunan",
                "https://maps.app.goo.gl/czo4Q1bYwUEhJ1Ax6"
            )
            else -> finish()
        }

        backNav.setOnClickListener(this)
        shareLocation.setOnClickListener(this)
    }

    private fun setCityDetail(
        detailImage1: Int,
        cityName1: String,
        description1: String,
        geographicsCondition1: String,
        cityLocation1: String
    ) {
        detailImage.setImageResource(detailImage1)
        cityName.text = cityName1
        description.text = description1
        geographicsCondition.text = geographicsCondition1
        cityLocation.text = cityLocation1
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.backNav -> finish()
            R.id.action_share -> {
                val intent = Intent(Intent.ACTION_SEND)
                intent.type = "text/plain"
                intent.putExtra(Intent.EXTRA_TEXT, cityLocation.text.toString())
                startActivity(Intent.createChooser(intent, "Share With :"))
            }
        }
    }

    private fun goToAboutPage(){
        val intent = Intent(this, About::class.java)
        startActivity(intent)
    }


}

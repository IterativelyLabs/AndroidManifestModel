package uk.co.iteratively.amm

enum class AndroidApi(version: String, level: Int) {
    ANDROID_1("1.0", 1),
    ANDROID_2("1.1", 2),
    CUPCAKE("1.5" , 3),
    DONUT("1.6", 4),
    ECLAIR("2.0", 5),
    ECLAIR_MR1("2.0.1", 6),
    ECLAIR_MR2("2.1", 7),
    FROYO("2.2", 8),
    GINGERBREAD("2.3",9),
    GINGERBREAD_MR1("2.2.3", 10),
    HONEYCOMB("3.0", 11),
    HONEYCOMB_MR1("3.1", 12),
    HONEYCOMB_MR2("3.2", 13),
    ICE_CREAM_SANDWICH("4.0", 14),
    ICE_CREAM_SANDWICH_MR1("4.0.3", 15),
    JELLY_BEAN("4.1", 16),
    JELLY_BEAN_MR1("4.2", 17),
    JELLY_BEAN_MR2("4.3", 18),
    KITKAT("4.4", 19),
    KITKAT_WATCH("4.4W", 20),
    LOLLIPOP("5.0", 21),
    LOLLIPOP_MR1("5.1", 22),
    MARSHMALLOW("6.0", 23),
    NOUGAT("7.0", 24),
    NOUGAT_MR1("7.1", 25),
    OREO("8.0", 26),
    OREO_MR1("8.1", 27),
    PIE("9.0", 28),
    Q("10.0", 29),
}
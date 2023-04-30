@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package org.autojs.autojs.core.image

import android.content.res.Resources.NotFoundException
import org.autojs.autojs.app.GlobalAppContext
import org.autojs.autojs6.R

/**
 * Created by SuperMonster003 on Dec 21, 2022.
 */
class ColorTable {

    object Android {

        const val TRANSPARENT = 0
        const val BLACK = -0x1000000
        const val BLUE = -0xffff01
        const val CYAN = -0xff0001
        const val AQUA = CYAN
        const val DARK_GRAY = -0xbbbbbc
        const val DARK_GREY = DARK_GRAY
        const val DKGRAY = DARK_GRAY
        const val GRAY = -0x777778
        const val GREY = GRAY
        const val GREEN = -0xff0100
        const val LIME = GREEN
        const val LIGHT_GRAY = -0x333334
        const val LIGHT_GREY = LIGHT_GRAY
        const val LTGRAY = LIGHT_GRAY
        const val MAGENTA = -0xff01
        const val FUCHSIA = MAGENTA
        const val MAROON = -0x800000
        const val NAVY = -0xffff80
        const val OLIVE = -0x7f8000
        const val PURPLE = -0x7fff80
        const val RED = -0x10000
        const val SILVER = -0x3f3f40
        const val TEAL = -0xff7f80
        const val WHITE = -0x1
        const val YELLOW = -0x100

    }

    object Css {

        const val ALICE_BLUE = -0xf0701
        const val ANTIQUE_WHITE = -0x51429
        const val AQUAMARINE = -0x80002c
        const val AZURE = -0xf0001
        const val BEIGE = -0xa0a24
        const val BISQUE = -0x1b3c
        const val BLACK = -0x1000000
        const val BLANCHED_ALMOND = -0x1433
        const val BLUE = -0xffff01
        const val BLUE_VIOLET = -0x75d41e
        const val BROWN = -0x5ad5d6
        const val BURLY_WOOD = -0x214779
        const val CADET_BLUE = -0xa06160
        const val CHARTREUSE = -0x800100
        const val CHOCOLATE = -0x2d96e2
        const val CORAL = -0x80b0
        const val CORNFLOWER_BLUE = -0x9b6a13
        const val CORN_SILK = -0x724
        const val CRIMSON = -0x23ebc4
        const val CYAN = -0xff0001
        const val AQUA = CYAN
        const val DARK_BLUE = -0xffff75
        const val DARK_CYAN = -0xff7475
        const val DARK_GOLDENROD = -0x4779f5
        const val DARK_GRAY = -0x565657
        const val DARK_GREY = DARK_GRAY
        const val DARK_GREEN = -0xff9c00
        const val DARK_KHAKI = -0x424895
        const val DARK_MAGENTA = -0x74ff75
        const val DARK_OLIVE_GREEN = -0xaa94d1
        const val DARK_ORANGE = -0x7400
        const val DARK_ORCHID = -0x66cd34
        const val DARK_RED = -0x750000
        const val DARK_SALMON = -0x166986
        const val DARK_SEA_GREEN = -0x704371
        const val DARK_SLATE_BLUE = -0xb7c275
        const val DARK_SLATE_GRAY = -0xd0b0b1
        const val DARK_SLATE_GREY = DARK_SLATE_GRAY
        const val DARK_TURQUOISE = -0xff312f
        const val DARK_VIOLET = -0x6bff2d
        const val DEEP_PINK = -0xeb6d
        const val DEEP_SKY_BLUE = -0xff4001
        const val DIM_GRAY = -0x969697
        const val DIM_GREY = DIM_GRAY
        const val DODGER_BLUE = -0xe16f01
        const val FIRE_BRICK = -0x4dddde
        const val FLORAL_WHITE = -0x510
        const val FOREST_GREEN = -0xdd74de
        const val GAINSBORO = -0x232324
        const val GHOST_WHITE = -0x70701
        const val GOLD = -0x2900
        const val GOLDENROD = -0x255ae0
        const val GRAY = -0x7f7f80
        const val GREY = GRAY
        const val GREEN = -0xff8000
        const val GREEN_YELLOW = -0x5200d1
        const val HONEYDEW = -0xf0010
        const val HOT_PINK = -0x964c
        const val INDIAN_RED = -0x32a3a4
        const val INDIGO = -0xb4ff7e
        const val IVORY = -0x10
        const val KHAKI = -0xf1974
        const val LAVENDER = -0x191906
        const val LAVENDER_BLUSH = -0xf0b
        const val LAWN_GREEN = -0x830400
        const val LEMON_CHIFFON = -0x533
        const val LIGHT_BLUE = -0x52271a
        const val LIGHT_CORAL = -0xf7f80
        const val LIGHT_CYAN = -0x1f0001
        const val LIGHT_GOLDENROD_YELLOW = -0x5052e
        const val LIGHT_GRAY = -0x2c2c2d
        const val LIGHT_GREY = LIGHT_GRAY
        const val LIGHT_GREEN = -0x6f1170
        const val LIGHT_PINK = -0x493f
        const val LIGHT_SALMON = -0x5f86
        const val LIGHT_SEA_GREEN = -0xdf4d56
        const val LIGHT_SKY_BLUE = -0x783106
        const val LIGHT_SLATE_GRAY = -0x887767
        const val LIGHT_SLATE_GREY = LIGHT_SLATE_GRAY
        const val LIGHT_STEEL_BLUE = -0x4f3b22
        const val LIGHT_YELLOW = -0x20
        const val LIME = -0xff0100
        const val LIME_GREEN = -0xcd32ce
        const val LINEN = -0x50f1a
        const val MAGENTA = -0xff01
        const val FUCHSIA = MAGENTA
        const val MAROON = -0x800000
        const val MEDIUM_AQUAMARINE = -0x993256
        const val MEDIUM_BLUE = -0xffff33
        const val MEDIUM_LAVENDER_MAGENTA = -0x225f23
        const val MEDIUM_ORCHID = -0x45aa2d
        const val MEDIUM_PURPLE = -0x6c8f25
        const val MEDIUM_SEA_GREEN = -0xc34c8f
        const val MEDIUM_SLATE_BLUE = -0x849712
        const val MEDIUM_SPRING_GREEN = -0xff0566
        const val MEDIUM_TURQUOISE = -0xb72e34
        const val MEDIUM_VIOLET_RED = -0x38ea7b
        const val MIDNIGHT_BLUE = -0xe6e690
        const val MINT_CREAM = -0xa0006
        const val MISTY_ROSE = -0x1b1f
        const val MOCCASIN = -0x1b4b
        const val NAVAJO_WHITE = -0x2153
        const val NAVY = -0xffff80
        const val OLD_LACE = -0x20a1a
        const val OLIVE = -0x7f8000
        const val OLIVE_DRAB = -0x9471dd
        const val ORANGE = -0x5b00
        const val ORANGE_RED = -0xbb00
        const val ORCHID = -0x258f2a
        const val PALE_GOLDENROD = -0x111756
        const val PALE_GREEN = -0x670468
        const val PALE_TURQUOISE = -0x501112
        const val PALE_VIOLET_RED = -0x248f6d
        const val PAPAYA_WHIP = -0x102b
        const val PATRIARCH = -0x7fff80
        const val PEACH_PUFF = -0x2547
        const val PERU = -0x327ac1
        const val PINK = -0x3f35
        const val POWDER_BLUE = -0x4f1f1a
        const val REBECCA_PURPLE = -0x99cc67
        const val RED = -0x10000
        const val ROSY_BROWN = -0x437071
        const val ROYAL_BLUE = -0xbe961f
        const val SADDLE_BROWN = -0x74baed
        const val SALMON = -0x57f8e
        const val SAND_BROWN = -0xb5ba0
        const val SEASHELL = -0xa12
        const val SEA_GREEN = -0xd174a9
        const val SIENNA = -0x5fadd3
        const val SILVER = -0x3f3f40
        const val SKY_BLUE = -0x783115
        const val SLATE_BLUE = -0x95a533
        const val SLATE_GRAY = -0x8f7f70
        const val SLATE_GREY = SLATE_GRAY
        const val SNOW = -0x506
        const val SPRING_GREEN = -0xff0081
        const val STEEL_BLUE = -0xb97d4c
        const val TAN = -0x2d4b74
        const val TEAL = -0xff7f80
        const val THISTLE = -0x274028
        const val TOMATO = -0x9cb9
        const val TURQUOISE = -0xbf1f30
        const val VIOLET = -0x117d12
        const val WHEAT = -0xa214d
        const val WHITE = -0x1
        const val WHITE_SMOKE = -0xa0a0b
        const val YELLOW = -0x100
        const val YELLOW_GREEN = -0x6532ce

    }

    object Web {

        const val ALICE_BLUE = -0xf0701
        const val ALIZARIN_CRIMSON = -0x1cd9ca
        const val AMBER = -0x4100
        const val AMETHYST = -0x669934
        const val ANTIQUE_WHITE = -0x51429
        const val APPLE_GREEN = -0x731a00
        const val APRICOT = -0x19669a
        const val AQUA = -0x50201c
        const val AQUAMARINE = -0x80002c
        const val AQUA_BLUE = -0x99001a
        const val AZURE = -0xff8001
        const val BABY_BLUE = -0x763010
        const val BABY_PINK = -0x261a
        const val BEIGE = -0xa0a24
        const val BISQUE = -0x1b3c
        const val BLACK = -0x1000000
        const val BLANCHED_ALMOND = -0x1433
        const val BLUE = -0xffff01
        const val BLUE_VIOLET = -0x75d41e
        const val BRIGHT_GREEN = -0x990100
        const val BRONZE = -0x3280ce
        const val BROWN = -0x5ad5d6
        const val BURGUNDY = -0x7fffe0
        const val BURLY_WOOD = -0x214779
        const val BURNT_ORANGE = -0x33ab00
        const val CADET_BLUE = -0xa06160
        const val CAMEL = -0x5e94b9
        const val CAMELLIA = -0x19c66b
        const val CANARY_YELLOW = -0x1100
        const val CARDINAL_RED = -0x66ffca
        const val CARMINE = -0x19ffa4
        const val CELADON = -0x531e51
        const val CERISE = -0x21ce9d
        const val CERULEAN_BLUE = -0xd5ad42
        const val CHAMPAGNE_YELLOW = -0x67
        const val CHARTREUSE = -0x800100
        const val CHOCOLATE = -0x2d96e2
        const val CHROME_YELLOW = -0x194800
        const val CLEMATIS = -0x335c34
        const val COBALT_BLUE = -0xffb855
        const val COBALT_GREEN = -0x9900a7
        const val COCONUT_BROWN = -0xb2e100
        const val COFFEE = -0xb2c700
        const val CORAL = -0x80b0
        const val CORAL_PINK = -0x7f41
        const val CORNFLOWER_BLUE = -0x9b6a13
        const val CORN_SILK = -0x724
        const val CREAM = -0x230
        const val CRIMSON = -0x23ebc4
        const val CYAN = -0xff0001
        const val CYAN_BLUE = -0xf24074
        const val DARK_BLUE = -0xffff75
        const val DARK_CYAN = -0xff7475
        const val DARK_GOLDENROD = -0x4779f5
        const val DARK_GRAY = -0x565657
        const val DARK_GREEN = -0xff9c00
        const val DARK_KHAKI = -0x424895
        const val DARK_MAGENTA = -0x74ff75
        const val DARK_MINERAL_BLUE = -0xdbc983
        const val DARK_OLIVE_GREEN = -0xaa94d1
        const val DARK_ORANGE = -0x7400
        const val DARK_ORCHID = -0x66cd34
        const val DARK_POWDER_BLUE = -0xffcc67
        const val DARK_RED = -0x750000
        const val DARK_SALMON = -0x166986
        const val DARK_SEA_GREEN = -0x704371
        const val DARK_SLATE_BLUE = -0xb7c275
        const val DARK_SLATE_GRAY = -0xd0b0b1
        const val DARK_TURQUOISE = -0xff312f
        const val DARK_VIOLET = -0x6bff2d
        const val DEEP_PINK = -0xeb6d
        const val DEEP_SKY_BLUE = -0xff4001
        const val DIM_GRAY = -0x969697
        const val DODGER_BLUE = -0xe16f01
        const val EMERALD = -0xaf3788
        const val FIRE_BRICK = -0x4dddde
        const val FLAMINGO = -0x197548
        const val FLORAL_WHITE = -0x510
        const val FOLIAGE_GREEN = -0x8c47c7
        const val FOREST_GREEN = -0xdd74de
        const val FRESH_LEAVES = -0x6600b3
        const val FUCHSIA = -0xbff5f
        const val GAINSBORO = -0x232324
        const val GHOST_WHITE = -0x70701
        const val GOLDEN = -0x2900
        const val GOLD = GOLDEN
        const val GOLDENROD = -0x255ae0
        const val GRASS_GREEN = -0x6619b3
        const val GRAY = -0x7f7f80
        const val GRAYISH_PURPLE = -0x798b5f
        const val GREEN = -0xff8000
        const val GREEN_YELLOW = -0x5200d1
        const val HELIOTROPE = -0x208c01
        const val HONEYDEW = -0xf0010
        const val HONEY_ORANGE = -0x4c9a
        const val HORIZON_BLUE = -0x472238
        const val HOT_PINK = -0x964c
        const val INDIAN_RED = -0x32a3a4
        const val INDIGO = -0xb4ff80
        const val INTERNATIONAL_KLEIN_BLUE = -0xffd059
        const val IRON_GRAY = -0x9da4a9
        const val IVORY = -0x10
        const val IVY_GREEN = -0xc940ca
        const val JASMINE = -0x193ca4
        const val KHAKI = -0x6694e1
        const val LAPIS_LAZULI = -0xd99e64
        const val LAVENDER = -0x4a8124
        const val LAVENDER_BLUE = -0x333301
        const val PERIWINKLE = LAVENDER_BLUE
        const val LAVENDER_BLUSH = -0xf0b
        const val LAVENDER_MAGENTA = -0x117d12
        const val LAVENDER_MIST = -0x191906
        const val LAWN_GREEN = -0x830400
        const val LEMON_CHIFFON = -0x533
        const val LIGHT_BLUE = -0x52271a
        const val LIGHT_CORAL = -0xf7f80
        const val LIGHT_CYAN = -0x1f0001
        const val LIGHT_GOLDENROD_YELLOW = -0x5052e
        const val LIGHT_GRAY = -0x2c2c2d
        const val LIGHT_GREEN = -0x6f1170
        const val LIGHT_KHAKI = -0xf1974
        const val LIGHT_PINK = -0x493f
        const val LIGHT_SALMON = -0x5f86
        const val LIGHT_SEA_GREEN = -0xdf4d56
        const val LIGHT_SKY_BLUE = -0x783106
        const val LIGHT_SLATE_GRAY = -0x887767
        const val LIGHT_STEEL_BLUE = -0x4f3b22
        const val LIGHT_VIOLET = -0x4f6247
        const val LIGHT_YELLOW = -0x20
        const val LILAC = -0x375d38
        const val LIME = -0x330100
        const val LIGHT_LIME = LIME
        const val LIME_GREEN = -0xcd32ce
        const val LINEN = -0x50f1a
        const val MAGENTA = -0xff01
        const val MAGENTA_ROSE = -0xf25a
        const val MALACHITE = -0xdd3cd2
        const val MALLOW = -0x26b201
        const val MARIGOLD = -0x6700
        const val MARINE_BLUE = -0xffb883
        const val MAROON = -0x800000
        const val MAUVE = -0x1f4f01
        const val MEDIUM_AQUAMARINE = -0x993256
        const val MEDIUM_BLUE = -0xffff33
        const val MEDIUM_LAVENDER_MAGENTA = -0x225f23
        const val MEDIUM_ORCHID = -0x45aa2d
        const val MEDIUM_PURPLE = -0x6c8f25
        const val MEDIUM_SEA_GREEN = -0xc34c8f
        const val MEDIUM_SLATE_BLUE = -0x849712
        const val MEDIUM_SPRING_GREEN = -0xff0566
        const val MEDIUM_TURQUOISE = -0xb72e34
        const val MEDIUM_VIOLET_RED = -0x38ea7b
        const val MIDNIGHT_BLUE = -0xe6e690
        const val MIMOSA = -0x1926cd
        const val MINERAL_BLUE = -0xffb267
        const val MINERAL_VIOLET = -0x5c6252
        const val MINT = -0xe967d5
        const val MINT_CREAM = -0xa0006
        const val MISTY_ROSE = -0x1b1f
        const val MOCCASIN = -0x1b4b
        const val MOON_YELLOW = -0xb3
        const val MOSS_GREEN = -0x9688dd
        const val MUSTARD = -0x3333b3
        const val NAVAJO_WHITE = -0x2153
        const val NAVY = -0xffff80
        const val NAVY_BLUE = NAVY
        const val OCHER = -0x3388de
        const val OLD_LACE = -0x20a1a
        const val OLD_ROSE = -0x3f7f7f
        const val OLIVE = -0x7f8000
        const val OLIVE_DRAB = -0x9471dd
        const val OPERA_MAUVE = -0x487b59
        const val ORANGE = -0x5b00
        const val ORANGE_RED = -0xbb00
        const val ORCHID = -0x258f2a
        const val PAIL_LILAC = -0x19301a
        const val PALE_BLUE = -0x2e120e
        const val PALE_DENIM = -0xa1793f
        const val PALE_GOLDENROD = -0x111756
        const val PALE_GREEN = -0x670468
        const val PALE_OCHRE = -0x334c74
        const val PALE_TURQUOISE = -0x501112
        const val PALE_VIOLET_RED = -0x248f6d
        const val PANSY = -0x8bff5f
        const val PAPAYA_WHIP = -0x102b
        const val PATRIARCH = -0x7fff80
        const val PEACH = -0x1a4c
        const val PEACH_PEARL = -0x4415f
        const val PEACH_PUFF = -0x2547
        const val PEACOCK_BLUE = -0xff7f74
        const val PEACOCK_GREEN = -0xff5ea4
        const val PEARL_PINK = -0x4c1a
        const val PERSIMMON = -0xb2c0
        const val PERU = -0x327ac1
        const val PINK = -0x3f35
        const val PLUM = -0x71ba7b
        const val POWDER_BLUE = -0x4f1f1a
        const val PRUSSIAN_BLUE = -0xffcead
        const val PURPLE = -0x95f253
        const val RED = -0x10000
        const val ROSE = -0xff81
        const val ROSE_PINK = -0x9934
        const val ROSY_BROWN = -0x437071
        const val ROYAL_BLUE = -0xbe961f
        const val RUBY = -0x33ff80
        const val SADDLE_BROWN = -0x74baed
        const val SALMON = -0x57f8e
        const val SALMON_PINK = -0x7f67
        const val SALVIA_BLUE = -0xb27f1a
        const val SAND_BEIGE = -0x193c3d
        const val SAND_BROWN = -0xb5ba0
        const val SAPPHIRE = -0xf7da99
        const val SAXE_BLUE = -0xb8674d
        const val SCARLET = -0xdc00
        const val SEASHELL = -0xa12
        const val SEA_GREEN = -0xd174a9
        const val SEPIA = -0x8fbdec
        const val SHELL_PINK = -0x4c41
        const val SIENNA = -0x5fadd3
        const val SILVER = -0x3f3f40
        const val SKY_BLUE = -0x783115
        const val SLATE_BLUE = -0x95a533
        const val SLATE_GRAY = -0x8f7f70
        const val SNOW = -0x506
        const val SPINEL_RED = -0x8c4d
        const val SPRING_GREEN = -0xff0080
        const val STEEL_BLUE = -0xb97d4c
        const val STRONG_BLUE = -0xff9c8c
        const val STRONG_RED = -0x1a0000
        const val SUN_ORANGE = -0x8d00
        const val TAN = -0x2d4b74
        const val TANGERINE = -0xd7b00
        const val TANGERINE_YELLOW = -0x3400
        const val TEAL = -0xff7f80
        const val THISTLE = -0x274028
        const val TOMATO = -0x9cb9
        const val TROPICAL_ORANGE = -0x7fcd
        const val TURQUOISE = -0xcf2a38
        const val TURQUOISE_BLUE = -0xff0011
        const val TURQUOISE_GREEN = -0xb21980
        const val ULTRAMARINE = -0xffcc01
        const val VERMILION = -0x1cbdcc
        const val VERY_LIGHT_MALACHITE_GREEN = -0x8c1974
        const val VIOLET = -0x7fff01
        const val VIRIDIAN = -0xed8bca
        const val WEDGWOOD_BLUE = -0xa97941
        const val WHEAT = -0xa214d
        const val WHITE = -0x1
        const val WHITE_SMOKE = -0xa0a0b
        const val WISTERIA = -0x365f24
        const val YELLOW = -0x100
        const val YELLOW_GREEN = -0x6532ce

    }

    object Material {

        const val RED_50 = -0x1412
        const val RED_100 = -0x322e
        const val RED_200 = -0x106566
        const val RED_300 = -0x1a8c8d
        const val RED_400 = -0x10acb0
        const val RED_500 = -0xbbcca
        const val RED_600 = -0x1ac6cb
        const val RED_700 = -0x2cd0d1
        const val RED_800 = -0x39d7d8
        const val RED_900 = -0x48e3e4
        const val RED_A100 = -0x7580
        const val RED_A200 = -0xadae
        const val RED_A400 = -0xe8bc
        const val RED_A700 = -0x2b0000
        const val PINK_50 = -0x31b14
        const val PINK_100 = -0x74430
        const val PINK_200 = -0xb704f
        const val PINK_300 = -0xf9d6e
        const val PINK_400 = -0x13bf86
        const val PINK_500 = -0x16e19d
        const val PINK_600 = -0x27e4a0
        const val PINK_700 = -0x3de7a5
        const val PINK_800 = -0x52eba9
        const val PINK_900 = -0x77f1b1
        const val PINK_A100 = -0x7f55
        const val PINK_A200 = -0xbf7f
        const val PINK_A400 = -0xaffa9
        const val PINK_A700 = -0x3aee9e
        const val PURPLE_50 = -0xc1a0b
        const val PURPLE_100 = -0x1e4119
        const val PURPLE_200 = -0x316c28
        const val PURPLE_300 = -0x459738
        const val PURPLE_400 = -0x54b844
        const val PURPLE_500 = -0x63d850
        const val PURPLE_600 = -0x71db56
        const val PURPLE_700 = -0x84e05e
        const val PURPLE_800 = -0x95e466
        const val PURPLE_900 = -0xb5eb74
        const val PURPLE_A100 = -0x157f04
        const val PURPLE_A200 = -0x1fbf05
        const val PURPLE_A400 = -0x2aff07
        const val PURPLE_A700 = -0x55ff01
        const val DEEP_PURPLE_50 = -0x12180a
        const val DEEP_PURPLE_100 = -0x2e3b17
        const val DEEP_PURPLE_200 = -0x4c6225
        const val DEEP_PURPLE_300 = -0x6a8a33
        const val DEEP_PURPLE_400 = -0x81a83e
        const val DEEP_PURPLE_500 = -0x98c549
        const val DEEP_PURPLE_600 = -0xa1ca4f
        const val DEEP_PURPLE_700 = -0xaed258
        const val DEEP_PURPLE_800 = -0xbad860
        const val DEEP_PURPLE_900 = -0xcee46e
        const val DEEP_PURPLE_A100 = -0x4c7701
        const val DEEP_PURPLE_A200 = -0x83b201
        const val DEEP_PURPLE_A400 = -0x9ae001
        const val DEEP_PURPLE_A700 = -0x9dff16
        const val INDIGO_50 = -0x17150a
        const val INDIGO_100 = -0x3a3517
        const val INDIGO_200 = -0x605726
        const val INDIGO_300 = -0x867935
        const val INDIGO_400 = -0xa39440
        const val INDIGO_500 = -0xc0ae4b
        const val INDIGO_600 = -0xc6b655
        const val INDIGO_700 = -0xcfc061
        const val INDIGO_800 = -0xd7ca6d
        const val INDIGO_900 = -0xe5dc82
        const val INDIGO_A100 = -0x736101
        const val INDIGO_A200 = -0xac9202
        const val INDIGO_A400 = -0xc2a502
        const val INDIGO_A700 = -0xcfb002
        const val BLUE_50 = -0x1c0d03
        const val BLUE_100 = -0x442105
        const val BLUE_200 = -0x6f3507
        const val BLUE_300 = -0x9b4a0a
        const val BLUE_400 = -0xbd5a0b
        const val BLUE_500 = -0xde690d
        const val BLUE_600 = -0xe1771b
        const val BLUE_700 = -0xe6892e
        const val BLUE_800 = -0xea9a40
        const val BLUE_900 = -0xf2b85f
        const val BLUE_A100 = -0x7d4e01
        const val BLUE_A200 = -0xbb7501
        const val BLUE_A400 = -0xd68601
        const val BLUE_A700 = -0xd69d01
        const val LIGHT_BLUE_50 = -0x1e0a02
        const val LIGHT_BLUE_100 = -0x4c1a04
        const val LIGHT_BLUE_200 = -0x7e2b06
        const val LIGHT_BLUE_300 = -0xb03c09
        const val LIGHT_BLUE_400 = -0xd64904
        const val LIGHT_BLUE_500 = -0xfc560c
        const val LIGHT_BLUE_600 = -0xfc641b
        const val LIGHT_BLUE_700 = -0xfd772f
        const val LIGHT_BLUE_800 = -0xfd8843
        const val LIGHT_BLUE_900 = -0xfea865
        const val LIGHT_BLUE_A100 = -0x7f2701
        const val LIGHT_BLUE_A200 = -0xbf3b01
        const val LIGHT_BLUE_A400 = -0xff4f01
        const val LIGHT_BLUE_A700 = -0xff6e16
        const val CYAN_50 = -0x1f0806
        const val CYAN_100 = -0x4d140e
        const val CYAN_200 = -0x7f2116
        const val CYAN_300 = -0xb22f1f
        const val CYAN_400 = -0xd93926
        const val CYAN_500 = -0xff432c
        const val CYAN_600 = -0xff533f
        const val CYAN_700 = -0xff6859
        const val CYAN_800 = -0xff7c71
        const val CYAN_900 = -0xff9f9c
        const val CYAN_A100 = -0x7b0001
        const val CYAN_A200 = -0xe70001
        const val CYAN_A400 = -0xff1a01
        const val CYAN_A700 = -0xff472c
        const val TEAL_50 = -0x1f0d0f
        const val TEAL_100 = -0x4d2025
        const val TEAL_200 = -0x7f343c
        const val TEAL_300 = -0xb24954
        const val TEAL_400 = -0xd95966
        const val TEAL_500 = -0xff6978
        const val TEAL_600 = -0xff7685
        const val TEAL_700 = -0xff8695
        const val TEAL_800 = -0xff96a4
        const val TEAL_900 = -0xffb2c0
        const val TEAL_A100 = -0x580015
        const val TEAL_A200 = -0x9b0026
        const val TEAL_A400 = -0xe2164a
        const val TEAL_A700 = -0xff405b
        const val GREEN_50 = -0x170a17
        const val GREEN_100 = -0x371937
        const val GREEN_200 = -0x5a2959
        const val GREEN_300 = -0x7e387c
        const val GREEN_400 = -0x994496
        const val GREEN_500 = -0xb350b0
        const val GREEN_600 = -0xbc5fb9
        const val GREEN_700 = -0xc771c4
        const val GREEN_800 = -0xd182ce
        const val GREEN_900 = -0xe4a1e0
        const val GREEN_A100 = -0x460936
        const val GREEN_A200 = -0x960f52
        const val GREEN_A400 = -0xff198a
        const val GREEN_A700 = -0xff37ad
        const val LIGHT_GREEN_50 = -0xe0717
        const val LIGHT_GREEN_100 = -0x231238
        const val LIGHT_GREEN_200 = -0x3a1e5b
        const val LIGHT_GREEN_300 = -0x512a7f
        const val LIGHT_GREEN_400 = -0x63339b
        const val LIGHT_GREEN_500 = -0x743cb6
        const val LIGHT_GREEN_600 = -0x834cbe
        const val LIGHT_GREEN_700 = -0x9760c8
        const val LIGHT_GREEN_800 = -0xaa74d1
        const val LIGHT_GREEN_900 = -0xcc96e2
        const val LIGHT_GREEN_A100 = -0x330070
        const val LIGHT_GREEN_A200 = -0x4d00a7
        const val LIGHT_GREEN_A400 = -0x8900fd
        const val LIGHT_GREEN_A700 = -0x9b22e9
        const val LIME_50 = -0x60419
        const val LIME_100 = -0xf0b3d
        const val LIME_200 = -0x191164
        const val LIME_300 = -0x23188b
        const val LIME_400 = -0x2b1ea9
        const val LIME_500 = -0x3223c7
        const val LIME_600 = -0x3f35cd
        const val LIME_700 = -0x5b4bd5
        const val LIME_800 = -0x6162dc
        const val LIME_900 = -0x7d88e9
        const val LIME_A100 = -0xb007f
        const val LIME_A200 = -0x1100bf
        const val LIME_A400 = -0x390100
        const val LIME_A700 = -0x511600
        const val YELLOW_50 = -0x219
        const val YELLOW_100 = -0x63c
        const val YELLOW_200 = -0xa70
        const val YELLOW_300 = -0xe8a
        const val YELLOW_400 = -0x11a8
        const val YELLOW_500 = -0x14c5
        const val YELLOW_600 = -0x227cb
        const val YELLOW_700 = -0x43fd3
        const val YELLOW_800 = -0x657db
        const val YELLOW_900 = -0xa80e9
        const val YELLOW_A100 = -0x7e
        const val YELLOW_A200 = -0x100
        const val YELLOW_A400 = -0x1600
        const val YELLOW_A700 = -0x2a00
        const val AMBER_50 = -0x71f
        const val AMBER_100 = -0x134d
        const val AMBER_200 = -0x1f7e
        const val AMBER_300 = -0x2ab1
        const val AMBER_400 = -0x35d8
        const val AMBER_500 = -0x3ef9
        const val AMBER_600 = -0x4d00
        const val AMBER_700 = -0x6000
        const val AMBER_800 = -0x7100
        const val AMBER_900 = -0x9100
        const val AMBER_A100 = -0x1a81
        const val AMBER_A200 = -0x28c0
        const val AMBER_A400 = -0x3c00
        const val AMBER_A700 = -0x5500
        const val ORANGE_50 = -0xc20
        const val ORANGE_100 = -0x1f4e
        const val ORANGE_200 = -0x3380
        const val ORANGE_300 = -0x48b3
        const val ORANGE_400 = -0x58da
        const val ORANGE_500 = -0x6800
        const val ORANGE_600 = -0x47400
        const val ORANGE_700 = -0xa8400
        const val ORANGE_800 = -0x109400
        const val ORANGE_900 = -0x19af00
        const val ORANGE_A100 = -0x2e80
        const val ORANGE_A200 = -0x54c0
        const val ORANGE_A400 = -0x6f00
        const val ORANGE_A700 = -0x9300
        const val DEEP_ORANGE_50 = -0x41659
        const val DEEP_ORANGE_100 = -0x3344
        const val DEEP_ORANGE_200 = -0x546f
        const val DEEP_ORANGE_300 = -0x759b
        const val DEEP_ORANGE_400 = -0x8fbd
        const val DEEP_ORANGE_500 = -0xa8de
        const val DEEP_ORANGE_600 = -0xbaee2
        const val DEEP_ORANGE_700 = -0x19b5e7
        const val DEEP_ORANGE_800 = -0x27bceb
        const val DEEP_ORANGE_900 = -0x40c9f4
        const val DEEP_ORANGE_A100 = -0x6180
        const val DEEP_ORANGE_A200 = -0x91c0
        const val DEEP_ORANGE_A400 = -0xc300
        const val DEEP_ORANGE_A700 = -0x22da00
        const val BROWN_50 = -0x101417
        const val BROWN_100 = -0x283338
        const val BROWN_200 = -0x43555c
        const val BROWN_300 = -0x5e7781
        const val BROWN_400 = -0x72919d
        const val BROWN_500 = -0x86aab8
        const val BROWN_600 = -0x92b3bf
        const val BROWN_700 = -0xa2bfc9
        const val BROWN_800 = -0xb1cbd2
        const val BROWN_900 = -0xc1d8dd
        const val GREY_50 = -0x50506
        const val GREY_100 = -0xa0a0b
        const val GREY_200 = -0x111112
        const val GREY_300 = -0x1f1f20
        const val GREY_400 = -0x424243
        const val GREY_500 = -0x616162
        const val GREY_600 = -0x8a8a8b
        const val GREY_700 = -0x9e9e9f
        const val GREY_800 = -0xbdbdbe
        const val GREY_900 = -0xdededf
        const val BLACK_1000 = -0x1000000
        const val WHITE_1000 = -0x1
        const val BLUE_GREY_50 = -0x13100f
        const val BLUE_GREY_100 = -0x302724
        const val BLUE_GREY_200 = -0x4f443b
        const val BLUE_GREY_300 = -0x6f5b52
        const val BLUE_GREY_400 = -0x876f64
        const val BLUE_GREY_500 = -0x9f8275
        const val BLUE_GREY_600 = -0xab9186
        const val BLUE_GREY_700 = -0xbaa59c
        const val BLUE_GREY_800 = -0xc8b8b1
        const val BLUE_GREY_900 = -0xd9cdc8

        const val RED = RED_500
        const val PINK = PINK_500
        const val PURPLE = PURPLE_500
        const val DEEP_PURPLE = DEEP_PURPLE_500
        const val INDIGO = INDIGO_500
        const val BLUE = BLUE_500
        const val LIGHT_BLUE = LIGHT_BLUE_500
        const val CYAN = CYAN_500
        const val TEAL = TEAL_500
        const val GREEN = GREEN_500
        const val LIGHT_GREEN = LIGHT_GREEN_500
        const val LIME = LIME_500
        const val YELLOW = YELLOW_500
        const val AMBER = AMBER_500
        const val ORANGE = ORANGE_500
        const val DEEP_ORANGE = DEEP_ORANGE_500
        const val BROWN = BROWN_500
        const val GREY = GREY_500
        const val BLUE_GREY = BLUE_GREY_500
        const val BLACK = BLACK_1000
        const val WHITE = WHITE_1000

    }

    companion object {

        internal val globalAppContext = GlobalAppContext.get()

        @JvmStatic
        @JvmOverloads
        fun getColorByName(colorName: String, suppressException: Boolean = false): Int? {
            val name = colorName.replace("-", "_").uppercase()
            arrayOf(
                Android::class.java,
                Css::class.java,
                Web::class.java,
                Material::class.java,
            ).forEach { clazz ->
                clazz.declaredFields.forEach { field ->
                    if (removeUnderscores(name) == removeUnderscores(field.name)) {
                        return field.getInt(field.name)
                    }
                }
            }
            if (!suppressException) {
                throw NotFoundException(globalAppContext.getString(R.string.error_unknown_color_name, colorName))
            }
            return null
        }

        private fun removeUnderscores(s: String) = s.replace("_", "")

    }

}
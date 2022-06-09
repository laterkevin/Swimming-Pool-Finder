package de.syntaxinstitut.swimmingpoolfinder.data.exampleData

import de.syntaxinstitut.swimmingpoolfinder.data.dataclasses.SwimmingPoolData
import java.sql.Time

object SwimmingPoolExamplesData {

    val pool1 = SwimmingPoolData(
        name = "Sommerbad Kreuzberg",
        address = "Prinzenstraße 113-119",
        openMonday = Time(7),
        closeMonday = Time(20),
        openTuesday = Time(7),
        closeTuesday = Time(20),
        openWednesday = Time(7),
        closeWednesday = Time(20),
        openThursday = Time(7),
        closeThursday = Time(20),
        openFriday = Time(7),
        closeFriday = Time(20),
        openSaturday = Time(7),
        closeSaturday = Time(20),
        openSunday = Time(7),
        closeSunday = Time(20),
        divingPlatform = true,
        gastronomy = true,
        slide = false
    )

    val pool2 = SwimmingPoolData(
        name = "Sommerbad Pankow",
        address = "Wolfshagener Straße 91-93\n" +
                "13187 Berlin - Pankow",
        openMonday = Time(10),
        closeMonday = Time(18),
        openTuesday = Time(10),
        closeTuesday = Time(18),
        openWednesday = Time(10),
        closeWednesday = Time(18),
        openThursday = Time(10),
        closeThursday = Time(18),
        openFriday = Time(10),
        closeFriday = Time(18),
        openSaturday = Time(10),
        closeSaturday = Time(18),
        openSunday = Time(10),
        closeSunday = Time(18),
        divingPlatform = true,
        gastronomy = false,
        slide = true
    )

    val pool3 = SwimmingPoolData(
        name = "Stadtbad Mitte",
        address = "Gartenstraße 5\n" +
                "10115 Berlin - Mitte",
        openMonday = Time(6),
        closeMonday = Time(18),
        openTuesday = Time(6),
        closeTuesday = Time(13),
        openWednesday = Time(6),
        closeWednesday = Time(18),
        openThursday = Time(6),
        closeThursday = Time(13),
        openFriday = Time(12),
        closeFriday = Time(18),
        openSaturday = null,
        closeSaturday = null,
        openSunday = null,
        closeSunday = null,
        divingPlatform = false,
        gastronomy = false,
        slide = false
    )

    val pool4 = SwimmingPoolData(
        name = "Schwimmhalle Kaulsdorf",
        address = "Clara-Zetkin-Weg 13\n" +
                "12619 Berlin - Kaulsdorf",
        openMonday = Time(6),
        closeMonday = Time(8),
        openTuesday = Time(6),
        closeTuesday = Time(8),
        openWednesday = null,
        closeWednesday = null,
        openThursday = Time(6),
        closeThursday = Time(13),
        openFriday = Time(6),
        closeFriday = Time(8),
        openSaturday = null,
        closeSaturday = null,
        openSunday = null,
        closeSunday = null,
        divingPlatform = false,
        gastronomy = false,
        slide = true
    )

    val pool5 = SwimmingPoolData(
        name = "Kombibad Spandau Süd",
        address = "Gatower Straße 19\n" +
                "13595 Berlin - Spandau",
        openMonday = Time(7),
        closeMonday = Time(20),
        openTuesday = Time(7),
        closeTuesday = Time(20),
        openWednesday = Time(7),
        closeWednesday = Time(20),
        openThursday = Time(7),
        closeThursday = Time(20),
        openFriday = Time(7),
        closeFriday = Time(20),
        openSaturday = Time(7),
        closeSaturday = Time(20),
        openSunday = Time(7),
        closeSunday = Time(20),
        divingPlatform = true,
        gastronomy = true,
        slide = true
    )
}
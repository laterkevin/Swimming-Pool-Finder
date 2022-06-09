package de.syntaxinstitut.swimmingpoolfinder.data.dataclasses

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Time

@Entity(tableName = "swimming_pools_table")
data class SwimmingPoolData(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var name: String,
    var address: String,
    var openMonday: Time?,
    var closeMonday: Time?,
    var openTuesday: Time?,
    var closeTuesday: Time?,
    var openWednesday: Time?,
    var closeWednesday: Time?,
    var openThursday: Time?,
    var closeThursday: Time?,
    var openFriday: Time?,
    var closeFriday: Time?,
    var openSaturday: Time?,
    var closeSaturday: Time?,
    var openSunday: Time?,
    var closeSunday: Time?,
    var divingPlatform: Boolean,
    var gastronomy: Boolean,
    var slide: Boolean
)
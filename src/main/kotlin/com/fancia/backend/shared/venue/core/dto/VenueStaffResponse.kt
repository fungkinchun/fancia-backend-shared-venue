package com.fancia.backend.shared.venue.core.dto

import com.fancia.backend.shared.venue.core.enums.StaffStatus
import java.util.*

data class VenueStaffResponse(
    var venueId: UUID? = null,
    var userId: UUID? = null,
    var status: StaffStatus? = null,
)

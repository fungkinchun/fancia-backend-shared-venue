package com.fancia.backend.shared.venue.core.dto

import com.fancia.backend.shared.venue.core.enums.StaffStatus

data class UpdateVenueStaffRequest(
    var status: StaffStatus
)

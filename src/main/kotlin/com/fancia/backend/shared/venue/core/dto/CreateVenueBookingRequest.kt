package com.fancia.backend.shared.venue.core.dto

import java.util.UUID

data class CreateVenueBookingRequest(
    val slotId: UUID,
    val areaId: UUID? = null,
)

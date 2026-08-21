package com.fancia.backend.shared.venue.core.dto

import jakarta.validation.constraints.Min
import jakarta.validation.constraints.Size
import java.time.LocalDateTime

data class UpdateVenueSlotRequest(
    val startTime: LocalDateTime? = null,
    val endTime: LocalDateTime? = null,
    @field:Min(value = 0, message = "priceMinor must be zero or positive")
    val priceMinor: Long? = null,
    @field:Size(min = 3, max = 8, message = "currency must be 3–8 characters")
    val currency: String? = null,
)

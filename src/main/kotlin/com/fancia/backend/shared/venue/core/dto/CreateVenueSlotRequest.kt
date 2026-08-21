package com.fancia.backend.shared.venue.core.dto

import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.time.LocalDateTime

data class CreateVenueSlotRequest(
    @field:NotNull(message = "startTime is required")
    val startTime: LocalDateTime,
    @field:NotNull(message = "endTime is required")
    val endTime: LocalDateTime,
    @field:Min(value = 0, message = "priceMinor must be zero or positive")
    val priceMinor: Long = 0,
    @field:Size(min = 3, max = 8, message = "currency must be 3–8 characters")
    val currency: String = "gbp",
)

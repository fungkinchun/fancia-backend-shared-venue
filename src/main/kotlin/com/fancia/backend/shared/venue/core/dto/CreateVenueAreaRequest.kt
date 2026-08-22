package com.fancia.backend.shared.venue.core.dto

import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class CreateVenueAreaRequest(
    @field:NotBlank
    @field:Size(max = 255)
    val name: String,
    @field:Min(0)
    val priceMinor: Long = 0,
    @field:Size(max = 8)
    val currency: String = "gbp",
    @field:Min(1)
    val capacity: Int? = null,
    val sortOrder: Int = 0,
)

data class UpdateVenueAreaRequest(
    @field:Size(max = 255)
    val name: String? = null,
    @field:Min(0)
    val priceMinor: Long? = null,
    @field:Size(max = 8)
    val currency: String? = null,
    @field:Min(1)
    val capacity: Int? = null,
    val sortOrder: Int? = null,
)

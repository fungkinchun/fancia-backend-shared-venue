package com.fancia.backend.shared.venue.core.dto

import com.fancia.backend.shared.common.social.core.dto.LinkItem
import jakarta.validation.Valid
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class CreateVenueRequest(
    @field:NotBlank(message = "Venue name is required")
    @field:Size(max = 255, message = "Venue name must be at most 255 characters")
    val name: String,
    @field:NotBlank(message = "Venue description is required")
    @field:Size(max = 4000, message = "Venue description must be at most 4000 characters")
    val description: String,
    val tags: Set<@Size(max = 100, message = "Tag must be at most 100 characters") String>,
    @field:Valid
    val links: List<LinkItem> = emptyList(),
)

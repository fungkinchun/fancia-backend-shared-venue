package com.fancia.backend.shared.venue.core.dto

import com.fancia.backend.shared.common.location.core.dto.LocationDto
import com.fancia.backend.shared.common.social.core.dto.LinkResponse
import java.time.LocalDateTime
import java.util.*

data class VenueResponse(
    var id: UUID? = null,
    var name: String = "",
    var description: String = "",
    var createdBy: UUID? = null,
    var createdAt: LocalDateTime? = null,
    var tags: Set<UUID> = emptySet(),
    var links: Set<LinkResponse> = emptySet(),
    var location: LocationDto? = null,
)

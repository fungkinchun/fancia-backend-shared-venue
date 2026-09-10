package com.fancia.backend.shared.venue.core.dto

import com.fancia.backend.shared.common.core.enums.ResourceVisibility
import com.fancia.backend.shared.common.location.core.dto.LocationDto
import com.fancia.backend.shared.common.social.core.dto.LinkResponse
import java.time.LocalDateTime
import java.util.*

data class VenueResponse(
    var id: UUID? = null,
    var name: String = "",
    var slug: String = "",
    var description: String = "",
    var createdBy: UUID? = null,
    var createdAt: LocalDateTime? = null,
    var tags: Set<UUID> = emptySet(),
    var links: Set<LinkResponse> = emptySet(),
    var location: LocationDto? = null,
    var visibility: ResourceVisibility = ResourceVisibility.PUBLIC,
    var savedByCurrentUser: Boolean? = null,
    var averageRating: Double? = null,
    var ratingCount: Long = 0,
    var currentUserRating: Int? = null,
)

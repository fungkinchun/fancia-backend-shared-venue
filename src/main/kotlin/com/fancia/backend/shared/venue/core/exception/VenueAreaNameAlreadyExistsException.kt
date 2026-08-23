package com.fancia.backend.shared.venue.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.UUID

class VenueAreaNameAlreadyExistsException(
    val venueId: UUID,
    val name: String,
    title: String = "Venue Area Name Already Exists",
    message: String = "Venue $venueId already has an area named \"$name\"",
    errorCode: String = "VENUE_AREA_NAME_ALREADY_EXISTS",
) : DomainException(title, message, errorCode)

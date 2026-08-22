package com.fancia.backend.shared.venue.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.UUID

class VenueAreaNotFoundException(
    val areaId: UUID? = null,
    message: String = "Venue area not found",
    title: String = "Venue Area Not Found",
    errorCode: String = "VENUE_AREA_NOT_FOUND",
) : DomainException(title, message, errorCode)

class VenueAreaSoldOutException(
    val areaId: UUID? = null,
    message: String = "This area is fully booked for the selected time",
    title: String = "Area Sold Out",
    errorCode: String = "VENUE_AREA_SOLD_OUT",
) : DomainException(title, message, errorCode)

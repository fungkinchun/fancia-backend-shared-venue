package com.fancia.backend.shared.venue.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.*

class VenueNotFoundException : DomainException {
    val venueId: UUID?
    val ref: String

    constructor(
        venueId: UUID,
        title: String = "Venue not found",
        message: String = "Venue not found with id: $venueId",
        errorCode: String = "VENUE_NOT_FOUND",
    ) : super(title, message, errorCode) {
        this.venueId = venueId
        this.ref = venueId.toString()
    }

    constructor(
        ref: String,
        title: String = "Venue not found",
        message: String = "Venue not found with id or slug: $ref",
        errorCode: String = "VENUE_NOT_FOUND",
    ) : super(title, message, errorCode) {
        this.venueId = null
        this.ref = ref
    }
}

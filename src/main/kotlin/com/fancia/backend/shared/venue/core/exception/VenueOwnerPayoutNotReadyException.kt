package com.fancia.backend.shared.venue.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.UUID

class VenueOwnerPayoutNotReadyException(
    val venueId: UUID,
    val ownerId: UUID,
    title: String = "Venue Owner Payout Not Ready",
    message: String = "Venue $venueId owner $ownerId must finish Stripe payout onboarding before publishing a priced slot",
    errorCode: String = "VENUE_OWNER_PAYOUT_NOT_READY",
) : DomainException(title, message, errorCode)

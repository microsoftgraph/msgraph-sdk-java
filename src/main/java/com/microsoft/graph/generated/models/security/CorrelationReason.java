package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CorrelationReason implements ValuedEnum {
    RepeatedAlertOccurrence("repeatedAlertOccurrence"),
    SameGeography("sameGeography"),
    SimilarArtifacts("similarArtifacts"),
    SameTargetedAsset("sameTargetedAsset"),
    SameNetworkSegment("sameNetworkSegment"),
    EventSequence("eventSequence"),
    TimeFrame("timeFrame"),
    SameThreatSource("sameThreatSource"),
    SimilarTTPsOrBehavior("similarTTPsOrBehavior"),
    SameActor("sameActor"),
    SameCampaign("sameCampaign"),
    SharedIndicators("sharedIndicators"),
    SameAsset("sameAsset"),
    NetworkProximity("networkProximity"),
    EventCasualSequence("eventCasualSequence"),
    TemporalProximity("temporalProximity"),
    LateralMovementPath("lateralMovementPath"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CorrelationReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CorrelationReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "repeatedAlertOccurrence": return RepeatedAlertOccurrence;
            case "sameGeography": return SameGeography;
            case "similarArtifacts": return SimilarArtifacts;
            case "sameTargetedAsset": return SameTargetedAsset;
            case "sameNetworkSegment": return SameNetworkSegment;
            case "eventSequence": return EventSequence;
            case "timeFrame": return TimeFrame;
            case "sameThreatSource": return SameThreatSource;
            case "similarTTPsOrBehavior": return SimilarTTPsOrBehavior;
            case "sameActor": return SameActor;
            case "sameCampaign": return SameCampaign;
            case "sharedIndicators": return SharedIndicators;
            case "sameAsset": return SameAsset;
            case "networkProximity": return NetworkProximity;
            case "eventCasualSequence": return EventCasualSequence;
            case "temporalProximity": return TemporalProximity;
            case "lateralMovementPath": return LateralMovementPath;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

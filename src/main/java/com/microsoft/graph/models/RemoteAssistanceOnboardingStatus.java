package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The current TeamViewer connector status
 */
public enum RemoteAssistanceOnboardingStatus implements ValuedEnum {
    /** The status reported when there is no active TeamViewer connector configured or active */
    NotOnboarded("notOnboarded"),
    /** The status reported when the system has initiated a TeamViewer connection, but the service has not yet completed the confirmation of a connector */
    Onboarding("onboarding"),
    /** The status reported when the system has successfully exchanged account information with TeamViewer and can now initiate remote assistance sessions with clients */
    Onboarded("onboarded");
    public final String value;
    RemoteAssistanceOnboardingStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RemoteAssistanceOnboardingStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notOnboarded": return NotOnboarded;
            case "onboarding": return Onboarding;
            case "onboarded": return Onboarded;
            default: return null;
        }
    }
}

package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum RemoteAssistanceOnboardingStatus implements ValuedEnum {
    NotOnboarded("notOnboarded"),
    Onboarding("onboarding"),
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

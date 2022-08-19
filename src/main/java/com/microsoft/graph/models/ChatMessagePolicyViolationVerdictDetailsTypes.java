package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of chat entities. */
public enum ChatMessagePolicyViolationVerdictDetailsTypes implements ValuedEnum {
    None("none"),
    AllowFalsePositiveOverride("allowFalsePositiveOverride"),
    AllowOverrideWithoutJustification("allowOverrideWithoutJustification"),
    AllowOverrideWithJustification("allowOverrideWithJustification");
    public final String value;
    ChatMessagePolicyViolationVerdictDetailsTypes(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ChatMessagePolicyViolationVerdictDetailsTypes forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "allowFalsePositiveOverride": return AllowFalsePositiveOverride;
            case "allowOverrideWithoutJustification": return AllowOverrideWithoutJustification;
            case "allowOverrideWithJustification": return AllowOverrideWithJustification;
            default: return null;
        }
    }
}

package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the getMailTips method.  */
public enum MailTipsType implements ValuedEnum {
    AutomaticReplies("automaticReplies"),
    MailboxFullStatus("mailboxFullStatus"),
    CustomMailTip("customMailTip"),
    ExternalMemberCount("externalMemberCount"),
    TotalMemberCount("totalMemberCount"),
    MaxMessageSize("maxMessageSize"),
    DeliveryRestriction("deliveryRestriction"),
    ModerationStatus("moderationStatus"),
    RecipientScope("recipientScope"),
    RecipientSuggestions("recipientSuggestions");
    public final String value;
    MailTipsType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MailTipsType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "automaticReplies": return AutomaticReplies;
            case "mailboxFullStatus": return MailboxFullStatus;
            case "customMailTip": return CustomMailTip;
            case "externalMemberCount": return ExternalMemberCount;
            case "totalMemberCount": return TotalMemberCount;
            case "maxMessageSize": return MaxMessageSize;
            case "deliveryRestriction": return DeliveryRestriction;
            case "moderationStatus": return ModerationStatus;
            case "recipientScope": return RecipientScope;
            case "recipientSuggestions": return RecipientSuggestions;
            default: return null;
        }
    }
}

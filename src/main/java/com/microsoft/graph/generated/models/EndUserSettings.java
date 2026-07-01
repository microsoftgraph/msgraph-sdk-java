package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EndUserSettings extends ControlConfiguration implements Parsable {
    /**
     * Instantiates a new {@link EndUserSettings} and sets the default values.
     */
    public EndUserSettings() {
        super();
        this.setOdataType("#microsoft.graph.endUserSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EndUserSettings}
     */
    @jakarta.annotation.Nonnull
    public static EndUserSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EndUserSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("relatedPeopleInsightLevel", (n) -> { this.setRelatedPeopleInsightLevel(n.getEnumValue(AccessPackageSuggestionRelatedPeopleInsightLevel::forValue)); });
        deserializerMap.put("showApproverDetailsToMembers", (n) -> { this.setShowApproverDetailsToMembers(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the relatedPeopleInsightLevel property value. The level of related people insights to show in access package suggestions. The possible values are: disabled, count, countAndNames, unknownFutureValue.
     * @return a {@link AccessPackageSuggestionRelatedPeopleInsightLevel}
     */
    @jakarta.annotation.Nullable
    public AccessPackageSuggestionRelatedPeopleInsightLevel getRelatedPeopleInsightLevel() {
        return this.backingStore.get("relatedPeopleInsightLevel");
    }
    /**
     * Gets the showApproverDetailsToMembers property value. Indicates whether approver details are shown to end users. When true, approver information is visible to members.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowApproverDetailsToMembers() {
        return this.backingStore.get("showApproverDetailsToMembers");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("relatedPeopleInsightLevel", this.getRelatedPeopleInsightLevel());
        writer.writeBooleanValue("showApproverDetailsToMembers", this.getShowApproverDetailsToMembers());
    }
    /**
     * Sets the relatedPeopleInsightLevel property value. The level of related people insights to show in access package suggestions. The possible values are: disabled, count, countAndNames, unknownFutureValue.
     * @param value Value to set for the relatedPeopleInsightLevel property.
     */
    public void setRelatedPeopleInsightLevel(@jakarta.annotation.Nullable final AccessPackageSuggestionRelatedPeopleInsightLevel value) {
        this.backingStore.set("relatedPeopleInsightLevel", value);
    }
    /**
     * Sets the showApproverDetailsToMembers property value. Indicates whether approver details are shown to end users. When true, approver information is visible to members.
     * @param value Value to set for the showApproverDetailsToMembers property.
     */
    public void setShowApproverDetailsToMembers(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showApproverDetailsToMembers", value);
    }
}

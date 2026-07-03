package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageSuggestionSelfAssignmentHistoryBased extends AccessPackageSuggestionReason implements Parsable {
    /**
     * Instantiates a new {@link AccessPackageSuggestionSelfAssignmentHistoryBased} and sets the default values.
     */
    public AccessPackageSuggestionSelfAssignmentHistoryBased() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageSuggestionSelfAssignmentHistoryBased");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessPackageSuggestionSelfAssignmentHistoryBased}
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageSuggestionSelfAssignmentHistoryBased createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageSuggestionSelfAssignmentHistoryBased();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastAssignmentDateTime", (n) -> { this.setLastAssignmentDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("pastAssignmentCount", (n) -> { this.setPastAssignmentCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastAssignmentDateTime property value. The date and time when the user was last assigned to this access package. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastAssignmentDateTime() {
        return this.backingStore.get("lastAssignmentDateTime");
    }
    /**
     * Gets the pastAssignmentCount property value. The number of times the user has been assigned to this access package in the past. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPastAssignmentCount() {
        return this.backingStore.get("pastAssignmentCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("lastAssignmentDateTime", this.getLastAssignmentDateTime());
        writer.writeIntegerValue("pastAssignmentCount", this.getPastAssignmentCount());
    }
    /**
     * Sets the lastAssignmentDateTime property value. The date and time when the user was last assigned to this access package. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the lastAssignmentDateTime property.
     */
    public void setLastAssignmentDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastAssignmentDateTime", value);
    }
    /**
     * Sets the pastAssignmentCount property value. The number of times the user has been assigned to this access package in the past. Read-only.
     * @param value Value to set for the pastAssignmentCount property.
     */
    public void setPastAssignmentCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pastAssignmentCount", value);
    }
}

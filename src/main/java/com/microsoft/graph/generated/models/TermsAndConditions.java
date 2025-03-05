package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A termsAndConditions entity represents the metadata and contents of a given Terms and Conditions (T&amp;C) policy. T&amp;C policies contents are presented to users upon their first attempt to enroll into Intune and subsequently upon edits where an administrator has required re-acceptance. They enable administrators to communicate the provisions to which a user must agree in order to have devices enrolled into Intune.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TermsAndConditions extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TermsAndConditions} and sets the default values.
     */
    public TermsAndConditions() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TermsAndConditions}
     */
    @jakarta.annotation.Nonnull
    public static TermsAndConditions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TermsAndConditions();
    }
    /**
     * Gets the acceptanceStatement property value. Administrator-supplied explanation of the terms and conditions, typically describing what it means to accept the terms and conditions set out in the T&amp;C policy. This is shown to the user on prompts to accept the T&amp;C policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAcceptanceStatement() {
        return this.backingStore.get("acceptanceStatement");
    }
    /**
     * Gets the acceptanceStatuses property value. The list of acceptance statuses for this T&amp;C policy.
     * @return a {@link java.util.List<TermsAndConditionsAcceptanceStatus>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TermsAndConditionsAcceptanceStatus> getAcceptanceStatuses() {
        return this.backingStore.get("acceptanceStatuses");
    }
    /**
     * Gets the assignments property value. The list of assignments for this T&amp;C policy.
     * @return a {@link java.util.List<TermsAndConditionsAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TermsAndConditionsAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the bodyText property value. Administrator-supplied body text of the terms and conditions, typically the terms themselves. This is shown to the user on prompts to accept the T&amp;C policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBodyText() {
        return this.backingStore.get("bodyText");
    }
    /**
     * Gets the createdDateTime property value. DateTime the object was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. Administrator-supplied description of the T&amp;C policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Administrator-supplied name for the T&amp;C policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acceptanceStatement", (n) -> { this.setAcceptanceStatement(n.getStringValue()); });
        deserializerMap.put("acceptanceStatuses", (n) -> { this.setAcceptanceStatuses(n.getCollectionOfObjectValues(TermsAndConditionsAcceptanceStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(TermsAndConditionsAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("bodyText", (n) -> { this.setBodyText(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the title property value. Administrator-supplied title of the terms and conditions. This is shown to the user on prompts to accept the T&amp;C policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.backingStore.get("title");
    }
    /**
     * Gets the version property value. Integer indicating the current version of the terms. Incremented when an administrator makes a change to the terms and wishes to require users to re-accept the modified T&amp;C policy.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("acceptanceStatement", this.getAcceptanceStatement());
        writer.writeCollectionOfObjectValues("acceptanceStatuses", this.getAcceptanceStatuses());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeStringValue("bodyText", this.getBodyText());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("title", this.getTitle());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the acceptanceStatement property value. Administrator-supplied explanation of the terms and conditions, typically describing what it means to accept the terms and conditions set out in the T&amp;C policy. This is shown to the user on prompts to accept the T&amp;C policy.
     * @param value Value to set for the acceptanceStatement property.
     */
    public void setAcceptanceStatement(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("acceptanceStatement", value);
    }
    /**
     * Sets the acceptanceStatuses property value. The list of acceptance statuses for this T&amp;C policy.
     * @param value Value to set for the acceptanceStatuses property.
     */
    public void setAcceptanceStatuses(@jakarta.annotation.Nullable final java.util.List<TermsAndConditionsAcceptanceStatus> value) {
        this.backingStore.set("acceptanceStatuses", value);
    }
    /**
     * Sets the assignments property value. The list of assignments for this T&amp;C policy.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<TermsAndConditionsAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the bodyText property value. Administrator-supplied body text of the terms and conditions, typically the terms themselves. This is shown to the user on prompts to accept the T&amp;C policy.
     * @param value Value to set for the bodyText property.
     */
    public void setBodyText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bodyText", value);
    }
    /**
     * Sets the createdDateTime property value. DateTime the object was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. Administrator-supplied description of the T&amp;C policy.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Administrator-supplied name for the T&amp;C policy.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the title property value. Administrator-supplied title of the terms and conditions. This is shown to the user on prompts to accept the T&amp;C policy.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
    /**
     * Sets the version property value. Integer indicating the current version of the terms. Incremented when an administrator makes a change to the terms and wishes to require users to re-accept the modified T&amp;C policy.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("version", value);
    }
}

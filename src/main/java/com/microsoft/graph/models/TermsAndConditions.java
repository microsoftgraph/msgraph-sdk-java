package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A termsAndConditions entity represents the metadata and contents of a given Terms and Conditions (T&C) policy. T&C policies contents are presented to users upon their first attempt to enroll into Intune and subsequently upon edits where an administrator has required re-acceptance. They enable administrators to communicate the provisions to which a user must agree in order to have devices enrolled into Intune.
 */
public class TermsAndConditions extends Entity implements Parsable {
    /**
     * Administrator-supplied explanation of the terms and conditions, typically describing what it means to accept the terms and conditions set out in the T&C policy. This is shown to the user on prompts to accept the T&C policy.
     */
    private String acceptanceStatement;
    /**
     * The list of acceptance statuses for this T&C policy.
     */
    private java.util.List<TermsAndConditionsAcceptanceStatus> acceptanceStatuses;
    /**
     * The list of assignments for this T&C policy.
     */
    private java.util.List<TermsAndConditionsAssignment> assignments;
    /**
     * Administrator-supplied body text of the terms and conditions, typically the terms themselves. This is shown to the user on prompts to accept the T&C policy.
     */
    private String bodyText;
    /**
     * DateTime the object was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Administrator-supplied description of the T&C policy.
     */
    private String description;
    /**
     * Administrator-supplied name for the T&C policy.
     */
    private String displayName;
    /**
     * DateTime the object was last modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Administrator-supplied title of the terms and conditions. This is shown to the user on prompts to accept the T&C policy.
     */
    private String title;
    /**
     * Integer indicating the current version of the terms. Incremented when an administrator makes a change to the terms and wishes to require users to re-accept the modified T&C policy.
     */
    private Integer version;
    /**
     * Instantiates a new termsAndConditions and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public TermsAndConditions() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a termsAndConditions
     */
    @jakarta.annotation.Nonnull
    public static TermsAndConditions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TermsAndConditions();
    }
    /**
     * Gets the acceptanceStatement property value. Administrator-supplied explanation of the terms and conditions, typically describing what it means to accept the terms and conditions set out in the T&C policy. This is shown to the user on prompts to accept the T&C policy.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAcceptanceStatement() {
        return this.acceptanceStatement;
    }
    /**
     * Gets the acceptanceStatuses property value. The list of acceptance statuses for this T&C policy.
     * @return a termsAndConditionsAcceptanceStatus
     */
    @jakarta.annotation.Nullable
    public java.util.List<TermsAndConditionsAcceptanceStatus> getAcceptanceStatuses() {
        return this.acceptanceStatuses;
    }
    /**
     * Gets the assignments property value. The list of assignments for this T&C policy.
     * @return a termsAndConditionsAssignment
     */
    @jakarta.annotation.Nullable
    public java.util.List<TermsAndConditionsAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the bodyText property value. Administrator-supplied body text of the terms and conditions, typically the terms themselves. This is shown to the user on prompts to accept the T&C policy.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBodyText() {
        return this.bodyText;
    }
    /**
     * Gets the createdDateTime property value. DateTime the object was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. Administrator-supplied description of the T&C policy.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Administrator-supplied name for the T&C policy.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the title property value. Administrator-supplied title of the terms and conditions. This is shown to the user on prompts to accept the T&C policy.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the version property value. Integer indicating the current version of the terms. Incremented when an administrator makes a change to the terms and wishes to require users to re-accept the modified T&C policy.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * Sets the acceptanceStatement property value. Administrator-supplied explanation of the terms and conditions, typically describing what it means to accept the terms and conditions set out in the T&C policy. This is shown to the user on prompts to accept the T&C policy.
     * @param value Value to set for the acceptanceStatement property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAcceptanceStatement(@jakarta.annotation.Nullable final String value) {
        this.acceptanceStatement = value;
    }
    /**
     * Sets the acceptanceStatuses property value. The list of acceptance statuses for this T&C policy.
     * @param value Value to set for the acceptanceStatuses property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAcceptanceStatuses(@jakarta.annotation.Nullable final java.util.List<TermsAndConditionsAcceptanceStatus> value) {
        this.acceptanceStatuses = value;
    }
    /**
     * Sets the assignments property value. The list of assignments for this T&C policy.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<TermsAndConditionsAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the bodyText property value. Administrator-supplied body text of the terms and conditions, typically the terms themselves. This is shown to the user on prompts to accept the T&C policy.
     * @param value Value to set for the bodyText property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBodyText(@jakarta.annotation.Nullable final String value) {
        this.bodyText = value;
    }
    /**
     * Sets the createdDateTime property value. DateTime the object was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Administrator-supplied description of the T&C policy.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Administrator-supplied name for the T&C policy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the title property value. Administrator-supplied title of the terms and conditions. This is shown to the user on prompts to accept the T&C policy.
     * @param value Value to set for the title property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the version property value. Integer indicating the current version of the terms. Incremented when an administrator makes a change to the terms and wishes to require users to re-accept the modified T&C policy.
     * @param value Value to set for the version property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.version = value;
    }
}

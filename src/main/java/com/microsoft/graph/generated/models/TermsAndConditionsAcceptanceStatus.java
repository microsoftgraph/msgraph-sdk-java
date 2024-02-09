package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A termsAndConditionsAcceptanceStatus entity represents the acceptance status of a given Terms and Conditions (T&C) policy by a given user. Users must accept the most up-to-date version of the terms in order to retain access to the Company Portal.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TermsAndConditionsAcceptanceStatus extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TermsAndConditionsAcceptanceStatus} and sets the default values.
     */
    public TermsAndConditionsAcceptanceStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TermsAndConditionsAcceptanceStatus}
     */
    @jakarta.annotation.Nonnull
    public static TermsAndConditionsAcceptanceStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TermsAndConditionsAcceptanceStatus();
    }
    /**
     * Gets the acceptedDateTime property value. DateTime when the terms were last accepted by the user.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAcceptedDateTime() {
        return this.backingStore.get("acceptedDateTime");
    }
    /**
     * Gets the acceptedVersion property value. Most recent version number of the T&C accepted by the user.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAcceptedVersion() {
        return this.backingStore.get("acceptedVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acceptedDateTime", (n) -> { this.setAcceptedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("acceptedVersion", (n) -> { this.setAcceptedVersion(n.getIntegerValue()); });
        deserializerMap.put("termsAndConditions", (n) -> { this.setTermsAndConditions(n.getObjectValue(TermsAndConditions::createFromDiscriminatorValue)); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the termsAndConditions property value. Navigation link to the terms and conditions that are assigned.
     * @return a {@link TermsAndConditions}
     */
    @jakarta.annotation.Nullable
    public TermsAndConditions getTermsAndConditions() {
        return this.backingStore.get("termsAndConditions");
    }
    /**
     * Gets the userDisplayName property value. Display name of the user whose acceptance the entity represents.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.backingStore.get("userDisplayName");
    }
    /**
     * Gets the userPrincipalName property value. The userPrincipalName of the User that accepted the term.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("acceptedDateTime", this.getAcceptedDateTime());
        writer.writeIntegerValue("acceptedVersion", this.getAcceptedVersion());
        writer.writeObjectValue("termsAndConditions", this.getTermsAndConditions());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the acceptedDateTime property value. DateTime when the terms were last accepted by the user.
     * @param value Value to set for the acceptedDateTime property.
     */
    public void setAcceptedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("acceptedDateTime", value);
    }
    /**
     * Sets the acceptedVersion property value. Most recent version number of the T&C accepted by the user.
     * @param value Value to set for the acceptedVersion property.
     */
    public void setAcceptedVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("acceptedVersion", value);
    }
    /**
     * Sets the termsAndConditions property value. Navigation link to the terms and conditions that are assigned.
     * @param value Value to set for the termsAndConditions property.
     */
    public void setTermsAndConditions(@jakarta.annotation.Nullable final TermsAndConditions value) {
        this.backingStore.set("termsAndConditions", value);
    }
    /**
     * Sets the userDisplayName property value. Display name of the user whose acceptance the entity represents.
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userDisplayName", value);
    }
    /**
     * Sets the userPrincipalName property value. The userPrincipalName of the User that accepted the term.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}

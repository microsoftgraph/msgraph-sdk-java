package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VerifiedIdProfile extends Entity implements Parsable {
    /**
     * Instantiates a new {@link VerifiedIdProfile} and sets the default values.
     */
    public VerifiedIdProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VerifiedIdProfile}
     */
    @jakarta.annotation.Nonnull
    public static VerifiedIdProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerifiedIdProfile();
    }
    /**
     * Gets the description property value. Description for the verified ID profile. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the faceCheckConfiguration property value. The faceCheckConfiguration property
     * @return a {@link FaceCheckConfiguration}
     */
    @jakarta.annotation.Nullable
    public FaceCheckConfiguration getFaceCheckConfiguration() {
        return this.backingStore.get("faceCheckConfiguration");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("faceCheckConfiguration", (n) -> { this.setFaceCheckConfiguration(n.getObjectValue(FaceCheckConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(VerifiedIdProfileState::forValue)); });
        deserializerMap.put("verifiedIdProfileConfiguration", (n) -> { this.setVerifiedIdProfileConfiguration(n.getObjectValue(VerifiedIdProfileConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("verifiedIdUsageConfigurations", (n) -> { this.setVerifiedIdUsageConfigurations(n.getCollectionOfObjectValues(VerifiedIdUsageConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("verifierDid", (n) -> { this.setVerifierDid(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. DateTime the profile was last modified. Optional.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the name property value. Display name for the verified ID profile. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the priority property value. Defines profile processing priority if multiple profiles are configured. Optional.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link VerifiedIdProfileState}
     */
    @jakarta.annotation.Nullable
    public VerifiedIdProfileState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the verifiedIdProfileConfiguration property value. The verifiedIdProfileConfiguration property
     * @return a {@link VerifiedIdProfileConfiguration}
     */
    @jakarta.annotation.Nullable
    public VerifiedIdProfileConfiguration getVerifiedIdProfileConfiguration() {
        return this.backingStore.get("verifiedIdProfileConfiguration");
    }
    /**
     * Gets the verifiedIdUsageConfigurations property value. Collection defining the usage purpose for the profile. Required.
     * @return a {@link java.util.List<VerifiedIdUsageConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<VerifiedIdUsageConfiguration> getVerifiedIdUsageConfigurations() {
        return this.backingStore.get("verifiedIdUsageConfigurations");
    }
    /**
     * Gets the verifierDid property value. Decentralized Identifier (DID) string that represents the verifier in the verifiable credential exchange. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVerifierDid() {
        return this.backingStore.get("verifierDid");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("faceCheckConfiguration", this.getFaceCheckConfiguration());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeEnumValue("state", this.getState());
        writer.writeObjectValue("verifiedIdProfileConfiguration", this.getVerifiedIdProfileConfiguration());
        writer.writeCollectionOfObjectValues("verifiedIdUsageConfigurations", this.getVerifiedIdUsageConfigurations());
        writer.writeStringValue("verifierDid", this.getVerifierDid());
    }
    /**
     * Sets the description property value. Description for the verified ID profile. Required.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the faceCheckConfiguration property value. The faceCheckConfiguration property
     * @param value Value to set for the faceCheckConfiguration property.
     */
    public void setFaceCheckConfiguration(@jakarta.annotation.Nullable final FaceCheckConfiguration value) {
        this.backingStore.set("faceCheckConfiguration", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the profile was last modified. Optional.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the name property value. Display name for the verified ID profile. Required.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the priority property value. Defines profile processing priority if multiple profiles are configured. Optional.
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("priority", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final VerifiedIdProfileState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the verifiedIdProfileConfiguration property value. The verifiedIdProfileConfiguration property
     * @param value Value to set for the verifiedIdProfileConfiguration property.
     */
    public void setVerifiedIdProfileConfiguration(@jakarta.annotation.Nullable final VerifiedIdProfileConfiguration value) {
        this.backingStore.set("verifiedIdProfileConfiguration", value);
    }
    /**
     * Sets the verifiedIdUsageConfigurations property value. Collection defining the usage purpose for the profile. Required.
     * @param value Value to set for the verifiedIdUsageConfigurations property.
     */
    public void setVerifiedIdUsageConfigurations(@jakarta.annotation.Nullable final java.util.List<VerifiedIdUsageConfiguration> value) {
        this.backingStore.set("verifiedIdUsageConfigurations", value);
    }
    /**
     * Sets the verifierDid property value. Decentralized Identifier (DID) string that represents the verifier in the verifiable credential exchange. Required.
     * @param value Value to set for the verifierDid property.
     */
    public void setVerifierDid(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("verifierDid", value);
    }
}

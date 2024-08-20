package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceApp extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ServiceApp} and sets the default values.
     */
    public ServiceApp() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ServiceApp}
     */
    @jakarta.annotation.Nonnull
    public static ServiceApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceApp();
    }
    /**
     * Gets the application property value. The Entra ID application ID.
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getApplication() {
        return this.backingStore.get("application");
    }
    /**
     * Gets the effectiveDateTime property value. Timestamp of the effective activation of the service app.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEffectiveDateTime() {
        return this.backingStore.get("effectiveDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("application", (n) -> { this.setApplication(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("effectiveDateTime", (n) -> { this.setEffectiveDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("registrationDateTime", (n) -> { this.setRegistrationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ServiceAppStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the person who last modified the entity.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. Timestamp of the last modification of the entity.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the registrationDateTime property value. Timestamp of the creation of the service app entity.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRegistrationDateTime() {
        return this.backingStore.get("registrationDateTime");
    }
    /**
     * Gets the status property value. The status of the service app. This value indicates whether or not the application can be used to control the backup service. The possible values are: inactive, active, pendingActive, pendingInactive, unknownFutureValue.
     * @return a {@link ServiceAppStatus}
     */
    @jakarta.annotation.Nullable
    public ServiceAppStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("application", this.getApplication());
        writer.writeOffsetDateTimeValue("effectiveDateTime", this.getEffectiveDateTime());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeOffsetDateTimeValue("registrationDateTime", this.getRegistrationDateTime());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the application property value. The Entra ID application ID.
     * @param value Value to set for the application property.
     */
    public void setApplication(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("application", value);
    }
    /**
     * Sets the effectiveDateTime property value. Timestamp of the effective activation of the service app.
     * @param value Value to set for the effectiveDateTime property.
     */
    public void setEffectiveDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("effectiveDateTime", value);
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the person who last modified the entity.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Timestamp of the last modification of the entity.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the registrationDateTime property value. Timestamp of the creation of the service app entity.
     * @param value Value to set for the registrationDateTime property.
     */
    public void setRegistrationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("registrationDateTime", value);
    }
    /**
     * Sets the status property value. The status of the service app. This value indicates whether or not the application can be used to control the backup service. The possible values are: inactive, active, pendingActive, pendingInactive, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ServiceAppStatus value) {
        this.backingStore.set("status", value);
    }
}

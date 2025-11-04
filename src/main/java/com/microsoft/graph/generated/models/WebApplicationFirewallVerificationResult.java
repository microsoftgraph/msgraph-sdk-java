package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WebApplicationFirewallVerificationResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WebApplicationFirewallVerificationResult} and sets the default values.
     */
    public WebApplicationFirewallVerificationResult() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WebApplicationFirewallVerificationResult}
     */
    @jakarta.annotation.Nonnull
    public static WebApplicationFirewallVerificationResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebApplicationFirewallVerificationResult();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the errors property value. The errors property
     * @return a {@link java.util.List<GenericError>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GenericError> getErrors() {
        return this.backingStore.get("errors");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(GenericError::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(WebApplicationFirewallVerificationStatus::forValue)); });
        deserializerMap.put("verifiedOnDateTime", (n) -> { this.setVerifiedOnDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getCollectionOfObjectValues(GenericError::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link WebApplicationFirewallVerificationStatus}
     */
    @jakarta.annotation.Nullable
    public WebApplicationFirewallVerificationStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the verifiedOnDateTime property value. The verifiedOnDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getVerifiedOnDateTime() {
        return this.backingStore.get("verifiedOnDateTime");
    }
    /**
     * Gets the warnings property value. The warnings property
     * @return a {@link java.util.List<GenericError>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GenericError> getWarnings() {
        return this.backingStore.get("warnings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeOffsetDateTimeValue("verifiedOnDateTime", this.getVerifiedOnDateTime());
        writer.writeCollectionOfObjectValues("warnings", this.getWarnings());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the errors property value. The errors property
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<GenericError> value) {
        this.backingStore.set("errors", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final WebApplicationFirewallVerificationStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the verifiedOnDateTime property value. The verifiedOnDateTime property
     * @param value Value to set for the verifiedOnDateTime property.
     */
    public void setVerifiedOnDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("verifiedOnDateTime", value);
    }
    /**
     * Sets the warnings property value. The warnings property
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final java.util.List<GenericError> value) {
        this.backingStore.set("warnings", value);
    }
}

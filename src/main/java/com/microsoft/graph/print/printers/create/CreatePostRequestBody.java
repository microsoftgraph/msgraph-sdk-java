package com.microsoft.graph.print.printers.create;

import com.microsoft.graph.models.PrintCertificateSigningRequest;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreatePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new CreatePostRequestBody and sets the default values.
     */
    public CreatePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreatePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static CreatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreatePostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the certificateSigningRequest property value. The certificateSigningRequest property
     * @return a PrintCertificateSigningRequest
     */
    @jakarta.annotation.Nullable
    public PrintCertificateSigningRequest getCertificateSigningRequest() {
        return this.backingStore.get("certificateSigningRequest");
    }
    /**
     * Gets the connectorId property value. The connectorId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConnectorId() {
        return this.backingStore.get("connectorId");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("certificateSigningRequest", (n) -> { this.setCertificateSigningRequest(n.getObjectValue(PrintCertificateSigningRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("connectorId", (n) -> { this.setConnectorId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("hasPhysicalDevice", (n) -> { this.setHasPhysicalDevice(n.getBooleanValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("physicalDeviceId", (n) -> { this.setPhysicalDeviceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasPhysicalDevice property value. The hasPhysicalDevice property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasPhysicalDevice() {
        return this.backingStore.get("hasPhysicalDevice");
    }
    /**
     * Gets the manufacturer property value. The manufacturer property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the model property value. The model property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.backingStore.get("model");
    }
    /**
     * Gets the physicalDeviceId property value. The physicalDeviceId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPhysicalDeviceId() {
        return this.backingStore.get("physicalDeviceId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("certificateSigningRequest", this.getCertificateSigningRequest());
        writer.writeStringValue("connectorId", this.getConnectorId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("hasPhysicalDevice", this.getHasPhysicalDevice());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("physicalDeviceId", this.getPhysicalDeviceId());
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
     * Sets the certificateSigningRequest property value. The certificateSigningRequest property
     * @param value Value to set for the certificateSigningRequest property.
     */
    public void setCertificateSigningRequest(@jakarta.annotation.Nullable final PrintCertificateSigningRequest value) {
        this.backingStore.set("certificateSigningRequest", value);
    }
    /**
     * Sets the connectorId property value. The connectorId property
     * @param value Value to set for the connectorId property.
     */
    public void setConnectorId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("connectorId", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the hasPhysicalDevice property value. The hasPhysicalDevice property
     * @param value Value to set for the hasPhysicalDevice property.
     */
    public void setHasPhysicalDevice(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasPhysicalDevice", value);
    }
    /**
     * Sets the manufacturer property value. The manufacturer property
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the model property value. The model property
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("model", value);
    }
    /**
     * Sets the physicalDeviceId property value. The physicalDeviceId property
     * @param value Value to set for the physicalDeviceId property.
     */
    public void setPhysicalDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("physicalDeviceId", value);
    }
}

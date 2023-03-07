package com.microsoft.graph.print.printers.create;

import com.microsoft.graph.models.PrintCertificateSigningRequest;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CreatePostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The certificateSigningRequest property */
    private PrintCertificateSigningRequest certificateSigningRequest;
    /** The connectorId property */
    private String connectorId;
    /** The displayName property */
    private String displayName;
    /** The hasPhysicalDevice property */
    private Boolean hasPhysicalDevice;
    /** The manufacturer property */
    private String manufacturer;
    /** The model property */
    private String model;
    /** The physicalDeviceId property */
    private String physicalDeviceId;
    /**
     * Instantiates a new createPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CreatePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a createPostRequestBody
     */
    @javax.annotation.Nonnull
    public static CreatePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreatePostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the certificateSigningRequest property value. The certificateSigningRequest property
     * @return a printCertificateSigningRequest
     */
    @javax.annotation.Nullable
    public PrintCertificateSigningRequest getCertificateSigningRequest() {
        return this.certificateSigningRequest;
    }
    /**
     * Gets the connectorId property value. The connectorId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectorId() {
        return this.connectorId;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasPhysicalDevice() {
        return this.hasPhysicalDevice;
    }
    /**
     * Gets the manufacturer property value. The manufacturer property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the model property value. The model property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the physicalDeviceId property value. The physicalDeviceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhysicalDeviceId() {
        return this.physicalDeviceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the certificateSigningRequest property value. The certificateSigningRequest property
     * @param value Value to set for the certificateSigningRequest property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateSigningRequest(@javax.annotation.Nullable final PrintCertificateSigningRequest value) {
        this.certificateSigningRequest = value;
    }
    /**
     * Sets the connectorId property value. The connectorId property
     * @param value Value to set for the connectorId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectorId(@javax.annotation.Nullable final String value) {
        this.connectorId = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the hasPhysicalDevice property value. The hasPhysicalDevice property
     * @param value Value to set for the hasPhysicalDevice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasPhysicalDevice(@javax.annotation.Nullable final Boolean value) {
        this.hasPhysicalDevice = value;
    }
    /**
     * Sets the manufacturer property value. The manufacturer property
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the model property value. The model property
     * @param value Value to set for the model property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModel(@javax.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the physicalDeviceId property value. The physicalDeviceId property
     * @param value Value to set for the physicalDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhysicalDeviceId(@javax.annotation.Nullable final String value) {
        this.physicalDeviceId = value;
    }
}

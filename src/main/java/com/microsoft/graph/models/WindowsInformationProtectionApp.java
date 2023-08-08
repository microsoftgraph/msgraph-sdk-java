package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * App for Windows information protection
 */
public class WindowsInformationProtectionApp implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If true, app is denied protection or exemption.
     */
    private Boolean denied;
    /**
     * The app's description.
     */
    private String description;
    /**
     * App display name.
     */
    private String displayName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The product name.
     */
    private String productName;
    /**
     * The publisher name
     */
    private String publisherName;
    /**
     * Instantiates a new windowsInformationProtectionApp and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public WindowsInformationProtectionApp() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsInformationProtectionApp
     */
    @jakarta.annotation.Nonnull
    public static WindowsInformationProtectionApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsInformationProtectionDesktopApp": return new WindowsInformationProtectionDesktopApp();
                case "#microsoft.graph.windowsInformationProtectionStoreApp": return new WindowsInformationProtectionStoreApp();
            }
        }
        return new WindowsInformationProtectionApp();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the denied property value. If true, app is denied protection or exemption.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDenied() {
        return this.denied;
    }
    /**
     * Gets the description property value. The app's description.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. App display name.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("denied", (n) -> { this.setDenied(n.getBooleanValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("productName", (n) -> { this.setProductName(n.getStringValue()); });
        deserializerMap.put("publisherName", (n) -> { this.setPublisherName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the productName property value. The product name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProductName() {
        return this.productName;
    }
    /**
     * Gets the publisherName property value. The publisher name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPublisherName() {
        return this.publisherName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("denied", this.getDenied());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("productName", this.getProductName());
        writer.writeStringValue("publisherName", this.getPublisherName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the denied property value. If true, app is denied protection or exemption.
     * @param value Value to set for the denied property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDenied(@jakarta.annotation.Nullable final Boolean value) {
        this.denied = value;
    }
    /**
     * Sets the description property value. The app's description.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. App display name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the productName property value. The product name.
     * @param value Value to set for the productName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProductName(@jakarta.annotation.Nullable final String value) {
        this.productName = value;
    }
    /**
     * Sets the publisherName property value. The publisher name
     * @param value Value to set for the publisherName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPublisherName(@jakarta.annotation.Nullable final String value) {
        this.publisherName = value;
    }
}

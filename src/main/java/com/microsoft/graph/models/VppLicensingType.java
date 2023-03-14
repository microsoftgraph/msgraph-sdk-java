package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for iOS Volume-Purchased Program (Vpp) Licensing Type.
 */
public class VppLicensingType implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The OdataType property */
    private String odataType;
    /** Whether the program supports the device licensing type. */
    private Boolean supportsDeviceLicensing;
    /** Whether the program supports the user licensing type. */
    private Boolean supportsUserLicensing;
    /**
     * Instantiates a new vppLicensingType and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VppLicensingType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a vppLicensingType
     */
    @javax.annotation.Nonnull
    public static VppLicensingType createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VppLicensingType();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("supportsDeviceLicensing", (n) -> { this.setSupportsDeviceLicensing(n.getBooleanValue()); });
        deserializerMap.put("supportsUserLicensing", (n) -> { this.setSupportsUserLicensing(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the supportsDeviceLicensing property value. Whether the program supports the device licensing type.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSupportsDeviceLicensing() {
        return this.supportsDeviceLicensing;
    }
    /**
     * Gets the supportsUserLicensing property value. Whether the program supports the user licensing type.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSupportsUserLicensing() {
        return this.supportsUserLicensing;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("supportsDeviceLicensing", this.getSupportsDeviceLicensing());
        writer.writeBooleanValue("supportsUserLicensing", this.getSupportsUserLicensing());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the supportsDeviceLicensing property value. Whether the program supports the device licensing type.
     * @param value Value to set for the supportsDeviceLicensing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportsDeviceLicensing(@javax.annotation.Nullable final Boolean value) {
        this.supportsDeviceLicensing = value;
    }
    /**
     * Sets the supportsUserLicensing property value. Whether the program supports the user licensing type.
     * @param value Value to set for the supportsUserLicensing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportsUserLicensing(@javax.annotation.Nullable final Boolean value) {
        this.supportsUserLicensing = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties of a macOS .app in the package */
public class MacOSLobChildApp implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The build number of the app. */
    private String _buildNumber;
    /** The bundleId of the app. */
    private String _bundleId;
    /** The OdataType property */
    private String _odataType;
    /** The version number of the app. */
    private String _versionNumber;
    /**
     * Instantiates a new macOSLobChildApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSLobChildApp() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.macOSLobChildApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSLobChildApp
     */
    @javax.annotation.Nonnull
    public static MacOSLobChildApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSLobChildApp();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the buildNumber property value. The build number of the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBuildNumber() {
        return this._buildNumber;
    }
    /**
     * Gets the bundleId property value. The bundleId of the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBundleId() {
        return this._bundleId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSLobChildApp currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("buildNumber", (n) -> { currentObject.setBuildNumber(n.getStringValue()); });
        deserializerMap.put("bundleId", (n) -> { currentObject.setBundleId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("versionNumber", (n) -> { currentObject.setVersionNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the versionNumber property value. The version number of the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersionNumber() {
        return this._versionNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("buildNumber", this.getBuildNumber());
        writer.writeStringValue("bundleId", this.getBundleId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("versionNumber", this.getVersionNumber());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the buildNumber property value. The build number of the app.
     * @param value Value to set for the buildNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBuildNumber(@javax.annotation.Nullable final String value) {
        this._buildNumber = value;
    }
    /**
     * Sets the bundleId property value. The bundleId of the app.
     * @param value Value to set for the bundleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBundleId(@javax.annotation.Nullable final String value) {
        this._bundleId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the versionNumber property value. The version number of the app.
     * @param value Value to set for the versionNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersionNumber(@javax.annotation.Nullable final String value) {
        this._versionNumber = value;
    }
}

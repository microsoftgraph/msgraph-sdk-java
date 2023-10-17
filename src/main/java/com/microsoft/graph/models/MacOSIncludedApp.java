package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties of an included .app in a MacOS app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSIncludedApp implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The bundleId of the app. This maps to the CFBundleIdentifier in the app's bundle configuration.
     */
    private String bundleId;
    /**
     * The version of the app. This maps to the CFBundleShortVersion in the app's bundle configuration.
     */
    private String bundleVersion;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new MacOSIncludedApp and sets the default values.
     */
    public MacOSIncludedApp() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSIncludedApp
     */
    @jakarta.annotation.Nonnull
    public static MacOSIncludedApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSIncludedApp();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the bundleId property value. The bundleId of the app. This maps to the CFBundleIdentifier in the app's bundle configuration.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBundleId() {
        return this.bundleId;
    }
    /**
     * Gets the bundleVersion property value. The version of the app. This maps to the CFBundleShortVersion in the app's bundle configuration.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBundleVersion() {
        return this.bundleVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("bundleId", (n) -> { this.setBundleId(n.getStringValue()); });
        deserializerMap.put("bundleVersion", (n) -> { this.setBundleVersion(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("bundleId", this.getBundleId());
        writer.writeStringValue("bundleVersion", this.getBundleVersion());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the bundleId property value. The bundleId of the app. This maps to the CFBundleIdentifier in the app's bundle configuration.
     * @param value Value to set for the bundleId property.
     */
    public void setBundleId(@jakarta.annotation.Nullable final String value) {
        this.bundleId = value;
    }
    /**
     * Sets the bundleVersion property value. The version of the app. This maps to the CFBundleShortVersion in the app's bundle configuration.
     * @param value Value to set for the bundleVersion property.
     */
    public void setBundleVersion(@jakarta.annotation.Nullable final String value) {
        this.bundleVersion = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}

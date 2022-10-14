package com.microsoft.graph.models;

import com.microsoft.graph.models.OmaSettingBase64;
import com.microsoft.graph.models.OmaSettingBoolean;
import com.microsoft.graph.models.OmaSettingDateTime;
import com.microsoft.graph.models.OmaSettingFloatingPoint;
import com.microsoft.graph.models.OmaSettingInteger;
import com.microsoft.graph.models.OmaSettingString;
import com.microsoft.graph.models.OmaSettingStringXml;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** OMA Settings definition. */
public class OmaSetting implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Description. */
    private String _description;
    /** Display Name. */
    private String _displayName;
    /** The OdataType property */
    private String _odataType;
    /** OMA. */
    private String _omaUri;
    /**
     * Instantiates a new omaSetting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OmaSetting() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.omaSetting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a omaSetting
     */
    @javax.annotation.Nonnull
    public static OmaSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.omaSettingBase64": return new OmaSettingBase64();
                case "#microsoft.graph.omaSettingBoolean": return new OmaSettingBoolean();
                case "#microsoft.graph.omaSettingDateTime": return new OmaSettingDateTime();
                case "#microsoft.graph.omaSettingFloatingPoint": return new OmaSettingFloatingPoint();
                case "#microsoft.graph.omaSettingInteger": return new OmaSettingInteger();
                case "#microsoft.graph.omaSettingString": return new OmaSettingString();
                case "#microsoft.graph.omaSettingStringXml": return new OmaSettingStringXml();
            }
        }
        return new OmaSetting();
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
     * Gets the description property value. Description.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Display Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OmaSetting currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("omaUri", (n) -> { currentObject.setOmaUri(n.getStringValue()); });
        }};
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
     * Gets the omaUri property value. OMA.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOmaUri() {
        return this._omaUri;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("omaUri", this.getOmaUri());
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
     * Sets the description property value. Description.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Display Name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
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
     * Sets the omaUri property value. OMA.
     * @param value Value to set for the omaUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOmaUri(@javax.annotation.Nullable final String value) {
        this._omaUri = value;
    }
}

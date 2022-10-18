package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ImplicitGrantSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Specifies whether this web application can request an access token using the OAuth 2.0 implicit flow. */
    private Boolean _enableAccessTokenIssuance;
    /** Specifies whether this web application can request an ID token using the OAuth 2.0 implicit flow. */
    private Boolean _enableIdTokenIssuance;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new implicitGrantSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ImplicitGrantSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.implicitGrantSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a implicitGrantSettings
     */
    @javax.annotation.Nonnull
    public static ImplicitGrantSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImplicitGrantSettings();
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
     * Gets the enableAccessTokenIssuance property value. Specifies whether this web application can request an access token using the OAuth 2.0 implicit flow.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableAccessTokenIssuance() {
        return this._enableAccessTokenIssuance;
    }
    /**
     * Gets the enableIdTokenIssuance property value. Specifies whether this web application can request an ID token using the OAuth 2.0 implicit flow.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableIdTokenIssuance() {
        return this._enableIdTokenIssuance;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ImplicitGrantSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("enableAccessTokenIssuance", (n) -> { currentObject.setEnableAccessTokenIssuance(n.getBooleanValue()); });
            this.put("enableIdTokenIssuance", (n) -> { currentObject.setEnableIdTokenIssuance(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("enableAccessTokenIssuance", this.getEnableAccessTokenIssuance());
        writer.writeBooleanValue("enableIdTokenIssuance", this.getEnableIdTokenIssuance());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the enableAccessTokenIssuance property value. Specifies whether this web application can request an access token using the OAuth 2.0 implicit flow.
     * @param value Value to set for the enableAccessTokenIssuance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableAccessTokenIssuance(@javax.annotation.Nullable final Boolean value) {
        this._enableAccessTokenIssuance = value;
    }
    /**
     * Sets the enableIdTokenIssuance property value. Specifies whether this web application can request an ID token using the OAuth 2.0 implicit flow.
     * @param value Value to set for the enableIdTokenIssuance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableIdTokenIssuance(@javax.annotation.Nullable final Boolean value) {
        this._enableIdTokenIssuance = value;
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
}

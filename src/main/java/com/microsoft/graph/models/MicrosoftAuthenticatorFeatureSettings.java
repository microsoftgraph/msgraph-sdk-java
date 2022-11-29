package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MicrosoftAuthenticatorFeatureSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Determines whether the user's Authenticator app will show them the client app they are signing into. */
    private AuthenticationMethodFeatureConfiguration _displayAppInformationRequiredState;
    /** Determines whether the user's Authenticator app will show them the geographic location of where the authentication request originated from. */
    private AuthenticationMethodFeatureConfiguration _displayLocationInformationRequiredState;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new microsoftAuthenticatorFeatureSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MicrosoftAuthenticatorFeatureSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a microsoftAuthenticatorFeatureSettings
     */
    @javax.annotation.Nonnull
    public static MicrosoftAuthenticatorFeatureSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftAuthenticatorFeatureSettings();
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
     * Gets the displayAppInformationRequiredState property value. Determines whether the user's Authenticator app will show them the client app they are signing into.
     * @return a authenticationMethodFeatureConfiguration
     */
    @javax.annotation.Nullable
    public AuthenticationMethodFeatureConfiguration getDisplayAppInformationRequiredState() {
        return this._displayAppInformationRequiredState;
    }
    /**
     * Gets the displayLocationInformationRequiredState property value. Determines whether the user's Authenticator app will show them the geographic location of where the authentication request originated from.
     * @return a authenticationMethodFeatureConfiguration
     */
    @javax.annotation.Nullable
    public AuthenticationMethodFeatureConfiguration getDisplayLocationInformationRequiredState() {
        return this._displayLocationInformationRequiredState;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MicrosoftAuthenticatorFeatureSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("displayAppInformationRequiredState", (n) -> { currentObject.setDisplayAppInformationRequiredState(n.getObjectValue(AuthenticationMethodFeatureConfiguration::createFromDiscriminatorValue)); });
            this.put("displayLocationInformationRequiredState", (n) -> { currentObject.setDisplayLocationInformationRequiredState(n.getObjectValue(AuthenticationMethodFeatureConfiguration::createFromDiscriminatorValue)); });
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
        writer.writeObjectValue("displayAppInformationRequiredState", this.getDisplayAppInformationRequiredState());
        writer.writeObjectValue("displayLocationInformationRequiredState", this.getDisplayLocationInformationRequiredState());
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
     * Sets the displayAppInformationRequiredState property value. Determines whether the user's Authenticator app will show them the client app they are signing into.
     * @param value Value to set for the displayAppInformationRequiredState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayAppInformationRequiredState(@javax.annotation.Nullable final AuthenticationMethodFeatureConfiguration value) {
        this._displayAppInformationRequiredState = value;
    }
    /**
     * Sets the displayLocationInformationRequiredState property value. Determines whether the user's Authenticator app will show them the geographic location of where the authentication request originated from.
     * @param value Value to set for the displayLocationInformationRequiredState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayLocationInformationRequiredState(@javax.annotation.Nullable final AuthenticationMethodFeatureConfiguration value) {
        this._displayLocationInformationRequiredState = value;
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

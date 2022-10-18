package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LobbyBypassSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Specifies whether or not to always let dial-in callers bypass the lobby. Optional. */
    private Boolean _isDialInBypassEnabled;
    /** The OdataType property */
    private String _odataType;
    /** Specifies the type of participants that are automatically admitted into a meeting, bypassing the lobby. Optional. */
    private LobbyBypassScope _scope;
    /**
     * Instantiates a new lobbyBypassSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public LobbyBypassSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.lobbyBypassSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a lobbyBypassSettings
     */
    @javax.annotation.Nonnull
    public static LobbyBypassSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LobbyBypassSettings();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final LobbyBypassSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("isDialInBypassEnabled", (n) -> { currentObject.setIsDialInBypassEnabled(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("scope", (n) -> { currentObject.setScope(n.getEnumValue(LobbyBypassScope.class)); });
        }};
    }
    /**
     * Gets the isDialInBypassEnabled property value. Specifies whether or not to always let dial-in callers bypass the lobby. Optional.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDialInBypassEnabled() {
        return this._isDialInBypassEnabled;
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
     * Gets the scope property value. Specifies the type of participants that are automatically admitted into a meeting, bypassing the lobby. Optional.
     * @return a lobbyBypassScope
     */
    @javax.annotation.Nullable
    public LobbyBypassScope getScope() {
        return this._scope;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isDialInBypassEnabled", this.getIsDialInBypassEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("scope", this.getScope());
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
     * Sets the isDialInBypassEnabled property value. Specifies whether or not to always let dial-in callers bypass the lobby. Optional.
     * @param value Value to set for the isDialInBypassEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDialInBypassEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isDialInBypassEnabled = value;
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
     * Sets the scope property value. Specifies the type of participants that are automatically admitted into a meeting, bypassing the lobby. Optional.
     * @param value Value to set for the scope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScope(@javax.annotation.Nullable final LobbyBypassScope value) {
        this._scope = value;
    }
}

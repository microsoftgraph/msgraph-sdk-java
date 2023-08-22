package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LobbyBypassSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Specifies whether or not to always let dial-in callers bypass the lobby. Optional.
     */
    private Boolean isDialInBypassEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Specifies the type of participants that are automatically admitted into a meeting, bypassing the lobby. Optional.
     */
    private LobbyBypassScope scope;
    /**
     * Instantiates a new lobbyBypassSettings and sets the default values.
     */
    public LobbyBypassSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a lobbyBypassSettings
     */
    @jakarta.annotation.Nonnull
    public static LobbyBypassSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LobbyBypassSettings();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("isDialInBypassEnabled", (n) -> { this.setIsDialInBypassEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getEnumValue(LobbyBypassScope.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isDialInBypassEnabled property value. Specifies whether or not to always let dial-in callers bypass the lobby. Optional.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDialInBypassEnabled() {
        return this.isDialInBypassEnabled;
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
     * Gets the scope property value. Specifies the type of participants that are automatically admitted into a meeting, bypassing the lobby. Optional.
     * @return a lobbyBypassScope
     */
    @jakarta.annotation.Nullable
    public LobbyBypassScope getScope() {
        return this.scope;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isDialInBypassEnabled", this.getIsDialInBypassEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("scope", this.getScope());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the isDialInBypassEnabled property value. Specifies whether or not to always let dial-in callers bypass the lobby. Optional.
     * @param value Value to set for the isDialInBypassEnabled property.
     */
    public void setIsDialInBypassEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isDialInBypassEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the scope property value. Specifies the type of participants that are automatically admitted into a meeting, bypassing the lobby. Optional.
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final LobbyBypassScope value) {
        this.scope = value;
    }
}

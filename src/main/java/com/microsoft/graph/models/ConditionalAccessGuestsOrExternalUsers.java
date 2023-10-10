package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConditionalAccessGuestsOrExternalUsers implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The tenant IDs of the selected types of external users. Either all B2B tenant or a collection of tenant IDs. External tenants can be specified only when the property guestOrExternalUserTypes isn't null or an empty String.
     */
    private ConditionalAccessExternalTenants externalTenants;
    /**
     * The guestOrExternalUserTypes property
     */
    private EnumSet<ConditionalAccessGuestOrExternalUserTypes> guestOrExternalUserTypes;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new ConditionalAccessGuestsOrExternalUsers and sets the default values.
     */
    public ConditionalAccessGuestsOrExternalUsers() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConditionalAccessGuestsOrExternalUsers
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessGuestsOrExternalUsers createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessGuestsOrExternalUsers();
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
     * Gets the externalTenants property value. The tenant IDs of the selected types of external users. Either all B2B tenant or a collection of tenant IDs. External tenants can be specified only when the property guestOrExternalUserTypes isn't null or an empty String.
     * @return a ConditionalAccessExternalTenants
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessExternalTenants getExternalTenants() {
        return this.externalTenants;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("externalTenants", (n) -> { this.setExternalTenants(n.getObjectValue(ConditionalAccessExternalTenants::createFromDiscriminatorValue)); });
        deserializerMap.put("guestOrExternalUserTypes", (n) -> { this.setGuestOrExternalUserTypes(n.getEnumSetValue(ConditionalAccessGuestOrExternalUserTypes.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the guestOrExternalUserTypes property value. The guestOrExternalUserTypes property
     * @return a EnumSet<ConditionalAccessGuestOrExternalUserTypes>
     */
    @jakarta.annotation.Nullable
    public EnumSet<ConditionalAccessGuestOrExternalUserTypes> getGuestOrExternalUserTypes() {
        return this.guestOrExternalUserTypes;
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
        writer.writeObjectValue("externalTenants", this.getExternalTenants());
        writer.writeEnumSetValue("guestOrExternalUserTypes", this.getGuestOrExternalUserTypes());
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
     * Sets the externalTenants property value. The tenant IDs of the selected types of external users. Either all B2B tenant or a collection of tenant IDs. External tenants can be specified only when the property guestOrExternalUserTypes isn't null or an empty String.
     * @param value Value to set for the externalTenants property.
     */
    public void setExternalTenants(@jakarta.annotation.Nullable final ConditionalAccessExternalTenants value) {
        this.externalTenants = value;
    }
    /**
     * Sets the guestOrExternalUserTypes property value. The guestOrExternalUserTypes property
     * @param value Value to set for the guestOrExternalUserTypes property.
     */
    public void setGuestOrExternalUserTypes(@jakarta.annotation.Nullable final EnumSet<ConditionalAccessGuestOrExternalUserTypes> value) {
        this.guestOrExternalUserTypes = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}

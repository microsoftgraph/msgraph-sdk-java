package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IncomingContext implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new IncomingContext and sets the default values.
     */
    public IncomingContext() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IncomingContext
     */
    @jakarta.annotation.Nonnull
    public static IncomingContext createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IncomingContext();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("observedParticipantId", (n) -> { this.setObservedParticipantId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("onBehalfOf", (n) -> { this.setOnBehalfOf(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("sourceParticipantId", (n) -> { this.setSourceParticipantId(n.getStringValue()); });
        deserializerMap.put("transferor", (n) -> { this.setTransferor(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the observedParticipantId property value. The ID of the participant that is under observation. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getObservedParticipantId() {
        return this.getBackingStore().get("observedParticipantId");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the onBehalfOf property value. The identity that the call is happening on behalf of.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getOnBehalfOf() {
        return this.getBackingStore().get("onBehalfOf");
    }
    /**
     * Gets the sourceParticipantId property value. The ID of the participant that triggered the incoming call. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceParticipantId() {
        return this.getBackingStore().get("sourceParticipantId");
    }
    /**
     * Gets the transferor property value. The identity that transferred the call.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getTransferor() {
        return this.getBackingStore().get("transferor");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("observedParticipantId", this.getObservedParticipantId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("onBehalfOf", this.getOnBehalfOf());
        writer.writeStringValue("sourceParticipantId", this.getSourceParticipantId());
        writer.writeObjectValue("transferor", this.getTransferor());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the observedParticipantId property value. The ID of the participant that is under observation. Read-only.
     * @param value Value to set for the observedParticipantId property.
     */
    public void setObservedParticipantId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("observedParticipantId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the onBehalfOf property value. The identity that the call is happening on behalf of.
     * @param value Value to set for the onBehalfOf property.
     */
    public void setOnBehalfOf(@jakarta.annotation.Nullable final IdentitySet value) {
        this.getBackingStore().set("onBehalfOf", value);
    }
    /**
     * Sets the sourceParticipantId property value. The ID of the participant that triggered the incoming call. Read-only.
     * @param value Value to set for the sourceParticipantId property.
     */
    public void setSourceParticipantId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("sourceParticipantId", value);
    }
    /**
     * Sets the transferor property value. The identity that transferred the call.
     * @param value Value to set for the transferor property.
     */
    public void setTransferor(@jakarta.annotation.Nullable final IdentitySet value) {
        this.getBackingStore().set("transferor", value);
    }
}

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
public class SynchronizationJobSubject implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new SynchronizationJobSubject and sets the default values.
     */
    public SynchronizationJobSubject() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SynchronizationJobSubject
     */
    @jakarta.annotation.Nonnull
    public static SynchronizationJobSubject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationJobSubject();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("links", (n) -> { this.setLinks(n.getObjectValue(SynchronizationLinkedObjects::createFromDiscriminatorValue)); });
        deserializerMap.put("objectId", (n) -> { this.setObjectId(n.getStringValue()); });
        deserializerMap.put("objectTypeName", (n) -> { this.setObjectTypeName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the links property value. Principals that you would like to provision.
     * @return a SynchronizationLinkedObjects
     */
    @jakarta.annotation.Nullable
    public SynchronizationLinkedObjects getLinks() {
        return this.backingStore.get("links");
    }
    /**
     * Gets the objectId property value. The identifier of an object to which a synchronizationJob is to be applied. Can be one of the following: An onPremisesDistinguishedName for synchronization from Active Directory to Azure AD.The user ID for synchronization from Microsoft Entra ID to a third-party.The Worker ID of the Workday worker for synchronization from Workday to either Active Directory or Microsoft Entra ID.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getObjectId() {
        return this.backingStore.get("objectId");
    }
    /**
     * Gets the objectTypeName property value. The type of the object to which a synchronizationJob is to be applied. Can be one of the following: user for synchronizing between Active Directory and Azure AD.User for synchronizing a user between Microsoft Entra ID and a third-party application. Worker for synchronization a user between Workday and either Active Directory or Microsoft Entra ID.Group for synchronizing a group between Microsoft Entra ID and a third-party application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getObjectTypeName() {
        return this.backingStore.get("objectTypeName");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("links", this.getLinks());
        writer.writeStringValue("objectId", this.getObjectId());
        writer.writeStringValue("objectTypeName", this.getObjectTypeName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the links property value. Principals that you would like to provision.
     * @param value Value to set for the links property.
     */
    public void setLinks(@jakarta.annotation.Nullable final SynchronizationLinkedObjects value) {
        this.backingStore.set("links", value);
    }
    /**
     * Sets the objectId property value. The identifier of an object to which a synchronizationJob is to be applied. Can be one of the following: An onPremisesDistinguishedName for synchronization from Active Directory to Azure AD.The user ID for synchronization from Microsoft Entra ID to a third-party.The Worker ID of the Workday worker for synchronization from Workday to either Active Directory or Microsoft Entra ID.
     * @param value Value to set for the objectId property.
     */
    public void setObjectId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("objectId", value);
    }
    /**
     * Sets the objectTypeName property value. The type of the object to which a synchronizationJob is to be applied. Can be one of the following: user for synchronizing between Active Directory and Azure AD.User for synchronizing a user between Microsoft Entra ID and a third-party application. Worker for synchronization a user between Workday and either Active Directory or Microsoft Entra ID.Group for synchronizing a group between Microsoft Entra ID and a third-party application.
     * @param value Value to set for the objectTypeName property.
     */
    public void setObjectTypeName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("objectTypeName", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}

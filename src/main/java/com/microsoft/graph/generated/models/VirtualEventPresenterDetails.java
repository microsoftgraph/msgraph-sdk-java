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
public class VirtualEventPresenterDetails implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link VirtualEventPresenterDetails} and sets the default values.
     */
    public VirtualEventPresenterDetails() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VirtualEventPresenterDetails}
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventPresenterDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventPresenterDetails();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the bio property value. The bio property
     * @return a {@link ItemBody}
     */
    @jakarta.annotation.Nullable
    public ItemBody getBio() {
        return this.backingStore.get("bio");
    }
    /**
     * Gets the company property value. The company property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompany() {
        return this.backingStore.get("company");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("bio", (n) -> { this.setBio(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("company", (n) -> { this.setCompany(n.getStringValue()); });
        deserializerMap.put("jobTitle", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("linkedInProfileWebUrl", (n) -> { this.setLinkedInProfileWebUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("personalSiteWebUrl", (n) -> { this.setPersonalSiteWebUrl(n.getStringValue()); });
        deserializerMap.put("photo", (n) -> { this.setPhoto(n.getByteArrayValue()); });
        deserializerMap.put("twitterProfileWebUrl", (n) -> { this.setTwitterProfileWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the jobTitle property value. The jobTitle property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJobTitle() {
        return this.backingStore.get("jobTitle");
    }
    /**
     * Gets the linkedInProfileWebUrl property value. The linkedInProfileWebUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLinkedInProfileWebUrl() {
        return this.backingStore.get("linkedInProfileWebUrl");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the personalSiteWebUrl property value. The personalSiteWebUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPersonalSiteWebUrl() {
        return this.backingStore.get("personalSiteWebUrl");
    }
    /**
     * Gets the photo property value. The photo property
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getPhoto() {
        return this.backingStore.get("photo");
    }
    /**
     * Gets the twitterProfileWebUrl property value. The twitterProfileWebUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTwitterProfileWebUrl() {
        return this.backingStore.get("twitterProfileWebUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("bio", this.getBio());
        writer.writeStringValue("company", this.getCompany());
        writer.writeStringValue("jobTitle", this.getJobTitle());
        writer.writeStringValue("linkedInProfileWebUrl", this.getLinkedInProfileWebUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("personalSiteWebUrl", this.getPersonalSiteWebUrl());
        writer.writeByteArrayValue("photo", this.getPhoto());
        writer.writeStringValue("twitterProfileWebUrl", this.getTwitterProfileWebUrl());
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
     * Sets the bio property value. The bio property
     * @param value Value to set for the bio property.
     */
    public void setBio(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("bio", value);
    }
    /**
     * Sets the company property value. The company property
     * @param value Value to set for the company property.
     */
    public void setCompany(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("company", value);
    }
    /**
     * Sets the jobTitle property value. The jobTitle property
     * @param value Value to set for the jobTitle property.
     */
    public void setJobTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("jobTitle", value);
    }
    /**
     * Sets the linkedInProfileWebUrl property value. The linkedInProfileWebUrl property
     * @param value Value to set for the linkedInProfileWebUrl property.
     */
    public void setLinkedInProfileWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("linkedInProfileWebUrl", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the personalSiteWebUrl property value. The personalSiteWebUrl property
     * @param value Value to set for the personalSiteWebUrl property.
     */
    public void setPersonalSiteWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("personalSiteWebUrl", value);
    }
    /**
     * Sets the photo property value. The photo property
     * @param value Value to set for the photo property.
     */
    public void setPhoto(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("photo", value);
    }
    /**
     * Sets the twitterProfileWebUrl property value. The twitterProfileWebUrl property
     * @param value Value to set for the twitterProfileWebUrl property.
     */
    public void setTwitterProfileWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("twitterProfileWebUrl", value);
    }
}

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
public class DocumentSet implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DocumentSet} and sets the default values.
     */
    public DocumentSet() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DocumentSet}
     */
    @jakarta.annotation.Nonnull
    public static DocumentSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DocumentSet();
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
     * Gets the allowedContentTypes property value. Content types allowed in document set.
     * @return a {@link java.util.List<ContentTypeInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContentTypeInfo> getAllowedContentTypes() {
        return this.backingStore.get("allowedContentTypes");
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
     * Gets the defaultContents property value. Default contents of document set.
     * @return a {@link java.util.List<DocumentSetContent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DocumentSetContent> getDefaultContents() {
        return this.backingStore.get("defaultContents");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("allowedContentTypes", (n) -> { this.setAllowedContentTypes(n.getCollectionOfObjectValues(ContentTypeInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultContents", (n) -> { this.setDefaultContents(n.getCollectionOfObjectValues(DocumentSetContent::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("propagateWelcomePageChanges", (n) -> { this.setPropagateWelcomePageChanges(n.getBooleanValue()); });
        deserializerMap.put("sharedColumns", (n) -> { this.setSharedColumns(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("shouldPrefixNameToFile", (n) -> { this.setShouldPrefixNameToFile(n.getBooleanValue()); });
        deserializerMap.put("welcomePageColumns", (n) -> { this.setWelcomePageColumns(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("welcomePageUrl", (n) -> { this.setWelcomePageUrl(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the propagateWelcomePageChanges property value. Specifies whether to push welcome page changes to inherited content types.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPropagateWelcomePageChanges() {
        return this.backingStore.get("propagateWelcomePageChanges");
    }
    /**
     * Gets the sharedColumns property value. The sharedColumns property
     * @return a {@link java.util.List<ColumnDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ColumnDefinition> getSharedColumns() {
        return this.backingStore.get("sharedColumns");
    }
    /**
     * Gets the shouldPrefixNameToFile property value. Indicates whether to add the name of the document set to each file name.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShouldPrefixNameToFile() {
        return this.backingStore.get("shouldPrefixNameToFile");
    }
    /**
     * Gets the welcomePageColumns property value. The welcomePageColumns property
     * @return a {@link java.util.List<ColumnDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ColumnDefinition> getWelcomePageColumns() {
        return this.backingStore.get("welcomePageColumns");
    }
    /**
     * Gets the welcomePageUrl property value. Welcome page absolute URL.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWelcomePageUrl() {
        return this.backingStore.get("welcomePageUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("allowedContentTypes", this.getAllowedContentTypes());
        writer.writeCollectionOfObjectValues("defaultContents", this.getDefaultContents());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("propagateWelcomePageChanges", this.getPropagateWelcomePageChanges());
        writer.writeCollectionOfObjectValues("sharedColumns", this.getSharedColumns());
        writer.writeBooleanValue("shouldPrefixNameToFile", this.getShouldPrefixNameToFile());
        writer.writeCollectionOfObjectValues("welcomePageColumns", this.getWelcomePageColumns());
        writer.writeStringValue("welcomePageUrl", this.getWelcomePageUrl());
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
     * Sets the allowedContentTypes property value. Content types allowed in document set.
     * @param value Value to set for the allowedContentTypes property.
     */
    public void setAllowedContentTypes(@jakarta.annotation.Nullable final java.util.List<ContentTypeInfo> value) {
        this.backingStore.set("allowedContentTypes", value);
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
     * Sets the defaultContents property value. Default contents of document set.
     * @param value Value to set for the defaultContents property.
     */
    public void setDefaultContents(@jakarta.annotation.Nullable final java.util.List<DocumentSetContent> value) {
        this.backingStore.set("defaultContents", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the propagateWelcomePageChanges property value. Specifies whether to push welcome page changes to inherited content types.
     * @param value Value to set for the propagateWelcomePageChanges property.
     */
    public void setPropagateWelcomePageChanges(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("propagateWelcomePageChanges", value);
    }
    /**
     * Sets the sharedColumns property value. The sharedColumns property
     * @param value Value to set for the sharedColumns property.
     */
    public void setSharedColumns(@jakarta.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this.backingStore.set("sharedColumns", value);
    }
    /**
     * Sets the shouldPrefixNameToFile property value. Indicates whether to add the name of the document set to each file name.
     * @param value Value to set for the shouldPrefixNameToFile property.
     */
    public void setShouldPrefixNameToFile(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("shouldPrefixNameToFile", value);
    }
    /**
     * Sets the welcomePageColumns property value. The welcomePageColumns property
     * @param value Value to set for the welcomePageColumns property.
     */
    public void setWelcomePageColumns(@jakarta.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this.backingStore.set("welcomePageColumns", value);
    }
    /**
     * Sets the welcomePageUrl property value. Welcome page absolute URL.
     * @param value Value to set for the welcomePageUrl property.
     */
    public void setWelcomePageUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("welcomePageUrl", value);
    }
}

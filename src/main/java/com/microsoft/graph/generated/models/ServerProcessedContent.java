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
public class ServerProcessedContent implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ServerProcessedContent} and sets the default values.
     */
    public ServerProcessedContent() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ServerProcessedContent}
     */
    @jakarta.annotation.Nonnull
    public static ServerProcessedContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServerProcessedContent();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("htmlStrings", (n) -> { this.setHtmlStrings(n.getCollectionOfObjectValues(MetaDataKeyStringPair::createFromDiscriminatorValue)); });
        deserializerMap.put("imageSources", (n) -> { this.setImageSources(n.getCollectionOfObjectValues(MetaDataKeyStringPair::createFromDiscriminatorValue)); });
        deserializerMap.put("links", (n) -> { this.setLinks(n.getCollectionOfObjectValues(MetaDataKeyStringPair::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("searchablePlainTexts", (n) -> { this.setSearchablePlainTexts(n.getCollectionOfObjectValues(MetaDataKeyStringPair::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the htmlStrings property value. A key-value map where keys are string identifiers and values are rich text with HTML format. SharePoint servers treat the values as HTML content and run services like safety checks, search index and link fixup on them.
     * @return a {@link java.util.List<MetaDataKeyStringPair>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MetaDataKeyStringPair> getHtmlStrings() {
        return this.backingStore.get("htmlStrings");
    }
    /**
     * Gets the imageSources property value. A key-value map where keys are string identifiers and values are image sources. SharePoint servers treat the values as image sources and run services like search index and link fixup on them.
     * @return a {@link java.util.List<MetaDataKeyStringPair>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MetaDataKeyStringPair> getImageSources() {
        return this.backingStore.get("imageSources");
    }
    /**
     * Gets the links property value. A key-value map where keys are string identifiers and values are links. SharePoint servers treat the values as links and run services like link fixup on them.
     * @return a {@link java.util.List<MetaDataKeyStringPair>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MetaDataKeyStringPair> getLinks() {
        return this.backingStore.get("links");
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
     * Gets the searchablePlainTexts property value. A key-value map where keys are string identifiers and values are strings that should be search indexed.
     * @return a {@link java.util.List<MetaDataKeyStringPair>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MetaDataKeyStringPair> getSearchablePlainTexts() {
        return this.backingStore.get("searchablePlainTexts");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("htmlStrings", this.getHtmlStrings());
        writer.writeCollectionOfObjectValues("imageSources", this.getImageSources());
        writer.writeCollectionOfObjectValues("links", this.getLinks());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("searchablePlainTexts", this.getSearchablePlainTexts());
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
     * Sets the htmlStrings property value. A key-value map where keys are string identifiers and values are rich text with HTML format. SharePoint servers treat the values as HTML content and run services like safety checks, search index and link fixup on them.
     * @param value Value to set for the htmlStrings property.
     */
    public void setHtmlStrings(@jakarta.annotation.Nullable final java.util.List<MetaDataKeyStringPair> value) {
        this.backingStore.set("htmlStrings", value);
    }
    /**
     * Sets the imageSources property value. A key-value map where keys are string identifiers and values are image sources. SharePoint servers treat the values as image sources and run services like search index and link fixup on them.
     * @param value Value to set for the imageSources property.
     */
    public void setImageSources(@jakarta.annotation.Nullable final java.util.List<MetaDataKeyStringPair> value) {
        this.backingStore.set("imageSources", value);
    }
    /**
     * Sets the links property value. A key-value map where keys are string identifiers and values are links. SharePoint servers treat the values as links and run services like link fixup on them.
     * @param value Value to set for the links property.
     */
    public void setLinks(@jakarta.annotation.Nullable final java.util.List<MetaDataKeyStringPair> value) {
        this.backingStore.set("links", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the searchablePlainTexts property value. A key-value map where keys are string identifiers and values are strings that should be search indexed.
     * @param value Value to set for the searchablePlainTexts property.
     */
    public void setSearchablePlainTexts(@jakarta.annotation.Nullable final java.util.List<MetaDataKeyStringPair> value) {
        this.backingStore.set("searchablePlainTexts", value);
    }
}

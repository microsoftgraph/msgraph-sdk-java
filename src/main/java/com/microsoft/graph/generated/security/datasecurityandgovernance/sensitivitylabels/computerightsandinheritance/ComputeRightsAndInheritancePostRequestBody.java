package com.microsoft.graph.security.datasecurityandgovernance.sensitivitylabels.computerightsandinheritance;

import com.microsoft.graph.models.ProtectedContent;
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
public class ComputeRightsAndInheritancePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ComputeRightsAndInheritancePostRequestBody} and sets the default values.
     */
    public ComputeRightsAndInheritancePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ComputeRightsAndInheritancePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ComputeRightsAndInheritancePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ComputeRightsAndInheritancePostRequestBody();
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
     * Gets the delegatedUserEmail property value. The delegatedUserEmail property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDelegatedUserEmail() {
        return this.backingStore.get("delegatedUserEmail");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("delegatedUserEmail", (n) -> { this.setDelegatedUserEmail(n.getStringValue()); });
        deserializerMap.put("locale", (n) -> { this.setLocale(n.getStringValue()); });
        deserializerMap.put("protectedContents", (n) -> { this.setProtectedContents(n.getCollectionOfObjectValues(ProtectedContent::createFromDiscriminatorValue)); });
        deserializerMap.put("supportedContentFormats", (n) -> { this.setSupportedContentFormats(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the locale property value. The locale property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocale() {
        return this.backingStore.get("locale");
    }
    /**
     * Gets the protectedContents property value. The protectedContents property
     * @return a {@link java.util.List<ProtectedContent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProtectedContent> getProtectedContents() {
        return this.backingStore.get("protectedContents");
    }
    /**
     * Gets the supportedContentFormats property value. The supportedContentFormats property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedContentFormats() {
        return this.backingStore.get("supportedContentFormats");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("delegatedUserEmail", this.getDelegatedUserEmail());
        writer.writeStringValue("locale", this.getLocale());
        writer.writeCollectionOfObjectValues("protectedContents", this.getProtectedContents());
        writer.writeCollectionOfPrimitiveValues("supportedContentFormats", this.getSupportedContentFormats());
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
     * Sets the delegatedUserEmail property value. The delegatedUserEmail property
     * @param value Value to set for the delegatedUserEmail property.
     */
    public void setDelegatedUserEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("delegatedUserEmail", value);
    }
    /**
     * Sets the locale property value. The locale property
     * @param value Value to set for the locale property.
     */
    public void setLocale(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("locale", value);
    }
    /**
     * Sets the protectedContents property value. The protectedContents property
     * @param value Value to set for the protectedContents property.
     */
    public void setProtectedContents(@jakarta.annotation.Nullable final java.util.List<ProtectedContent> value) {
        this.backingStore.set("protectedContents", value);
    }
    /**
     * Sets the supportedContentFormats property value. The supportedContentFormats property
     * @param value Value to set for the supportedContentFormats property.
     */
    public void setSupportedContentFormats(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("supportedContentFormats", value);
    }
}

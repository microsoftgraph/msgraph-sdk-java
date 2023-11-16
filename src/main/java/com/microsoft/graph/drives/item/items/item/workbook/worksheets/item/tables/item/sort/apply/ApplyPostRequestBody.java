package com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.sort.apply;

import com.microsoft.graph.models.WorkbookSortField;
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
public class ApplyPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new ApplyPostRequestBody and sets the default values.
     */
    public ApplyPostRequestBody() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ApplyPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ApplyPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplyPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("fields", (n) -> { this.setFields(n.getCollectionOfObjectValues(WorkbookSortField::createFromDiscriminatorValue)); });
        deserializerMap.put("matchCase", (n) -> { this.setMatchCase(n.getBooleanValue()); });
        deserializerMap.put("method", (n) -> { this.setMethod(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fields property value. The fields property
     * @return a java.util.List<WorkbookSortField>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookSortField> getFields() {
        return this.BackingStore.get("fields");
    }
    /**
     * Gets the matchCase property value. The matchCase property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMatchCase() {
        return this.BackingStore.get("matchCase");
    }
    /**
     * Gets the method property value. The method property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMethod() {
        return this.BackingStore.get("method");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("fields", this.getFields());
        writer.writeBooleanValue("matchCase", this.getMatchCase());
        writer.writeStringValue("method", this.getMethod());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the fields property value. The fields property
     * @param value Value to set for the fields property.
     */
    public void setFields(@jakarta.annotation.Nullable final java.util.List<WorkbookSortField> value) {
        this.BackingStore.set("fields", value);
    }
    /**
     * Sets the matchCase property value. The matchCase property
     * @param value Value to set for the matchCase property.
     */
    public void setMatchCase(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("matchCase", value);
    }
    /**
     * Sets the method property value. The method property
     * @param value Value to set for the method property.
     */
    public void setMethod(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("method", value);
    }
}

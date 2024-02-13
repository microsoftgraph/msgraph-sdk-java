package com.microsoft.graph.reports.partners.billing.usage.billed.microsoftgraphpartnersbillingexport;

import com.microsoft.graph.models.partners.billing.AttributeSet;
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
public class ExportPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ExportPostRequestBody} and sets the default values.
     */
    public ExportPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExportPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ExportPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExportPostRequestBody();
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
     * Gets the attributeSet property value. The attributeSet property
     * @return a {@link AttributeSet}
     */
    @jakarta.annotation.Nullable
    public AttributeSet getAttributeSet() {
        return this.backingStore.get("attributeSet");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("attributeSet", (n) -> { this.setAttributeSet(n.getEnumValue(AttributeSet::forValue)); });
        deserializerMap.put("invoiceId", (n) -> { this.setInvoiceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the invoiceId property value. The invoiceId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInvoiceId() {
        return this.backingStore.get("invoiceId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("attributeSet", this.getAttributeSet());
        writer.writeStringValue("invoiceId", this.getInvoiceId());
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
     * Sets the attributeSet property value. The attributeSet property
     * @param value Value to set for the attributeSet property.
     */
    public void setAttributeSet(@jakarta.annotation.Nullable final AttributeSet value) {
        this.backingStore.set("attributeSet", value);
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
     * Sets the invoiceId property value. The invoiceId property
     * @param value Value to set for the invoiceId property.
     */
    public void setInvoiceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("invoiceId", value);
    }
}

package com.microsoft.graph.me.drives.item.items.item.copy;

import com.microsoft.graph.models.ItemReference;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the copy method. */
public class CopyPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The name property */
    private String _name;
    /** The parentReference property */
    private ItemReference _parentReference;
    /**
     * Instantiates a new copyPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CopyPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a copyPostRequestBody
     */
    @javax.annotation.Nonnull
    public static CopyPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopyPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CopyPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(2);
        deserializerMap.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
        deserializerMap.put("parentReference", (n) -> { currentObject.setParentReference(n.getObjectValue(ItemReference::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the parentReference property value. The parentReference property
     * @return a itemReference
     */
    @javax.annotation.Nullable
    public ItemReference getParentReference() {
        return this._parentReference;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("parentReference", this.getParentReference());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the parentReference property value. The parentReference property
     * @param value Value to set for the parentReference property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentReference(@javax.annotation.Nullable final ItemReference value) {
        this._parentReference = value;
    }
}

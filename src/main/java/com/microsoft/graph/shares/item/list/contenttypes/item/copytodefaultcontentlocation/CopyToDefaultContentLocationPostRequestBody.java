package com.microsoft.graph.shares.item.list.contenttypes.item.copytodefaultcontentlocation;

import com.microsoft.graph.models.ItemReference;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopyToDefaultContentLocationPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The destinationFileName property
     */
    private String destinationFileName;
    /**
     * The sourceFile property
     */
    private ItemReference sourceFile;
    /**
     * Instantiates a new copyToDefaultContentLocationPostRequestBody and sets the default values.
     */
    public CopyToDefaultContentLocationPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a copyToDefaultContentLocationPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static CopyToDefaultContentLocationPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopyToDefaultContentLocationPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the destinationFileName property value. The destinationFileName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDestinationFileName() {
        return this.destinationFileName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("destinationFileName", (n) -> { this.setDestinationFileName(n.getStringValue()); });
        deserializerMap.put("sourceFile", (n) -> { this.setSourceFile(n.getObjectValue(ItemReference::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sourceFile property value. The sourceFile property
     * @return a itemReference
     */
    @jakarta.annotation.Nullable
    public ItemReference getSourceFile() {
        return this.sourceFile;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("destinationFileName", this.getDestinationFileName());
        writer.writeObjectValue("sourceFile", this.getSourceFile());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the destinationFileName property value. The destinationFileName property
     * @param value Value to set for the destinationFileName property.
     */
    public void setDestinationFileName(@jakarta.annotation.Nullable final String value) {
        this.destinationFileName = value;
    }
    /**
     * Sets the sourceFile property value. The sourceFile property
     * @param value Value to set for the sourceFile property.
     */
    public void setSourceFile(@jakarta.annotation.Nullable final ItemReference value) {
        this.sourceFile = value;
    }
}

package com.microsoft.graph.drives.item.list.contenttypes.item.copytodefaultcontentlocation;

import com.microsoft.graph.models.ItemReference;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
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
     * @return a void
     */
    @javax.annotation.Nullable
    public CopyToDefaultContentLocationPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a copyToDefaultContentLocationPostRequestBody
     */
    @javax.annotation.Nonnull
    public static CopyToDefaultContentLocationPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopyToDefaultContentLocationPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the destinationFileName property value. The destinationFileName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationFileName() {
        return this.destinationFileName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public ItemReference getSourceFile() {
        return this.sourceFile;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("destinationFileName", this.getDestinationFileName());
        writer.writeObjectValue("sourceFile", this.getSourceFile());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the destinationFileName property value. The destinationFileName property
     * @param value Value to set for the destinationFileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDestinationFileName(@javax.annotation.Nullable final String value) {
        this.destinationFileName = value;
    }
    /**
     * Sets the sourceFile property value. The sourceFile property
     * @param value Value to set for the sourceFile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceFile(@javax.annotation.Nullable final ItemReference value) {
        this.sourceFile = value;
    }
}

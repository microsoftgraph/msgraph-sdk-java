package com.microsoft.graph.drives.item.items.item.preview;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PreviewPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The page property
     */
    private String page;
    /**
     * The zoom property
     */
    private Double zoom;
    /**
     * Instantiates a new previewPostRequestBody and sets the default values.
     */
    public PreviewPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a previewPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static PreviewPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PreviewPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("page", (n) -> { this.setPage(n.getStringValue()); });
        deserializerMap.put("zoom", (n) -> { this.setZoom(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the page property value. The page property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPage() {
        return this.page;
    }
    /**
     * Gets the zoom property value. The zoom property
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getZoom() {
        return this.zoom;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("page", this.getPage());
        writer.writeDoubleValue("zoom", this.getZoom());
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
     * Sets the page property value. The page property
     * @param value Value to set for the page property.
     */
    public void setPage(@jakarta.annotation.Nullable final String value) {
        this.page = value;
    }
    /**
     * Sets the zoom property value. The zoom property
     * @param value Value to set for the zoom property.
     */
    public void setZoom(@jakarta.annotation.Nullable final Double value) {
        this.zoom = value;
    }
}

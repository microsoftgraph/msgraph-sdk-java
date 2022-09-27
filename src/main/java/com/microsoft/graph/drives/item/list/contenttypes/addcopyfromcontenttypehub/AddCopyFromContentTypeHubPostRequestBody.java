package com.microsoft.graph.drives.item.list.contenttypes.addcopyfromcontenttypehub;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the addCopyFromContentTypeHub method. */
public class AddCopyFromContentTypeHubPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The contentTypeId property */
    private String _contentTypeId;
    /**
     * Instantiates a new addCopyFromContentTypeHubPostRequestBody and sets the default values.
     * @return a void
     */
    public AddCopyFromContentTypeHubPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a addCopyFromContentTypeHubPostRequestBody
     */
    @javax.annotation.Nonnull
    public static AddCopyFromContentTypeHubPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddCopyFromContentTypeHubPostRequestBody();
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
     * Gets the contentTypeId property value. The contentTypeId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentTypeId() {
        return this._contentTypeId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AddCopyFromContentTypeHubPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(1) {{
            this.put("contentTypeId", (n) -> { currentObject.setContentTypeId(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("contentTypeId", this.getContentTypeId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the contentTypeId property value. The contentTypeId property
     * @param value Value to set for the contentTypeId property.
     * @return a void
     */
    public void setContentTypeId(@javax.annotation.Nullable final String value) {
        this._contentTypeId = value;
    }
}

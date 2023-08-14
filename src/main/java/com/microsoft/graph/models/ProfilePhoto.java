package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProfilePhoto extends Entity implements Parsable {
    /**
     * The height of the photo. Read-only.
     */
    private Integer height;
    /**
     * The width of the photo. Read-only.
     */
    private Integer width;
    /**
     * Instantiates a new profilePhoto and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ProfilePhoto() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a profilePhoto
     */
    @jakarta.annotation.Nonnull
    public static ProfilePhoto createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProfilePhoto();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("height", (n) -> { this.setHeight(n.getIntegerValue()); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the height property value. The height of the photo. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getHeight() {
        return this.height;
    }
    /**
     * Gets the width property value. The width of the photo. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getWidth() {
        return this.width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("height", this.getHeight());
        writer.writeIntegerValue("width", this.getWidth());
    }
    /**
     * Sets the height property value. The height of the photo. Read-only.
     * @param value Value to set for the height property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setHeight(@jakarta.annotation.Nullable final Integer value) {
        this.height = value;
    }
    /**
     * Sets the width property value. The width of the photo. Read-only.
     * @param value Value to set for the width property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWidth(@jakarta.annotation.Nullable final Integer value) {
        this.width = value;
    }
}

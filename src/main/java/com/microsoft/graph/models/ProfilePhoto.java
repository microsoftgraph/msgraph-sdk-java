package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProfilePhoto extends Entity implements Parsable {
    /** The height of the photo. Read-only. */
    private Integer _height;
    /** The width of the photo. Read-only. */
    private Integer _width;
    /**
     * Instantiates a new profilePhoto and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProfilePhoto() {
        super();
        this.setOdataType("#microsoft.graph.profilePhoto");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a profilePhoto
     */
    @javax.annotation.Nonnull
    public static ProfilePhoto createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProfilePhoto();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ProfilePhoto currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("height", (n) -> { currentObject.setHeight(n.getIntegerValue()); });
        deserializerMap.put("width", (n) -> { currentObject.setWidth(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the height property value. The height of the photo. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getHeight() {
        return this._height;
    }
    /**
     * Gets the width property value. The width of the photo. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWidth() {
        return this._width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
    @javax.annotation.Nonnull
    public void setHeight(@javax.annotation.Nullable final Integer value) {
        this._height = value;
    }
    /**
     * Sets the width property value. The width of the photo. Read-only.
     * @param value Value to set for the width property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWidth(@javax.annotation.Nullable final Integer value) {
        this._width = value;
    }
}

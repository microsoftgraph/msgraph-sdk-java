package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PersonType implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The type of data source, such as Person. */
    private String _class_escaped;
    /** The secondary type of data source, such as OrganizationUser. */
    private String _subclass;
    /**
     * Instantiates a new personType and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PersonType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a personType
     */
    @javax.annotation.Nonnull
    public static PersonType createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersonType();
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
     * Gets the class property value. The type of data source, such as Person.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClass_escaped() {
        return this._class_escaped;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PersonType currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(2) {{
            this.put("class", (n) -> { currentObject.setClass(n.getStringValue()); });
            this.put("subclass", (n) -> { currentObject.setSubclass(n.getStringValue()); });
        }};
    }
    /**
     * Gets the subclass property value. The secondary type of data source, such as OrganizationUser.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubclass() {
        return this._subclass;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("class", this.getClass_escaped());
        writer.writeStringValue("subclass", this.getSubclass());
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
     * Sets the class property value. The type of data source, such as Person.
     * @param value Value to set for the class property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClass(@javax.annotation.Nullable final String value) {
        this._class_escaped = value;
    }
    /**
     * Sets the subclass property value. The secondary type of data source, such as OrganizationUser.
     * @param value Value to set for the subclass property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubclass(@javax.annotation.Nullable final String value) {
        this._subclass = value;
    }
}

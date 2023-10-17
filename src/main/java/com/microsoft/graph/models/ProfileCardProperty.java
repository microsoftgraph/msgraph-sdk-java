package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProfileCardProperty extends Entity implements Parsable {
    /**
     * The annotations property
     */
    private java.util.List<ProfileCardAnnotation> annotations;
    /**
     * The directoryPropertyName property
     */
    private String directoryPropertyName;
    /**
     * Instantiates a new ProfileCardProperty and sets the default values.
     */
    public ProfileCardProperty() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProfileCardProperty
     */
    @jakarta.annotation.Nonnull
    public static ProfileCardProperty createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProfileCardProperty();
    }
    /**
     * Gets the annotations property value. The annotations property
     * @return a java.util.List<ProfileCardAnnotation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProfileCardAnnotation> getAnnotations() {
        return this.annotations;
    }
    /**
     * Gets the directoryPropertyName property value. The directoryPropertyName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDirectoryPropertyName() {
        return this.directoryPropertyName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("annotations", (n) -> { this.setAnnotations(n.getCollectionOfObjectValues(ProfileCardAnnotation::createFromDiscriminatorValue)); });
        deserializerMap.put("directoryPropertyName", (n) -> { this.setDirectoryPropertyName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("annotations", this.getAnnotations());
        writer.writeStringValue("directoryPropertyName", this.getDirectoryPropertyName());
    }
    /**
     * Sets the annotations property value. The annotations property
     * @param value Value to set for the annotations property.
     */
    public void setAnnotations(@jakarta.annotation.Nullable final java.util.List<ProfileCardAnnotation> value) {
        this.annotations = value;
    }
    /**
     * Sets the directoryPropertyName property value. The directoryPropertyName property
     * @param value Value to set for the directoryPropertyName property.
     */
    public void setDirectoryPropertyName(@jakarta.annotation.Nullable final String value) {
        this.directoryPropertyName = value;
    }
}
